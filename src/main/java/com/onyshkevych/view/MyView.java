package com.onyshkevych.view;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import com.onyshkevych.controller.ContactPersonController;
import com.onyshkevych.controller.CandidateInfoController;
import com.onyshkevych.controller.InterviewResaultsController;
import com.onyshkevych.controller.EnglishLevelTestController;
import com.onyshkevych.model.objects.ITCompanyVacancy;
import com.onyshkevych.controller.ITCompanyVacancyController;
import com.onyshkevych.model.objects.EnglishLevelTest;
import com.onyshkevych.model.objects.CandidateInfo;
import com.onyshkevych.model.objects.ContactPerson;
import com.onyshkevych.model.objects.InterviewResaults;
import com.onyshkevych.model.objects.ProgrammingLevelTest;
import com.onyshkevych.controller.ProgrammingLevelTestController;

public class MyView {
    private final ProgrammingLevelTestController programmingLevelTestController = new ProgrammingLevelTestController();
    private final ITCompanyVacancyController iTCompanyVacancyController = new ITCompanyVacancyController();
    private final EnglishLevelTestController englishLevelTestController = new EnglishLevelTestController();
    private final InterviewResaultsController interviewResaultsController =new InterviewResaultsController();
    private final ContactPersonController contactPersonController = new ContactPersonController();
    private final CandidateInfoController candidateInfoController = new CandidateInfoController();
    private final Map<String, String> menu;
    private final Map<String, Printable> methodsMenu;
    private static final Scanner INPUT = new Scanner(System.in);
    public MyView() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();
        menu.put("Q", "Q - exit program");
        menu.put("S", "S - show menu");

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

        menu.put("16", "16 - Get all english tests");
        menu.put("17", "17 - Get english test by ID");
        menu.put("18", "18 - Create english test");
        menu.put("19", "19- Delete english test by ID");
        menu.put("20", "20 - Update english test");

        menu.put("21", "21 - Get all vacancies");
        menu.put("22", "22 - Get vacancy by ID");
        menu.put("23", "23 - Create vacancy");
        menu.put("24", "24- Delete vacancy by ID");
        menu.put("25", "25 - Update vacancy");

        menu.put("26", "26 - Get all programming tests");
        menu.put("27", "27 - Get programming test by ID");
        menu.put("28", "28 - Create programming test");
        menu.put("29", "29- Delete programming test by ID");
        menu.put("30", "30 - Update programming test");

        methodsMenu.put("S", this::showMenu);

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

        methodsMenu.put("16", this::getAllEngTests);
        methodsMenu.put("17", this::getEngTestById);
        methodsMenu.put("18", this::createEngTest);
        methodsMenu.put("19", this::deleteEngTest);
        methodsMenu.put("20", this::updateEngTest);

        methodsMenu.put("21", this::getAllVacancies);
        methodsMenu.put("22", this::getVacancyById);
        methodsMenu.put("23", this::createVacancy);
        methodsMenu.put("24", this::deleteVacancy);
        methodsMenu.put("25", this::updateVacancy);

