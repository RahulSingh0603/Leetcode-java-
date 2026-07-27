# Write your MySQL query statement below
select class from courses
Group By class
Having count(class)>=5;