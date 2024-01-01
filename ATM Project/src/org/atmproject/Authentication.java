package org.atmproject;

import java.util.HashMap;
import java.util.Map;

public class Authentication {

        private Map<Long, Integer> accountMap;

        public Authentication() {
            this.accountMap = new HashMap<>();
        }

        public void addAccount(long accountNumber, int pin) {
            accountMap.put(accountNumber, pin);
        }

        public boolean isValidPin(long accountNumber, int pin) {
            return accountMap.containsKey(accountNumber) && accountMap.get(accountNumber) == pin;
        }

}