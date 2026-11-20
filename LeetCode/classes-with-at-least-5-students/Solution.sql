1# Write your MySQL query statement below
2select class from Courses group by class having count(class)>=5;