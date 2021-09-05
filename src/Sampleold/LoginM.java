package Sampleold;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class LoginM {
    private String username;
    private String password;
    private String usertype;
    public static String loginstatus;

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

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    public void UserInfo(String username,String password){
        
        LoginM.loginstatus = "0";
        File Userfile = new File("src/Database/User.txt");
        try {
            FileReader Userfilefr = new FileReader(Userfile);
            BufferedReader Userfilebr = new BufferedReader(Userfilefr);
            String x = Userfilebr.readLine();
            while (x!=null){
                String[] line = x.split("%");
                if (line[0].equals(username) && line[1].equals(password)){
                    setUsername(username);
                    setPassword(password);
                    setUsertype(line[2]);
                    LoginM.loginstatus = "1";
                    break;
                }
                else {
                    x = Userfilebr.readLine();
                    if (x == null){
                        JOptionPane.showMessageDialog(null, "Login Failed! Please check your Username and Password again!");
                    }
                }
            }
            
        } catch (Exception ex) {
            
        }
    }
    
}
