package ru.topacademy.homework2.task2;

import java.util.TreeMap;

class Person implements Comparable<Person> {
    private String name, surname, middlename, home, mobile;

    Person() {
    }

    Person(String s_name, String i_name, String m_name, String h_num, String m_num) {
        surname = s_name;
        name = i_name;
        middlename = m_name;
        home = h_num;
        mobile = m_num;
    }

    public String getF() {
        return surname;
    }

    public String getI() {
        return name;
    }

    public String getO() {
        return middlename;
    }

    public String homeCode() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("845", "Саратов");
        map.put("364", "Сургут");
        map.put("473", "Воронеж");
        map.put("495", "Москва");
        map.put("862", "Сочи");
        map.put("812", "Санкт-Петербург");
        map.put("863", "Ростов на Дону");
        return map.get(  home.substring(2, 5) );
    }

    public String mobileCode() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("903", "Билайн");
        map.put("961", "Билайн");
        map.put("909", "Билайн");
        map.put("929", "Мегафон");
        map.put("927", "Мегафон");
        map.put("987", "МТС");
        map.put("919", "МТС");
        map.put("999", "Йота");
        return map.get( mobile.substring(2, 5) );
    }

    @Override
    public int compareTo(Person p) {
        String a = surname + " " + name + " " + middlename;
        String b = p.getF() + " " + p.getI() + " " + p.getO();
        return a.compareToIgnoreCase(b);
    }

}
