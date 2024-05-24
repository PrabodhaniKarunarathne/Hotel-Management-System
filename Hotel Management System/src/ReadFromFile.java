import java.util.Locale;
import java.util.Scanner;
import java.io.File;
public class ReadFromFile {

    public static void ReadFromFile1() {
        LuxuryRooms objectL1 = new LuxuryRooms();
        String[] CName1 = new String[10];
        String[] CContact1 = new String[10];
        String[] CEmail1 = new String[10];
        String[] CID1 = new String[10];
        String[] CNametosave1 = new String[10];
        String[] CContacttosave1 = new String[10];
        String[] CEmailtosave1 = new String[10];
        String[] CIDtosave1 = new String[10];
        int RoomNumber1;
        int LineCount1 = 0;
        File file1 = new File("Hotel1.txt");
        try {
            Scanner FileScanner1 = new Scanner(file1);
            FileScanner1.useLocale(Locale.US);

            while (FileScanner1.hasNextLine()) {

                RoomNumber1=FileScanner1.nextInt();
                FileScanner1.nextLine();
                CName1[LineCount1]=FileScanner1.nextLine();
                CContact1[LineCount1]=FileScanner1.nextLine();
                CEmail1[LineCount1]=FileScanner1.nextLine();
                CID1[LineCount1]=FileScanner1.nextLine();

                CNametosave1[RoomNumber1]=CName1[LineCount1];
                CContacttosave1[RoomNumber1]=CContact1[LineCount1];
                CEmailtosave1[RoomNumber1]=CEmail1[LineCount1];
                CIDtosave1[RoomNumber1]=CID1[LineCount1];
                objectL1.LDoubleRoom[RoomNumber1] = new LuxuryRooms(CNametosave1[RoomNumber1], CContacttosave1[RoomNumber1], CIDtosave1[RoomNumber1], CEmailtosave1[RoomNumber1]);
                LineCount1++;
            }
            FileScanner1.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    public static void ReadFromFile2() throws Exception {
        LuxuryRooms objectL2 = new LuxuryRooms();
        String[] CName2 = new String[10];
        String[] CContact2 = new String[10];
        String[] CEmail2 = new String[10];
        String[] CID2 = new String[10];
        String[] CNametosave2 = new String[10];
        String[] CContacttosave2 = new String[10];
        String[] CEmailtosave2 = new String[10];
        String[] CIDtosave2 = new String[10];
        int RoomNumber2;
        int LineCount2 = 0;
        File file2 = new File("Hotel2.txt");
        try {
            Scanner FileScanner2 = new Scanner(file2);
            FileScanner2.useLocale(Locale.US);

            while (FileScanner2.hasNextLine()) {

                RoomNumber2=FileScanner2.nextInt();
                FileScanner2.nextLine();
                CName2[LineCount2]=FileScanner2.nextLine();
                CContact2[LineCount2]=FileScanner2.nextLine();
                CEmail2[LineCount2]=FileScanner2.nextLine();
                CID2[LineCount2]=FileScanner2.nextLine();

                CNametosave2[RoomNumber2]=CName2[LineCount2];
                CContacttosave2[RoomNumber2]=CContact2[LineCount2];
                CEmailtosave2[RoomNumber2]=CEmail2[LineCount2];
                CIDtosave2[RoomNumber2]=CID2[LineCount2];
                objectL2.LSingleRooms[RoomNumber2] = new LuxuryRooms(CNametosave2[RoomNumber2], CContacttosave2[RoomNumber2], CIDtosave2[RoomNumber2], CEmailtosave2[RoomNumber2]);
                LineCount2++;
            }
            FileScanner2.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    public static void ReadFromFile3() throws Exception {
        DeluxRoom objectD1 = new DeluxRoom();
        String[] CName3 = new String[10];
        String[] CContact3 = new String[10];
        String[] CEmail3 = new String[10];
        String[] CID3 = new String[10];
        String[] CNametosave3 = new String[10];
        String[] CContacttosave3 = new String[10];
        String[] CEmailtosave3 = new String[10];
        String[] CIDtosave3 = new String[10];
        int RoomNumber3;
        int LineCount3 = 0;
        File file3 = new File("Hotel3.txt");
        try {
            Scanner FileScanner3 = new Scanner(file3);
            FileScanner3.useLocale(Locale.US);

            while (FileScanner3.hasNextLine()) {

                RoomNumber3=FileScanner3.nextInt();
                FileScanner3.nextLine();
                CName3[LineCount3]=FileScanner3.nextLine();
                CContact3[LineCount3]=FileScanner3.nextLine();
                CEmail3[LineCount3]=FileScanner3.nextLine();
                CID3[LineCount3]=FileScanner3.nextLine();

                CNametosave3[RoomNumber3]=CName3[LineCount3];
                CContacttosave3[RoomNumber3]=CContact3[LineCount3];
                CEmailtosave3[RoomNumber3]=CEmail3[LineCount3];
                CIDtosave3[RoomNumber3]=CID3[LineCount3];
                objectD1.DDoubleRoom[RoomNumber3]= new DeluxRoom(CNametosave3[RoomNumber3], CContacttosave3[RoomNumber3], CIDtosave3[RoomNumber3], CEmailtosave3[RoomNumber3]);
                LineCount3++;
            }
            FileScanner3.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    public static void ReadFromFile4() throws Exception {
        DeluxRoom objectD2 = new DeluxRoom();
        String[] CName4 = new String[10];
        String[] CContact4 = new String[10];
        String[] CEmail4 = new String[10];
        String[] CID4 = new String[10];
        String[] CNametosave4 = new String[10];
        String[] CContacttosave4 = new String[10];
        String[] CEmailtosave4 = new String[10];
        String[] CIDtosave4 = new String[10];
        int RoomNumber4;
        int LineCount4 = 0;
        File file4 = new File("Hotel4.txt");
        try {
            Scanner FileScanner4 = new Scanner(file4);
            FileScanner4.useLocale(Locale.US);

            while (FileScanner4.hasNextLine()) {

                RoomNumber4=FileScanner4.nextInt();
                FileScanner4.nextLine();
                CName4[LineCount4]=FileScanner4.nextLine();
                CContact4[LineCount4]=FileScanner4.nextLine();
                CEmail4[LineCount4]=FileScanner4.nextLine();
                CID4[LineCount4]=FileScanner4.nextLine();

                CNametosave4[RoomNumber4]=CName4[LineCount4];
                CContacttosave4[RoomNumber4]=CContact4[LineCount4];
                CEmailtosave4[RoomNumber4]=CEmail4[LineCount4];
                CIDtosave4[RoomNumber4]=CID4[LineCount4];
                objectD2.DSingleRoom[RoomNumber4] = new DeluxRoom(CNametosave4[RoomNumber4], CContacttosave4[RoomNumber4], CIDtosave4[RoomNumber4], CEmailtosave4[RoomNumber4]);
                LineCount4++;
            }
            FileScanner4.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}