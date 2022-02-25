-- An Sql File Containing all the SQL Statements used in the system

CREATE TABLE  users_table(
    id INT NOT NULL AUTO_INCREMENT,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    account_type INT NOT NULL,
    role INT NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (role) REFERENCES roles_table(id),
    FOREIGN KEY (account_type) REFERENCES account_types_table(id)
);

CREATE TABLE account_types_table(
    id INT NOT NULL AUTO_INCREMENT,
    account_type VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE  roles_table(
    id INT NOT NULL AUTO_INCREMENT,
    role VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);