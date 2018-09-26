package lk.ijse.spring.admin.dto;

public class CustomerDTO {

    private String cus_Name;
    private String cus_UName;
    private String cus_Address;
    private String cus_Email;
    private String cus_Contact;
    private String cus_Password;
    private String cus_ConfPassword;

    public CustomerDTO() {
    }

    public CustomerDTO( String cus_Name, String cus_UName, String cus_Address, String cus_Email, String cus_Contact, String cus_Password, String cus_ConfPassword) {
        this.setCus_Name(cus_Name);
        this.setCus_UName(cus_UName);
        this.setCus_Address(cus_Address);
        this.setCus_Email(cus_Email);
        this.setCus_Contact(cus_Contact);
        this.setCus_Password(cus_Password);
        this.setCus_ConfPassword(cus_ConfPassword);
    }

    public CustomerDTO(String cus_UName, String cus_Password) {
        this.cus_UName = cus_UName;
        this.cus_Password = cus_Password;
    }

    public String getCus_Name() {
        return cus_Name;
    }

    public void setCus_Name(String cus_Name) {
        this.cus_Name = cus_Name;
    }

    public String getCus_UName() {
        return cus_UName;
    }

    public void setCus_UName(String cus_UName) {
        this.cus_UName = cus_UName;
    }

    public String getCus_Address() {
        return cus_Address;
    }

    public void setCus_Address(String cus_Address) {
        this.cus_Address = cus_Address;
    }

    public String getCus_Email() {
        return cus_Email;
    }

    public void setCus_Email(String cus_Email) {
        this.cus_Email = cus_Email;
    }

    public String getCus_Contact() {
        return cus_Contact;
    }

    public void setCus_Contact(String cus_Contact) {
        this.cus_Contact = cus_Contact;
    }

    public String getCus_Password() {
        return cus_Password;
    }

    public void setCus_Password(String cus_Password) {
        this.cus_Password = cus_Password;
    }

    public String getCus_ConfPassword() {
        return cus_ConfPassword;
    }

    public void setCus_ConfPassword(String cus_ConfPassword) {
        this.cus_ConfPassword = cus_ConfPassword;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                ", cus_Name='" + cus_Name + '\'' +
                ", cus_UName='" + cus_UName + '\'' +
                ", cus_Address='" + cus_Address + '\'' +
                ", cus_Email='" + cus_Email + '\'' +
                ", cus_Contact='" + cus_Contact + '\'' +
                ", cus_Password='" + cus_Password + '\'' +
                ", cus_ConfPassword='" + cus_ConfPassword + '\'' +
                '}';
    }
}
