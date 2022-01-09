package Auth;

public class User {
    private int id;
    private String fullname;
    private String email;
    private String password;
 
      public int getUserid() {
            return id;
        }
       public void setUserid(int userid) {
            this.id = id;
        }

       public String getFname() {
            return fullname;
        }

       public void setFname(String fullname) {
            this.fullname = fullname;
        }

       public String getLname() {
            return email;
        }

        public void setLname(String email) {
            this.email = email;
        }
     
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}