package ylesanded;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TwentyFive {
    public static void main(String[] args) throws FileNotFoundException {
        final List<String> students = readFile("./src/students.csv");

        countStudents(students);
        getFirstTenStudents(students);
        randomThreeStudents(students);
        getStudentsEmails(students);
        getStudentsNamesFirstLetters(students);
        getStudentsPasswords(students);
    }

    private static List<String> readFile(final String input_file) throws FileNotFoundException {
        List<String> students = new ArrayList<>();

        File file = new File(input_file);
        Scanner reader = new Scanner(file);

        // Skip first row that has column names.
        if (reader.hasNextLine()) {
            reader.nextLine();
        }

        while (reader.hasNextLine()) {
            students.add(reader.nextLine());
        }
        reader.close();

        return students;
    }

    private static long countStudents(final List<String> students) {
        final long count = students.size();
        System.out.println("\r\nTotal number of students: " + count + "\r\n");
        return count;
    }

    private static List<String> getFirstTenStudents(final List<String> students) {
        List<String> tenStudents = new ArrayList<>();
        String tenStudentsOutput = "\r\n10 first students:\r\n";

        for (int i = 0; i < Math.min(10, students.size()); i++) {
            final String student = students.get(i);
            tenStudents.add(student);
            tenStudentsOutput += student + "\r\n";
        }

        System.out.println(tenStudentsOutput);
        return tenStudents;
    }

    private static List<String> randomThreeStudents(final List<String> students) {
        List<String> randomStudents = new ArrayList<>();
        String randomStudentsOutput = "\r\nRandom three lucky students:\r\n";

        final int size = students.size();

        final String
            student_one = students.get(ThreadLocalRandom.current().nextInt(0, size + 1)),
            student_two = students.get(ThreadLocalRandom.current().nextInt(0, size + 1)),
            student_three = students.get(ThreadLocalRandom.current().nextInt(0, size + 1));

        randomStudents.add(student_one);
        randomStudentsOutput += student_one + "\r\n";
        randomStudents.add(student_two);
        randomStudentsOutput += student_two + "\r\n";
        randomStudents.add(student_three);
        randomStudentsOutput += student_three + "\r\n";

        System.out.println(randomStudentsOutput);
        return randomStudents;
    }

    private static List<String> getStudentsEmails(final List<String> students) {
        List<String> emails = new ArrayList<>();
        String emailsOutput = "\r\nAll student emails:\r\n";

        for (final String student : students) {
            final String email = student.split(",")[3];
            emails.add(email);
            emailsOutput += email + "\r\n";
        }

        System.out.println(emailsOutput);
        return emails;
    }

    private static List<Character> getStudentsNamesFirstLetters(final List<String> students) {
        List<Character> firstLetters = new ArrayList<>();
        String firstLettersOutput = "";

        for (final String student : students) {
            final char firstLetter = student.split(",")[1].charAt(0);
            firstLetters.add(firstLetter);
            firstLettersOutput += firstLetter + "\r\n";
        }

        System.out.println(firstLettersOutput);
        return firstLetters;
    }

    private static List<String> getStudentsPasswords(final List<String> students) {
        List<String> passwords = new ArrayList<>();
        String passwordsOutput = "";

        for (final String student : students) {
            final String familyNamePassword = student.split(",")[2] + ThreadLocalRandom.current().nextInt(10000, 1000000000);
            passwords.add(familyNamePassword);
            passwordsOutput += familyNamePassword + "\r\n";
        }

        System.out.println(passwordsOutput);
        return passwords;
    }
}
