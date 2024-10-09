CREATE table Customers(
Customer_id VARCHAR(10) primary key,
Customer_name VARCHAR(20),
Address VARCHAR(20),
Phone_no BIGINT,
Email_id VARCHAR(20)
);

INSERT INTO Customers (Customer_id, Customer_name, Address, Phone_no, Email_id)
VALUES
('C1', 'Rahul', 'Visakhapatnam', 9876543210, 'rahul@gmail.in'),
('C2', 'Priya', 'Vijayawada', 9876543211, 'priya@gamil.in'),
('C3', 'Afrid', 'Guntur', 9876543212, 'afrid@gmail.in'),
('C4', 'Sneha', 'Tirupati', 9876543213, 'sneha@gmail.in'),
('C5', 'Rajesh', 'Kakinada', 9876543214, 'rajesh@gmail.in');