1# Write your MySQL query statement below
2SELECT p.firstName, p.lastName, a.city, a.state FROM Person p
3LEFT JOIN Address a ON p.personId = a.personId;