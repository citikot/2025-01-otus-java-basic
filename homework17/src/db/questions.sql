CREATE TABLE `otus_db`.`questions` (
  `id_question` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(200) NULL,
  PRIMARY KEY (`id_question`),
  UNIQUE INDEX `id_question_UNIQUE` (`id_question` ASC) VISIBLE);