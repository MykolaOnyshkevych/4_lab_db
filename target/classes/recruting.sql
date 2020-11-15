CREATE SCHEMA IF NOT EXISTS recrutingdb DEFAULT CHARACTER SET utf8 ;
USE recrutingdb;

DROP TABLE IF EXISTS it_company_vacancy_has_contact_person;
DROP TABLE IF EXISTS it_company_vacancy_has_candidate_info;
DROP TABLE IF EXISTS it_company_vacancy;
DROP TABLE IF EXISTS candidate_info;
DROP TABLE IF EXISTS contact_person;
DROP TABLE IF EXISTS interview_resaults;
DROP TABLE IF EXISTS english_level_test;
DROP TABLE IF EXISTS programming_level_test;


CREATE TABLE IF NOT EXISTS it_company_vacancy (
                                                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                                  vacancy_description VARCHAR(45) NOT NULL,
                                                  project_name VARCHAR(45) NOT NULL,
                                                  vacancy_salary_in_gryvnas INT NOT NULL)

    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS english_level_test (
                                                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                                  test_mark_english INT NOT NULL,
                                                  expert_comment VARCHAR(360) NOT NULL)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS programming_level_test (
                                                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                                      programming_level VARCHAR(45) NOT NULL,
                                                      test_mark_programming INT NOT NULL,
                                                      expert_comment VARCHAR(360) NOT NULL)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS interview_resaults (
                                                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                                  experts_mark varchar(45) NOT NULL,
                                                  english_id BIGINT NOT NULL,
                                                  programing_id BIGINT NOT NULL)
    ENGINE = InnoDB;
ALTER TABLE interview_resaults
    ADD CONSTRAINT FK_interview_has_english_test_resault
        FOREIGN KEY (english_id)
            REFERENCES english_level_test (id),
    ADD CONSTRAINT FK_interview_has_programming_test_resault
        FOREIGN KEY (programing_id)
            REFERENCES programming_level_test(id);

CREATE TABLE IF NOT EXISTS candidate_info (
                                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                              candidate_name VARCHAR(45) NOT NULL,
                                              candidate_second_name VARCHAR(45) NOT NULL,
                                              work_experience_in_years INT NOT NULL,
                                              age INT NOT NULL,
                                              interview_id BIGINT NOT NULL)
    ENGINE = InnoDB;
ALTER TABLE candidate_info
    ADD CONSTRAINT FK_candidate_info_has_interview_resaults
        FOREIGN KEY (interview_id)
            REFERENCES interview_resaults(id);

CREATE TABLE IF NOT EXISTS contact_person (
                                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                              first_name_person VARCHAR(45) NOT NULL,
                                              last_name_person VARCHAR(45) NOT NULL,
                                              phone_number INT NOT NULL,
                                              person_email VARCHAR(180) NOT NULL)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS it_company_vacancy_has_contact_person (
                                                                     it_company_vacancy_id BIGINT NOT NULL,
                                                                     contact_person_id BIGINT NOT NULL,
                                                                     PRIMARY KEY (it_company_vacancy_id, contact_person_id))
    ENGINE = InnoDB;
ALTER TABLE it_company_vacancy_has_contact_person
    ADD CONSTRAINT FK_it_company_vacancy_has_contact_person_company1
        FOREIGN KEY (it_company_vacancy_id)
            REFERENCES it_company_vacancy (id),
    ADD CONSTRAINT FK_it_company_vacancy_has_contact_person_person1
        FOREIGN KEY (contact_person_id)
            REFERENCES contact_person (id);


CREATE TABLE IF NOT EXISTS it_company_vacancy_has_candidate_info(
                                            it_company_vacancy_id BIGINT NOT NULL,
                                    candidate_info_id BIGINT NOT NULL,
                                                                PRIMARY KEY (it_company_vacancy_id, candidate_info_id))
    ENGINE = InnoDB;
ALTER TABLE it_company_vacancy_has_candidate_info
    ADD CONSTRAINT FK_it_company_vacancy_has_candidate_info_company1
        FOREIGN KEY (it_company_vacancy_id)
            REFERENCES it_company_vacancy(id),
    ADD CONSTRAINT FK_it_company_vacancy_has_candidate_info_candidate1
        FOREIGN KEY (candidate_info_id)
            REFERENCES candidate_info (id);

CREATE INDEX progr_mark ON programming_level_test(test_mark_programming);
CREATE INDEX salary ON it_company_vacancy(vacancy_salary_in_gryvnas);

INSERT INTO english_level_test (id, test_mark_english, expert_comment) VALUES
(1,  56, 'Not Bad'),
(2, 61, 'Good'),
(3, 72, 'Completely Good'),
(4, 94, 'Exelent');

INSERT INTO programming_level_test( id, programming_level, test_mark_programming, expert_comment) VALUES
(1, 'Junior', 50, 'Yuo should practise more'),
(2, 'Senior', 92, 'Excellent'),
(3, 'Junior', 52, 'Try harder'),
(4, 'Middle', 78, 'Completely good');

INSERT INTO interview_resaults (id, experts_mark, english_id, programing_id) VALUES
(1, 'exelent', 1, 1),
(2, 'good', 2,  2),
(3, 'satisfied', 3, 3),
(4, 'exelent', 4,  4);

INSERT INTO contact_person (id, first_name_person, last_name_person, phone_number, person_email) VALUES
(1, 'Anna', 'Bogomol', 975647873, 'annabomogol@gmail.com'),
(2, 'Serhiy', 'Dudka', 975647873, 'seriidudka@gmail.com'),
(3, 'Bohdan', 'Shvadchak', 975647873, 'kakakkakak@gmail.com'),
(4, 'Bohdan', 'Shvadchak', 975647873, 'kakakkakak@gmail.com');

INSERT INTO candidate_info (id, candidate_name, candidate_second_name, work_experience_in_years, age, interview_id) VALUES
(1, 'Nazar', 'Polishchuk', 3, 34, 1),
(2, 'Oleh', 'Urban', 4, 25, 2),
(3, 'Bohdan', 'Dorog', 6, 35, 3),
(4, 'Olya', 'Bedrylo', 8, 36, 4);

INSERT INTO it_company_vacancy (id, vacancy_description,project_name,vacancy_salary_in_gryvnas) VALUES
(1, 'Tech Lid', 'Furia', 23000),
(2, 'Junior Java Developer', 'Amazon Go', 5000),
(3, 'Middle Java Developer', 'Frenk', 34000),
(4, 'Project Manager', 'Steam prod', 28000);


INSERT INTO it_company_vacancy_has_contact_person (it_company_vacancy_id, contact_person_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4);

INSERT INTO it_company_vacancy_has_candidate_info (it_company_vacancy_id, candidate_info_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4);