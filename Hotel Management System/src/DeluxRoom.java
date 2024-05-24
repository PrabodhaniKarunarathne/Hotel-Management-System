public class DeluxRoom {
    String CName,CID,CEmail,CContact ;
    static DeluxRoom [] DDoubleRoom=new DeluxRoom[10];
    static DeluxRoom [] DSingleRoom=new DeluxRoom[10];

    public DeluxRoom(String custname, String custContact, String custID, String custEmail) {
        CName=custname;
        CID=custID;
        CContact=custContact;
        CEmail=custEmail;
    }

    public DeluxRoom() {

    }
}