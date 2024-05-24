public class LuxuryRooms {
    String CName,CID,CEmail,CContact ;

    public static LuxuryRooms[] LDoubleRoom =new LuxuryRooms[10];
    public static LuxuryRooms[] LSingleRooms =new LuxuryRooms[10];

    public LuxuryRooms(String custname, String custContact, String custID, String custEmail) {
        CName=custname;
        CID=custID;
        CContact=custContact;
        CEmail=custEmail;
    }
    public LuxuryRooms() {
    }
}