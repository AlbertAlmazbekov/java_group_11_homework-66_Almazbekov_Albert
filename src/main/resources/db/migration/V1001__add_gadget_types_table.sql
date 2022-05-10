use `gadgets`;

create table gadgetType(
   id BIGSERIAL not null,
   name varchar(50) not null,
   icon varchar (50) not null
);

alter table `gadgets`
    add column `gadget_type_id` INT NOT NULL after `place_id`,
    add CONSTRAINT `fk_gadget__gadget_types`
        FOREIGN KEY (`gadget_type_id`)
            REFERENCES `gadget_types` (`id`);