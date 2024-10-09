SELECT o.order_id, 
       c.customer_name, 
       hd.hotel_name, 
       o.order_amount
FROM orders o
JOIN Customers c ON o.customer_id = c.customer_id
JOIN hotel_details hd ON o.hotel_id = hd.hotel_id
ORDER BY o.order_id ASC;


