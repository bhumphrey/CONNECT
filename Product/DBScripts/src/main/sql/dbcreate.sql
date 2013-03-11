-- create application user
CREATE USER ${database.username} IDENTIFIED BY '${database.password}';


GRANT CREATE,SELECT,INSERT,UPDATE,DELETE ON *.* TO '${database.username}'@'localhost' IDENTIFIED BY '${database.password}' WITH GRANT OPTION;
GRANT CREATE,SELECT,INSERT,UPDATE,DELETE ON *.* TO '${database.username}'@'127.0.0.1' IDENTIFIED BY '${database.password}' WITH GRANT OPTION;
FLUSH PRIVILEGES;

