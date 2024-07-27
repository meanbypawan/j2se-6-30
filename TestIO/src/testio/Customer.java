package testio;

import java.io.Serializable;

public class Customer implements Serializable{
  private int id;
  private String name;
  private String accountNumber;
  private String contact;
  transient private int age;
  transient private String address;
    public Customer(int id, String name, String accountNumber, String contact, int age, String address) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.contact = contact;
        this.age = age;
        this.address = address;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", contact=" + contact + ", age=" + age + ", address=" + address + '}';
    }
   
}
