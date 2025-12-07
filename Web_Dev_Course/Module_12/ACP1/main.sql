CREATE TABLE employees (
  SNO TEXT PRIMARY KEY,
  SNAME TEXT,
  Designation TEXT,
  CITY TEXT
);

INSERT INTO employees (SNO, SNAME, STATUS, CITY) VALUES
  ('S1', 'Smith', 'HR', 'London'),
  ('S2', 'Jones', 'Developer', 'Paris'),
  ('S3', 'Blake', 'Developer', 'Paris'),
  ('S4', 'Clarke', 'Intern', 'London'),
  ('S5', 'Adams', 'Marketing', 'Athens');

SELECT * FROM employees;
