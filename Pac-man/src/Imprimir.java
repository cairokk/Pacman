public class Imprimir {
    public static void printPacMan() {
        System.out.println("  _ __   __ _  ___ _ __ ___   __ _ _ __  ");
        System.out.println(" | '_ \\ / _` |/ __| '_ ` _ \\ / _` | '_ \\ ");
        System.out.println(" | |_) | (_| | (__| | | | | | (_| | | | |");
        System.out.println(" | .__/ \\__,_|\\___|_| |_| |_|\\__,_|_| |_|");
        System.out.println(" |_|");

        System.out.println();

        System.out.println("⠀⠀⠀⠀⣀⣤⣴⣶⣶⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⢿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⢀⣾⣿⣿⣿⣿⣿⣿⣿⣅⢀⣽⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⠛⠁⠀⠀⣴⣶⡄⠀⣶⣶⡄⠀⣴⣶⡄");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣀⠀⠙⠋⠁⠀⠉⠋⠁⠀⠙⠋⠀");
        System.out.println("⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠈⠙⠿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

        System.out.println();
        System.out.println();
    }

    public static void printMatrixWitchPacAndGhost(int[][] matrizConfigMapa, String pacMan, String ghost) {

        String[] pacManPos = pacMan.split("-");
        String[] ghostPos = ghost.split("-");

        for (int i = 0; i < matrizConfigMapa.length; i++) {
            for (int j = 0; j < matrizConfigMapa[0].length; j++) {                
                if (matrizConfigMapa[i][j] == 1) {
                    if(i == Integer.parseInt(pacManPos[0]) && j == Integer.parseInt(pacManPos[1])){
                        System.out.print("😃");
                    } else if(i == Integer.parseInt(ghostPos[0]) && j == Integer.parseInt(ghostPos[1])) {
                        System.out.print("👻");
                    } else {
                        System.out.print("⚪️");
                    }
                } else {
                    System.out.print("🟦");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
