create table collection (
    collection_id varchar(400) not null primary key,
    name varchar(55) not null
);

create table book (
    book_id varchar(400) not null primary key,
    name varchar(55) not null,
    price numeric(20, 2),
    collection_id varchar(400),

    constraint fk_clc_collectionid foreign key (collection_id) references collection (collection_id)
);

create table orders (
     order_id varchar(400) not null primary key,
     order_item_id varchar(400)

);

create table order_item (
    order_item_id varchar(400) not null primary key,
    order_id varchar(400) not null,
    book_id varchar(400),
    quantity numeric(50),

    constraint fk_ori_orderid foreign key (order_id) references orders (order_id),
    constraint fk_bok_bookid foreign key (book_id) references book (book_id)

);