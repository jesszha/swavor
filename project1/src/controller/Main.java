package controller;

import delegates.TerminalTransactionsDelegate;

public class Main implements TerminalTransactionsDelegate {

    public Main() {}

    private void start() {

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
