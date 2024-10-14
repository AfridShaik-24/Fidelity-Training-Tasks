CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(nth_highest INT)
RETURNS INTEGER AS $$
DECLARE nth_salary NUMERIC;
BEGIN
SELECT DISTINCT salary INTO nth_salary FROM worker
ORDER BY salary DESC
OFFSET nth_highest-1 LIMIT 1;
RETURN(SELECT COUNT(*) FROM worker WHERE salary=nth_salary);
END;
$$LANGUAGE plpgsql;
SELECT get_worker_count_by_nth_highest_salary(4);
