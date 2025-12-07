-- Create table
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    city VARCHAR(50),
    grade INT
);

-- Insert sample data
INSERT INTO customers (customer_id, customer_name, city, grade) VALUES
(1, 'John', 'New York', 120),
(2, 'Alice', 'Chicago', 90),
(3, 'Ramesh', 'New York', 80),
(4, 'Sophia', 'Boston', 150),
(5, 'David', 'New York', 200),
(6, 'Emma', 'Houston', 70);

-- Query 1: Customers who belong to New York OR have grade > 100
SELECT *
FROM customers
WHERE city = 'New York'
   OR grade > 100;

-- Query 2: Customers who belong to New York AND have grade > 100
SELECT *
FROM customers
WHERE city = 'New York'
  AND grade > 100;
