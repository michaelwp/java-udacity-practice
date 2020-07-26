package com.company;

public class Main {

    public static void main(String[] args) {
        // define contacts manager
        ContactsManager myContactsManager = new ContactsManager();

        // set contact list value
        String[][] contactsList = {
                {"Michael", "michael@michael.com", "+6281234567890"},
                {"Melissa", "melissa@melissa.com", "+6281234567891"},
                {"Brahmantya", "brahmanatya@brahmanatya.com", "+6281234567892"},
                {"Ilham", "ilham@ilham.com", "+6281234567893"}
        };

        // loop the contact data list
        for (String[] contactItem : contactsList) {
            // create new contact object
            Contact friendsContact = new Contact();

            // set contact
            friendsContact.name = contactItem[0];
            friendsContact.email = contactItem[1];
            friendsContact.phoneNumber = contactItem[2];

            // add contact
            myContactsManager.addContact(friendsContact);
        }

        // random friends name
        double indexNumber = Math.random() * 3;
        String friendsName = contactsList[Math.round((float) indexNumber)][0];

        // find contact by friends name
        Contact resContact = myContactsManager.searchContact(friendsName);

        if (!(resContact == null)) {
            System.out.println("Name : " + resContact.name);
            System.out.println("Email : " + resContact.email);
            System.out.println("Phone number : " + resContact.phoneNumber);
        }
    }
}
