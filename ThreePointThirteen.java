package chapterThree;

public class ThreePointThirteen {
    private String firstname;
    private String lastname;
    private double monthlySalary;
    private double yearlySalary;

    public ThreePointThirteen(String firstname, String lastname, double monthlySalary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthlySalary = monthlySalary;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return  lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary < 0.0)
            this.monthlySalary = monthlySalary;
    }

    public void yearlySalary(double yearlySalary) {
        this.yearlySalary = monthlySalary * 12;
    }

    public double getYearlySalary() {
      return yearlySalary;
    }

    public void newYearlySalary(double newSalary) {
        yearlySalary = monthlySalary * 12 * 10;
        //System.out.printf("New yearly salary is %f", yearlySalary);
    }
}
