# Write your MySQL query statement below
select id,
    CASE
        when p_id is null then 'Root'
        when id in (select p_id from tree where p_id is not null) then 'Inner'
        else 'Leaf'
    END as type
from tree;
