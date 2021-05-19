
package Eventkampus;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConnection {
    private Connection koneksi;
    public Connection connect()
    {try
    {Class.forName("com.mysql.cj.jdbc.Driver");
     System.out.println("berhasil");
    }
     catch(ClassNotFoundException cnfe){System.out.println("tidak ada");}
    try{
        String url="jdbc:mysql://localhost:3306/db_eventkampus";
        koneksi=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_eventkampus?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        System.out.println("berhasil koneksi");
    }
    catch(SQLException se){System.out.println("gagal koneksi");
    }
    return koneksi;
}
}