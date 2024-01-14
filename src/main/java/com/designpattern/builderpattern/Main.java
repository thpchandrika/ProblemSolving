package com.designpattern.builderpattern;

public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();
        System.out.println("Account Number= " +newAccount.getAccountNumber());
        System.out.println("Account Name= " + newAccount.getName());
        System.out.println("Email Address= " +newAccount.getEmail());
        System.out.println("Is Newsletter= " +newAccount.isNewsletter());
    }
}
