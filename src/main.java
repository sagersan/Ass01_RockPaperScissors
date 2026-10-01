import java.util.Scanner;


    void main()
    {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        boolean done = false;

        do {
            IO.print("Player A enter your RPS move [RPSrps]: ");
            playA = in.nextLine();

            if (playA.matches("[RPSrps]"))
            {
                IO.println("Got player A move " + playA);
            }
            else // Illegal value not R P or S
            {
                IO.println("You must enter [RPSrps] not " + playA);
            }
        }while (!done);

        done = false;
        do {
            IO.print("Player B enter your RPS move [RPSrps]: ");
            playB = in.nextLine();

            if (playB.matches("[RPSrps]"))
            {
                IO.println("Got player B move " + playB);
            }
            else // Illegal value not R P or S
            {
                IO.println("You must enter [RPSrps] not " + playB);
            }
        }while (!done);

        // Got the values for playerA and playerB now show game results

    }


