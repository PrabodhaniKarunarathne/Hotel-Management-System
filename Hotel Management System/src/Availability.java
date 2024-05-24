public class Availability {
    static void Availability() throws Exception {
        int Roomnumber;
        System.out.println("The Available rooms of Luxury Rooms (Double Rooms) :\n");
        for (Roomnumber=0;Roomnumber<LuxuryRooms.LDoubleRoom.length;Roomnumber++) {
            if (LuxuryRooms.LDoubleRoom[Roomnumber] == null) {
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else if(LuxuryRooms.LDoubleRoom[Roomnumber].CName ==""){
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else{
                System.out.println("Room No:" + ++Roomnumber + "\t:Room is Not Available");
                --Roomnumber;
            }

        }

        System.out.println();

        System.out.println("The Available rooms of Luxury Rooms (Single Rooms) :\n");
        for (Roomnumber=0;Roomnumber<LuxuryRooms.LSingleRooms.length;Roomnumber++) {
            if (LuxuryRooms.LSingleRooms[Roomnumber] == null) {
                Roomnumber=Roomnumber+10;
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else if(LuxuryRooms.LSingleRooms[Roomnumber].CName ==""){
                Roomnumber=Roomnumber+10;
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else{
                Roomnumber=Roomnumber+10;
                System.out.println("Room No:" + ++Roomnumber + "\t:Room is Not Available");
                --Roomnumber;
            }
            Roomnumber=Roomnumber-10;
        }
        System.out.println();


        System.out.println("The Available rooms of Deluxe Rooms (Double Rooms) :\n");
        for (Roomnumber=0;Roomnumber<DeluxRoom.DDoubleRoom.length;Roomnumber++) {
            if (DeluxRoom.DDoubleRoom[Roomnumber] == null) {
                Roomnumber=Roomnumber+20;
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else if(DeluxRoom.DDoubleRoom[Roomnumber].CName ==""){
                Roomnumber=Roomnumber+20;
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else{
                Roomnumber=Roomnumber+20;
                System.out.println("Room No:" + ++Roomnumber + "\t:Room is Not Available");
                --Roomnumber;
            }
            Roomnumber=Roomnumber-20;
        }
        System.out.println();

        System.out.println("The Available rooms of Deluxe Rooms (Single Rooms) :\n");
        for (Roomnumber=0;Roomnumber<DeluxRoom.DSingleRoom.length;Roomnumber++) {
            if (DeluxRoom.DSingleRoom[Roomnumber] == null) {
                Roomnumber=Roomnumber+30;
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else if(DeluxRoom.DSingleRoom[Roomnumber].CName ==""){
                Roomnumber=Roomnumber+30;
                System.out.println("Room No:"+ ++Roomnumber + "\t:Room is Available");
                --Roomnumber;
            }else{
                Roomnumber=Roomnumber+30;
                System.out.println("Room No:" + ++Roomnumber + "\t:Room is Not Available");
                --Roomnumber;
            }
            Roomnumber=Roomnumber-30;
        }
        System.out.println();
    }
}