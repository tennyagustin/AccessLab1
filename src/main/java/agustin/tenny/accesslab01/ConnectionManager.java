package agustin.tenny.accesslab01;


import java.util.ArrayList;
/**
 * Created by Tenny on 1/28/16.
 */
public class ConnectionManager {

    public static int currentPosition; //needed for addConnection method
    public static boolean full = false; //needed to check if limited array size is already full
    public static Connection[] connectionStorageArray = new Connection[3]; //making new Connection[] and initializing size
    //Right side of = is equal to Connection Object because method returns Connection
        //public static Integer[] portArray; //store limited number of ports
        //public static int emptyPort; //where ports were left off

    //static Connection[] connectionStorageArray = new Connection[]; //declare Connection[]

    public ConnectionManager() {
        //Constructor
        //portArray = new Integer[] {1,2,3}; //limited number of ports?
    }

//ADD CONNECTION METHOD
    public static Connection addConnection(int x, String y) { //returns Connection object
        //connectionStorageArray[i] = Connection.storeConnection(x, y);  //equivalent to Connection object
        //return connectionStorageArray[i]; //returning Connection in spot 0

        for (int i = 0; i < connectionStorageArray.length; i++) { //iterate through every element

            if (connectionStorageArray[i] == null) { //if there is an empty space in i position...

                connectionStorageArray[i] = Connection.storeConnection(x, y); //Connection is stored in i position
                currentPosition = i; //use to keep place in array

                break;
            }

            if(i == connectionStorageArray.length-1) { //if i is the length of array (minus one for final array index)
                full = true; //then storage is full
                System.out.println("No open ports available for connection."); //full storage message
            }
        }
       if(!full) { //if not full...
           return connectionStorageArray[currentPosition]; //go back to where iterator left off
       } else {
           return null;
       }
    }

//REMOVE CONNECTION METHOD
    static void removeConnection(Connection x) {
        for (int i = 0; i < connectionStorageArray.length; i++) { //iterate to check if Connection exists

            if (connectionStorageArray[i] != null) {  //if Connection is NOT null (i.e. occupied)
                if (connectionStorageArray[i] == x) {  //if i is an x Connection, then make it null (unoccupied)
                    connectionStorageArray[i] = null; //unoccupied position in array
                    System.out.println("Device successfully removed."); //confirm Connection removal
                }
            }
        }
    }

//DISPLAY CONNECTION METHOD
    public static void displayConnection(Connection[] x) { //display array list of Connections
        for (int i = 0; i < connectionStorageArray.length; i++) { //iterate through each element

            if (connectionStorageArray[i] != null) {  //if index position is filled, display following information
                System.out.println("Index Position: " + i + " IP Address: " + connectionStorageArray[i].getIpAddress() + " Which Port? " + connectionStorageArray[i].getPortNumber());
            } else {
                System.out.println("There are one or more ports available for use."); //available ports message
            }
        }
    }

    public static void main(String[] args) {
        Connection c1 = ConnectionManager.addConnection(1,"1.11.1.1");
        Connection c2 = ConnectionManager.addConnection(2,"2.22.2.2");
        Connection c3 = ConnectionManager.addConnection(3,"3.33.3.3");
        //Connection template looking for Connection object to fill in

        Connection c4 = ConnectionManager.addConnection(4,"4.44.4.4"); //pretending there are "4" ports to prompt full message

        ConnectionManager.displayConnection(connectionStorageArray);

        ConnectionManager.removeConnection(c1);
        ConnectionManager.removeConnection(c2);


        /*for (int i = 0; i < portArray.length; i++)
            if(portArray == full) {
                Connection c4 = ConnectionManager.addConnection(portArray[i], "4.44.4.4"); {
                }
                c4.getPortNumber();
        }
        */

        /*for (int i = 0; i < portArray.length; i++)
            if (portArray[i] == Integer.parseInt("")) { //if there is an empty space in i position...
                Connection c4 = ConnectionManager.addConnection(emptyPort, "4.44.4.4"); //automate port selection
                emptyPort = i;

        ConnectionManager.displayConnection(connectionStorageArray);
        */
    }

}




