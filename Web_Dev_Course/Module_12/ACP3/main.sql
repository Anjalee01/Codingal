-- Create employee table
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    department VARCHAR(50),
    salary INT
);

-- Insert sample data
INSERT INTO employees (emp_id, emp_name, department, salary) VALUES
(1, 'Rita', 'HR', 50000),
(2, 'John', 'Sales', 60000),
(3, 'Alice', 'IT', 75000),
(4, 'David', 'Finance', 90000),
(5, 'Sophia', 'IT', 72000),
(6, 'Emma', 'Sales', 65000);

-- Sum of salaries
SELECT SUM(salary) AS total_salary
FROM employees;

-- Average salary
SELECT AVG(salary) AS average_salary
FROM employees;

-- Count of all departments
SELECT COUNT(DISTINCT department) AS department_count
FROM employees;

-- Minimum salary
SELECT MIN(salary) AS minimum_salary
FROM employees;

-- Maximum salary
SELECT MAX(salary) AS maximum_salary
FROM employees;
