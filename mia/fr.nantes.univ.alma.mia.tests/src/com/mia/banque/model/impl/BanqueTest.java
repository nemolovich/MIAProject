package com.mia.banque.model.impl;

import com.mia.banque.model.impl.Banque;
import com.mia.banque.model.impl.Client;
import com.mia.banque.model.impl.Compte;
import com.mia.banque.model.impl.Operation;

public class BanqueTest {

	public static Banque createTestBanque() {

	    Banque banque = new Banque();

		Client client1 = new Client();
		client1.setNom("Dupont");
		client1.setPrenom("Jean");
		client1.setAdresse("Paris");
		banque.getClients().add(client1);


		Client client2 = new Client();
		client2.setNom("Durant");
		client2.setPrenom("Pierre");
		client2.setAdresse("Lyon");
		banque.getClients().add(client2);



	    // Client 1

	    Compte compte1 = new Compte();
	    compte1.setNumero("123456");
	    
	    client1.getComptes().add(compte1);
	    
    	Operation credit = new Operation();
    	credit.setMontant("1000");
    	credit.setNumero("Salaire");
    	
    	Operation debit1 = new Operation();
    	debit1.setMontant("-100");
    	debit1.setNumero("Telephone");

    	Operation debit2 = new Operation();
    	debit2.setMontant("-400");
    	debit2.setNumero("Loyer");
    	
    	compte1.getOperations().add(credit);
    	compte1.getOperations().add(debit1);
    	compte1.getOperations().add(debit2);


	    // Client 2
	    
	    Compte compte2 = new Compte();
	    compte2.setNumero("789123");
	    
	    client2.getComptes().add(compte2);
	    
    	credit = new Operation();
    	credit.setMontant("400");
    	credit.setNumero("Loto");
    	
    	debit1 = new Operation();
    	debit1.setMontant("-300");
    	debit1.setNumero("Electricite");

    	compte2.getOperations().add(credit);
    	compte2.getOperations().add(debit1);


	    return banque;
	}
}
