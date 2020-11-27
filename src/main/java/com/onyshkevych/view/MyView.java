package com.onyshkevych.view;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.onyshkevych.controller.ContactPersonController;
import com.onyshkevych.controller.CandidateInfoController;
import com.onyshkevych.controller.InterviewResultsController;
import com.onyshkevych.controller.ItCompanyVacancyController;
import com.onyshkevych.models.ItCompanyVacancy;
import com.onyshkevych.models.CandidateInfo;
import com.onyshkevych.models.ContactPerson;
import com.onyshkevych.models.InterviewResults;


public class MyView {
    private final ItCompanyVacancyController iTCompanyVacancyController = new ItCompanyVacancyController();
    private final InterviewResultsController interviewResultsController = new InterviewResultsController();
    private final ContactPersonController contactPersonController = new ContactPersonController();
    private final CandidateInfoController candidateInfoController = new CandidateInfoController();
    private final Map<String, String> menu;
    private final Map<String, Printable> methodsMenu;
    private static final Scanner INPUT = new Scanner(System.in);

    public MyView() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();
        menu.put("Q", "Q - exit program");
        menu.put("M", "M - show menu");

        menu.put("1", "1 - Get all contact persons");
        menu.put("2", "2 - Get contact person by ID");
        menu.put("3", "3 - Create contact persons");
        menu.put("4", "4 - Delete contact person by ID");
        menu.put("5", "5 - Update contact person");

        menu.put("6", "6 - Get all candidates");
        menu.put("7", "7 - Get candidate by ID");
        menu.put("8", "8 - Create candidate");
        menu.put("9", "9 - Delete candidate by ID");
        menu.put("10", "10 - Update candidate");

        menu.put("11", "11 - Get all interviews");
        menu.put("12", "12 - Get interview by ID");
        menu.put("13", "13 - Create interview");
        menu.put("14", "14- Delete interview by ID");
        menu.put("15", "15 - Update interview");

        menu.put("16", "16 - Get all vacancies");
        menu.put("17", "17 - Get vacancy by ID");
        menu.put("18", "18 - Create vacancy");
        menu.put("19", "19- Delete vacancy by ID");
        menu.put("20", "20 - Update vacancy");

        methodsMenu.put("M", this::showMenu);

        methodsMenu.put("1", this::getAllContactPersons);
        methodsMenu.put("2", this::getContactPersonById);
        methodsMenu.put("3", this::createContactPerson);
        methodsMenu.put("4", this::deleteContactPerson);
        methodsMenu.put("5", this::updateContactPerson);

        methodsMenu.put("6", this::getAllCandidates);
        methodsMenu.put("7", this::getCandidateById);
        methodsMenu.put("8", this::createCandidate);
        methodsMenu.put("9", this::deleteCandidate);
        methodsMenu.put("10", this::updateCandidate);

        methodsMenu.put("11", this::getAllInterviews);
        methodsMenu.put("12", this::getInterviewById);
        methodsMenu.put("13", this::createInterview);
        methodsMenu.put("14", this::deleteInterview);
        methodsMenu.put("15", this::updateInterview);

