package agustin.tenny.accesslab01;

/**
 * Created by Tenny on 1/28/16.
 */
public class ConnectionManager {

    static Connection storage;


    static Connection addConnection(int x, String y){
        Connection.returnConnection(x, y);  //equivalent to Connection object
    }

    static void removeConnection() {

    }

    static String displayConnection() {

    }

    public static void main(String[] args) {
        Connection c1 = ConnectionManager.addConnection(11111,"1.11.1.1");
        //Connection template looking for Connection object to fill in
        //Right side of = is equal to Connection Object because method returns Connection
        c1.getIpAddress();
        c1.getPortNumber();
    }

}
