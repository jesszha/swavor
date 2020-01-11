package ui;

import delegates.TerminalTransactionsDelegate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalTransactions {
    private static final String EXCEPTION_TAG = "[EXCEPTION]";
    private static final String WARNING_TAG = "[WARNING]";
    private static final int INVALID_INPUT = Integer.MIN_VALUE;
    private static final int EMPTY_INPUT = 0;

    private BufferedReader bufferedReader = null;
    private TerminalTransactionsDelegate delegate = null;

    public TerminalTransactions() {}

    public void showMainMenu(TerminalTransactionsDelegate delegate) {
        this.delegate = delegate;

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int choice = INVALID_INPUT;

        while (choice != 5) {
            System.out.println();
            System.out.println("0. Quit.");
            System.out.println("1. Create a service request.");
            System.out.println("2. Delete a service request.");
            System.out.println("Please choose one of the options above: ");

            choice = readInteger(false);

            System.out.println(" ");

            if (choice != INVALID_INPUT) {
                switch(choice) {
                    case 0:
                        handleQuitOption();
                        break;
                    case 1:
                        handleCreateServiceRequest();
                        break;
                    case 2:
                        handleDeleteServiceRequest();
                        break;

                }
            }

        }
    }

    private void handleQuitOption() {
        System.out.println("Good Bye!");

        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("IOException!");
            }
        }

        delegate.terminalTransactionsFinished();
    }

    private void handleCreateServiceRequest() {
        //TODO
    }

    private void handleDeleteServiceRequest() {
        //TODO: look at the handleCreateServiceRequest function. requires database to be working
    }

    private int readInteger(boolean allowEmpty) {
        String line = null;
        int input = INVALID_INPUT;
        try {
            line = bufferedReader.readLine();
            input = Integer.parseInt(line);
        } catch (IOException e) {
            System.out.println(EXCEPTION_TAG + " " + e.getMessage());
        } catch (NumberFormatException e) {
            if (allowEmpty && line.length() == 0) {
                input = EMPTY_INPUT;
            } else {
                System.out.println(WARNING_TAG + " Your input was not an integer");
            }
        }
        return input;
    }
}
