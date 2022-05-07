/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuto1;

/**
 *
 * @author iwana
 */
interface Account{
    public abstract int deposit(int depositAmount);
    public abstract boolean withdraw(int withdrawAmount);
    
}

public class BankAccount implements Account{
    private int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    
    public int deposit(int depositAmount){
        return balance = balance + depositAmount;
    }
    
    public boolean withdraw(int withdrawAmount){
        if(withdrawAmount<balance){
            balance = balance-withdrawAmount;
            return true;
        }else{
            return false;
        }
    }
    
}
