package HomeWorkBank;

import java.util.*;

public class Bank {

    static Client getClientByAccount(HashMap<Account, Client> hm ,  Account account) {
    //find client by account
     return   hm.get(account);

    }

     static List<Account> getAccountsByClient(HashMap<Account, Client> hm , Client client) {
     //find account(s) by client
        List<Account> listOfAccounts = new ArrayList<Account>();

        if( hm.containsValue(client))
        {
            for (Map.Entry<Account, Client> accClientEntry : hm.entrySet()) {
                if (accClientEntry.getValue().equals(client)) {
                    listOfAccounts.add(accClientEntry.getKey());
                }
            }
        }

     return  listOfAccounts;

    }
    public static void main(String[] args) {
        Client client1 = new Client("Gusev", 38 );
        Account account1 = new Account(client1,"Acc1");
        Account account11 = new Account(client1, "Acc2");

        Client client2 = new Client("Utkin", 28 );
        Account account2 = new Account(client2,"Acc2");

        HashMap<Account, Client> accountClientHashMap  = new HashMap<Account, Client> ();

        accountClientHashMap.put(account1, client1 );
        accountClientHashMap.put(account11, client1 );
        accountClientHashMap.put(account2, client2 );

//client by account:
        System.out.println( Bank.getClientByAccount(accountClientHashMap, account1).getName());

//account by client
    List<Account> clientAccounts = new ArrayList<>();
    clientAccounts = Bank.getAccountsByClient(accountClientHashMap, client1);
        for (Account account: clientAccounts
             ) {
            System.out.println(account.getName());
        }

    }

}
