import java.util.*;
// import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Inventory {
    static int tomato = 100, onion = 100, potato = 100, oil = 100;
    static int tomatoPrice = 100, onionPrice = 35, potatoPrice = 50, oilPrice = 80, cash = 0;
}

class Cashier {
    String name, nickname;
    int password;

    public Cashier(String name, String nickname, int password) {
        this.name = name;
        this.nickname = nickname;
        this.password = password;
    }
}

class Main {
    static List<Cashier> cashiers = new ArrayList<>();

    public static void stockOperations(Scanner sc) {
        while (true) {
            System.out.print("\nStock Operations:\n1. Add Stock\n2. Update Stock\n3. Delete Stock\n4. Exit\nEnter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                stockEntry(sc);
            } else if (choice == 2) {
                stockUpdate(sc);
            } else if (choice == 3) {
                stockDelete();
            } else {
                break;
            }
        }
    }

    public static void stockEntry(Scanner sc) {
        System.out.println("Stock Entry:");
        System.out.print("Enter tomatoes to add: ");
        Inventory.tomato += sc.nextInt();
        System.out.print("Enter onions to add: ");
        Inventory.onion += sc.nextInt();
        System.out.print("Enter potatoes to add: ");
        Inventory.potato += sc.nextInt();
        System.out.print("Enter oil to add: ");
        Inventory.oil += sc.nextInt();
    }

    public static void stockUpdate(Scanner sc) {
        System.out.println("Stock Update:");
        System.out.print("Enter new quantity for tomatoes: ");
        Inventory.tomato = sc.nextInt();
        System.out.print("Enter new quantity for onions: ");
        Inventory.onion = sc.nextInt();
        System.out.print("Enter new quantity for potatoes: ");
        Inventory.potato = sc.nextInt();
        System.out.print("Enter new quantity for oil: ");
        Inventory.oil = sc.nextInt();
    }

    public static void stockDelete() {
        Inventory.tomato = 0;
        Inventory.onion = 0;
        Inventory.potato = 0;
        Inventory.oil = 0;
        System.out.println("Stock has been deleted.");
    }

