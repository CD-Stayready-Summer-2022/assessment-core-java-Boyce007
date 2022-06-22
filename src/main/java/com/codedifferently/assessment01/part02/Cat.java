package com.codedifferently.assessment01.part02;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        super(name,age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super(age);
        super.setName("Cat name");
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        super.setName("Cat name");
        super.setAge(0);
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
