 ALTER TABLE Customers
 ALTER COLUMN customer_id TYPE INT USING cust_id::INT;

-- select * from customers;
