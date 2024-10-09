SELECT hd.hotel_id, 
       hd.hotel_name, 
       hd.hotel_type
FROM hotel_details hd
LEFT JOIN orders o ON hd.hotel_id = o.hotel_id 
                   AND o.order_date >= '2019-05-01' 
                   AND o.order_date < '2019-06-01'
WHERE o.order_id IS NULL
ORDER BY hd.hotel_id ASC;

