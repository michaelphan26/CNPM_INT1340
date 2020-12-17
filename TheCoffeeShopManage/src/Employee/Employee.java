/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Computer
 */
public class Employee {
    public String username;
    public String password;
    public String name;
    public String tel;
    public String birth;
    public String position;
    public String status;

    public Employee(String username, String password, String name, String tel, String birth, String position,String status) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.tel = tel;
        this.birth = birth;
        this.position = position;
        this.status=status;
    }

    public Employee() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getBirth() {
        return birth;
    }

    public String getPosition() {
        return position;
    }
    
    public String getStatus() {
        return status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

}
