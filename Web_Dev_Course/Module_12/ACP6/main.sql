---------------------------------------------------------
-- Create Customers Table
---------------------------------------------------------
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    country VARCHAR(100)
);

---------------------------------------------------------
-- Create Products Table
---------------------------------------------------------
CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    price INT
);

---------------------------------------------------------
-- Create Exports Table (linking customers with products)
---------------------------------------------------------
CREATE TABLE exports (
    export_id INT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    export_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

---------------------------------------------------------
-- Insert Sample Customer Data
---------------------------------------------------------
INSERT INTO customers (customer_id, customer_name, country) VALUES
(1, 'Aarav', 'India'),
(2, 'Alexa', 'USA'),
(3, 'Gordon', 'UK'),
(4, 'Aaron', 'Canada'),
(5, 'Morris', 'Germany'),
(6, 'Tracy', 'Brazil');

---------------------------------------------------------
-- Insert Sample Product Data
---------------------------------------------------------
INSERT INTO products (product_id, product_name, price) VALUES
(101, 'Laptop', 800),
(102, 'Mobile Phone', 500),
(103, 'Headphones', 120),
(104, 'Smartwatch', 200);

---------------------------------------------------------
-- Insert Sample Export Data
---------------------------------------------------------
INSERT INTO exports (export_id, customer_id, product_id, export_date) VALUES
(1001, 1, 101, '2024-03-11'),
(1002, 2, 102, '2024-02-10'),
(1003, 3, 103, '2024-01-15'),
(1004, 4, 104, '2024-05-05'),
(1005, 5, 102, '2024-06-12'),
(1006, 1, 103, '2024-06-20'),
(1007, 4, 101, '2024-07-02');

---------------------------------------------------------
-- 1) Harish wants details of customers whose name:
--    a) STARTS WITH 'a'      -> LIKE 'a%'
--    b) CONTAINS 'or'        -> LIKE '%or%'
---------------------------------------------------------

SELECT *
FROM customers
WHERE customer_name LIKE 'a%'     -- name starts with 'a'
   OR customer_name LIKE '%or%';  -- name contains 'or'

---------------------------------------------------------
-- 2) DISTINCT Keyword: Get unique countries
---------------------------------------------------------

SELECT DISTINCT country
FROM customers
ORDER BY country;

---------------------------------------------------------
-- 3) Customer + Product + Export Details
--    (Harish wants more details about products and export countries)
---------------------------------------------------------

SELECT 
    c.customer_name,
    c.country AS exported_to_country,
    p.product_name,
    p.price,
    e.export_date
FROM customers c
JOIN exports e ON c.customer_id = e.customer_id
JOIN products p ON e.product_id = p.product_id
ORDER BY c.customer_name, e.export_date;

---------------------------------------------------------
-- 4) Filtering: Only customers whose name starts with 'a'
--    AND have exported products
---------------------------------------------------------

SELECT 
    c.customer_name,
    c.country,
    p.product_name,
    p.price
FROM customers c
JOIN exports e ON c.customer_id = e.customer_id
JOIN products p ON e.product_id = p.product_id
WHERE c.customer_name LIKE 'a%'
ORDER BY p.price DESC;

---------------------------------------------------------
-- 5) Grouping: Count how many products each country imports
---------------------------------------------------------

SELECT 
    c.country,
    COUNT(e.product_id) AS total_products_imported
FROM customers c
JOIN exports e ON c.customer_id = e.customer_id
GROUP BY c.country
ORDER BY total_products_imported DESC;
