package entities;


public class UserEntity {
    int id;
    String login;
    String password;
    String phone;

    public UserEntity(String reqParameter, String parameter, String login, String password) {
        this.login = login;
        this.password = password;
        this.phone= " ";
    }

    public UserEntity(String login, String password, String phone) {
        this.id = -1;
        this.login = login;
        this.password = password;
        this.phone= phone;
    }

    public UserEntity(int id, String login, String password, String phone) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.phone = " ";
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", phone:"+ phone+'\''+
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
