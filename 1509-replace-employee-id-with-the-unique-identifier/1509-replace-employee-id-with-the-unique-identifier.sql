# Write your MySQL query statement below
select e.unique_id as unique_id, em.name 
from Employees em
left join EmployeeUNI e using(id)