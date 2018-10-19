package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person p1 = new Person();
        Education ed1 = new Education();
        Experience exp1 = new Experience();
        Skill sk1 = new Skill();

        String answer = "n";
        String answerEdu = "n";
        String answerExp = "n";
        String answerSk = "n";

        do {
            System.out.println("Do you want to enter a Person's information? ");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                p1 = new Person();

                System.out.print("Enter the name: ");
                p1.setName(scan.nextLine());
                System.out.print("Enter the email address: ");
                p1.seteAddress(scan.nextLine());
                System.out.print("Enter the phone number: ");
                p1.setPhoneNumber(scan.nextLine());


                do {

                    System.out.println("Do you want to enter a person's educational information? ");
                    answer = scan.nextLine();


                    ed1 = new Education();

                    System.out.print("Enter the school: ");
                    ed1.setSchool(scan.nextLine());
                    System.out.print("Enter the major: ");
                    ed1.setMajor(scan.nextLine());
                    System.out.print("Enter the degree: ");
                    ed1.setDegree(scan.nextLine());
                    System.out.print("Enter the year: ");
                    ed1.setYear(scan.nextLine());

                    p1.addEducation(ed1);

                } while (answerEdu.equalsIgnoreCase("y"));

                do {

                    System.out.println("Do you want to enter a person's experience? ");
                    answer = scan.nextLine();


                    exp1 = new Experience();

                    System.out.print("Enter a company name: ");
                    exp1.setCompName(scan.nextLine());
                    System.out.print("Enter a title: ");
                    exp1.setTitle(scan.nextLine());
                    System.out.print("Enter a date: ");
                    exp1.setDate(scan.nextLine());
                    System.out.print("Enter a description: ");
                    exp1.setDescription(scan.nextLine());

                    p1.addExperience(exp1);


                } while (answerExp.equalsIgnoreCase("Y"));

                    do {

                        System.out.println("Do you want to enter a person's skill? ");
                        answer = scan.nextLine();


                        sk1 = new Skill();

                        System.out.print("Enter advanced: ");
                        sk1.setAdvanced(scan.nextLine());
                        System.out.print("Enter intermediate: ");
                        sk1.setIntermidiate(scan.nextLine());
                        System.out.print("Enter novice: ");
                        sk1.setNovice(scan.nextLine());
                        System.out.print("Enter fundamental: ");
                        sk1.setFundamental(scan.nextLine());

                        p1.addSkill(sk1);


                    } while (answerSk.equalsIgnoreCase("y"));

                }
                } while (answer.equalsIgnoreCase("y"));

                System.out.println("================================================");
                System.out.println(p1.getName().toString());
                System.out.print("");
                System.out.println(p1.geteAddress().toString());
                System.out.print("");
                System.out.println(p1.getPhoneNumber().toString());
                System.out.print("");

                for (Education edu : p1.getListEducations()) {
                    System.out.println("Education");
                    System.out.println(edu.getSchool());
                    System.out.print("");
                    System.out.println(edu.getMajor());
                    System.out.print("");
                    System.out.println(edu.getDegree());
                    System.out.print("");
                    System.out.println(edu.getYear());
                }

                for (Experience exp : p1.getListExperience()) {
                    System.out.println("Experience");
                    System.out.println(exp.getCompName());
                    System.out.print("");
                    System.out.println(exp.getTitle());
                    System.out.print("");
                    System.out.println(exp.getDate());
                    System.out.print("");
                    System.out.println(exp.getDescription());
                    System.out.print("");

                }

                for (Skill ski : p1.getLitSkills()) {
                    System.out.println("Skills");
                    System.out.println(ski.getAdvanced());
                    System.out.print("");
                    System.out.println(ski.getIntermidiate());
                    System.out.print("");
                    System.out.println(ski.getNovice());
                    System.out.print("");
                    System.out.println(ski.getFundamental());


                }
            }
        }
