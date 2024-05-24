import java.util.Scanner;

abstract class OrderFoods {
    static int Amount;
    static int totalPrice = 0;

    static char choice;
    static char choose;

    static Scanner input = new Scanner(System.in);

    public abstract double getPrice();

}


class BreakfastFoods extends OrderFoods {

    public BreakfastFoods() {

        {
            System.out.println(" ----------------- Menu ----------------- \n");
            System.out.println("1 :Chocolate porridge with Fruit juice \t\t\t\t\t\t\t\t\t\t: Rs:1500 (Press A)\n" +
                    "2: Veggie breakfast bakes with Milkshake\t\t\t\t\t\t\t\t\t: Rs:1200 (Press B)\n" +
                    "3: Middle Eastern eggs with merguez & pistachios with Smoothie\t\t\t\t: Rs:1600 (Press C)\n" +
                    "4: Ham & potato hash with baked beans & healthy fried eggs with Fruit juice : Rs:1550 (Press D)\n" +
                    "5: Tropical breakfast bars with Milkshake\t\t\t\t\t\t\t\t\t: Rs:1650 (Press E)\n  ");
            do {
                System.out.println("Enter your choice : \n");
                choice = input.next().charAt(0);
                System.out.println("Enter the Quantity : \n");
                Amount = input.nextInt();

                switch (choice) {
                    case 'A':
                        totalPrice = totalPrice + (Amount * 1500);
                        break;
                    case 'B':
                        totalPrice = totalPrice + (Amount * 1200);//System.out.println("Total Price:" + totalPrice);
                        break;
                    case 'C':
                        totalPrice = totalPrice + (Amount * 1600);
                        break;
                    case 'D':
                        totalPrice = totalPrice + (Amount * 1550);
                        break;
                    case 'E':
                        totalPrice = totalPrice + (Amount * 1650);
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;

                }
                System.out.println("Do you want to order again?\n Press 'Y' for Yes, Press 'N' for No");
                choose = input.next().charAt(0);
                if (choose == 'Y' || choose == 'y') {
                    new BreakfastFoods();
                } else {
                    if (!(choose == 'y' || choose == 'Y' || choose == 'n' || choose == 'N')) {
                        System.out.println("Invalid Option");
                        System.out.print("Do you want to order again?\\n Press 'Y' for Yes, Press 'N' for No\")");
                        choose = input.next().charAt(0);

                    }
                }

            } while (choose == 'Y' || choose == 'y');

        }
    }


    @Override
    public double getPrice() {
        return totalPrice;
    }
}

class LunchFoods extends OrderFoods {

    public LunchFoods() {
        System.out.println(" ----------------- Menu ----------------- \n");
        System.out.println("1 :Vegetable Biryani \t: Rs:1400 (Press A)\n" +
                "2: Chicken Biryani\t\t: Rs:1700 (Press B)\n" +
                "3: Mixed Rice\t\t\t: Rs:1600 (Press C)\n" +
                "4: Seafood Rice\t\t\t: Rs:1750 (Press D)\n" +
                "5: Vegetable Rice\t\t: Rs:13000 (Press E)\n ");
        do {
            System.out.println("Enter your choice : \n");
            choice = input.next().charAt(0);
            System.out.println("Enter the Quantity : \n");
            Amount = input.nextInt();

            switch (choice) {
                case 'A':
                    totalPrice = totalPrice + (Amount * 1400);
                    break;
                case 'B':
                    totalPrice = totalPrice + (Amount * 1700);
                    break;
                case 'C':
                    totalPrice = totalPrice + (Amount * 1600);
                    break;
                case 'D':
                    totalPrice = totalPrice + (Amount * 1750);
                    break;
                case 'E':
                    totalPrice = totalPrice + (Amount * 1300);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
            System.out.println("Do you want to order again?\n Press 'Y' for Yes, Press 'N' for No");
            choose = input.next().charAt(0);
            if (choose == 'Y' || choose == 'y') {
                new LunchFoods();
            } else {
                if (!(choose == 'y' || choose == 'Y' || choose == 'n' || choose == 'N')) {
                    System.out.println("Invalid Option");
                    System.out.print("Do you want to order again?\\n Press 'Y' for Yes, Press 'N' for No\")");
                    choose = input.next().charAt(0);

                }
            }

        } while (choose == 'Y' || choose == 'y');

    }


    @Override
    public double getPrice() {
        return totalPrice;
    }
}

class DinnerFoods extends  OrderFoods{

    public DinnerFoods() {
        System.out.println(" ----------------- Menu ----------------- \n");
        System.out.println("1 :Macaroni and Cheese\t\t\t\t: Rs:1600 (Press A)\n" +
                "2: Broccoli Cheddar Baked Potato\t: Rs:1200 (Press B)\n" +
                "3: Hummus Salad\t\t\t\t\t\t: Rs:1500 (Press C)\n" +
                "4: Fresh Green Salad\t\t\t\t: Rs:1400 (Press D)\n" +
                "5: Burrito Bowl\t\t\t\t\t\t: Rs:1650 (Press E)\n  ");
        do{
            System.out.println("Enter your choice : \n");
            choice = input.next().charAt(0);
            System.out.println("Enter the Quantity : \n");
            Amount = input.nextInt();

            switch (choice){
                case 'A':
                    totalPrice = totalPrice+(Amount*1600);
                    break;
                case 'B':
                    totalPrice = totalPrice+(Amount*1200);
                    break;
                case 'C':
                    totalPrice = totalPrice+(Amount*1500);
                    break;
                case 'D':
                    totalPrice = totalPrice+(Amount*1400);
                    break;
                case 'E':
                    totalPrice = totalPrice+(Amount*1650);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
            System.out.println("Do you want to order again?\n Press 'Y' for Yes, Press 'N' for No");
            choose = input.next().charAt(0);
            if(choose == 'Y' || choose == 'y'){
                new DinnerFoods();
            }
            else{
                if(!(choose=='y'||choose=='Y'||choose=='n'||choose=='N'))
                {
                    System.out.println("Invalid Option");
                    System.out.print("Do you want to order again?\\n Press 'Y' for Yes, Press 'N' for No\")");
                    choose=input.next().charAt(0);

                }
            }
        }while (choose == 'Y' || choose == 'y');

    }

    @Override
    public double getPrice() {
        return totalPrice;
    }
}