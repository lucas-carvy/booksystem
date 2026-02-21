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

create table order_list (
    orderlistid varchar(400) not null primary key,
    bookid varchar(400),

    constraint fk_bok_bookid foreign key (bookid) references book (id)

);

create table orders (
    orderid varchar(400) not null primary key,
    totalprice numeric(20, 2),
    orderlistid varchar(400),

    constraint fk_oli_orderlistid foreign key (orderlistid) references order_list (orderlistid)

);