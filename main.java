import java.util.Scanner;

class main 
{
    static void clearCLI() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void main (String[] arg) 
    {
        clearCLI();
        System.out.println("  ______   ______     ______   .______    _______ .__   __.   ______    __  ___   ___"); 
        System.out.println("/      | /  __  \\   /  __  \\   |   _  \\  |   ____||  \\ |  |  /  __  \\  |  | \\  \\ /  /"); 
        System.out.println("|  ,----'|  |  |  | |  |  |  | |  |_)  | |  |__   |   \\|  | |  |  |  | |  |  \\  V  /");  
        System.out.println("|  |     |  |  |  | |  |  |  | |   ___/  |   __|  |  . `  | |  |  |  | |  |   >   <");   
        System.out.println("|  `----.|  `--'  | |  `--'  | |  |      |  |____ |  |\\   | |  `--'  | |  |  /  .  \\");  
        System.out.println("\\______| \\______/   \\______/   | _|      |_______||__| \\__|  \\______/  |__| /__/ \\__\\");                                                                                            
        
        String[][] toDoCommandes = {{"Jean-Marie", "18-04-2005", "Noix de forêt", "5", "2000"}, {"Mamadou", "24-05-1998", "Noix d'afrique", "8", "900"}};
        Scanner inputData = new Scanner(System.in);
        System.out.println("\n[ 1 ] - Ouvrir la liste des commandes en préparation.\n[ 2 ] - Ouvrir la liste des commandes prêtes.");
        int decision = inputData.nextInt();
        clearCLI();  
        if (decision == 1) {
            String leftAlignFormat = "| %-15s | %-18s | %-14s | %-17s | %-10s | %n";
            System.out.format("+-----------------+--------------------+----------------+-------------------+------------+%n");
            System.out.format("| Nom du client   | Date de commande   | Nom du produit | Nombre de produit | Prix total |%n");
            System.out.format("+-----------------+--------------------+----------------+-------------------+------------+%n");
            for (int index = 0; index < toDoCommandes.length; index++) {
                System.out.format(leftAlignFormat, toDoCommandes[index][0], toDoCommandes[index][1], toDoCommandes[index][2], toDoCommandes[index][3], toDoCommandes[index][4]);
            }
            System.out.format("+-----------------+--------------------+----------------+-------------------+------------+%n");
        } else if (decision == 2) {
            String[][] commandReady = {{"Jordan", "29-11-2002", "Noix des bois", "185", "650"}, {"Michel", "19-02-1985", "Noix d'Amérique", "65", "156"}};
            String leftAlignFormat = "| %-15s | %-18s | %-15s | %-17s | %-10s | %n";
            System.out.format("+-----------------+--------------------+-----------------+-------------------+------------+%n");
            System.out.format("| Nom du client   | Date de commande   | Nom du produit  | Nombre de produit | Prix total |%n");
            System.out.format("+-----------------+--------------------+-----------------+-------------------+------------+%n");
            for (int index = 0; index < commandReady.length; index++) {
                System.out.format(leftAlignFormat, commandReady[index][0], commandReady[index][1], commandReady[index][2], commandReady[index][3], commandReady[index][4]);
            }
            System.out.format("+-----------------+--------------------+-----------------+-------------------+------------+%n");
        }
    }
}