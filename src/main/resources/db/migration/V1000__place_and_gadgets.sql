use `gadgets`;

create table places(
    id BIGSERIAL not null,
    name varchar(50) not null,
    address varchar (50) not null,
    image varchar (50) not null
);
`place_id` int                not null,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_gadget_place` FOREIGN KEY (`place_id`) REFERENCES `places` (`id`)
create table gadgets(
    id BIGSERIAL not null,
    name varchar(50) not null,
    image varchar (50) not null,
    price varchar (50) not null
    `place_id` int not null,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_gadget_place` FOREIGN KEY (`place_id`) REFERENCES `places` (`id`)
);