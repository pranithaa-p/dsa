1SELECT e.name AS Employee FROM Employee e 
2JOIN Employee m
3ON e.managerId = m.id 
4WHERE e.salary > m.salary;