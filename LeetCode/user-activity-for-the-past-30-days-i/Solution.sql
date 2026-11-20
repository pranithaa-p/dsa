1# Write your MySQL query statement below
2SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
3FROM Activity WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
4AND activity_type IN ('open_session', 'end_session', 'scroll_down', 'send_message')
5GROUP BY activity_date;
6