
-- begin patientdb
CREATE DATABASE patientdb;

GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON patientdb.* to ${database.username};