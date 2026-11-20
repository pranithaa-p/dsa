1# Write your MySQL query statement below
2select customer_number from Orders
3group by customer_number order by count(order_number) desc
4limit 1;