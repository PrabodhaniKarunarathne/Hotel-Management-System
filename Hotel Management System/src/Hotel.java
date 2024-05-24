import java.io.*;
import java.util.Scanner;

public class Hotel {


    static void Roomdetails(char Category) {

        switch (Category) {
            case 'A' :
                System.out.println("Number of Guests    : 2\n A\\C Availability    : Yes \n Breakfast Availability    : Yes\n Price for One Night    : 15000LKR");
                break;
            case 'B' :
                System.out.println("Number of Guests    : 1\n A\\C Availability    : Yes \n Breakfast Availability    : Yes\n Price for One Night    : 12000LKR");
                break;
            case 'C' :
                System.out.println("Number of Guests    : 2\n A\\C Availability    : No  \n Breakfast Availability    : Yes\n Price for One Night    : 10000LKR");
                break;
            case 'D' :
                System.out.println("Number of Guests    : 1\n A\\C Availability    : No  \n Breakfast Availability    : Yes\n Price for One Night    :  8000LKR");
                break;
            default :
                System.out.println("Please enter a valid option");
        }

    }

    static void GetCustDetails(char Booking, int RoomNumber) {
        LuxuryRooms objectL = new LuxuryRooms();
        DeluxRoom objectD = new DeluxRoom();
        String Custname;
        String CustContact;
        String CustEmail;
        String CustID;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Customer details...");
        System.out.print("Enter Customer Name              :");
        Custname = input.next();
        System.out.println();
        System.out.print("Enter Customers' Contact Number  :");
        CustContact = input.next();
        System.out.println();
        System.out.print("Enter Customers' Email           :");
        CustEmail = input.next();
        System.out.println();
        System.out.print("Enter Customers' ID              :");
        CustID = input.next();
        System.out.println();

        switch (Booking) {
            case 'A':
                objectL.LDoubleRoom[RoomNumber] = new LuxuryRooms(Custname, CustContact, CustID, CustEmail);
                break;
            case 'B':
                objectL.LSingleRooms[RoomNumber] = new LuxuryRooms(Custname, CustContact, CustID, CustEmail);
                break;
            case 'C':
                objectD.DDoubleRoom[RoomNumber] = new DeluxRoom(Custname, CustContact, CustID, CustEmail);
                break;
            case 'D':
                objectD.DSingleRoom[RoomNumber] = new DeluxRoom(Custname, CustContact, CustID, CustEmail);
                break;
            default:
                System.out.print("Please enter a valid option");
        }
    }

