# Write your MySQL query statement below
select (select Distinct salary  from employee 
group by id 
order by salary desc
limit 1 
offset 1)as SecondHighestSalary;