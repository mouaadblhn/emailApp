package includes;

// Employer Data.
public class Employer {
    private String fname;
    private String lname;
    private String dept;
    private String email;
    private String password;
    
    // Set default data.
    public Employer () {
        this.fname = "fname";
        this.lname = "lname";
        this.dept = "default";
        this.email = null;
        this.password = null;
    }

    // getters.
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getDept() {
        return dept;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    // setters.
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Show employers infos.
    public String showInfos() {
        return  "First name : "+getFname()+"\nLast name : "+getLname()+"\nDepartement : "+getDept()+
                "\nEmail : "+getEmail()+"\nPassword : "+getPassword();
    }

    // You can add more methodes here.
}