        methodsMenu.put("16", this::getAllVacancies);
        methodsMenu.put("17", this::getVacancyById);
        methodsMenu.put("18", this::createVacancy);
        methodsMenu.put("19", this::deleteVacancy);
        methodsMenu.put("20", this::updateVacancy);

    }


    private void getAllVacancies() throws SQLException {
        System.out.println("\nVacancies:");
        System.out.println(iTCompanyVacancyController.findAll());
    }

    private void getVacancyById() throws SQLException {
        System.out.println("\nEnter ID for an vacancy you want to find");
        int id = INPUT.nextInt();
        System.out.println(iTCompanyVacancyController.find(id));
    }

    private void deleteVacancy() throws SQLException {
        System.out.println("\nEnter ID for an vacancy you want to delete");
        int id = INPUT.nextInt();
        iTCompanyVacancyController.delete(id);
        System.out.println("You deleted" + id + "vacancy");
    }

    private void createVacancy() throws SQLException {
        System.out.println("\nEnter vacancy decription");
        String vacancyDescription = INPUT.next();
        System.out.println("\nEnter salary in gryvnas");
        int vacancySalaryInUAH = INPUT.nextInt();
        ItCompanyVacancy itCompanyVacancy = new ItCompanyVacancy(vacancyDescription, vacancySalaryInUAH);
        iTCompanyVacancyController.create(itCompanyVacancy);
        System.out.println("Interview created");
    }

    private void updateVacancy() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter vacancy decription");
        String vacancyDescription = INPUT.next();
        System.out.println("\nEnter salary in gryvnas");
        int vacancySalaryInUAH = INPUT.nextInt();
        ItCompanyVacancy itCompanyVacancy = new ItCompanyVacancy(id, vacancyDescription, vacancySalaryInUAH);
        if (itCompanyVacancy == iTCompanyVacancyController.find(id)) {
            iTCompanyVacancyController.update(itCompanyVacancy);
            System.out.println("Vacancy updated");

        }
        else System.out.println("Oops! Something went wrong");
    }


    private void getAllInterviews() throws SQLException {
        System.out.println("\nInterviews:");
        System.out.println(interviewResultsController.findAll());
    }

    private void getInterviewById() throws SQLException {
        System.out.println("\nEnter ID for an Interview you want to find");
        int id = INPUT.nextInt();
        System.out.println(interviewResultsController.find(id));
    }

    private void deleteInterview() throws SQLException {
        System.out.println("\nEnter ID for an Interview you want to delete");
        int id = INPUT.nextInt();
        interviewResultsController.delete(id);
        System.out.println("You deleted" + id + "interview results");
    }

    private void createInterview() throws SQLException {
        System.out.println("\nEnter experts mark");
        String expertsMark = INPUT.next();
        System.out.println("\nEnter english test id");
        int programmingMark = INPUT.nextInt();
        System.out.println("\nEnter programming test id");
        int englishMark = INPUT.nextInt();
        InterviewResults interviewResults = new InterviewResults(expertsMark, programmingMark, englishMark);
        interviewResultsController.create(interviewResults);
        System.out.println("Interview created");
    }

    private void updateInterview() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter experts mark");
        String expertsMark = INPUT.next();
        System.out.println("\nEnter english test id");
        int programmingMark = INPUT.nextInt();
        System.out.println("\nEnter programming test id");
        int englishMark = INPUT.nextInt();
        InterviewResults interviewResults = new InterviewResults(id, expertsMark, programmingMark, englishMark);
        if (interviewResults == interviewResultsController.find(id)) {
            interviewResultsController.create(interviewResults);
            System.out.println("Interview updated");

        }
        else System.out.println("Oops! Something went wrong");


    }


    private void getAllCandidates() throws SQLException {
        System.out.println("\nCandidates:");
        System.out.println(candidateInfoController.findAll());
    }

    private void getCandidateById() throws SQLException {
        System.out.println("\nDo you want to find a person by id or by initials?");
        System.out.println("1-Name and Surname, 2-ID");
        int flag = INPUT.nextInt();
        if (flag == 1) {
            System.out.println("\nEnter name of the person you want to find");
            String firstName = INPUT.next();
            System.out.println("\nEnter surname of the person you want to find");
            String secondName = INPUT.next();
            System.out.println(candidateInfoController.findByInitials(firstName, secondName));
        } else if (flag == 2) {
            System.out.println("\nEnter ID for the person you want to find");
            int id = INPUT.nextInt();
            System.out.println(candidateInfoController.find(id));
        } else {
            System.out.println("\nData you entered is wrong");
        }
    }

    private void deleteCandidate() throws SQLException {
        System.out.println("\nEnter ID for an candidate you want to delete");
        int id = INPUT.nextInt();
        candidateInfoController.delete(id);
        System.out.println("You deleted" + id + "candidate info");
    }

    private void createCandidate() throws SQLException {
        System.out.println("\nEnter first name");
        String firstName = INPUT.next();
        System.out.println("\nEnter second name");
        String secondName = INPUT.next();
        System.out.println("\nEnter interview Results By Interview Id");
        int int_id = INPUT.nextInt();
        InterviewResults interviewResultsByInterviewId = interviewResultsController.find(int_id);
        System.out.println("\nEnter it Company Vacancy By It Company Vacancy Id");
        int it_id = INPUT.nextInt();
        ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId = iTCompanyVacancyController.find(it_id);
        CandidateInfo candidateInfo = new CandidateInfo(firstName, secondName, interviewResultsByInterviewId, itCompanyVacancyByItCompanyVacancyId);
        candidateInfoController.create(candidateInfo);
        System.out.println("Candidate Info created");
    }

    private void updateCandidate() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter first name");
        String firstName = INPUT.next();
        System.out.println("\nEnter second name");
        String secondName = INPUT.next();
        System.out.println("\nEnter interview Results By Interview Id");
        int int_id = INPUT.nextInt();
        InterviewResults interviewResultsByInterviewId = interviewResultsController.find(int_id);
        System.out.println("\nEnter it Company Vacancy By It Company Vacancy Id");
        int it_id = INPUT.nextInt();
        ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId = iTCompanyVacancyController.find(it_id);

        CandidateInfo candidateInfo = new CandidateInfo(id, firstName, secondName, interviewResultsByInterviewId, itCompanyVacancyByItCompanyVacancyId);
        if (candidateInfo == candidateInfoController.find(id)) {
            candidateInfoController.update(candidateInfo);
            System.out.println("Candidate Info updated");

        }
        else System.out.println("Oops! Something went wrong");
    }


    private void getAllContactPersons() throws SQLException {
        System.out.println("\nContact Persons:");
        System.out.println(contactPersonController.findAll());
    }

    private void getContactPersonById() throws SQLException {
        System.out.println("\nEnter ID for an contact person you want to find");
        int id = INPUT.nextInt();
        System.out.println(contactPersonController.find(id));
    }

    private void deleteContactPerson() throws SQLException {
        System.out.println("\nEnter ID for an contact person you want to delete");
        int id = INPUT.nextInt();
        contactPersonController.delete(id);
        System.out.println("You deleted" + id + "Contact Person");
    }

    private void createContactPerson() throws SQLException {
        System.out.println("\nEnter person name");
        String personName = INPUT.next();
        System.out.println("\nEnter phone number");
        int phoneNumber = INPUT.nextInt();
        System.out.println("\nEnter it Company Vacancy By It Company Vacancy Id");
        int it_id = INPUT.nextInt();
        ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId = iTCompanyVacancyController.find(it_id);
        ContactPerson contactPerson = new ContactPerson(personName, phoneNumber, itCompanyVacancyByItCompanyVacancyId);
        contactPersonController.create(contactPerson);
        System.out.println("Contact Person created");
    }

    private void updateContactPerson() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter person name");
        String personName = INPUT.next();
        System.out.println("\nEnter phone number");
        int phoneNumber = INPUT.nextInt();
        System.out.println("\nEnter it Company Vacancy By It Company Vacancy Id");
        int it_id = INPUT.nextInt();
        ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId = iTCompanyVacancyController.find(it_id);
        ContactPerson contactPerson = new ContactPerson(id, personName, phoneNumber, itCompanyVacancyByItCompanyVacancyId);
        if (contactPerson == contactPersonController.find(id)) {
            contactPersonController.create(contactPerson);
            System.out.println("Contact Person updated");

        }
        else System.out.println("Oops! Something went wrong");
    }

    private void showMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show() {
        do {
            System.out.println("\nM - show menu");
            System.out.println("Q - exit");
            String keyMenu = INPUT.nextLine().toUpperCase();
            if (keyMenu.equalsIgnoreCase("M")) {
                showMenu();
                System.out.println("Select menu point.");
                keyMenu = INPUT.nextLine().toUpperCase();
                try {
                    methodsMenu.get(keyMenu).print();
                } catch (SQLException e) {
                    System.out.println("SQLException: " + e.getMessage());
                    System.out.println("SQLState: " + e.getSQLState());
                    System.out.println("VendorError: " + e.getErrorCode());
                } catch (NullPointerException ignored) {
                    if (keyMenu.equalsIgnoreCase("Q")) {
                        System.out.println("\nGood Bye");
                        break;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nSomething went wrong. Please try later");
                }
            } else if (keyMenu.equalsIgnoreCase("Q")) {
                System.out.println("\nGood Bye");
                break;
            }
        } while (true);
    }
}
