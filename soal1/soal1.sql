SELECT m.id as id_murid, m.name as name, p.status as pendidikan_terakhir, m.time_create as time_create, p.time_create as time_updated
FROM `murid` m
         LEFT JOIN `pendidikan` p on p.id_murid = m.id
WHERE p.time_create IN (
    SELECT MAX(time_create)
    FROM `pendidikan` p2
    GROUP BY id_murid
);