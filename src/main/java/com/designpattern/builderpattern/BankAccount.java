package com.designpattern.builderpattern;

import lombok.Getter;

@Getter
public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder builder){
          this.name = builder.getName();
          this.accountNumber = builder.getAccountNumber();
          this.email = builder.getEmail();
          this.newsletter = builder.isNewsletter();
    }

    @Getter
    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
