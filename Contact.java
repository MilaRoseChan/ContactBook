package sample;

public class Contact {
    private String name;
    private String eMail;
    private String postCode;
    private String phoneNumber;

    public Contact(String name,String eMail,String postCode,String phoneNumber){
        this.name = name;
        this.eMail = eMail;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEMail() {
        return eMail;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Expose a public static method, instead of creating a separate instance or object.
    //Call the Constructor.
    public static Contact createContact(String name,String eMail,String postCode,String phoneNumber){
        return new Contact(name, eMail, postCode, phoneNumber);
    }


}




