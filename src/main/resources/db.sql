CREATE DATABASE IF NOT EXISTS `phs` DEFAULT CHARACTER SET utf8mb4;
USE `phs`;

CREATE TABLE IF NOT EXISTS `user`
(
  status TINYINT NOT NULL,

  open_id CHAR(28) NOT NULL,
  union_id CHAR(29) NOT NULL,
  nickname VARCHAR(255) NOT NULL,
  avatar_url VARCHAR(255) NOT NULL,
  gender INT,
  country VARCHAR(255),
  province VARCHAR(255),
  city VARCHAR(255),
  language VARCHAR(255),

  stu_no VARCHAR(255),
  `name` VARCHAR(255),
  school VARCHAR(255),
  class VARCHAR(255),
  college VARCHAR(255),

  own_groups JSON,
  manage_groups JSON,
  join_groups JSON,

  PRIMARY KEY (union_id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `group`
(
  id VARCHAR(255) NOT NULL,
  status TINYINT NOT NULL,
  code VARCHAR(255)  NOT NULL,

  nickname VARCHAR(255)  NOT NULL,
  avatar_url VARCHAR(255)  NOT NULL,

  create_time INT  NOT NULL,

  owner_id VARCHAR(255)  NOT NULL,
  managers JSON,
  members JSON,
  person_num INT  NOT NULL,

  PRIMARY KEY (id),
  KEY (code),
  FOREIGN KEY (owner_id) REFERENCES `user`(union_id) ON DELETE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `notice`
(
  id VARCHAR(255) NOT NULL,
  status TINYINT NOT NULL,
  `type` TINYINT  NOT NULL,

  creator_id VARCHAR(255) NOT NULL,
  group_id VARCHAR(255)  NOT NULL,

  title VARCHAR(255)  NOT NULL,
  content TEXT  NOT NULL,
  imgs JSON,
  note VARCHAR(255),
  create_time INT  NOT NULL,
  notice_time INT  NOT NULL,
  has_file TINYINT  NOT NULL,

  files JSON,

  watch_users JSON,
  watch_num INT,
  like_users JSON,
  like_num INT,

  PRIMARY KEY (id),
  FOREIGN KEY (group_id) REFERENCES `group`(id) ON DELETE CASCADE,
  FOREIGN KEY (creator_id) REFERENCES `user`(union_id) ON DELETE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

