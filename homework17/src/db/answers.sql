CREATE TABLE `otus_db`.`answers` (
  `id_answer` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_question` INT UNSIGNED NULL,
  `answer` VARCHAR(255) NULL,
  `is_correct` TINYINT NOT NULL,
  PRIMARY KEY (`id_answer`),
  UNIQUE INDEX `id_answer_UNIQUE` (`id_answer` ASC) VISIBLE);