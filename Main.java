import includes.Employer;
import includes.App.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employer> employers = new ArrayList<Employer>(); 

        Employer emp = new Employer();
        String companyName = "mycompany.com";

        // Set new employer's data.
        emp.setFname("mouaad");
        emp.setLname("blhn");
        emp.setDept("service");
        
        // Add emp to ArrayList.
        employers.add(emp);

        // Before generating email & password.
        // System.out.println(emp.toString());

        App generate = new App();

        // Set new email.
        emp.setEmail(generate.generateEmail(emp.getFname(), emp.getLname(), emp.getDept(), companyName));
        // Set new password.
        emp.setPassword(generate.generateRandomPassword(10));
        
        // After generating email & password.
        // System.out.println("\n\n");
        // System.out.println(emp.toString());

        // Update ArrayList.
        employers.set(0, emp);

        // Show ArrayList Content.
        System.out.println("\n\n");
        for (Employer e : employers) {
            System.out.println(e.toString());
        }
    }
} 