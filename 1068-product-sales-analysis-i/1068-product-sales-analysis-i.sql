-- Write your PostgreSQL query statement below
SELECT Sales.year, Sales.price, Product.product_name FROM Sales INNER JOIN Product ON Product.product_id = Sales.product_id 