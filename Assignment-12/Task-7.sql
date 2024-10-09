SELECT hd.hotel_id, 
hd.hotel_name, 
COUNT(o.order_id) AS NO_OF_ORDERS
FROM hotel_details hd
JOIN orders o ON hd.hotel_id = o.hotel_id
GROUP BY hd.hotel_id, hd.hotel_name
HAVING COUNT(o.order_id) > 5
ORDER BY hd.hotel_id ASC;
