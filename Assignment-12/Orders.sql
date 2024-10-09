CREATE TABLE orders(
order_id VARCHAR(10) PRIMARY KEY,
customer_id VARCHAR(20) NULL ,
hotel_id VARCHAR(20) NULL,
partner_id  VARCHAR(10) NULL, 
order_date DATE NULL,
order_amount INT NULL,
FOREIGN KEY (customer_id ) REFERENCES Customers(customer_id),
FOREIGN KEY (hotel_id) REFERENCES hotel_details(hotel_id),
FOREIGN KEY (partner_id) REFERENCES delivery_partners(partner_id)
);

INSERT INTO orders
VALUES
('O1', 'C1', 'H1', 'P1', '2024-10-01', 5000),
('O2', 'C2', 'H2', 'P2', '2024-10-02', 7000),
('O3', 'C3', 'H3', 'P3', '2024-10-03', 3000),
('O4', 'C4', 'H4', 'P4', '2024-10-04', 8000),
('O5', 'C5', 'H5', 'P5', '2024-10-05', 4000);