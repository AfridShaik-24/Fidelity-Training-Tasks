CREATE TABLE Hotel_Details(
hotel_id VARCHAR(10) PRIMARY KEY,
hotel_name VARCHAR(20) NULL,
hotel_type VARCHAR(20) NULL,
rating INT NULL
);

INSERT INTO hotel_details
VALUES
('H1', 'Taj Palace', 'Luxury', 5),
('H2', 'ITC Grand', 'Luxury', 5),
('H3', 'Holiday Inn', 'Business', 4),
('H4', 'The Leela', 'Resort', 5),
('H5', 'Radisson Blu', 'Business', 4),
('H6', 'Budget Stay', 'Budget', 1);  