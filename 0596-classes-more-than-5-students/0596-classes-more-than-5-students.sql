# Write your MySQL query statement below
select class from (select class, count(*) as sub from Courses group by class having sub>4) as tbl1