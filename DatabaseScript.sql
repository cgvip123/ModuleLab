CREATE TABLE admins (
 	mobile_no varchar(10) check (regexp_like(mobile_no,'^[6-9][0-9]{9}')),
 	name varchar(50) check (regexp_like(name,'[A-Za-z]')),  
 	password varchar(20) NOT NULL,
	email varchar(70),
	PRIMARY KEY (mobile_no)
	); 

CREATE TABLE customer (
	mobile_no varchar(10) check (regexp_like(mobile_no,'^[6-9][0-9]{9}')) NOT NULL ,
	name varchar(50) check (regexp_like(name,'[A-Za-z]')) NOT NULL,
	email varchar(70) NOT NULL UNIQUE,
	gender varchar(6) NOT NULL,
  	dob varchar(20),
	password varchar(20) NOT NULL,
	wishlist_id number(10),
	cart_id number(10),
	sno number(10),
	active varchar(1),
	PRIMARY KEY (mobile_no),
	FOREIGN KEY (wishlist_id) REFERENCES WishList(wishlist_id),
	FOREIGN KEY (sno) REFERENCES savedCard_master(sno),
	FOREIGN KEY (cart_id) REFERENCES Cart(cart_id)
	);

CREATE TABLE address (
 	mobile_no varchar(10) check (regexp_like(mobile_no,'^[6-9][0-9]{9}')) NOT NULL, 
	house_no varchar(10),  	
  	area varchar(20),
	city varchar(20) NOT NULL,
	pincode varchar(6) NOT NULL,
	states varchar(30) NOT NULL,
	landmark varchar(50),
	name varchar(50),
	alternate_mobile varchar(10),
	address_type varchar(10),
	order_id number(10) NOT NULL,
	FOREIGN KEY (mobile_no) REFERENCES customer(mobile_no),
	PRIMARY KEY (mobile_no)
	);

CREATE TABLE coupon (
 	coupon_id number(10) NOT NULL,
 	coupon_code varchar(6) NOT NULL, 	
 	description varchar(50) NOT NULL,
 	expiry_date date NOT NULL,
 	coupon_applied varchar(1),
	prod_id number(10),	
	FOREIGN KEY (prod_id) REFERENCES product(prod_id),
	PRIMARY KEY (coupon_id)
	);


CREATE TABLE feedback (
 	feedback_id number(10) NOT NULL,
 	description varchar(50) NOT NULL,
	rating number(5,2),
	mobile_no varchar(10) NOT NULL,
 	prod_id number(10) NOT NULL,
	FOREIGN KEY (prod_id) REFERENCES product(prod_id),	
	FOREIGN KEY (mobile_no) REFERENCES customer(mobile_no),
	PRIMARY KEY (feedback_id)
	);
	
CREATE TABLE merchant (
	merchant_id number(10) NOT NULL ,
	merchant_name varchar(50) NOT NULL,
	email varchar(70) NOT NULL UNIQUE,
	password varchar(20) NOT NULL,
  	mobile varchar(10) NOT NULL UNIQUE,
 	merchant_type  varchar(255) NOT NULL,
 	merchant_address varchar(255) ,
	prod_id number(10) ,
	FOREIGN KEY (prod_id) REFERENCES product(prod_id),
	PRIMARY KEY (merchant_id)
	); 

CREATE TABLE product (
 	prod_id number(10) NOT NULL ,
 	name varchar(70) NOT NULL UNIQUE,
 	sizes varchar(5)  ,
 	intial_quantity number(5) NOT NULL,
	available_quantity number(5) NOT NULL,
	price number(6,2),
 	rating number(5,2),
	product_category varchar(50),
	discount number(5,2),	
	merchant_id number(10),
	wishlist_id number(10),
	order_id number(10),
	FOREIGN KEY (merchant_id) REFERENCES merchant(merchant_id),
	FOREIGN KEY (wishlist_id) REFERENCES WishList(wishlist_id),
	FOREIGN KEY (order_id) REFERENCES Orders(order_id),
	PRIMARY KEY (prod_id)
	);


CREATE TABLE cart (
 	cart_id number(10) NOT NULL,
	prod_id number(10) NOT NULL,
	PRIMARY KEY (cart_id),
	FOREIGN KEY (prod_id) REFERENCES product(prod_id)
	); 

CREATE TABLE WishList (
 	wishlist_id number(10) NOT NULL ,
	PRIMARY KEY (wishlist_id)
	); 

CREATE TABLE Orders (
 	order_id number(10) NOT NULL,
	prod_id number(10),
	purchase_date date,
    delivery_address varchar(255),
	delivery_date date,
	order_status varchar(20),
	subtotal  number(10,2),
  	cust_mobile_no varchar(10), 
	PRIMARY KEY (order_id),
	FOREIGN KEY (cust_mobile_no) REFERENCES customer(mobile_no),
	FOREIGN KEY (cust_mobile_no) REFERENCES address(mobile_no)
	);

CREATE TABLE images(
	image_id number(10) NOT NULL,
	url varchar(255),
	prod_id number(10),
	PRIMARY KEY (image_id),
	FOREIGN KEY (prod_id) REFERENCES product(prod_id)
	);


CREATE TABLE invoice (
 	invoice_id number(10) NOT NULL ,
	payment_options varchar(20),
	transaction_id number(20) ,
	PRIMARY KEY (invoice_id)
	);
 
CREATE TABLE savedCard(
	sno number(10) NOT NULL,
	card_holder_name varchar(50) NOT NULL,
	cardno number(16) NOT NULL,
	expirymon number(2) NOT NULL,
	expiry_year number(4) NOT NULL,
	PRIMARY KEY (sno)
);

	