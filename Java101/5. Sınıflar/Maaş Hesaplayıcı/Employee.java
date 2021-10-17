public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){

        double tax;
        tax = (this.salary <= 1000) ? 0: this.salary*0.03;
        System.out.println("Vergi: " + tax);
        return  tax;
    }

    double bonus(){

        double bonus;
        bonus = (this.workHours <= 40) ? 0: 30*(this.workHours - 40);
        System.out.println("Bonus: " + bonus);
        return bonus;
    }

    double raiseSalary(){

        double raise = 0;

        if(2021 - this.hireYear < 10)
            raise = this.salary*0.05;

        if((2021 - this.hireYear > 9) && (2021 - this.hireYear <20))
            raise = this.salary*0.1;

        if(2021 - this.hireYear > 19)
            raise = this.salary*0.15;

        System.out.println("Maaş Artışı : " + raise);
        return raise;
    }

    void toMyString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        double tax = this.tax();
        double bonus = this.bonus();
        double raise = this.raiseSalary();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax + bonus));
        System.out.println("Toplam Maaş : " + (this.salary + raise));
    }
}
