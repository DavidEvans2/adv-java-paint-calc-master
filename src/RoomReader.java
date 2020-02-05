import edu.wctc.Room;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RoomReader {
    public ArrayList<Room> readRoomFile(String fileName) throws IOException {

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Room> rooms = new ArrayList<>();

        Object ob;
        try{
            while ((ob = ois.readObject()) !=null){
                Room roomA = (Room) ob;
                rooms.add(roomA);
            }
        }catch (EOFException | ClassNotFoundException e){

        }
        return rooms;
    }
}
