public class ContactManager {
  
    Contact [] myFriends;
    int friendsCount;

   public ContactManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

       public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
   public Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}

