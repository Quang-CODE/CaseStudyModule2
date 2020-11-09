package ExportFile;

import Hotels.Rooms.Rooms;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ExportFile {

    public File getFile(){
        File file = new File("RoomInfo.txt");
        return file;
    }
    public void writeInfoToFile(ArrayList<Rooms> myRooms,File file){
        file = getFile();
            try {
                FileWriter fileWriter = new FileWriter(file);
                for (Rooms a:myRooms) {
                    fileWriter.write(a.toString());
                    fileWriter.write(" Price of room " + a.getRoomNumber() + ": " + a.getType() * a.checkClient() * a.getDuration());
                    fileWriter.write(" Staying duration: " + a.getDuration());
                    fileWriter.write("\n");
                    fileWriter.write(a.getClientsList().toString());
                    fileWriter.write("\n");
                    fileWriter.write("\n");
                }
                fileWriter.close();

            }catch(IOException e){
                e.printStackTrace();
            }
        }
    public void readFile(File file){
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
