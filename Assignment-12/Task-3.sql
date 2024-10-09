SELECT Customer_id, Customer_name, Phone_no, Address
FROM Customers
WHERE Email_id LIKE '_____@gmail.com' COLLATE "C"
ORDER BY Customer_id;

