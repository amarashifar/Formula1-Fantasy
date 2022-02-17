/**
 * Basic Person class
 * @author Amirali Marashifar
 * @version 1.0
 * @since 2022-2-7
 * This is a basic Person class that has several attributes of university students. 
 * Compile as {@code javac Person.java}
 * **/
public class Person {
		//Person attributes.
		private String firstName;
		private String lastName;
		private int Age;
		private String address;
		private String gender;
		private String socialSecurity;
		private double weight;

		//Getter for firstname
		public String getfirstName() {return firstName;}

		//Getter for lastName
		public String getlastName() {return lastName;}

		//Getter for int age
		public int getAge() {return Age;}
		
		//Getter for address
		public String getaddress() {return address;}

		//Getter for gender
		public String getgender() {return gender;}

		//Getter for socialSecurity
		public String socialSecurity() {return socialSecurity;}

		//Getter for weight
		public double getweight() {return weight;}

		/**
		 * @param firstName 
		 * Setter for firstName
		 * */
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		/**
		 * @param lastName 
		 * Setter for last Name
		 * */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		/**
		 * @param Age 
		 * Setter for Age
		 * */
		public void setAge(int Age) {
			this.Age = Age;
		}

		/**
		 * @param address 
		 * Setter for address
		 * */
		public void setaddress(String address) {
			this.address = address;
		}
		/**
		 * @param gender 
		 * Setter for gender
		 * */
		public void setgender(String gender) {
			this.gender = gender;
		}

		/**
		 * @param socialSecurity 
		 * Setter for social security
		 * */
		public void setsocialSecurity(String socialSecurity) {
			this.socialSecurity = socialSecurity;
		}
		/**
		 *  @param weight
		 * 	setter for weight
		 * */
		public void setweight(double weight) {
			this.weight = weight;
		}
		/**
		 * Constructor for Student. 
		 * @param firstName, lastName, Age, ssn, address, gender, weight 
		 * */
		public Person(String firstName, String lastName, int Age, String socialSecurity, String address, String gender, double weight) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.Age = Age;
			this.socialSecurity = socialSecurity;
			this.address = address;
			this.gender = gender;
			this.weight = weight;
		}

		/**
		 * toString function return a String value
		 **/
		@Override
		public String toString() {
			return firstName + " " + lastName + "\n" + "Age: " + Age + ", SSN: " + socialSecurity + "\n" + "Address: " + address + " " + "\n" + gender + ", Weight: " + weight;
		}
		/**
		 * introduce function. 
		 * No return type. Void
		 **/
		public void introduce() {
			System.out.println(firstName + " " + lastName + " " + Age + " " + socialSecurity + " " + address + " " + gender + " " + weight); 

		}


}
