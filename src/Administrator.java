/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Sherlock Baldeo Joshua C. Manansala
 *
 */
public class Administrator {

    private String password;

    public Administrator(String password) {
        this.password = password;
    }

    public boolean login(String password) {
        return this.password.equals("adminuser1");
    }
}
