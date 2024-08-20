class Employee {//base class
    float salary = 40000;
}

class Programmer extends Employee { //derived class
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer(); //creation of an derived class object
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
}
