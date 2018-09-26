package lk.ijse.spring.admin.dto;

public class UserDTO {

    private String user_Name;
    private String user_Password;
    private String user_NIC;
    private String user_Tele;

    public UserDTO() {
    }

    public UserDTO( String user_Name, String user_Password, String user_NIC, String user_Tele) {
        this.setUser_Name(user_Name);
        this.setUser_Password(user_Password);
        this.setUser_NIC(user_NIC);
        this.setUser_Tele(user_Tele);
    }


    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

    public String getUser_NIC() {
        return user_NIC;
    }

    public void setUser_NIC(String user_NIC) {
        this.user_NIC = user_NIC;
    }

    public String getUser_Tele() {
        return user_Tele;
    }

    public void setUser_Tele(String user_Tele) {
        this.user_Tele = user_Tele;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                ", user_Name='" + user_Name + '\'' +
                ", user_Password='" + user_Password + '\'' +
                ", user_NIC='" + user_NIC + '\'' +
                ", user_Tele='" + user_Tele + '\'' +
                '}';
    }
}