    public static void billOperations(Scanner sc) {
        while (true) {
            System.out.print("\nBill Operations:\n1. Add Bill\n2. Update Bill\n3. Delete Bill\n4. Exit\nEnter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1)
             {
                try{
                billEntry(sc);
                }
                catch( Exception e){
                    System.out.println(e);
                }
            } else if (choice == 2) {
                billUpdate(sc);
            } else if (choice == 3) {
                billDelete();
            } else {
                break;
            }
        }
    }

    public static void billEntry(Scanner sc) throws IOException {
        System.out.println("Bill Entry:");
        System.out.print("Enter tomatoes purchased: ");
        int t = sc.nextInt();
        System.out.print("Enter onions purchased: ");
        int o = sc.nextInt();
        System.out.print("Enter potatoes purchased: ");
        int p = sc.nextInt();
        System.out.print("Enter oil purchased: ");
        int oil = sc.nextInt();
    
        // Check stock availability
        if (t > Inventory.tomato || o > Inventory.onion || p > Inventory.potato || oil > Inventory.oil) {
            System.out.println("Transaction failed! Insufficient stock.");
            System.out.println("Available stock: Tomatoes - " + Inventory.tomato + 
                               ", Onions - " + Inventory.onion + 
                               ", Potatoes - " + Inventory.potato + 
                               ", Oil - " + Inventory.oil);
        } else {
            // Deduct purchased items from inventory
            Inventory.tomato -= t;
            Inventory.onion -= o;
            Inventory.potato -= p;
            Inventory.oil -= oil;
    
            // Calculate individual item totals
            int totalTomato = t * Inventory.tomatoPrice;
            int totalOnion = o * Inventory.onionPrice;
            int totalPotato = p * Inventory.potatoPrice;
            int totalOil = oil * Inventory.oilPrice;
            
            // Calculate total bill
            int total = totalTomato + totalOnion + totalPotato + totalOil;
            double tax = total * 0.05; // 5% tax
            double finalTotal = total + tax;
    
            Inventory.cash += total;
    
            // Display bill details
            System.out.println("\n--- BILL RECEIPT ---");
            System.out.println("Item\tQuantity\tPrice\tTotal");
            System.out.println("Tomatoes\t" + t + "\t\t" + Inventory.tomatoPrice + "\t" + totalTomato);
            System.out.println("Onions\t\t" + o + "\t\t" + Inventory.onionPrice + "\t" + totalOnion);
            System.out.println("Potatoes\t" + p + "\t\t" + Inventory.potatoPrice + "\t" + totalPotato);
            System.out.println("Oil\t\t" + oil + "\t\t" + Inventory.oilPrice + "\t" + totalOil);
            System.out.println("------------------------------");
            System.out.println("Subtotal: " + total);
            System.out.println("Tax (5%): " + tax);
            System.out.println("Final Total: " + finalTotal);
            System.out.println("------------------------------");
    
            // Write bill to a file
            FileWriter writer = new FileWriter("bill_receipt.txt");
            writer.write("--- BILL RECEIPT ---\n");
            writer.write("Item\tQuantity\tPrice\tTotal\n");
            writer.write("Tomatoes\t" + t + "\t\t" + Inventory.tomatoPrice + "\t" + totalTomato + "\n");
            writer.write("Onions\t\t" + o + "\t\t" + Inventory.onionPrice + "\t" + totalOnion + "\n");
            writer.write("Potatoes\t" + p + "\t\t" + Inventory.potatoPrice + "\t" + totalPotato + "\n");
            writer.write("Oil\t\t" + oil + "\t\t" + Inventory.oilPrice + "\t" + totalOil + "\n");
            writer.write("------------------------------\n");
            writer.write("Subtotal: " + total + "\n");
            writer.write("Tax (5%): " + tax + "\n");
            writer.write("Final Total: " + finalTotal + "\n");
            writer.write("------------------------------\n");
            writer.close();
            System.out.println("Bill has been saved to 'bill_receipt.txt'");
            // **Append sales report to 'sales_report.txt'**
            FileWriter salesWriter = new FileWriter("sales_report.txt", true); // Append mode
            salesWriter.write("Sale Record:\n");
            salesWriter.write("Tomatoes: " + t + " x " + Inventory.tomatoPrice + " = " + totalTomato + "\n");
            salesWriter.write("Onions: " + o + " x " + Inventory.onionPrice + " = " + totalOnion + "\n");
            salesWriter.write("Potatoes: " + p + " x " + Inventory.potatoPrice + " = " + totalPotato + "\n");
            salesWriter.write("Oil: " + oil + " x " + Inventory.oilPrice + " = " + totalOil + "\n");
            salesWriter.write("Subtotal: " + total + "\n");
            salesWriter.write("Tax (5%): " + tax + "\n");
            salesWriter.write("Final Total: " + finalTotal + "\n");
            salesWriter.write("------------------------------\n");
            salesWriter.close();
            // System.out.println("Bill has been saved to 'bill_receipt.txt'");
            System.out.println("Sale has been recorded in 'sales_report.txt'");
        }
    }    
    public static void billUpdate(Scanner sc) {
        System.out.println("Update Bill Entry:");
        System.out.print("Enter new bill amount: ");
        Inventory.cash = sc.nextInt();
    }

    public static void billDelete() {
        Inventory.cash = 0;
        System.out.println("Bill has been deleted.");
    }

    public static void taxation() {
        double tax = Inventory.cash * 0.05;
        System.out.println("Total Tax to be paid: " + tax);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n1. Owner\n2. Cashier\n3. Exit\nEnter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("\nEnter admin password: ");
                int password = sc.nextInt();
                if (password == 000) {
                    while (true) {
                        System.out.print("\n1. Add Cashier\n2. View Cashiers\n3. Exit\nEnter your choice: ");
                        int option = sc.nextInt();
                        if (option == 1) {
                            System.out.print("\nEnter Cashier Name: ");
                            String name = sc.next();
                            System.out.print("\nEnter Nickname: ");
                            String nickname = sc.next();
                            System.out.print("\nEnter Password: ");
                            int pass = sc.nextInt();
                            cashiers.add(new Cashier(name, nickname, pass));
                        } else if (option == 2) {
                            for (Cashier cashier : cashiers) {
                                System.out.println(cashier.name + " - " + cashier.nickname);
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid password");
                }
            } else if (choice == 2) {
                System.out.print("\nEnter Cashier Password: ");
                int pass = sc.nextInt();
                for (Cashier cashier : cashiers) {
                    if (cashier.password == pass) {
                        System.out.println("Welcome " + cashier.nickname);
                        while (true) {
                            System.out.print("\n1. Stock Operations\n2. Bill Operations\n3. Taxation\n4. Exit\nEnter your choice: ");
                            int cashierChoice = sc.nextInt();
                            if (cashierChoice == 1) {
                                stockOperations(sc);
                            } else if (cashierChoice == 2) {
                                billOperations(sc);
                            } else if (cashierChoice == 3) {
                                taxation();
                            } else {
                                break;
                            }
                        }
                    }
                }
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}
