CREATE TABLE `otus_db`.`answers` (
  `id_answer`   INT UNSIGNED      NOT NULL AUTO_INCREMENT,
  `id_question` INT UNSIGNED      NOT NULL,
  `answer`      VARCHAR(255)      NOT NULL,
  `is_correct`  TINYINT           NOT NULL,

  PRIMARY KEY (`id_answer`),
  INDEX `idx_answers_question` (`id_question`),
  CONSTRAINT `fk_answers_questions`
    FOREIGN KEY (`id_question`)
    REFERENCES `otus_db`.`questions` (`id_question`)
    ON DELETE CASCADE,

)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
