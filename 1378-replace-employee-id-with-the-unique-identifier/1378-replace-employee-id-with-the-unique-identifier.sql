-- Write your PostgreSQL query statement below
SELECT uni.unique_id, em.name
FROM Employees em
LEFT JOIN EmployeeUNI uni ON em.id = uni.id;
