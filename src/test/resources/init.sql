use test;
CREATE TABLE `customer` (
                          `id` VARCHAR(60) NOT NULL,
                          `name` VARCHAR(80) NOT NULL,
                          PRIMARY KEY (`ID`));

insert into `customer` (id, name) values ('1', 'Tom');
insert into `customer` (id, name) values ('2', 'Dick');
insert into `customer` (id, name) values ('3', 'Harry');
commit;
