package com.kh.practiceTotal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankAccount {
    private String accountNumber;
    private double balance;

    /*
        @param amount : 입금 금액

     */
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + "원이 입금 되었습니다. 현재 잔액 : " + balance);
    }

    /*
        withdraw 출금기능
        @param amount 출금할 금액
     */
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 남은 잔액 : " + balance + "원");
    }
}
