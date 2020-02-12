package edu.wctc;

import edu.wctc.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomReader {
    public ArrayList<Paintable> readRoomFile(String fileName) throws IOException{

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Paintable> rooms = new ArrayList<>();
        Object obj;
        try{
            while ((obj = ois.readObject()) !=null){
                Room p = (Room) obj;
                rooms.add(p);
            }
        }catch (EOFException | ClassNotFoundException e){

        }
        return rooms;
    }
}
