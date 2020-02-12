package edu.wctc;

import edu.wctc.Room;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RoomWriter {
    public void writeRoomFile(String filename, ArrayList<Paintable> roomList)throws IOException
    {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(Paintable p : roomList){
            oos.writeObject((p));
        }oos.close();
    }
}
