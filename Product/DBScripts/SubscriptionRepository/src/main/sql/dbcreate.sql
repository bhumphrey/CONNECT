-- begin subscription repository creation
CREATE DATABASE subscriptionrepository;

GRANT CREATE, SELECT,INSERT,UPDATE,DELETE ON subscriptionrepository.* to ${database.username};