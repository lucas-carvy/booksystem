create table collection (
    collectionid varchar(400) not null primary key,
    name varchar(55) not null
);

create table book (
    id varchar(400) not null primary key,
    name varchar(55) not null,
    price numeric(20, 2),
    collectionid varchar(400),

    constraint fk_clc_collectionid foreign key (collectionid) references collection (collectionid)
);