CREATE SCHEMA IF NOT EXISTS lab5db DEFAULT CHARACTER SET utf8;
USE lab5db;

DROP TABLE IF EXISTS candidate_info;
DROP TABLE IF EXISTS contact_person;
DROP TABLE IF EXISTS interview_results;
DROP TABLE IF EXISTS it_company_vacancy;

CREATE TABLE IF NOT EXISTS it_company_vacancy
(
    id                        INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    vacancy_description       VARCHAR(45) NOT NULL,
    vacancy_salary_in_gryvnas INT         NOT NULL
)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS interview_results
(
    id             INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    experts_mark     VARCHAR(45) NOT NULL,
    programming_mark INT         NOT NULL,
    english_mark     INT         NOT NULL
)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS candidate_info
(
    id                    INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name            VARCHAR(45) NOT NULL,
    second_name           VARCHAR(45) NOT NULL,
    interview_id          INT         NOT NULL,
    it_company_vacancy_id INT         NOT NULL
)
    ENGINE = InnoDB;

ALTER TABLE candidate_info
    ADD CONSTRAINT FK_interview_results_has_candidate_info
        FOREIGN KEY (interview_id)
            REFERENCES interview_results (id),
    ADD CONSTRAINT FK_it_company_vacancy_has_candidate_info
        FOREIGN KEY (it_company_vacancy_id)
            REFERENCES it_company_vacancy (id);

CREATE TABLE IF NOT EXISTS contact_person
(
    id                    INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    person_name           VARCHAR(45) NOT NULL,
    phone_number          INT         NOT NULL,
    it_company_vacancy_id INT         NOT NULL
)
    ENGINE = InnoDB;
ALTER TABLE contact_person
    ADD CONSTRAINT FK_it_company_vacancy_has_contact_person
        FOREIGN KEY (it_company_vacancy_id)
            REFERENCES it_company_vacancy (id);

INSERT INTO it_company_vacancy (id, vacancy_description, vacancy_salary_in_gryvnas)
VALUES (1, 'Tech Lid', 23000),
       (2, 'Junior Java Developer', 5000),
       (3, 'Middle Java Developer', 34000),
       (4, 'Project Manager', 28000);

INSERT INTO interview_results (id, experts_mark, english_mark, programming_mark)
VALUES (1, 'exelent', 1, 1),
       (2, 'good', 2, 2),
       (3, 'satisfied', 3, 3),
       (4, 'exelent', 4, 4);

INSERT INTO contact_person (id, person_name, phone_number, it_company_vacancy_id)
VALUES (1, 'Anna', 975647873, 1),
       (2, 'Serhiy', 975647873, 2),
       (3, 'Bohdan', 975647873, 3),
       (4, 'Bohdan', 975647873, 4);

INSERT INTO candidate_info (id, first_name, second_name, interview_id, it_company_vacancy_id)
VALUES (1, 'Nazar', 'Polishchuk', 1, 1),
       (2, 'Oleh', 'Urban', 2, 2),
       (3, 'Bohdan', 'Dorog', 3, 3),
       (4, 'Olya', 'Bedrylo', 4, 4);