package com.company.main;


import com.company.main.HumanProps.*;
import com.company.main.languages.Arabic;
import com.company.main.languages.Language;
import com.company.main.needs.*;

import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way ;
public class Person extends Human
        implements IHaveHobby, IHaveNickName,
        IPayTaxes, ICanSpeak, INeedCompany, INeedToDoSport,
        INeedToMarry, INeedToPray, INeedToWork {

    private String name;
    private List<Hobby> hobbies;
    private String nickname;
    private int salary;

    @Override
    public String sayName() {
        return String.format("My name is %s", name);
    }

    @Override
    public String speak(Language lang) {
        return lang.sayHello();
    }

    @Override
    public void createNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    @Override
    public int addHobby(Hobby hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    @Override
    public void calculateTax(int percentage) {
        salary = salary * percentage;
    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void playSports() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void pray() {

    }

    @Override
    public void becomeEmployee() {

    }

    public static void main(String[] args) {
        Person human = new Person();
        human.speak(new Arabic());
    }
}