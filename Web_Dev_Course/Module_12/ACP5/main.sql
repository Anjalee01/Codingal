---------------------------------------------------------
-- Create employee table
---------------------------------------------------------
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    department VARCHAR(50),
    salary INT,
    joining_date DATE,
    bonus INT   -- this will contain some NULL values
);

---------------------------------------------------------
-- Insert sample employee data
---------------------------------------------------------
INSERT INTO employees (emp_id, emp_name, department, salary, joining_date, bonus) VALUES
(1, 'Harsh', 'Finance', 75000, '2022-03-01', NULL),
(2, 'Aditi', 'IT', 90000, '2023-01-15', 8000),
(3, 'Rahul', 'HR', 60000, '2021-08-20', NULL),
(4, 'Karan', 'IT', 95000, '2020-07-10', 12000),
(5, 'Simran', 'Sales', 55000, '2024-02-12', 5000),
(6, 'Meera', 'Finance', 70000, '2023-06-05', NULL);

---------------------------------------------------------
-- 1) Get ALL details of employees (Harsh needs full information)
---------------------------------------------------------
SELECT * 
FROM employees;

---------------------------------------------------------
-- 2) Employees with missing bonuses (Using NULL)
---------------------------------------------------------
SELECT *
FROM employees
WHERE bonus IS NULL;

---------------------------------------------------------
-- 3) Employees whose salary is BETWEEN 60000 and 90000
---------------------------------------------------------
SELECT *
FROM employees
WHERE salary BETWEEN 60000 AND 90000;

---------------------------------------------------------
-- 4) Sort employees by highest salary
---------------------------------------------------------
SELECT *
FROM employees
ORDER BY salary DESC;

---------------------------------------------------------
-- 5) Sort employees by joining date (oldest first)
---------------------------------------------------------
SELECT *
FROM employees
ORDER BY joining_date ASC;

---------------------------------------------------------
-- 6) Group employees by department with summary
---------------------------------------------------------
SELECT 
    department,
    COUNT(*) AS total_employees,
    AVG(salary) AS avg_salary,
    MAX(salary) AS highest_salary,
    MIN(salary) AS lowest_salary
FROM employees
GROUP BY department;

---------------------------------------------------------
-- 7) Employees who joined after 2022
---------------------------------------------------------
SELECT *
FROM employees
WHERE joining_date > '2022-01-01'
ORDER BY joining_date;

---------------------------------------------------------
-- 8) Get all employees with salary + bonus (handling NULL using COALESCE)
---------------------------------------------------------
SELECT 
    emp_name,
    salary,
    bonus,
    (salary + COALESCE(bonus, 0)) AS total_compensation
FROM employees
ORDER BY total_compensation DESC;
