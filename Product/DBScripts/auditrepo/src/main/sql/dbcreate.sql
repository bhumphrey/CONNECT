-- begin auditrepo
CREATE DATABASE auditrepo;


GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON auditrepo.* to ${database.username};