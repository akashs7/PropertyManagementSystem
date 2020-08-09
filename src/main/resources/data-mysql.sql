
delete from atrium;
insert into atrium(zone, daytype, renttype, rent) values ("North & West", "WeekDays", "HourWise", 600),
                                                                     ("North & West", "WeekEnd", "HourWise", 1000),
                                                                     ("North & West", "PublicHoliday", "HourWise", 2000),
                                                                     ("South", "WeekDays", "HourWise", 750),
                                                                     ("South", "WeekEnd", "HourWise", 1500),
                                                                     ("South", "PublicHoliday", "HourWise", 3000);

delete from banner;
insert into banner(daytype, rent) values("WeekDays", 1000), ("WeekEnd", 2500),("PublicHoliday", 50000);

delete from cinema;
insert into cinema(rent, place) values (100000, "Top Floor");

delete from users;
insert into users(username, firstname, lastname, password, email, role) values ("akashs7", "Akash", "Singh", "1234", "singh.akash1dec@gmail.com", "USER");
insert into users(username, password, role) values ("admin", "admin", "ADMIN");

delete from shop;
insert into shop(shoptype, daytype, renttype, rent) values ("Small","WeekDays", "DayWise", 1000),
                                                                      ("Small", "WeekEnd", "HourWise", 750),
                                                                      ("Small", "PublicHoliday", "HourWise", 1500),
                                                                      ("Medium", "WeekDays" , "DayWise", 3000),
                                                                      ("Medium", "WeekEnd", "DayWise", 1250),
                                                                      ("Medium", "PublicHoliday", "HourWise", 6000),
                                                                      ("Large", "WeekDays", "DayWise", 10000),
                                                                      ("Large", "WeekEnd", "DayWise", 3000),
                                                                      ("Large", "PublicHoliday", "DayWise", 9000);