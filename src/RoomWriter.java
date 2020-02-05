import edu.wctc.Room;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RoomWriter {
    public void writeRoomFile(String filename, ArrayList<Room>roomList)throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(Room roomA : roomList){
            oos.writeObject((roomA));
        }oos.close();
    }
}
