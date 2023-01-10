package model;


public class User {
    private int userid;
    private String name;
    private String mobile;
    private String email;
    private String address;
    private String username;
    private String password;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
    
    public User() {}

    public User(int userid, String name,String mobile,String email, String address, String username, String password){
        this.userid=userid;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.address=address;
        this.username=username;
        this.password=password;     
    }

    public User(String name,String mobile,String email, String address, String username, String password){
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.address=address;
        this.username=username;
        this.password=password;           
    }

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }
    

}
