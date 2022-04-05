import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class run {
    public static void main(String[] args) {

        DB db=new DB();
        GetConn gc=new GetConn();
        Connection conn=gc.connect_to_db();
        Error_ e=new Error_("to je napaka");
        System.out.println(db.insert(conn));
        System.out.println("76");
    }

}
