/**
 * Author:  Jessica
 * Created: 20/02/2020
 */

CREATE TABLE usuario (
  id bigint NOT NULL AUTO_INCREMENT,
  login varchar(255) DEFAULT NULL,
  nome varchar(255) DEFAULT NULL,
  senha varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

