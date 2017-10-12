/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayanControl;

/**
 *
 * @author USER
 */
class AkunInventory {
    private String Username;
    private String Password;
    private String Nama;
    private String Role;
    public AkunInventory(){}

    public AkunInventory(String username, String password, String nama, String role) {
        this.Username = username;
        this.Password = password;
        this.Nama = nama;
        this.Role = role;
    }
    
    
    public String getUsername() {
        return Username;
    }

   
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getRole() {
        return Role;
    }

   
    public void setRole(String Role) {
        this.Role = Role;
    }
    
}
