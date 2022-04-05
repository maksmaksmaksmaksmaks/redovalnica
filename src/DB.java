import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {

    public int insert(Connection conn){
        Statement statement;
        try {
            String querry=String.format("insert into new(ime) values('jakob');");
            statement=conn.createStatement();
            statement.executeQuery(querry);
            statement.close();
            conn.close();


        }catch (Exception e){
            System.out.println(e);
        }
        return 1;
    }


}

