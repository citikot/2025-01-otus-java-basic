CREATE TABLE `otus_db`.`testset` (
  `id_testset` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id_testset`),
  UNIQUE INDEX `id_testset_UNIQUE` (`id_testset` ASC) VISIBLE);