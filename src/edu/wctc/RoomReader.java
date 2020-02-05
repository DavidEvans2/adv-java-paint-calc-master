package edu.wctc;

import edu.wctc.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomReader {
    public ArrayList<Room> readRoomFile(String fileName) throws IOException{

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Room> rooms = new ArrayList<>();
        Object obj;
        try{
            while ((obj = ois.readObject()) !=null){
                Room roomA = (Room) obj;
                rooms.add(roomA);
            }
        }catch (EOFException | ClassNotFoundException e){

        }
        return rooms;
    }
}
