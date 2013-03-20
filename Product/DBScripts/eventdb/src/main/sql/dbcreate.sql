
-- begin eventdb

CREATE DATABASE eventdb;

GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON eventdb.* to ${database.username};