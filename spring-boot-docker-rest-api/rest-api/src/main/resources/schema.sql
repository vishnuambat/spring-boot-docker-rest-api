DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  category_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  category_name VARCHAR(255) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  customer_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `vendor`;
CREATE TABLE `vendor` (
  vendor_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  vendor_name VARCHAR(255) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
