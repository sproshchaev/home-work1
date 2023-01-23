package ru.topacademy.homework2.task2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyProg {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        Scanner scan = new Scanner(fr);

        ArrayList<Person> persons = new ArrayList<>();
        while (scan.hasNextLine())
            persons.add(get_person(scan));
        scan.close();
        fr.close();

        Collections.sort(persons);
        for (Person p : persons)
            System.out.println(p.homeCode() + " " + p.mobileCode());

    }

    private static Person get_person(Scanner scan) {
        String s_name = scan.nextLine();    // фамилия
        String i_name = scan.nextLine();    // имя
        String m_name = scan.nextLine();    // отчество
        String h_numb = scan.nextLine();    // домашний номер
        String m_numb = scan.nextLine();    // мобильный номер
        return new Person(s_name, i_name, m_name, h_numb, m_numb);
    }

}