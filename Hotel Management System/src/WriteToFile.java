import java.io.*;


public class WriteToFile {

    public static void CreateFile() throws IOException {
        File Hotel1 = null;
        File Hotel2 = null;
        File Hotel3 = null;
        File Hotel4 = null;
        int RoomNumber;
        try {
            Hotel1 = new File("Hotel1.txt");
            FileWriter FileWriter1 = new FileWriter(Hotel1, true);
            BufferedWriter BufferedWriter1 = new BufferedWriter(FileWriter1);
            PrintWriter PrintWriter1 = new PrintWriter(BufferedWriter1);
            if (Hotel1.createNewFile()) {
                System.out.println("File created: " + Hotel1.getName());
                for (RoomNumber = 0; RoomNumber < LuxuryRooms.LDoubleRoom.length; RoomNumber++) {
                    if (LuxuryRooms.LDoubleRoom[RoomNumber].CName != null) {
                        if(LuxuryRooms.LDoubleRoom[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter1.println(RoomNumber);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CName);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CContact);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CEmail);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CID);
                        }
                    }
                }
            }else {
                System.out.println("File already exists.");
                PrintWriter Checkoutwriter1 = new PrintWriter(Hotel1);
                Checkoutwriter1.print("");
                Checkoutwriter1.close();

                for (RoomNumber = 0; RoomNumber < LuxuryRooms.LDoubleRoom.length; RoomNumber++) {
                    if (LuxuryRooms.LDoubleRoom[RoomNumber] != null) {
                        if(LuxuryRooms.LDoubleRoom[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter1.println(RoomNumber);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CName);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CContact);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CEmail);
                            PrintWriter1.println(LuxuryRooms.LDoubleRoom[RoomNumber].CID);
                        }

                    }
                }
            }
            PrintWriter1.close();

            System.out.println("File :\"Hotel1 successfully saved");

            Hotel2 = new File("Hotel2.txt");
            FileWriter FileWriter2 = new FileWriter(Hotel2, true);
            BufferedWriter BufferedWriter2 = new BufferedWriter(FileWriter2);
            PrintWriter PrintWriter2 = new PrintWriter(BufferedWriter2);
            if (Hotel2.createNewFile()) {
                System.out.println("File created: " + Hotel2.getName());
                for (RoomNumber = 0; RoomNumber < LuxuryRooms.LSingleRooms.length; RoomNumber++) {
                    if (LuxuryRooms.LSingleRooms[RoomNumber] != null) {
                        if(LuxuryRooms.LSingleRooms[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter2.println(RoomNumber);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CName);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CContact);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CEmail);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CID);
                        }
                    }
                }
            }else {
                System.out.println("File already exists.");
                PrintWriter Checkoutwriter2 = new PrintWriter(Hotel2);
                Checkoutwriter2.print("");
                Checkoutwriter2.close();
                for (RoomNumber = 0; RoomNumber < LuxuryRooms.LSingleRooms.length; RoomNumber++) {
                    if (LuxuryRooms.LSingleRooms[RoomNumber] != null) {
                        if(LuxuryRooms.LSingleRooms[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter2.println(RoomNumber);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CName);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CContact);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CEmail);
                            PrintWriter2.println(LuxuryRooms.LSingleRooms[RoomNumber].CID);
                        }

                    }
                }
            }
            PrintWriter2.close();
            System.out.println("File :\"Hotel2 successfully saved");

            Hotel3 = new File("Hotel3.txt");
            FileWriter FileWriter3 = new FileWriter(Hotel3, true);
            BufferedWriter BufferedWriter3 = new BufferedWriter(FileWriter3);
            PrintWriter PrintWriter3 = new PrintWriter(BufferedWriter3);
            if (Hotel3.createNewFile()) {
                System.out.println("File created: " + Hotel3.getName());
                for (RoomNumber = 0; RoomNumber < DeluxRoom.DDoubleRoom.length; RoomNumber++) {
                    if (DeluxRoom.DDoubleRoom[RoomNumber] != null) {
                        if(DeluxRoom.DDoubleRoom[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter3.println(RoomNumber);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CName);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CContact);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CEmail);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CID);
                        }
                    }
                }
            }else {
                System.out.println("File already exists.");
                PrintWriter Checkoutwriter3 = new PrintWriter(Hotel3);
                Checkoutwriter3.print("");
                Checkoutwriter3.close();
                for (RoomNumber = 0; RoomNumber < DeluxRoom.DDoubleRoom.length; RoomNumber++) {
                    if (DeluxRoom.DDoubleRoom[RoomNumber] != null) {
                        if(DeluxRoom.DDoubleRoom[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter3.println(RoomNumber);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CName);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CContact);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CEmail);
                            PrintWriter3.println(DeluxRoom.DDoubleRoom[RoomNumber].CID);
                        }
                    }
                }
            }
            PrintWriter3.close();
            System.out.println("File :\"Hotel3 successfully saved");

            Hotel4 = new File("Hotel4.txt");
            FileWriter FileWriter4 = new FileWriter(Hotel4, true);
            BufferedWriter BufferedWriter4 = new BufferedWriter(FileWriter4);
            PrintWriter PrintWriter4 = new PrintWriter(BufferedWriter4);
            if (Hotel4.createNewFile()) {
                System.out.println("File created: " + Hotel4.getName());
                for (RoomNumber = 0; RoomNumber < DeluxRoom.DSingleRoom.length; RoomNumber++) {
                    if (DeluxRoom.DSingleRoom[RoomNumber] != null) {
                        if(DeluxRoom.DSingleRoom[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter4.println(RoomNumber);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CName);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CContact);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CEmail);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CID);
                        }
                    }
                }
            }else {
                System.out.println("File already exists.");
                PrintWriter Checkoutwriter4 = new PrintWriter(Hotel4);
                Checkoutwriter4.print("");
                Checkoutwriter4.close();
                for (RoomNumber = 0; RoomNumber < DeluxRoom.DSingleRoom.length; RoomNumber++) {
                    if (DeluxRoom.DSingleRoom[RoomNumber] != null) {
                        if(DeluxRoom.DSingleRoom[RoomNumber].CName==""){
                            System.out.println("Check out Room Skipped");
                        }else {
                            PrintWriter4.println(RoomNumber);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CName);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CContact);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CEmail);
                            PrintWriter4.println(DeluxRoom.DSingleRoom[RoomNumber].CID);
                        }
                    }
                }
            }
            PrintWriter4.close();
            System.out.println("File :\"Hotel4 successfully saved");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    public static void CheckoutWriter(char CheckOutRoomCat) throws Exception {
        int CountRoom;
        switch (CheckOutRoomCat) {

            case 'A':
                File Hotel1 = new File("Hotel1.txt");
                PrintWriter Checkoutwriter1 = new PrintWriter(Hotel1);
                Checkoutwriter1.print("");
                Checkoutwriter1.close();

                FileWriter FileWriter1 = new FileWriter(Hotel1, true);
                BufferedWriter BufferedWriter1 = new BufferedWriter(FileWriter1);
                PrintWriter PrintWriter1 = new PrintWriter(BufferedWriter1);
                try {
                    for (CountRoom = 0; CountRoom < LuxuryRooms.LDoubleRoom.length; CountRoom++) {
                        if (LuxuryRooms.LDoubleRoom[CountRoom] != null) {
                            if(LuxuryRooms.LDoubleRoom[CountRoom].CName==""){
                                System.out.println("Check out Room Skipped");
                            }else {
                                PrintWriter1.println(CountRoom);
                                PrintWriter1.println();
                                PrintWriter1.println(LuxuryRooms.LDoubleRoom[CountRoom].CName);
                                PrintWriter1.println(LuxuryRooms.LDoubleRoom[CountRoom].CContact);
                                PrintWriter1.println(LuxuryRooms.LDoubleRoom[CountRoom].CEmail);
                                PrintWriter1.println(LuxuryRooms.LDoubleRoom[CountRoom].CID);
                            }
                        }
                    }
                    PrintWriter1.close();
                }catch (Exception e){
                    System.out.println("Exception when Saving data into file");
                }
                break;

            case 'B':
                File Hotel2 = new File("Hotel2.txt");
                PrintWriter Checkoutwriter2 = new PrintWriter(Hotel2);
                Checkoutwriter2.print("");
                Checkoutwriter2.close();

                FileWriter FileWriter2 = new FileWriter(Hotel2, true);
                BufferedWriter BufferedWriter2 = new BufferedWriter(FileWriter2);
                PrintWriter PrintWriter2 = new PrintWriter(BufferedWriter2);
                try {
                    for (CountRoom = 0; CountRoom < LuxuryRooms.LSingleRooms.length; CountRoom++) {
                        if (LuxuryRooms.LSingleRooms[CountRoom] != null) {
                            if(LuxuryRooms.LSingleRooms[CountRoom].CName==""){
                                System.out.println("Check out Room Skipped");
                            }else {
                                PrintWriter2.println(CountRoom);
                                PrintWriter2.println();
                                PrintWriter2.println(LuxuryRooms.LSingleRooms[CountRoom].CName);
                                PrintWriter2.println(LuxuryRooms.LSingleRooms[CountRoom].CContact);
                                PrintWriter2.println(LuxuryRooms.LSingleRooms[CountRoom].CEmail);
                                PrintWriter2.println(LuxuryRooms.LSingleRooms[CountRoom].CID);
                            }
                        }
                    }
                    PrintWriter2.close();
                }catch (Exception e){
                    System.out.println("Exception when Saving data into file");
                }
                break;

            case 'C':
                File Hotel3 = new File("Hotel3.txt");
                PrintWriter Checkoutwriter3 = new PrintWriter(Hotel3);
                Checkoutwriter3.print("");
                Checkoutwriter3.close();

                FileWriter FileWriter3 = new FileWriter(Hotel3, true);
                BufferedWriter BufferedWriter3 = new BufferedWriter(FileWriter3);
                PrintWriter PrintWriter3= new PrintWriter(BufferedWriter3);
                try {
                    for (CountRoom = 0; CountRoom < DeluxRoom.DDoubleRoom.length; CountRoom++) {
                        if (DeluxRoom.DDoubleRoom[CountRoom] != null) {
                            if(DeluxRoom.DDoubleRoom[CountRoom].CName==""){
                                System.out.println("Check out Room Skipped");
                            }else {
                                PrintWriter3.println(CountRoom);
                                PrintWriter3.println();
                                PrintWriter3.println(DeluxRoom.DDoubleRoom[CountRoom].CName);
                                PrintWriter3.println(DeluxRoom.DDoubleRoom[CountRoom].CContact);
                                PrintWriter3.println(DeluxRoom.DDoubleRoom[CountRoom].CEmail);
                                PrintWriter3.println(DeluxRoom.DDoubleRoom[CountRoom].CID);
                            }
                        }
                    }
                    PrintWriter3.close();
                }catch (Exception e){
                    System.out.println("Exception when Saving data into file");
                }
                break;

            case 'D':
                File Hotel4 = new File("Hotel4.txt");
                PrintWriter Checkoutwriter4 = new PrintWriter(Hotel4);
                Checkoutwriter4.print("");
                Checkoutwriter4.close();

                FileWriter FileWriter4 = new FileWriter(Hotel4, true);
                BufferedWriter BufferedWriter4= new BufferedWriter(FileWriter4);
                PrintWriter PrintWriter4= new PrintWriter(BufferedWriter4);
                try {
                    for (CountRoom = 0; CountRoom < DeluxRoom.DSingleRoom.length; CountRoom++) {
                        if (DeluxRoom.DSingleRoom[CountRoom] != null) {
                            if(DeluxRoom.DSingleRoom[CountRoom].CName==""){
                                System.out.println("Check out Room Skipped");
                            }else {
                                PrintWriter4.println(CountRoom);
                                PrintWriter4.println();
                                PrintWriter4.println(DeluxRoom.DSingleRoom[CountRoom].CName);
                                PrintWriter4.println(DeluxRoom.DSingleRoom[CountRoom].CContact);
                                PrintWriter4.println(DeluxRoom.DSingleRoom[CountRoom].CEmail);
                                PrintWriter4.println(DeluxRoom.DSingleRoom[CountRoom].CID);
                            }
                        }
                    }
                    PrintWriter4.close();
                }catch (Exception e){
                    System.out.println("Exception when Saving data into file");
                }
                break;
        }
    }
}