-- begin transrepo

CREATE DATABASE transrepo;

GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON transrepo.* to ${database.username};