GRANT USAGE ON *.* TO ${database.username} identified by '${database.password}';
DROP USER '${database.username}';

-- workaround for non-supported DROP USER IF EXISTS. see MySQL Bug #15287
DELETE FROM mysql.user WHERE User = '${database.username}';