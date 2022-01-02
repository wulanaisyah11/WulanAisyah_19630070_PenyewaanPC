/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19630070;
import java.sql.SQLException;
/**
 *
 * @author Windows 8.1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        
       configdb uas = new configdb();
       uas.DataTabel("SELECT * FROM komputer",2);
       uas.DataTabel("SELECT * FROM member",4);
       uas.DataTabel("SELECT * FROM transaksi",10);
    }
    
}
