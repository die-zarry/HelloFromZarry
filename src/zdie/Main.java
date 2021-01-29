package zdie;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //system.out.println("Hello From ").projectName;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello From: ");
        String projectName = input.nextLine();

        System.out.println("Hello, my name is: " + projectName);
        String fancySignature =
                        "                  uu$$$$$$$$$$$uu\n" +
                        "              uu$$$$$$$$$$$$$$$$$uu\n" +
                        "             u$$$$$$$$$$$$$$$$$$$$$u\n" +
                        "            u$$$$$$$$$$$$$$$$$$$$$$$u\n" +
                        "           u$$$$$$$$$$$$$$$$$$$$$$$$$u\n" +
                        "           u$$$$$$*   *$$$*   *$$$$$$u\n" +
                        "           *$$$$*      u$u       $$$$*\n" +
                        "            $$$u       u$u       u$$$\n" +
                        "            $$$u      u$$$u      u$$$\n" +
                        "             *$$$$uu$$$   $$$uu$$$$*\n" +
                        "              *$$$$$$$*   *$$$$$$$*\n" +
                        "                u$$$$$$$u$$$$$$$u\n" +
                        "                 u$*$*$*$*$*$*$u\n" +
                        "      uuu        $$u$ $ $ $ $u$$       uuu\n" +
                        "      u$$$$       $$$$$u$u$u$$$       u$$$$\n" +
                        "      $$$$$uu      *$$$$$$$$$*     uu$$$$$$\n" +
                        "    u$$$$$$$$$$$uu    *****    uuuu$$$$$$$$$\n" +
                        "    $$$$***$$$$$$$$$$uuu   uu$$$$$$$$$***$$$*\n" +
                        "     ***      **$$$$$$$$$$$uu **$***\n" +
                        "              uuuu **$$$$$$$$$$uuu\n" +
                        "     u$$$uuu$$$$$$$$$uu **$$$$$$$$$$$uuu$$$\n" +
                        "     $$$$$$$$$$****           **$$$$$$$$$$$*\n" +
                        "       *$$$$$*                      **$$$$**\n" +
                        "         $$$*                         $$$$*\n" +
                        "               Hi, my name is Zach";
        System.out.println(fancySignature);
    }
}
