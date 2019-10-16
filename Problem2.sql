
SELECT 
     SUM(CASE WHEN Home_Page='1' THEN 1 ELSE 0 END) AS Home_Page_count
    ,SUM(CASE WHEN Product_Page='1'  THEN 1 ELSE 0 END) AS Product_Page_count
    ,SUM(CASE WHEN Warranty_Page='1'  THEN 1 ELSE 0 END) AS Warranty_Page_count
FROM sql_test_a;