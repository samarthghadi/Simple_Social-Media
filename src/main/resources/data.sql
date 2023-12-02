-- {User table} --
INSERT INTO user_details(id,birth_date,name)
VALUES(10001, current_date(), 'Samarth');

INSERT INTO user_details(id,birth_date,name)
VALUES(10002, current_date(), 'Max');

INSERT INTO user_details(id,birth_date,name)
VALUES(10003, current_date(), 'Tom');

INSERT INTO user_details(id,birth_date,name)
VALUES(10004, current_date(), 'Chloe');

-- {Post Table} --
INSERT INTO post(id, description, user_id)
VALUES(20001, 'I want to Learn Java FullStack', 10001);

INSERT INTO post(id, description, user_id)
VALUES(20002, 'I want to Learn AWS', 10002);

INSERT INTO post(id, description, user_id)
VALUES(20003, 'I want to Get A Job', 10003);

INSERT INTO post(id, description, user_id)
VALUES(20004, 'I want Learn Self Discipline', 10004);

