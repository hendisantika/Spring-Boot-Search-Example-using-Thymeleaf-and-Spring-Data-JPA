CREATE TABLE shop
(
    id         integer NOT NULL auto_increment,
    address    varchar(255),
    country    varchar(255),
    owner_name varchar(255),
    shop_no    bigint  NOT NULL,
    shop_type  varchar(255),
    PRIMARY KEY (id)
) engine=InnoDB;
