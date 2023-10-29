# Write your MySQL query statement below
select machine_id, round(sum(if(activity_type = 'start',-1*timestamp,timestamp))/count(distinct process_id),3) as processing_time from Activity group by machine_id