CREATE TABLE Customers (
    cust_id VARCHAR(10) PRIMARY KEY,
    cust_name VARCHAR(20) NULL,
    cust_phone BIGINT NULL,
    cust_address VARCHAR(20) NULL
);
CREATE TABLE Delivery_partner (
    partner_id VARCHAR(10) PRIMARY KEY,
    partner_name VARCHAR(15) NULL,
    rating INT NULL
);
CREATE TABLE Pizza (
    pizza_id VARCHAR(10) PRIMARY KEY,
    cust_id VARCHAR(10) NULL,
    partner_id VARCHAR(10) NULL,
    pizza_type VARCHAR(50) NULL,
    pizza_name VARCHAR(50) NULL,
    order_date DATE NULL,
    amount BIGINT NULL,
    FOREIGN KEY (cust_id) REFERENCES Customers(cust_id),
    FOREIGN KEY (partner_id) REFERENCES Delivery_partner(partner_id)
);

UPDATE Pizza
SET amount = amount * 0.97
WHERE pizza_type = 'Extra Large';


