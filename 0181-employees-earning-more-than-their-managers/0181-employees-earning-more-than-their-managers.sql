# Write your MySQL query statement below
select e2.name as Employee from Employee as e1 inner join Employee  as e2 on e1.id=e2.managerid where e2.salary>e1.salary