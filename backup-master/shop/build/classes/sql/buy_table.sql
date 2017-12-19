use orange;

drop table if exists buy_table;
drop table if exists pay_table;

create table buy_table(
id int not null primary key auto_increment,
item_transaction_id int,
total_price float,
shipping_user_name varchar(255),
shipping_company_name varchar(255),
shipping_address1 varchar(255),
shipping_address2 varchar(255),
shipping_user_city varchar(255),
shipping_user_state varchar(255),
shipping_user_zip varchar(255),
shipping_user_country varchar(255),
shipping_user_phone varchar(255),
memory_form int,
storage_form int,
mouse_form int,
fruit_form int,
flower_form int,
accessories_type int,
deliver int,
user_id varchar(16),
insert_date datetime
);

create table pay_table(
id int not null primary key auto_increment,
shipping_user_name varchar(255),
shipping_company_name varchar(255),
shipping_address1 varchar(255),
shipping_address2 varchar(255),
shipping_user_city varchar(255),
shipping_user_state varchar(255),
shipping_user_zip varchar(255),
shipping_user_country varchar(255),
shipping_user_phone varchar(255),
card_type int,
card_number varchar(255),
name_on_card varchar(255),
card_expiry_date varchar(255),
card_code int,
price float,
user_id varchar(16),
insert_date datetime
);