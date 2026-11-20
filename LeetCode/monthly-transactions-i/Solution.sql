1# Write your MySQL query statement below
2select date_format(trans_date, "%Y-%m") as month, 
3country, count(*) AS trans_count, 
4sum(case when state ='approved' then 1 else 0 end) AS approved_count, 
5SUM(amount) as trans_total_amount, 
6SUM(case when state = 'approved' then amount else 0 end) as approved_total_amount 
7from Transactions 
8group by month, country;
9