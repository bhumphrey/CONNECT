-- begin asyncmsgs
CREATE DATABASE asyncmsgs;

GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON asyncmsgs.* to ${database.username};
