SELECT 
w.first_name,w.salary,t.worker_title 
from worker w join title t 
on w.worker_id = t.worker_ref_id;