create table customers(
  id BIGSERIAL not null,
  email varchar(50) not null,
  password varchar(50) not null,
  fullname varchar(50) not null
);