1# Write your MySQL query statement below
2SELECT customer_number FROM Orders 
3GROUP BY customer_number ORDER BY count(*) DESC
4LIMIT 1;