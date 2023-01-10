package model;


public class Admin {
    private int adminid;
    private String name;
    private String mobile;
    private String email;
    private String address;
    private String username;
    private String password;

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }


    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }


    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Admin() {}

    public Admin(int adminid, String name,String mobile,String email, String address, String username, String password){
        this.adminid=adminid;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.address=address;
        this.username=username;
        this.password=password;     
    }

    public Admin(String name,String mobile,String email, String address, String username, String password){
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.address=address;
        this.username=username;
        this.password=password;           
    }

    public Admin(String username,String password){
        this.username=username;
        this.password=password;
    }
    

}
