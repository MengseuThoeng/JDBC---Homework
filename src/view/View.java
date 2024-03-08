package view;

import java.util.Scanner;

public class View {
    public static void ui(){
        String menu = """
                ╔═════════════════════════════════════════════════════════════════════════════════════════════════╗
                ║                                        Application Menu                                         ║
                ║─────────────────────────────────────────────────────────────────────────────────────────────────║
                ║          1. Display   |   2. Add New   |   3. Delete    |   4. Update   |   5. Search           ║
                ╚═════════════════════════════════════════════════════════════════════════════════════════════════╝
                """;
        System.out.print(menu);
    }
    public static String option(){
        System.out.print("ׂ╰┈➤ Choose the option :");
        return new Scanner(System.in).nextLine();
    }
}
