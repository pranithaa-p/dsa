1# Write your MySQL query statement below
2SELECT p.product_name, SUM(o.unit) AS unit FROM Products p JOIN Orders o
3ON p.product_id = o.product_id WHERE 
4MONTH(order_date) = 2 AND YEAR(order_date) = 2020
5GROUP BY product_name HAVING SUM(o.unit)>= 100;