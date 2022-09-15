public class Main {
		  public static void main(String [] args){
		  ContactsManager myContactsManager = new ContactsManager();   
	      
		  
	      	   class Contact{
	    	   String name;
	    	   String email;
	    	   String phoneNumber;
	    	}
	      
	      Contact friendPrince = new Contact();
	      friendPrince.name = "Prince";
	      friendPrince.email = "prince@cornell.edu";
	      friendPrince.phoneNumber = "(123)456-789";
	      myContactsManager.addContact(friendPrince);
	     
	      Contact friendIram = new Contact();
	      friendIram.name = "Iram";
	      friendIram.email = "iram@cornell.edu";
	      friendIram.phoneNumber = "(234)456-765";
	      myContactsManager.addContact(friendIram);
	      
	      Contact friendKelly = new Contact();
	      friendKelly.name = "Kelly";
	      friendKelly.email = "kelly@cornell.edu";
	      friendKelly.phoneNumber = "(432)765-9231";
	      myContactsManager.addContact(friendKelly);
	    		  
	    		 
	      
	      class ContactsManager {
	    	   
	    	   Contact [] myFriends;
	    	   int friendsCount;
	    	   	    	   	    	 	    	   
	    	   ContactsManager(){
	    	      friendsCount = 0;
	    	      myFriends = new Contact[500];	    	     
	    	   }
	    	   
	    	   void addContact(Contact contact){
	    	      myFriends[friendsCount] = contact;
	    	      friendsCount++;
	    	   }

	    	   Contact searchContact(String searchName){
	    	      for(int i=0; i<friendsCount; i++){
	    	         if(myFriends[i].name.equals(searchName)){
	    	            return myFriends[i];
	    	            Contact result = myContactsManager.searchContact("Prince");
	    	            System.out.println(result.phoneNumber);         
	    	         }
	    	      }
	    	      return null;
	    	   }
	    	}
	   }
	}
