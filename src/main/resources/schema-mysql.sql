create table if not exists users(id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY  , username VARCHAR(50), firstname varchar(50), lastname varchar(50),
                                 password varchar(20), email varchar(100), role varchar(20))ENGINE = InnoDB DEFAULT charset =utf8;

create table if not exists shop(id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY , shoptype varchar(50) , daytype varchar(50) , renttype varchar(50),
                  rent double )ENGINE = InnoDB DEFAULT charset =utf8;

create table if not exists atrium(id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY , zone varchar(50) , daytype varchar(50) ,
                    renttype varchar(50) , rent double )ENGINE = InnoDB DEFAULT charset =utf8;

create table if not exists cinema(id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY , rent double , place varchar(50))ENGINE = InnoDB DEFAULT charset =utf8;

create table if not exists banner(id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY , daytype varchar(50)  , rent double )ENGINE = InnoDB DEFAULT charset =utf8;

create table if not exists complaint(id bigint not null AUTO_INCREMENT PRIMARY KEY , username varchar(50) , property varchar(50), problemtype varchar(50) , description varchar(200), date DATE )ENGINE = InnoDB DEFAULT charset =utf8;

create table if not exists bookings(id bigint not null AUTO_INCREMENT PRIMARY KEY , username varchar(50) , property varchar(50), startday date  , endday date, rent double)ENGINE = InnoDB DEFAULT charset =utf8;
