1# Write your MySQL query statement below
2select activity_date as day, count(distinct user_id) as active_users
3from Activity where activity_type in ("open_session", "scroll_down", "end_session", "send_message")
4and activity_date >= '2019-06-28' and activity_date <= '2019-07-27'
5group by activity_date;