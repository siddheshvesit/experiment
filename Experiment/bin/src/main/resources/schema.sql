CREATE TABLE product_register (
  product_unique_code INT AUTO_INCREMENT  PRIMARY KEY,
  product_name VARCHAR(250) NOT NULL,
  product_category VARCHAR(250) NOT NULL,
  product_sub_category varchar(250) NOT NULL,
  product_brand varchar(250) NOT NULL,
  product_weight INT NOT NULL,
  product_price INT NOT NULL
);

