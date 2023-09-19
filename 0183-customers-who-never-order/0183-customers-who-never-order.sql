# Write your MySQL query statement below
select customers.name as Customers from Customers left join Orders on customers.id=Orders.customerId where Orders.customerid is NULL