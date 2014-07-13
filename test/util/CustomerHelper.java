package util;

import models.Customer;
import models.Gender;
import models.PhotoType;
import scala.util.Random;

public class CustomerHelper {
	
	public static Customer newRandomCustomer() {
		Random random = new Random();
		Customer customer = new Customer();
		customer.firstName = random.nextString(10);
		customer.lastName = random.nextString(10);
		customer.age = random.nextString(3);
		customer.jobTitle = random.nextString(20);
		
		int genderIndex = random.nextInt(Gender.values().length);
		customer.gender = Gender.values()[genderIndex];
		
		int photoTypeIndex = random.nextInt(PhotoType.values().length);
		customer.photoType = PhotoType.values()[photoTypeIndex];
		
		customer.photoUrl = random.nextString(30);
		
		return customer;
	}

}
