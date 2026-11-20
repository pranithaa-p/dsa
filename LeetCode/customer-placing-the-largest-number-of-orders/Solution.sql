1# Write your MySQL query statement below
2select customer_number from Orders
3group by customer_number having count(order_number)>1;