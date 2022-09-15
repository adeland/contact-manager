public class Main {
    public static void main(String [] args) {


        ContactManager myContactManager = new ContactManager();

        Contact searchResult;

        Contact Prince = new Contact();

        Prince.name = "Prince";
        Prince.phoneNumber = "(871)-985-5582";
        Prince.email = "prince@cornell.edu";

        Contact Iram = new Contact();

        Iram.name = "Iram";
        Iram.phoneNumber = "(312)123-2032";
        Iram.email = "iram@cornell.edu";

        Contact Kelly = new Contact();

        Kelly.name = "Kelly";
        Kelly.phoneNumber = "(123)873-2132";
        Kelly.email = "kelly@cornell.edu";
;
        myContactManager.addContact(Prince);
        myContactManager.addContact(Iram);
        myContactManager.addContact(Kelly);

        searchResult = myContactManager.searchContact("Prince");
        System.out.print(searchResult.name + " : " + searchResult.phoneNumber + " : " + searchResult.email + "\n");

        searchResult = myContactManager.searchContact("Iram");
        System.out.print(searchResult.name + " : " + searchResult.phoneNumber + " : " + searchResult.email + "\n");
        
        searchResult = myContactManager.searchContact("Kelly");
        System.out.print(searchResult.name + " : " + searchResult.phoneNumber + " : " + searchResult.email);
       


    }
}