import java.util.Scanner;
public class Maze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int game = 2;
        int retry = 1;
        int x = 1, y = 1;


        System.out.println("DEADLY MAZE\nReach the dolar sign to win\ntouch the wall and you lose");

            while (game <= 2) {



                // x= down, y = rightl;
                //                  { 0    1    2    3    4    5    6}
                String[][] level = {{"#", "#", "#", "#", "#", "#", "#"},//  0
                                    {"#", ".", "#", ".", ".", ".", "#"},//  1
                                    {"#", ".", "#", ".", "#", ".", "#"},//  2
                                    {"#", ".", "#", ".", "#", ".", "#"},//  3
                                    {"#", ".", "#", ".", "#", ".", "#"},//  4
                                    {"#", ".", ".", ".", "#", ".", "$"},//  5
                                    {"#", "#", "#", "#", "#", "#", "#"}};// 6



                String player = level[x][y] = "0";

                for (int i = 0; i < level.length; i++) {
                    System.out.println();
                    for (int j = 0; j < level[i].length; j++) {
                        System.out.print(level[i][j] + " ");


                    }
                }
                System.out.println();
                if (player.equalsIgnoreCase(level[5][6])) {
                    ++game;
                    System.out.println("well done you beat the maze");
                    break;
                }

                if (player.equals(level[x][0])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[6][y])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[0][y])) {
                    System.out.println("you hit a wall");
                    return;
                }
                else if (player.equals(level[x][6])) {
                    System.out.println("you hit a wall");
                    return;
                }
                else if (player.equals(level[1][2])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[2][2])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[3][2])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[4][2])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[2][4])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[3][4])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[4][4])) {
                    System.out.println("you hit a wall");
                    return;
                } else if (player.equals(level[5][4])) {
                    System.out.println("you hit a wall");
                    return;
                }




                System.out.println();
                String user = input.next();


                if (user.equalsIgnoreCase("s")) {
                    ++x;
                } else if (user.equalsIgnoreCase("d")) {
                    ++y;
                } else if (user.equalsIgnoreCase("w")) {
                    --x;
                } else if (user.equalsIgnoreCase("a")) {
                    --y;
                } else {
                    System.out.println("The controls are: w,a,s,d");
                }



            }

    }
}
