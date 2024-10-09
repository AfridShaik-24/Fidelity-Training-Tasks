CREATE TABLE salesman (
    salesman_id NUMERIC(5) PRIMARY KEY,
    name VARCHAR(30) NULL,
    city VARCHAR(15) NULL,
    commission DECIMAL(5, 2) NULL
);
CREATE TABLE orders (
    ord_no NUMERIC(5) PRIMARY KEY,
    purch_amt DECIMAL(8, 2) NULL,
    ord_date DATE NOT NULL,
    customer_id NUMERIC(5) NULL,
    salesman_id NUMERIC(5) NULL,
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);




