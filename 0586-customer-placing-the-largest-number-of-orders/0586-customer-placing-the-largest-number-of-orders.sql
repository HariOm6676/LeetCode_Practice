# Write your MySQL query statement below
select customer_number from (select customer_number, count(*) as num from Orders group by customer_number order by num desc) as tbl1 limit 1