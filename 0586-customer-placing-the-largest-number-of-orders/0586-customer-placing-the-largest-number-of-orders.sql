# Write your MySQL query statement below
select customer_number
from Orders
Group By customer_number 
Order By Count(customer_number) Desc
Limit 1;