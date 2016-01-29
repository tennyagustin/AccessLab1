package agustin.tenny.accesslab01;

/**
 * Created by Tenny on 1/28/16.
 */
public class Connection {
    private int portNumber;
    private String ipAddress;

    private Connection(int currentPortNumber, String currentIpAddress) {
        this.portNumber = currentPortNumber;
        this.ipAddress = currentIpAddress;
    }


    public static Connection storeConnection(int a, String b) {
        return new Connection(a, b); //method call for Constructor takes new instead of .
    }

    public int getPortNumber() {

        return portNumber;
    }

    public String getIpAddress() {

        return ipAddress;
    }
}
