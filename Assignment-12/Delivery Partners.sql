CREATE TABLE Delivery_partners(
Partner_id VARCHAR(10) PRIMARY KEY,
Partner_Name VARCHAR(20) NULL,
phone_no BIGINT NULL,
Rating INT null
);


INSERT INTO delivery_partners
VALUES
('P1', 'Rakesh', 9123456780, 4),
('P2', 'Anjali', 9123456781, 5),
('P3', 'Vikram', 9123456782, 3),
('P4', 'Nisha', 9123456783, 4),
('P5', 'Suresh', 9123456784, 5);
