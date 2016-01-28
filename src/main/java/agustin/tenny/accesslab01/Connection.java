package agustin.tenny.accesslab01;

/**
 * Created by Tenny on 1/28/16.
 */
public class Connection {
    private int portNumber;
    private String ipAddress;

    private Connection(int currentPortNumber, String currentIpAddress) {
        portNumber = currentPortNumber;
        ipAddress = currentIpAddress;
    }

    public int getPortNumber() {

        return portNumber;
    }

    public String getIpAddress() {

        return ipAddress;
    }
}
