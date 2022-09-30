//public class Main {

public class SalaryCalculator {


    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var worker = new Employee("F SYS", 987.65, 39, 2021 - 8);

        // worker info
        System.out.println(worker);

        // tax
        System.out.println("\nbonus: " + worker.bonus()); /* bonus */
        worker.workHours += 10;
        System.out.println("bonus: " + worker.bonus() + "  (c.saati +10)"); /* bonus */

        // raiseSalary
        System.out.println("\r\nMaas: " + worker.salary);
        System.out.println("tax: " + worker.tax());

        worker.hireYear += 10;
        worker.raiseSalary();
        System.out.println("\r\nMaas: " + worker.salary + "  (i.b. +10)");
        System.out.println("tax: " + worker.tax());

        worker.hireYear += 10;
        worker.raiseSalary();
        System.out.println("\r\nMaas: " + worker.salary + "  (i.b. +10)");
        System.out.println("tax: " + worker.tax());


    }

    static class Employee {
        public String name;
        public double salary;
        public Integer workHours;
        public Integer hireYear;

        public Employee(String name, double salary, Integer workHours, Integer hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }


        public int workingYears() {
            return ( /* (new Date()).getYear()) */ 2021 - hireYear);
        }

        public String toString() {
            return "Adi Soyadi: " + name + " , " + "Maas: " + salary + " , " + "C. Saati: " + workHours + " , " + "is Basi: " + hireYear;
        }

        public double tax() {
            if (salary > 1000) {
                return salary * 0.03;
            }
            return 0;
        }

        public double bonus() {
            if (workHours > 40) {
                return (workHours - 40) * 30;
            }
            return 0;
        }

        public void raiseSalary() {
            if (workingYears() < 10) {
                salary = salary * 1.05;
            } else if (workingYears() > 9 && workingYears() < 20) {
                salary = salary * 1.10;
            } else if (workingYears() > 19) {
                salary = salary * 1.15;
            }
            // else {        /* ne olacagi / ne olmayacagi belirtilmemis */ }
        }
    }

}