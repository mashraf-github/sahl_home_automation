--#################################################
--Insert users, roles and users roles
--#################################################
INSERT INTO users(id,created_at,updated_at,adress,company,email_adress,enabled,mobile_number,name_ar,name_en,national_id,password,premium,token_expired,username,created_by,updated_by)VALUES(1,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'Moharrem bek',false,'muhammed.ashraf321@gmail.com',true,'+20 106 330 8070','„Õ„œ √‘—› ﬂ„«·','Mohamed Ashraf Kamal','29008130201458','$2a$10$/ns.CwZ9sdhQaVjw/bwBQeelnmTZTI19trLtyY/bjbIVUokAckX8y',true,false,'mashraf',1,1);
INSERT INTO users(id,created_at,updated_at,adress,company,email_adress,enabled,mobile_number,name_ar,name_en,national_id,password,premium,token_expired,username,created_by,updated_by)VALUES(2,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'Kafr Abdo',false,'muhammed.ashraf321@gmail.com',true,'+20 106 330 8070','„Õ„œ √Õ„œ ›—€·Ì','Mohamed Ahmed Farghaly','29008130201458','$2a$10$WPDbKLCRnV0UrkEs2IEtUejsZiicxt0/GhUcOkg2.UscjBi8tOmxa',true,false,'mfarghaly',1,1);

INSERT INTO roles (id,name,created_by,created_at,updated_by,updated_at) values (1,'ADMIN',1,CURRENT_TIMESTAMP,1,CURRENT_TIMESTAMP);
INSERT INTO roles (id,name,created_by,created_at,updated_by,updated_at) values (2,'USER',1,CURRENT_TIMESTAMP,1,CURRENT_TIMESTAMP);

INSERT INTO users_roles (user_id, role_id) values (1, 1);
INSERT INTO users_roles (user_id, role_id) values (2, 1);