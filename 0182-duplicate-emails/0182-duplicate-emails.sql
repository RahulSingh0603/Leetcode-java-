# Write your MySQL query statement below
select email as Email
from person
Group By email
Having count(1)>1;