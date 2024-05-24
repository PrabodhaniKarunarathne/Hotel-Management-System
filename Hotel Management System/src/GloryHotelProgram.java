import java.util.Scanner;

class GloryHotelProgram {

    public static void main(String[] args) throws Exception {
        ReadFromFile.ReadFromFile1();
        ReadFromFile.ReadFromFile2();
        ReadFromFile.ReadFromFile3();
        ReadFromFile.ReadFromFile4();

        char Continue;

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("=====================================================================================================");
        System.out.println("                                           WELCOME TO                                                ");
        System.out.println("=====================================================================================================");
        System.out.println("    TTTTTTTTT  HHH  HHH  EEEEEEEE        GGGGGGG     LLL         OOOO     RRRRRRR    YYY     YYY     ");
        System.out.println("       TTT     HHH  HHH  EEE            GGG          LLL       OOO  OOO   RRR   RRR    YYY  YYY      ");
        System.out.println("       TTT     HHHHHHHH  EEEEEEEE      GGG      GGG  LLL      OOO    OOO  RRRRRRR        YYY         ");
        System.out.println("       TTT     HHH  HHH  EEE            GGG   GGG G  LLL       OOO  OOO   RRR  RRR       YYY         ");
        System.out.println("       TTT     HHH  HHH  EEEEEEEE         GGGGG   G  LLLLLLL     OOOO     RRR   RRR      YYY         ");
        System.out.println("=====================================================================================================");

        do  {
            System.out.println("=====================================================================================================");
            System.out.println("Display room details                                :   Press A ");
            System.out.println("=====================================================================================================");
            System.out.println("Display room availability                           :   Press B ");
            System.out.println("=====================================================================================================");
            System.out.println("Book a room                                         :   Press C ");
            System.out.println("=====================================================================================================");
            System.out.println("Order foods                                         :   Press D ");
            System.out.println("=====================================================================================================");
            System.out.println("Check out                                           :   Press E ");
            System.out.println("=====================================================================================================");
            System.out.println("Customer information                                :   Press F ");
            System.out.println("=====================================================================================================");
            System.out.println("Exit And Save data                                  :   Press G ");
            System.out.print("=====================================================================================================\n");

            String Usrinput = input.next();
            Usrinput = Usrinput.toUpperCase();
            try {
                switch (Usrinput) {

                    case "A":
                        System.out.println("=============================================================================================");
                        System.out.println("                                        Room details                                         ");
                        System.out.println("=============================================================================================");
                        System.out.println("Enter room category  :  \n Luxury Double Room     (Press A)\n Luxury Single Room     (Press B)\n Deluxe Double Room     (Press C)\n Deluxe Single Room     (Press D)\n ");
                        char Category = input.next().charAt(0);
                        Hotel.Roomdetails(Category);
                        break;

                    case "B":
                        System.out.println("=============================================================================================");
                        System.out.println("                                        Room Availability                                    ");
                        System.out.println("=============================================================================================");
                        Availability.Availability();
                        break;

                    case "C":
                        System.out.println("=============================================================================================");
                        System.out.println("                                        Room Booking                                         ");
                        System.out.println("=============================================================================================");
                        System.out.println("Enter room category  :  \n Luxury Double Room     (Press A)\n Luxury Single Room     (Press B)\n Deluxe Double Room     (Press C)\n Deluxe Single Room     (Press D)\n ");
                        char Booking = input.next().charAt(0);
                        Hotel.Booking(Booking);
                        break;

                    case "D":
                        System.out.println("=============================================================================================");
                        System.out.println("                                         Order Foods                                         ");
                        System.out.println("=============================================================================================");
                        System.out.println("Enter your meal type : \n Breakfast Meals    (Press A)\n Lunch Meals        (Press B)\n Dinner Meals       (Press C)");
                        char Foods = input.next().charAt(0);
                        Hotel.chooseFoods(Foods);
                        break;

                    case "E":
                        System.out.println("=============================================================================================");
                        System.out.println("                                         Checkout                                            ");
                        System.out.println("=============================================================================================");
                        System.out.println("Enter room category  :  \n Luxury Double Room     (Press A)\n Luxury Single Room     (Press B)\n Deluxe Double Room     (Press C)\n Deluxe Single Room     (Press D)\n ");
                        char CheckOutRoomCat = input.next().charAt(0);
                        Hotel.Checkout(CheckOutRoomCat);
                        break;

                    case "F":
                        System.out.println("=============================================================================================");
                        System.out.println("                                         Customer Information                                ");
                        System.out.println("=============================================================================================");
                        System.out.println("Enter room category  :  \n Luxury Double Room     (Press A)\n Luxury Single Room     (Press B)\n Deluxe Double Room     (Press C)\n Deluxe Single Room     (Press D)\n ");
                        Hotel.CheckCustomerInfo();
                        break;

                    case "G":
                        WriteToFile.CreateFile();
                        System.out.println("=====================================================================================================");
                        System.out.println("                                          THANK YOU!!!!                                              ");
                        System.out.println("=====================================================================================================");
                        System.exit(0);
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + Usrinput);
                }
            }catch (Exception e){
                System.out.println("Please enter valid letter\n");

            }
            System.out.print("Do you want to Continue ?     (Press 'Y' for Yes \\ 'N' for No    :");
            Continue= input.next().charAt(0);

            if(!(Continue=='y'||Continue=='Y'||Continue=='n'||Continue=='N'))
            {
                System.out.println("Invalid Option");
                System.out.print("\nDo you want to Continue ?     (Press 'Y' for Yes \\ 'N' for No    :)");
                Continue=input.next().charAt(0);
            }
        }while(Continue=='y'||Continue=='Y');
    }
}