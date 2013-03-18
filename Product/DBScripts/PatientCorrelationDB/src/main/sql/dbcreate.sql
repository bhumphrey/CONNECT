
-- begin patientcorrelationdb
CREATE DATABASE patientcorrelationdb;

GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON patientcorrelationdb.* to ${database.username};