package sample;

import java.util.ArrayList;

public class ContactBook {
    private String myName;
    private String myNumber;

    private ArrayList<Contact> contacts;

    public ContactBook(String myName, String myNumber) {
        this.myName = myName;
        this.myNumber = myNumber;

        this.contacts = new ArrayList<Contact>();
    }

    //**************************** Add Contact *************************************************************************
    //To add the contact, this method will first check if contact is already stored. If it is, print error message.
    //If not return true and add a new record of the contact object to the myContacts ArrayList.
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact Already exists");
            return false;
        }
        contacts.add(contact);
        return true;
    }
    //**************************** Add Contact *************************************************************************

    //**************************** Delete Contact **********************************************************************
    public boolean deleteContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println("Was not found");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName() + "Successfully deleted");
        return true;
    }
    //**************************** Delete Contact **********************************************************************

    //**************************** Search Contact **********************************************************************
    public Contact searchContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }
    //**************************** Search Contact **********************************************************************

    //**************************** Update Contact **********************************************************************

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition >= 0) {
            System.out.println(oldContact.getName() + "Was not found");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        // update contact using the index of the current contact in the array,
        // and replacing with' newContact'
        System.out.println(oldContact.getName() + " Is now updated to:   " + newContact.getName());
        return true;
    }

    //**************************** Update Contact **********************************************************************

    //**************************** Find Contact ************************************************************************
    //One of Two findContact methods. One to be over ridden as one finds the index in numbers the other passing a String.
    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    //Loop the through all the elements in the array to see if any of them match the contact name.
    // To prevent a duplicate being added.
    //If it is not on file it will return a -1 which means the contact can be added.

    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    //**************************** Find Contact ************************************************************************


    //**************************** Print Contact ***********************************************************************
    public void printContact(){
        System.out.println("All Contacts");
        for (int i=0; i<this.contacts.size();i++){
            System.out.println((i++) + "-" +
                    this.contacts.get(i).getName() +"\n" +
                    this.contacts.get(i).getEMail() +"\n" +
                    this.contacts.get(i).getPostCode() + "\n" +
                    this.contacts.get(i).getPhoneNumber());
        }
    }
    //**************************** Print Contact ***********************************************************************
}


