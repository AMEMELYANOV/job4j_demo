create table if not exists posts (
   id serial primary key not null,
   name varchar(255)
);

insert into posts (name)
values ('Hello');

insert into posts (name)
values ('Bye Bye');
