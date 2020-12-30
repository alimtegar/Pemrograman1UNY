// CSE 142 Labs
// A class to represent lawyers.

public class Lawyer extends Employee {
    public int getVacationDays() {
        return super.getVacationDays() + 5;           // 3 weeks vacation
    }

    public String getVacationForm() {
        return "pink";
    }
    
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}