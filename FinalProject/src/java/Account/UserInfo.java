/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author nhana
 */
public class UserInfo {
    private String userId;
    private String fullName;
    private String password;
    private int roleId;
    private String gmail;
    private String address;
    private int status;

    public UserInfo(){
        
    }
    
    public UserInfo(String userId,String fullName,String password,int roleId,String gmail,String address,int status){
        this.userId=userId;
        this.fullName=fullName;
        this.password=password;
        this.roleId=roleId;
        this.gmail=gmail;
        this.address=address;
        this.status=status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
       
}