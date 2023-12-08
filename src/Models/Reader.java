package Models;

public class Reader {
   int  id;
   String fullName;
   String email;
   String phoneNumber;
   Gender gender;

   public Reader() {
   }

   public Reader(int id, String fullName, String email, String phoneNumber, Gender gender) {
      this.id = id;
      this.fullName = fullName;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.gender = gender;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public Gender getGender() {
      return gender;
   }

   public void setGender(Gender gender) {
      this.gender = gender;
   }

   @Override
   public String toString() {
      return "Reader : " + "\n"+
              "id ->" + id +"\n"+
              ", fullName='" + fullName + "\n" +
              ", email='" + email + "\n" +
              ", phoneNumber='" + phoneNumber + "\n" +
              ", gender=" + gender + "\n"
              ;
   }
}
