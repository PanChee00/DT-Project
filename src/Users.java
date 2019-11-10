public class Users {
    private String username,passwd,role;
    
    public Users(String username,String passwd,String role){
        this.username = username;
        this.passwd = passwd;
        this.role = role;
    }
    
    public String getUsername(){
        return username;
    }
    public String getPasswd(){
        return passwd;
    }
    public String getRole(){
        return role;
    }
}