        methodsMenu.put("26", this::getAllProgrTests);
        methodsMenu.put("27", this::getProgrTestById);
        methodsMenu.put("28", this::createProgrTest);
        methodsMenu.put("29", this::deleteProgrTest);
        methodsMenu.put("30", this::updateProgrTest);
    }
    private void getAllProgrTests () throws SQLException {
        System.out.println("\nProgramming Tests:");
        System.out.println(programmingLevelTestController.findAll());
    }

    private void getProgrTestById () throws SQLException {
        System.out.println("\nEnter ID for an Programming test you want to find");
        int id = INPUT.nextInt();
        System.out.println(programmingLevelTestController.find(id));
    }

    private void deleteProgrTest () throws SQLException {
        System.out.println("\nEnter ID for an Programming test you want to delete");
        int id = INPUT.nextInt();
        System.out.println(programmingLevelTestController.delete(id));
    }

    private void createProgrTest  () throws SQLException {
        System.out.println("\nEnter Programming level");
        String programmingLevel = INPUT.next();
        System.out.println("\nEnter Programming test id");
        int testMarkProgramming = INPUT.nextInt();
        System.out.println("\nEnter Programming test id");
        String expertsComment = INPUT.next();
        ProgrammingLevelTest programmingLevelTest = new ProgrammingLevelTest( programmingLevel, testMarkProgramming, expertsComment);
        System.out.println(programmingLevelTestController.create(programmingLevelTest));
    }

    private void updateProgrTest () throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter Programming level");
        String programmingLevel = INPUT.next();
        System.out.println("\nEnter Programming test id");
        int testMarkProgramming = INPUT.nextInt();
        System.out.println("\nEnter Programming test id");
        String expertsComment = INPUT.next();
        ProgrammingLevelTest programmingLevelTest  = new ProgrammingLevelTest( programmingLevel, testMarkProgramming, expertsComment);
        System.out.println(programmingLevelTestController.update(programmingLevelTest));
    }



    private void getAllVacancies () throws SQLException {
        System.out.println("\nVacancies:");
        System.out.println(iTCompanyVacancyController.findAll());
    }

    private void getVacancyById () throws SQLException {
        System.out.println("\nEnter ID for an vacancy you want to find");
        int id = INPUT.nextInt();
        System.out.println(iTCompanyVacancyController.find(id));
    }

    private void deleteVacancy () throws SQLException {
        System.out.println("\nEnter ID for an vacancy you want to delete");
        int id = INPUT.nextInt();
        System.out.println(iTCompanyVacancyController.delete(id));
    }

    private void createVacancy  () throws SQLException {
        System.out.println("\nEnter vacancy decription");
        String vacancyDescription = INPUT.next();
        System.out.println("\nEnter project name");
        String projectName = INPUT.next();
        System.out.println("\nEnter salary in gryvnas");
        int vacancySalaryInUAH = INPUT.nextInt();
        ITCompanyVacancy itCompanyVacancy  = new ITCompanyVacancy( vacancyDescription, projectName,vacancySalaryInUAH);
        System.out.println(iTCompanyVacancyController.create(itCompanyVacancy));
    }

    private void updateVacancy () throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter vacancy decription");
        String vacancyDescription = INPUT.next();
        System.out.println("\nEnter project name");
        String projectName = INPUT.next();
        System.out.println("\nEnter salary in gryvnas");
        int vacancySalaryInUAH = INPUT.nextInt();
        ITCompanyVacancy itCompanyVacancy  = new ITCompanyVacancy(id, vacancyDescription, projectName,vacancySalaryInUAH);
        System.out.println(iTCompanyVacancyController.update(itCompanyVacancy));
    }








    private void getAllEngTests () throws SQLException {
        System.out.println("\nEnglish Tests:");
        System.out.println(englishLevelTestController.findAll());
    }

    private void getEngTestById () throws SQLException {
        System.out.println("\nEnter ID for an english test you want to find");
        int id = INPUT.nextInt();
        System.out.println(englishLevelTestController.find(id));
    }

    private void deleteEngTest () throws SQLException {
        System.out.println("\nEnter ID for an english test you want to delete");
        int id = INPUT.nextInt();
        System.out.println(englishLevelTestController.delete(id));
    }

    private void createEngTest  () throws SQLException {
        System.out.println("\nEnter english test id");
        int testMarkEnglish = INPUT.nextInt();
        System.out.println("\nEnter experts mark");
        String expertsComment = INPUT.next();
        EnglishLevelTest englishLevelTest  = new EnglishLevelTest( testMarkEnglish, expertsComment);
        System.out.println(englishLevelTestController.create(englishLevelTest));
    }

    private void updateEngTest () throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter test mark");
        int testMarkEnglish = INPUT.nextInt();
        System.out.println("\nEnter experts comment");
        String expertsComment = INPUT.next();
        EnglishLevelTest englishLevelTest  = new EnglishLevelTest(id, testMarkEnglish, expertsComment);
        System.out.println(englishLevelTestController.update(englishLevelTest));
    }









    private void getAllInterviews () throws SQLException {
        System.out.println("\nInterviews:");
        System.out.println(interviewResaultsController.findAll());
    }

    private void getInterviewById () throws SQLException {
        System.out.println("\nEnter ID for an Interview you want to find");
        int id = INPUT.nextInt();
        System.out.println(interviewResaultsController.find(id));
    }

    private void deleteInterview () throws SQLException {
        System.out.println("\nEnter ID for an Interview you want to delete");
        int id = INPUT.nextInt();
        System.out.println(interviewResaultsController.delete(id));
    }

    private void createInterview  () throws SQLException {
        System.out.println("\nEnter experts mark");
        String expertsMark = INPUT.next();
        System.out.println("\nEnter english test id");
        int englishId = INPUT.nextInt();
        System.out.println("\nEnter technical test id");
        int technicId = INPUT.nextInt();
        System.out.println("\nEnter programming test id");
        int programingId = INPUT.nextInt();
        InterviewResaults interviewResaults = new InterviewResaults(expertsMark, englishId, technicId, programingId);
        System.out.println(interviewResaultsController.create(interviewResaults));
    }

    private void updateInterview () throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter experts mark");
        String expertsMark = INPUT.next();
        System.out.println("\nEnter english test id");
        int englishId = INPUT.nextInt();
        System.out.println("\nEnter technical test id");
        int technicId = INPUT.nextInt();
        System.out.println("\nEnter programming test id");
        int programingId = INPUT.nextInt();
        InterviewResaults interviewResaults = new InterviewResaults(id, expertsMark, englishId, technicId, programingId);
        System.out.println(interviewResaultsController.update(interviewResaults));
    }


    private void getAllCandidates () throws SQLException {
        System.out.println("\nCandidates:");
        System.out.println(candidateInfoController.findAll());
    }

    private void getCandidateById () throws SQLException {
        System.out.println("\nEnter ID for an candidate you want to find");
        int id = INPUT.nextInt();
        System.out.println(candidateInfoController.find(id));
    }

    private void deleteCandidate () throws SQLException {
        System.out.println("\nEnter ID for an candidate you want to delete");
        int id = INPUT.nextInt();
        System.out.println(candidateInfoController.delete(id));
    }

    private void createCandidate () throws SQLException {
        System.out.println("\nEnter first name");
        String candidateName = INPUT.next();
        System.out.println("\nEnter second name");
        String candidateSecondName = INPUT.next();
        System.out.println("\nEnter work experience in years");
        int workExperienceInYears = INPUT.nextInt();
        System.out.println("\nEnter age");
        int age = INPUT.nextInt();
        System.out.println("\nEnter interview id");
        int interviewId = INPUT.nextInt();
        CandidateInfo candidateInfo = new CandidateInfo(candidateName, candidateSecondName, workExperienceInYears, age, interviewId);
        System.out.println(candidateInfoController.create(candidateInfo));
    }

    private void updateCandidate () throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter first name");
        String candidateName = INPUT.next();
        System.out.println("\nEnter second name");
        String candidateSecondName = INPUT.next();
        System.out.println("\nEnter work experience in years");
        int workExperienceInYears = INPUT.nextInt();
        System.out.println("\nEnter age");
        int age = INPUT.nextInt();
        System.out.println("\nEnter interview id");
        int interviewId = INPUT.nextInt();
        CandidateInfo candidateInfo = new CandidateInfo(id, candidateName, candidateSecondName, workExperienceInYears, age, interviewId);
        System.out.println(candidateInfoController.update(candidateInfo));
    }



        private void getAllContactPersons () throws SQLException {
            System.out.println("\nContact Persons:");
            System.out.println(contactPersonController.findAll());
        }

        private void getContactPersonById () throws SQLException {
//            System.out.println("\nEnter ID for an contact person you want to find");
//            int id = INPUT.nextInt();
//            System.out.println(contactPersonController.find(id));
            System.out.println("\nDo you want to find a person by id or by initials?");
            System.out.println("1-Name and Surname, 2-ID");
            int flag = INPUT.nextInt();
            if (flag == 1) {
                System.out.println("\nEnter name of the person you want to find");
                String firstNamePerson = INPUT.next();
                System.out.println("\nEnter surname of the person you want to find");
                String lastNamePerson = INPUT.next();
                System.out.println(contactPersonController.findByName(firstNamePerson, lastNamePerson));
            } else if (flag == 2) {
                System.out.println("\nEnter ID for the person you want to find");
                int id = INPUT.nextInt();
                System.out.println(contactPersonController.find(id));
            } else {
                System.out.println("\nData you entered is wrong");
            }
        }

        private void deleteContactPerson () throws SQLException {
            System.out.println("\nEnter ID for an contact person you want to delete");
            int id = INPUT.nextInt();
            System.out.println(contactPersonController.delete(id));
        }

        private void createContactPerson () throws SQLException {
            System.out.println("\nEnter first name");
            String firstNamePerson = INPUT.next();
            System.out.println("\nEnter second name");
            String lastNamePerson = INPUT.next();
            System.out.println("\nEnter phone number");
            int phoneNumber = INPUT.nextInt();
            System.out.println("\nEnter mail adress");
            String personEmail = INPUT.next();
            ContactPerson contactPerson = new ContactPerson(firstNamePerson, lastNamePerson, phoneNumber, personEmail);
            System.out.println(contactPersonController.create(contactPerson));
        }

        private void updateContactPerson () throws SQLException {
            System.out.println("\nEnter ID");
            int id = INPUT.nextInt();
            System.out.println("\nEnter first name");
            String firstNamePerson = INPUT.next();
            System.out.println("\nEnter second name");
            String lastNamePerson = INPUT.next();
            System.out.println("\nEnter phone number");
            int phoneNumber = INPUT.nextInt();
            System.out.println("\nEnter mail adress");
            String personEmail = INPUT.next();
            ContactPerson contactPerson = new ContactPerson(id,firstNamePerson, lastNamePerson, phoneNumber, personEmail);
            System.out.println(contactPersonController.update(contactPerson));
        }
        private final void showMenu(){
            System.out.println("\nMENU:");
            for (String str : menu.values()) {
                System.out.println(str);
            }
        }

        private final void showSmallMenu(){
            System.out.println(menu.get("S"));
            System.out.println(menu.get("Q"));
            System.out.println("Please, select menu point.");
        }

        public void show() {
            String keyMenu;
            showSmallMenu();
            do {
                keyMenu = INPUT.next().toUpperCase();
                try {
                    methodsMenu.get(keyMenu).print();
                } catch (Exception e) {
                }
                showSmallMenu();
            } while (!keyMenu.equals("Q"));
        }
    }


