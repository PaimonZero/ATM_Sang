
package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import util.Validation;

public class TransactionHash {
    private ArrayList<Transaction> transactionList;
    private Validation val;

    public TransactionHash(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
    
    ////////////////////////////////////////////////////////////////
    
    public void createFile(String pathName) throws IOException {
        File file = new File(pathName);
        try {
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean checkFileExist(String pathName) {
        File file = new File(pathName);
        //if file doesn't exist -> return false
        if(!file.exists()) {
            return false;
        }
        return true;
    }
    
    public void readFile() {
        //chuwa lam
    }
    
    
}