    static void Booking(char Booking) throws Exception {

        int i;
        int RoomNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("\nThe valid room number is: ");
        switch (Booking) {
            case 'A':
                for (i = 0; i < LuxuryRooms.LDoubleRoom.length; i++) {

                    if (LuxuryRooms.LDoubleRoom[i] == null||LuxuryRooms.LDoubleRoom[i].CName=="") {
                        System.out.print(i + 1 + ",");
                    }
                }
                System.out.print("\n\nEnter room number: ");
                try {
                    RoomNumber = input.nextInt();
                    RoomNumber--;
                    if(LuxuryRooms.LDoubleRoom[RoomNumber]==null||LuxuryRooms.LDoubleRoom[RoomNumber].CName=="") {
                        GetCustDetails(Booking, RoomNumber);
                        System.out.println("Room Booked");
                    }else {
                        throw new NotAvailable();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                }
                break;
            case 'B':
                for (i = 0; i < LuxuryRooms.LSingleRooms.length; i++) {

                    if (LuxuryRooms.LSingleRooms[i] == null||LuxuryRooms.LSingleRooms[i].CName=="") {
                        System.out.print(i + 11 + ",");
                    }
                }
                System.out.print("\n\nEnter room number: ");
                try {
                    RoomNumber = input.nextInt();
                    RoomNumber=RoomNumber-11;
                    if(LuxuryRooms.LSingleRooms[RoomNumber]==null||LuxuryRooms.LSingleRooms[RoomNumber].CName=="") {
                        GetCustDetails(Booking, RoomNumber);
                        System.out.println("Room Booked");
                    }else {
                        throw new NotAvailable();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                }
                break;
            case 'C':
                for (i = 0; i < DeluxRoom.DDoubleRoom.length; i++) {

                    if (DeluxRoom.DDoubleRoom[i] == null||DeluxRoom.DDoubleRoom[i].CName=="") {
                        System.out.print(i + 21 + ",");
                    }
                }
                System.out.print("\n\nEnter room number: ");
                try {
                    RoomNumber = input.nextInt();
                    RoomNumber=RoomNumber-21;
                    if(DeluxRoom.DDoubleRoom[RoomNumber]==null||DeluxRoom.DDoubleRoom[RoomNumber].CName=="") {
                        GetCustDetails(Booking, RoomNumber);
                        System.out.println("Room Booked");
                    }else {
                        throw new NotAvailable();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                }
                break;
            case 'D':
                for (i = 0; i < DeluxRoom.DSingleRoom.length; i++) {

                    if (DeluxRoom.DSingleRoom[i] == null||DeluxRoom.DSingleRoom[i].CName=="") {
                        System.out.print(i + 31 + ",");
                    }
                }
                System.out.print("\n\nEnter room number: ");
                try {
                    RoomNumber = input.nextInt();
                    RoomNumber=RoomNumber-31;
                    if(DeluxRoom.DSingleRoom[RoomNumber]==null||DeluxRoom.DSingleRoom[RoomNumber].CName=="") {
                        GetCustDetails(Booking, RoomNumber);
                        System.out.println("Room Booked");
                    }else {
                        throw new NotAvailable();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                }
                break;

            default:
                System.out.println("Invalid Input");
        }
    }

    static void chooseFoods(char Foods) {
        switch (Foods) {
            case 'A':
                OrderFoods breakfast0bj = new BreakfastFoods();
                System.out.println("Total Price : " + breakfast0bj.getPrice());
                break;
            case 'B':
                OrderFoods lunch0bj = new LunchFoods();
                System.out.println("Total Price : " + lunch0bj.getPrice());
                break;
            case 'C':
                OrderFoods dinner0bj = new DinnerFoods();
                System.out.println("Total Price : " + dinner0bj.getPrice());
                break;
            default:
                System.out.println("Invalid Input");
        }
    }


    static void Checkout(char CheckOutRoomCat) throws Exception {
        LuxuryRooms CheckoutLD=new LuxuryRooms();
        LuxuryRooms CheckoutLS=new LuxuryRooms();
        DeluxRoom CheckoutDD=new DeluxRoom();
        DeluxRoom CheckoutDS=new DeluxRoom();
        Scanner Checkoutinput=new Scanner(System.in);
        int RoomNumber;
        try {
            switch (CheckOutRoomCat) {
                case 'A':
                    System.out.print("Enter the room number   :");
                    RoomNumber = Checkoutinput.nextInt();
                    RoomNumber = RoomNumber - 1;

                    File Hotel1 = new File("Hotel1.txt");
                    PrintWriter Checkoutwriter1 = new PrintWriter(Hotel1);
                    Checkoutwriter1.print("");
                    Checkoutwriter1.close();

                    if (LuxuryRooms.LDoubleRoom[RoomNumber] == null) {
                        System.out.println("Please enter a valid Room number (The Room is not booked yet)");
                    } else {
                        String CName = "";
                        String CContact = "";
                        String CEmail = "";
                        String CID = "";

                        CheckoutLD.LDoubleRoom[RoomNumber] = new LuxuryRooms(CName, CContact, CID, CEmail);
                        System.out.println("Customer is Successfully checkout");
                        System.out.println("The Bill: 15000");
                    }
                    break;
                case 'B':
                    System.out.print("Enter the room number   :");
                    RoomNumber = Checkoutinput.nextInt();
                    RoomNumber = RoomNumber - 11;

                    File Hotel2 = new File("Hotel2.txt");
                    PrintWriter Checkoutwriter2 = new PrintWriter(Hotel2);
                    Checkoutwriter2.print("");
                    Checkoutwriter2.close();

                    if (LuxuryRooms.LSingleRooms[RoomNumber] == null) {
                        System.out.println("Please enter a valid Room number (The Room is not booked yet)");
                    } else {
                        String CName = "";
                        String CContact = "";
                        String CEmail = "";
                        String CID = "";

                        CheckoutLS.LSingleRooms[RoomNumber] = new LuxuryRooms(CName, CContact, CID, CEmail);
                        System.out.println("Customer is Successfully checkout");
                        System.out.println("The Bill: 12000");
                    }
                    break;
                case 'C':
                    System.out.print("Enter the room number   :");
                    RoomNumber = Checkoutinput.nextInt();
                    RoomNumber = RoomNumber - 21;

                    File Hotel3 = new File("Hotel3.txt");
                    PrintWriter Checkoutwriter3 = new PrintWriter(Hotel3);
                    Checkoutwriter3.print("");
                    Checkoutwriter3.close();

                    if (DeluxRoom.DDoubleRoom[RoomNumber] == null) {
                        System.out.println("Please enter a valid Room number (The Room is not booked yet)");
                    } else {
                        String CName = "";
                        String CContact = "";
                        String CEmail = "";
                        String CID = "";

                        CheckoutDD.DDoubleRoom[RoomNumber] = new DeluxRoom(CName, CContact, CID, CEmail);
                        System.out.println("Customer is Successfully checkout");
                        System.out.println("The Bill: 10000");
                    }
                    break;
                case 'D':
                    System.out.print("Enter the room number   :");
                    RoomNumber = Checkoutinput.nextInt();
                    RoomNumber = RoomNumber - 31;

                    File Hotel4 = new File("Hotel4.txt");
                    PrintWriter Checkoutwriter4 = new PrintWriter(Hotel4);
                    Checkoutwriter4.print("");
                    Checkoutwriter4.close();

                    if (DeluxRoom.DSingleRoom[RoomNumber] == null) {
                        System.out.println("Please enter a valid Room number (The Room is not booked yet)");
                    } else {
                        String CName = "";
                        String CContact = "";
                        String CEmail = "";
                        String CID = "";

                        CheckoutDS.DSingleRoom[RoomNumber] = new DeluxRoom(CName, CContact, CID, CEmail);
                        System.out.println("Customer is Successfully checkout");
                        System.out.println("The Bill: 8000");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + CheckOutRoomCat);
            }
        } catch(Exception e){
            System.out.println("Error in Checkout");
        }
    }

    static void CheckCustomerInfo(){
        System.out.println("Enter room category  :");
        System.out.println(" Luxury Double Room     (Ptess A)");
        System.out.println(" Luxury Single Room"    );
    }
}