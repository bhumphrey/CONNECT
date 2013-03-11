-- begin assigning authority
CREATE DATABASE assigningauthoritydb;

GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON assigningauthoritydb.* to ${database.username};
-- end assigning authority