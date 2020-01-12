package controller;

import database.DatabaseHandler;
import delegates.TerminalTransactionsDelegate;

public class Main implements TerminalTransactionsDelegate {

    private DatabaseHandler dbHandler = null;

    public Main() {
        dbHandler = new DatabaseHandler();
    }

    private void start() {
        // Logs into the authenticate the cloud database so it can be used
        dbHandler.login("root", "nwhacks");
    }

    /**
     * Main method called at launch time
     */
    public static void main(String args[]) {
        Main main = new Main();
        main.start();
    }

    @Override
    public void terminalTransactionsFinished() {
        System.exit(0);
    }
}
