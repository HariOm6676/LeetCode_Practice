# Write your MySQL query statement below
select distinct t1.author_id as id from (Views t1 inner join Views t2 on t1.author_id=t2.viewer_id and t1.author_id=t2.author_id) order by id asc
