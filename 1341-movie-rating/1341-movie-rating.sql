# Write your MySQL query statement below
(
    Select u.name as results
    from users u
    join movierating m
        on u.user_id=m.user_id
    group by u.user_id
    order by count(u.user_id) desc, u.name asc
    limit 1
)
UNION ALL
(
    select mo.title as results
    from movies mo
    join movierating m
        on mo.movie_id = m.movie_id
    where m.created_at between '2020-02-01' and '2020-02-29'
    group by mo.movie_id, mo.title
    order by avg(m.rating) desc, mo.title asc
    limit 1
)
