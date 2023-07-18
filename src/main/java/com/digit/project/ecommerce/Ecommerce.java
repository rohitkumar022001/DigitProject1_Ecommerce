package com.digit.project.ecommerce;



import java.util.Scanner;

// products
class Products {
	Scanner sc = new Scanner(System.in);

	public void buy(String name) {
		System.out.println("\n\t Thank You For Your Purchase");
		System.out.println("*************************************\n");
		System.out.println("\n\t\tBILL:\r\n");

		System.out.println("*************************************\n");
		System.out.println("Brand: ABCD\r\n" + "Model: " + name + "\r\n" + "Color: Space Gray\r\n" + "\r\n"
				+ "IMEI Number: 123456789012345\r\n" + "\r\n"
				+ "----------------------------------------------------\r\n" + "\r\n"
				+ "Pricing and Payment Information:\r\n" + "Unit Price: 100000\r\n" + "Quantity: 1\r\n"
				+ "Subtotal: $100000\r\n" + "Sales Tax (8%): 103.99\r\n" + "Total Amount Payable: 100403.98");

		while (true) {
			System.out.println("\n\n\tPress any Key... ");
			String str = sc.nextLine();
			if (!str.isEmpty() || str.isBlank()) {
				System.out.println("\n*****************************************\n");
				menu();
				break;
			}
		}
		System.out.println("\n*****************************************\n");

	}

	public void buyGF(String name) {
		System.out.println("\n\t Thank You For Your Purchase");
		System.out.println("*************************************\n");
		System.out.println("\n\t\tBILL:\r\n");
		System.out.println("*************************************\n");
		System.out.println("Brand: ABCD\r\n" + "Name : " + name + "Pricing and Payment Information:\r\n"
				+ "----------------------------------------------------\r\n" + "Unit Price: 100\r\n" + "Quantity: 1\r\n"
				+ "Subtotal: 100\r\n" + "Sales Tax (8%): 103.99\r\n" + "Total Amount Payable: 103.98");

			while (true) {
			System.out.println("\n\n\tPress any Key... ");
			String str = sc.nextLine();
			if (!str.isEmpty() || str.isBlank()) {
				System.out.println("\n*****************************************\n");
				menu();
				break;
			}
		}
		System.out.println("\n*****************************************\n");
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("\nWhat You are Looking For ?\n");
			System.out.println("1. Electronics " + "\n2. Beauty Products" + "\n3. Shoe" + "\n4. Groceries"
					+ "\n5. Furniture" + "\n6. Exit");

			System.out.println("\n Enter your choice from the above catagories : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n");
				Electronics e = new Electronics();
				e.display();
				break;
			case 2:
				System.out.println("\n");
				Beauty b = new Beauty();
				b.display();
				break;
			case 3:
				System.out.println("\n");
				Shoe s = new Shoe();
				s.display();
				break;
			case 4:
				System.out.println("\n");
				Groceries g = new Groceries();
				g.display();
				break;
			case 5:
				System.out.println("\n");
				Furniture f = new Furniture();
				f.display();
				break;
			case 6:
				System.out.println("\n\n\n\t\tThank Your For Visiting ...");
				System.exit(0);

			}

		}
	}

}

class Mobiles extends Electronics {

	Scanner sc = new Scanner(System.in);

	public void samsungS21Fe() {

		System.out.println("\n\tSamsung s21 Fe \n" + "\n Description :\n"
				+ "BODY	Dimensions	155.7 x 74.5 x 7.9 mm (6.13 x 2.93 x 0.31 in)\r\n" + "Weight	177 g (6.24 oz) "
				+ "\nIP68 dust/water resistant (up to 1.5m for 30 min)\r\n"
				+ "DISPLAY	Type	Dynamic AMOLED 2X, 120Hz, HDR10+\r\n"
				+ "Size	6.4 inches, 100.5 cm2 (~86.7% screen-to-body ratio)\r\n"
				+ "Resolution	1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density)\r\n"
				+ "Protection	Corning Gorilla Glass Victus ");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Samsung S21 FE");
		} else {
			display();
		}
	}

	public void samsungS22() {

		System.out.println("\n\tSamsung s22 \n" + "\n Description :\n"
				+ "BODY	Dimensions	155.7 x 74.5 x 7.9 mm (6.13 x 2.93 x 0.31 in)\r\n" + "Weight	177 g (6.24 oz) "
				+ "\nIP68 dust/water resistant (up to 1.5m for 30 min)\r\n"
				+ "DISPLAY	Type	Dynamic AMOLED 2X, 120Hz, HDR10+\r\n"
				+ "Size	6.4 inches, 100.5 cm2 (~86.7% screen-to-body ratio)\r\n"
				+ "Resolution	1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density)\r\n"
				+ "Protection	Corning Gorilla Glass Victus ");

		System.out.println("\n\n Price : 100000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Samsung S22");
		} else {
			display();
		}
	}

	public void samsungS23() {

		System.out.println("\n\tSamsung s23 \n" + "\n Description :\n"
				+ "BODY	Dimensions	155.7 x 74.5 x 7.9 mm (6.13 x 2.93 x 0.31 in)\r\n" + "Weight	177 g (6.24 oz) "
				+ "\nIP68 dust/water resistant (up to 1.5m for 30 min)\r\n"
				+ "DISPLAY	Type	Dynamic AMOLED 2X, 120Hz, HDR10+\r\n"
				+ "Size	6.4 inches, 100.5 cm2 (~86.7% screen-to-body ratio)\r\n"
				+ "Resolution	1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density)\r\n"
				+ "Protection	Corning Gorilla Glass Victus ");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Samsung S23");
		} else {
			display();
		}
	}

	public void iPhone14Pro() {

		System.out.println("\n\tI Phone 14 pro\n " + "\n Description :\n"
				+ "BODY	Dimensions	155.7 x 74.5 x 7.9 mm (6.13 x 2.93 x 0.31 in)\r\n" + "Weight	177 g (6.24 oz) "
				+ "\nIP68 dust/water resistant (up to 1.5m for 30 min)\r\n"
				+ "DISPLAY	Type	Dynamic AMOLED 2X, 120Hz, HDR10+\r\n"
				+ "Size	6.4 inches, 100.5 cm2 (~86.7% screen-to-body ratio)\r\n"
				+ "Resolution	1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density)\r\n"
				+ "Protection	Corning Gorilla Glass Victus ");

		System.out.println("\n\n Price : 135000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("I phone 14 Pro");
		} else {
			display();
		}
	}

	public void iPhone13() {

		System.out.println("\n\tI Phone 13\n " + "\n Description :\n"
				+ "BODY	Dimensions	155.7 x 74.5 x 7.9 mm (6.13 x 2.93 x 0.31 in)\r\n" + "Weight	177 g (6.24 oz) "
				+ "\nIP68 dust/water resistant (up to 1.5m for 30 min)\r\n"
				+ "DISPLAY	Type	Dynamic AMOLED 2X, 120Hz, HDR10+\r\n"
				+ "Size	6.4 inches, 100.5 cm2 (~86.7% screen-to-body ratio)\r\n"
				+ "Resolution	1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density)\r\n"
				+ "Protection	Corning Gorilla Glass Victus ");

		System.out.println("\n\n Price : 75000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("I phone 14 Pro");
		} else {
			display();
		}
	}

}

class SmartWatch extends Electronics {
	Scanner sc = new Scanner(System.in);

	public void noiseEvolve3() {

		System.out.println(
				"\n\t:Noise Evolve 3:\n \n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 5000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("noise Evolve 3");
		} else {
			display();
		}
	}

	public void NoiseEvolve2() {

		System.out.println(
				"\n\t:Noise Evolve 3: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 3000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("noise Evolve 2");
		} else {
			display();
		}
	}

	public void appleSeries3() {

		System.out.println(
				"\n\t:Apple Series 3: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Apple Series 3");
		} else {
			display();
		}
	}

	public void appleWatchSeries8() {

		System.out.println(
				"\n\t:Apple Watch Series 8: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 55000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Apple Watch Series 8");
		} else {
			display();
		}
	}

	public void appleWatchUltra() {

		System.out.println(
				"\n\t:Apple Watch Ultra :\n \n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 85000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Apple Watch Ultra");
		} else {
			display();
		}
	}

}

class Laptop extends Electronics {
	public void hpPavillion14() {

		System.out.println(
				"\n\t:Hp Pavillion 14: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 65000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Hp Pavillion 14");
		} else {
			display();
		}
	}

	public void hpPavillionAreo() {

		System.out.println(
				"\n\t:Hp Pavillion Areo: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 95000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Hp Pavillion Areo");
		} else {
			display();
		}
	}

	public void dellLatitude() {

		System.out.println(
				"\n\t:Dell Latitude: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 85000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Hp Pavillion 14");
		} else {
			display();
		}
	}

	public void mackBookAir() {

		System.out.println(
				"\n\t:Hp Pavillion 14: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 135000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Mac Book Air");
		} else {
			display();
		}
	}

	public void macBookPro() {

		System.out.println(
				"\n\t:Mac Book Pro: \n\n 1.43 AMOLED Always On Display (466*466px | 326 PPI | 500 nits brightness)\r\n"
						+ "Tru SyncTM\r\n" + "Lightweight design with circular stainless steel ring\r\n"
						+ "Noise Health SuiteTM (SpO2, stress monitor, 24*7 heart rate tracking, sleep monitor & breath)\r\n"
						+ "With Call Function\r\n" + "Touchscreen\r\n" + "Fitness & Outdoor\r\n"
						+ "Battery Runtime: Upto 7 days");

		System.out.println("\n\n Price : 185000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Mac Book Pro");
		} else {
			display();
		}
	}
}

class Fridge extends Electronics {
	public void samsung265L3Star() {

		System.out.println(
				"\n\t:Samsung 265 L 3 Star: \n\n The star rating changes are as per BEE guidelines on or before 1st Jan 2023\r\n"
						+ "Frost Free, Double Door: auto defrost to stop ice-build up\r\n"
						+ "Capacity 265 liters: suitable for families with 4 to 5 members and bachelors\r\n"
						+ "Energy rating 3 Star : high Energy Efficiency");

		System.out.println("\n\n Price : 15000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Samsung 265 L 3 Star");
		} else {
			display();
		}
	}

	public void samsung322L5Star() {

		System.out.println(
				"\n\t:Samsung 322 L 5 Star: \n\n The star rating changes are as per BEE guidelines on or before 1st Jan 2023\r\n"
						+ "Frost Free, Double Door: auto defrost to stop ice-build up\r\n"
						+ "Capacity 265 liters: suitable for families with 4 to 5 members and bachelors\r\n"
						+ "Energy rating 3 Star : high Energy Efficiency");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Samsung 322 L 5 Star");
		} else {
			display();
		}
	}

	public void lg265L3Star() {

		System.out.println(
				"\n\t:LG 265 L 3 Star: \n\n The star rating changes are as per BEE guidelines on or before 1st Jan 2023\r\n"
						+ "Frost Free, Double Door: auto defrost to stop ice-build up\r\n"
						+ "Capacity 265 liters: suitable for families with 4 to 5 members and bachelors\r\n"
						+ "Energy rating 3 Star : high Energy Efficiency");

		System.out.println("\n\n Price : 25000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("LG 265 L 3 Star");
		} else {
			display();
		}
	}

	public void lg343L3Star() {

		System.out.println(
				"\n\t:Lg 343 L 3 Star: \n\n The star rating changes are as per BEE guidelines on or before 1st Jan 2023\r\n"
						+ "Frost Free, Double Door: auto defrost to stop ice-build up\r\n"
						+ "Capacity 265 liters: suitable for families with 4 to 5 members and bachelors\r\n"
						+ "Energy rating 3 Star : high Energy Efficiency");

		System.out.println("\n\n Price : 45000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Lg 343 L 3 Star");
		} else {
			display();
		}
	}

	public void whirpool265L3Star() {

		System.out.println(
				"\n\t:Whirpool 265 L 3 Star:\n \n The star rating changes are as per BEE guidelines on or before 1st Jan 2023\r\n"
						+ "Frost Free, Double Door: auto defrost to stop ice-build up\r\n"
						+ "Capacity 265 liters: suitable for families with 4 to 5 members and bachelors\r\n"
						+ "Energy rating 3 Star : high Energy Efficiency");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Whirpool 265 L 3 Star");
		} else {
			display();
		}
	}
}

class WashingMachine extends Electronics {
	public void samsung7kg() {

		System.out.println(
				"\n\t:Samsung 7 kg Fully-Automatic: \n\n Fully-automatic top load washing machine: Affordable with great wash quality, Easy to use\r\n"
						+ "Capacity 7 Kg: Suitable For Families With 3 To 4 Members\r\n"
						+ "Manufacturer Warranty: 2 years comprehensive warranty on the product.\r\n"
						+ "Wash Programs: Normal, Quick Wash, Soak+Normal | Delicates | Eco Tub Clean | Energy Saving | 6y");

		System.out.println("\n\n Price : 15000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Samsung 7 kg Fully-Automatic");
		} else {
			display();
		}
	}

	public void samsung9kg() {

		System.out.println(
				"\n\t:Samsung 9 kg Fully-Automatic: \n\n Fully-automatic top load washing machine: Affordable with great wash quality, Easy to use\r\n"
						+ "Capacity 7 Kg: Suitable For Families With 3 To 4 Members\r\n"
						+ "Manufacturer Warranty: 2 years comprehensive warranty on the product.\r\n"
						+ "Wash Programs: Normal, Quick Wash, Soak+Normal | Delicates | Eco Tub Clean | Energy Saving | 6y");

		System.out.println("\n\n Price : 25000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Samsung 9 kg Fully-Automatic");
		} else {
			display();
		}
	}

	public void lg8kg() {

		System.out.println(
				"\n\t:Lg 8 kg Fully-Automatic:\n \n Fully-automatic top load washing machine: Affordable with great wash quality, Easy to use\r\n"
						+ "Capacity 7 Kg: Suitable For Families With 3 To 4 Members\r\n"
						+ "Manufacturer Warranty: 2 years comprehensive warranty on the product.\r\n"
						+ "Wash Programs: Normal, Quick Wash, Soak+Normal | Delicates | Eco Tub Clean | Energy Saving | 6y");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Lg 8 kg Fully-Automatic");
		} else {
			display();
		}
	}

	public void lg9L3Star() {

		System.out.println(
				"\n\t:Lg 9 kg Fully-Automatic: \n\n Fully-automatic top load washing machine: Affordable with great wash quality, Easy to use\r\n"
						+ "Capacity 7 Kg: Suitable For Families With 3 To 4 Members\r\n"
						+ "Manufacturer Warranty: 2 years comprehensive warranty on the product.\r\n"
						+ "Wash Programs: Normal, Quick Wash, Soak+Normal | Delicates | Eco Tub Clean | Energy Saving | 6y");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Lg 9 kg Fully-Automatic");
		} else {
			display();
		}
	}

	public void whirpool10kg3Star() {

		System.out.println(
				":Whirpool Fully-Automatic: \n The star rating changes are as per BEE guidelines on or before 1st Jan 2023\r\n"
						+ "Frost Free, Double Door: auto defrost to stop ice-build up\r\n"
						+ "Capacity 265 liters: suitable for families with 4 to 5 members and bachelors\r\n"
						+ "Energy rating 3 Star : high Energy Efficiency");

		System.out.println("\n\n Price : 35000/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buy("Whirpool Fully-Automatic");
		} else {
			display();
		}
	}
}

class Electronics extends Products {
	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("\n*****************************************\n");
		System.out.println("\nWhich Product You Want ?? \n" + "\n1. Mobiles" + "\n2. Smart Watch" + "\n3. Laptop"
				+ "\n4. Fridge" + "\n5. Washing Machine" + "\n6. GO BACK TO MAIN MENU");
		System.out.println("\nEnter Your Choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\n*****************************************\n");
			Mobiles m = new Mobiles();

			System.out.println("Avialable Phones :" + "\n1. Samsung S21fe" + "\n2. Samsung S22" + "\n3. Samsung S23"
					+ "\n4. I Phone 14 pro" + "\n5. I Phone 13" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				m.samsungS21Fe();
				break;
			case 2:
				m.samsungS22();
				break;
			case 3:
				m.samsungS23();
				break;
			case 4:
				m.iPhone14Pro();
				break;
			case 5:
				m.iPhone13();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 2:
			SmartWatch sw = new SmartWatch();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Smart Watch :" + "\n1. Noise evolve 3" + "\n2. Noise evolve 2"
					+ "\n3. Apple Watch Series 3" + "\n4. Apple Watch Series 8" + "\n5. Apple Watch Ultra"
					+ "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice3 = sc.nextInt();
			switch (choice3) {
			case 1:
				sw.noiseEvolve3();
				break;
			case 2:
				sw.NoiseEvolve2();
				break;
			case 3:
				sw.appleSeries3();
				break;
			case 4:
				sw.appleWatchSeries8();
				break;
			case 5:
				sw.appleWatchUltra();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 3:
			Laptop l = new Laptop();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Laptops :" + "\n1. Hp Pavillion 14" + "\n2. Hp Pavillion Areo"
					+ "\n3. Dell latitude" + "\n4. MackBook Air" + "\n5. MackBook Air" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice4 = sc.nextInt();
			switch (choice4) {
			case 1:
				l.hpPavillion14();
				break;
			case 2:
				l.hpPavillionAreo();
				break;
			case 3:
				l.dellLatitude();
				break;
			case 4:
				l.mackBookAir();
				break;
			case 5:
				l.macBookPro();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 4:
			Fridge f = new Fridge();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Fridge :\n" + "\n1. Samsung 265L 3star " + "\n2. Samsung 322L 5star"
					+ "\n3. Lg 265L 3star" + "\n4. Lg 343L 3star" + "\n5. Whirpool 265L 3star"
					+ "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice5 = sc.nextInt();
			switch (choice5) {
			case 1:
				f.samsung265L3Star();
				break;
			case 2:
				f.samsung322L5Star();
				break;
			case 3:
				f.lg265L3Star();
				break;
			case 4:
				f.lg343L3Star();
				break;
			case 5:
				f.whirpool265L3Star();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 5:
			WashingMachine w = new WashingMachine();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Washing Machine :" + "\n1. Samsung 7kg Fully-Automatic"
					+ "\n2. Samsung 9kg Fully-Automatic" + "\n3. Lg 8kg Fully-Automatic" + "\n4. Lg 9kg Fully-Automatic"
					+ "\n5. Whirpool Fully-Automatic" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice6 = sc.nextInt();
			switch (choice6) {
			case 1:
				w.samsung7kg();
				break;
			case 2:
				w.samsung9kg();
				break;
			case 3:
				w.lg8kg();
				break;
			case 4:
				w.lg9L3Star();
				break;
			case 5:
				w.whirpool10kg3Star();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 6:
			menu();
			break;
		}
	}

}

class Fruits extends Groceries {
	Scanner sc = new Scanner(System.in);

	public void Apple() {
		System.out.println("Apple :\n" + "Fresh " + "\n Price - 100/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Apple");
		} else {
			display();
		}
	}

	public void orange() {
		System.out.println("Orange :\n" + "Fresh " + "\n Price - 90/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Orange");
		} else {
			display();
		}
	}

	public void grapes() {
		System.out.println("Grapes :\n" + "Fresh " + "\n Price - 100/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Grapes ");
		} else {
			display();
		}
	}

	public void waterMelon() {
		System.out.println("Apple :\n" + "Fresh " + "\n Price - 20/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Water Melon");
		} else {
			display();
		}
	}

	public void banana() {
		System.out.println("Banana :\n" + "Fresh " + "\n Price - 40/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Banana");
		} else {
			display();
		}
	}

}

class Vegitables extends Groceries {
	Scanner sc = new Scanner(System.in);

	public void potato() {
		System.out.println("Potato :\n" + "Fresh " + "\n Price - 10/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Lg 9 kg Fully-Automatic");
		} else {
			display();
		}
	}

	public void tomato() {
		System.out.println("Tomato :\n" + "Fresh " + "\n Price - 100/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Tomato");
		} else {
			display();
		}
	}

	public void brocli() {
		System.out.println("Brocli :\n" + "Fresh " + "\n Price - 100/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Brocli");
		} else {
			display();
		}
	}

	public void caroot() {
		System.out.println("Caroot :\n" + "Fresh " + "\n Price - 60/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Caroot");
		} else {
			display();
		}
	}

	public void oninon() {
		System.out.println("Onion :\n" + "Fresh " + "\n Price - 25/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Onion");
		} else {
			display();
		}
	}
}

class Bread extends Groceries {
	public void wheatBread() {
		System.out.println("Wheat Bread :\n" + "Fresh " + "\n Price - 50/-");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Wheat Bread");
		} else {
			display();
		}
	}

	public void cornBread() {
		System.out.println("Corn Bread:\n" + "Fresh " + "\n Price - 60/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Corn Bread");
		} else {
			display();
		}
	}

	public void brownBread() {
		System.out.println("BrownBread:\n" + "Fresh " + "\n Price - 50/kg");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Brown Bread");
		} else {
			display();
		}
	}

}

class Beverages extends Groceries {
	public void frooti() {
		System.out.println("Frooti :\n" + "1 liter " + "\n Price - 100");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Brown Bread");
		} else {
			display();
		}
	}

	public void sprite() {
		System.out.println("Sprite:\n" + "1 liter " + "\n Price - 100");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Sprite");
		} else {
			display();
		}
	}

	public void thumsUp() {
		System.out.println("Thums Up:\n" + "Fresh " + "\n Price - 100");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Thums Up");
		} else {
			display();
		}
	}

	public void cocaCola() {
		System.out.println("Coca Cola:\n" + "1 liter " + "\n Price - 100");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Coca Cola");
		} else {
			display();
		}
	}

	public void mountainDew() {
		System.out.println("Mountain Dew:\n" + "750ml " + "\n Price - 50");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Mountain Dew");
		} else {
			display();
		}
	}

}

class CookingOil extends Groceries {
	public void mustardOil() {
		System.out.println("Mustard Oil:\n" + "1 liter " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Mustard Oil");
		} else {
			display();
		}
	}

	public void oliveOil() {
		System.out.println("Olive Oil:\n" + "750ml " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Olive oil");
		} else {
			display();
		}
	}

	public void sunflowerOil() {
		System.out.println("Sunflower Oil:\n" + "1 liter " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Sunflower oil");
		} else {
			display();
		}
	}

}

class Groceries extends Products {
	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("\n*****************************************\n");
		System.out.println("Which Product You Want ?? " + "\n1. Fruit" + "\n2. Vegitable" + "\n3. Cooking Oil"
				+ "\n4. Beverages" + "\n5. Bread" + "\n6. GO BACK TO MAIN MENU");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\n*****************************************\n");
			Fruits m = new Fruits();

			System.out.println("Avialable Fruits :" + "\n1. Apple" + "\n2. Orange" + "\n3. Grapes" + "\n4. Water Melon"
					+ "\n5. Banana" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				m.Apple();
				break;
			case 2:
				m.orange();
				break;
			case 3:
				m.grapes();
				break;
			case 4:
				m.waterMelon();
				break;
			case 5:
				m.banana();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 2:
			System.out.println("\n*****************************************\n");
			Vegitables sw = new Vegitables();

			System.out.println("Avialable Vegitables :" + "\n1. Potato" + "\n2. Tomato" + "\n3. Brocli" + "\n4. Caroot"
					+ "\n5. Onion" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice3 = sc.nextInt();
			switch (choice3) {
			case 1:
				sw.potato();
				break;
			case 2:
				sw.tomato();
				break;
			case 3:
				sw.brocli();
				break;
			case 4:
				sw.caroot();
				break;
			case 5:
				sw.oninon();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 3:
			System.out.println("\n*****************************************\n");
			CookingOil l = new CookingOil();

			System.out.println("Avialable Oil :" + "\n1. Mustard oil" + "\n2. Sunflower Oil" + "\n3. Olive Oil"
					+ "\n4. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice4 = sc.nextInt();
			switch (choice4) {
			case 1:
				l.mustardOil();
				break;
			case 2:
				l.sunflowerOil();
				break;
			case 3:
				l.oliveOil();
				break;
			case 4:
				menu();
				break;
			}
			break;

		case 4:
			System.out.println("\n*****************************************\n");
			Beverages f = new Beverages();

			System.out.println("Avialable Fridge :" + "\n1. Frooti" + "\n2. Sprite" + "\n3. Thumbs Up"
					+ "\n4. Mountain Dew" + "\n5. Coca Cola" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice5 = sc.nextInt();
			switch (choice5) {
			case 1:
				f.frooti();
				break;
			case 2:
				f.sprite();
				break;
			case 3:
				f.thumsUp();
				break;
			case 4:
				f.mountainDew();
				break;
			case 5:
				f.cocaCola();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 5:
			System.out.println("\n*****************************************\n");
			Bread w = new Bread();

			System.out.println("Avialable Bread :" + "\n1. Corn Bread" + "\n2. Wheat Bread" + "\n3. Brown Bread"
					+ "\n4. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice6 = sc.nextInt();
			switch (choice6) {
			case 1:
				w.cornBread();
				break;
			case 2:
				w.wheatBread();
				break;
			case 3:
				w.brownBread();
				break;
			case 4:
				menu();
				break;
			}
			break;

		case 6:
			menu();
			break;
		}
	}

}

class Chair extends Furniture {
	Scanner sc = new Scanner(System.in);

	public void chair1() {
		System.out.println("\nChair 1:\n" + "Strong " + "\n Price - 1500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Chair 1");
		} else {
			display();
		}
	}

	public void chair2() {
		System.out.println("\nChair 2:\n" + "very Strong " + "\n Price - 2500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Chair 2");
		} else {
			display();
		}
	}

	public void chair3() {
		System.out.println("Chair 3:\n" + "very very Strong " + "\n Price - 3500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Chair 3");
		} else {
			display();
		}
	}

	public void chair4() {
		System.out.println("Chair 4:\n" + "Very Very very Strong" + "\n Price - 4150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Chair 4");
		} else {
			display();
		}
	}
}

class Sofa extends Furniture {
	Scanner sc = new Scanner(System.in);

	public void sofa1() {
		System.out.println("\nSofa 1:\n" + "Strong " + "\n Price - 21500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Sofa 1");
		} else {
			display();
		}
	}

	public void sofa2() {
		System.out.println("\nSofa 2:\n" + "very Strong " + "\n Price - 22500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Sofa 2");
		} else {
			display();
		}
	}

	public void sofa3() {
		System.out.println("Sofa 3:\n" + "very very Strong " + "\n Price - 43500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Sofa 3");
		} else {
			display();
		}
	}

	public void sofa4() {
		System.out.println("Sofa 4:\n" + "Very Very very Strong" + "\n Price - 54150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Sofa 4");
		} else {
			display();
		}
	}
}

class Table extends Furniture {
	Scanner sc = new Scanner(System.in);

	public void table1() {
		System.out.println("\nTable 1:\n" + "Strong " + "\n Price - 21500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Table 1");
		} else {
			display();
		}
	}

	public void table2() {
		System.out.println("\ntable 2:\n" + "very Strong " + "\n Price - 22500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("table 2");
		} else {
			display();
		}
	}

	public void table3() {
		System.out.println("table 3:\n" + "very very Strong " + "\n Price - 43500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Table 3");
		} else {
			display();
		}
	}

	public void table4() {
		System.out.println("Table 4:\n" + "Very Very very Strong" + "\n Price - 54150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Table 4");
		} else {
			display();
		}
	}
}

class Mattres extends Furniture {
	Scanner sc = new Scanner(System.in);

	public void mattres1() {
		System.out.println("\nMattress 1:\n" + "Strong " + "\n Price - 21500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Mattress 1");
		} else {
			display();
		}
	}

	public void mattress2() {
		System.out.println("\nMattress 2:\n" + "very Strong " + "\n Price - 22500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Mattress 2");
		} else {
			display();
		}
	}

	public void mattress3() {
		System.out.println("Mattress 3:\n" + "very very Strong " + "\n Price - 43500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Mattress 3");
		} else {
			display();
		}
	}

	public void mattress4() {
		System.out.println("Mattress 4:\n" + "Very Very very Strong" + "\n Price - 54150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Mattress 4");
		} else {
			display();
		}
	}
}

class Furniture extends Products {
	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("\n*****************************************\n");
		System.out.println("\nWhich Product You Want ?? \n" + "\n1. chair" + "\n2. Sofa" + "\n3. Table" + "\n4. Mattres"
				+ "\n5. GO BACK TO MAIN MENU");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\n*****************************************\n");
			Chair m = new Chair();

			System.out.println("Avialable Chairs :" + "\n1. Chair 1" + "\n2. Chair 2" + "\n3. Chair 3" + "\n4. Chair 4"
					+ "\n5. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				m.chair1();
				break;
			case 2:
				m.chair2();
				break;
			case 3:
				m.chair3();
				break;
			case 4:
				m.chair4();
				break;
			case 5:
				menu();
				break;
			}
			break;

		case 2:
			System.out.println("\n*****************************************\n");
			Vegitables sw = new Vegitables();

			System.out.println("Avialable Chairs :" + "\n1. Chair 1" + "\n2. Chair 2" + "\n3. Chair 3" + "\n4. Chair 4"
					+ "\n5. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice3 = sc.nextInt();
			switch (choice3) {
			case 1:
				sw.potato();
				break;
			case 2:
				sw.tomato();
				break;
			case 3:
				sw.brocli();
				break;
			case 4:
				sw.caroot();
				break;
			case 5:
				sw.oninon();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 3:
			System.out.println("\n*****************************************\n");
			CookingOil l = new CookingOil();

			System.out.println("Avialable Oil :" + "\n1. Mustard oil" + "\n2. Sunflower Oil" + "\n3. Olive Oil"
					+ "\n4. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice4 = sc.nextInt();
			switch (choice4) {
			case 1:
				l.mustardOil();
				break;
			case 2:
				l.sunflowerOil();
				break;
			case 3:
				l.oliveOil();
				break;
			case 4:
				menu();
				break;
			}
			break;

		case 4:
			System.out.println("\n*****************************************\n");
			Beverages f = new Beverages();

			System.out.println("Avialable Fridge :" + "\n1. Frooti" + "\n2. Sprite" + "\n3. Thumbs Up"
					+ "\n4. Mountain Dew" + "\n5. Coca Cola" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice5 = sc.nextInt();
			switch (choice5) {
			case 1:
				f.frooti();
				break;
			case 2:
				f.sprite();
				break;
			case 3:
				f.thumsUp();
				break;
			case 4:
				f.mountainDew();
				break;
			case 5:
				f.cocaCola();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 5:
			System.out.println("\n*****************************************\n");
			Bread w = new Bread();

			System.out.println("Avialable Bread :" + "\n1. Corn Bread" + "\n2. Wheat Bread" + "\n3. Brown Bread"
					+ "\n4. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice6 = sc.nextInt();
			switch (choice6) {
			case 1:
				w.cornBread();
				break;
			case 2:
				w.wheatBread();
				break;
			case 3:
				w.brownBread();
				break;
			case 4:
				menu();
				break;
			}
			break;

		case 6:
			menu();
			break;
		}
	}

}

class Loafers extends Shoe {

	public void casualLoafers() {
		System.out.println("Casual Loafers:\n" + "Casual" + "\n Price - 54150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Casual Loafers");
		} else {
			display();
		}
	}

	public void synthetic() {
		System.out.println("Synthetic loafer:\n" + "Synthetic Loafer" + "\n Price - 54150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Synthetic Loafer");
		} else {
			display();
		}
	}

	public void trendyLoafers() {
		System.out.println("Trendy Loafers:\n" + "Stylish" + "\n Price - 54150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Trendy Loafers");
		} else {
			display();
		}
	}

	public void comfyLoafers() {
		System.out.println("Comfy Loafers:\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Comfy Loafers");
		} else {
			display();
		}
	}

}

class Sneakers extends Shoe {
	public void casualSneakers() {
		System.out.println("Casual Sneakers:\n" + "Casual" + "\n Price - 4150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Casual Sneakers");
		} else {
			display();
		}
	}

	public void synthetic() {
		System.out.println("Synthetic Sneakers:\n" + "Synthetic Sneakers" + "\n Price - 5150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Synthetic Sneakers");
		} else {
			display();
		}
	}

	public void trendySneakers() {
		System.out.println("Trendy Sneakers:\n" + "Stylish" + "\n Price - 5450");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Trendy Sneakers");
		} else {
			display();
		}
	}

	public void comfySneakers() {
		System.out.println("Comfy Sneakers:\n" + "Comfortable " + "\n Price - 1950");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Comfy Sneakers");
		} else {
			display();
		}
	}
}

class Sandals extends Shoe {
	public void casualSandals() {
		System.out.println("Casual Sandals:\n" + "Casual" + "\n Price - 415");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Casual Sandals");
		} else {
			display();
		}
	}

	public void synthetic() {
		System.out.println("Synthetic Sandals:\n" + "Synthetic Sandals" + "\n Price - 540");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Synthetic Sandals");
		} else {
			display();
		}
	}

	public void trendySandals() {
		System.out.println("Trendy Sandals:\n" + "Stylish" + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Trendy Sandals");
		} else {
			display();
		}
	}

	public void comfySandals() {
		System.out.println("Comfy Sandals:\n" + "Comfortable " + "\n Price - 1570");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Comfy Sandals");
		} else {
			display();
		}
	}
}

class Slipons extends Shoe {
	public void casualSlipons() {
		System.out.println("Casual Slipons:\n" + "Casual" + "\n Price - 5150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Casual Slipons");
		} else {
			display();
		}
	}

	public void synthetic() {
		System.out.println("Synthetic Slipons:\n" + "Synthetic Slipons" + "\n Price - 54150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Synthetic Slipons");
		} else {
			display();
		}
	}

	public void trendySlipons() {
		System.out.println("Trendy Slipons:\n" + "Stylish" + "\n Price - 5150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Trendy Slipons");
		} else {
			display();
		}
	}

	public void comfySlipons() {
		System.out.println("Comfy Slipons:\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Comfy Slipons");
		} else {
			display();
		}
	}
}

class Shoe extends Products {
	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("\n*****************************************\n");
		System.out.println("Which Product You Want ?? \n" + "\n1. Loafer" + "\n2. Sandals" + "\n3. Sneakers"
				+ "\n4. Slipons" + "\n5. GO BACK TO MAIN MENU");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\n*****************************************\n");
			Loafers m = new Loafers();

			System.out.println("Avialable Loafers:\n" + "\n1. Casual" + "\n2. Synthetic" + "\n3. Trendy" + "\n4. Comfy"
					+ "\n5. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				m.casualLoafers();
				break;
			case 2:
				m.synthetic();
				break;
			case 3:
				m.trendyLoafers();
				break;
			case 4:
				m.comfyLoafers();
				break;
			case 5:
				menu();
				break;
			}
			break;

		case 2:
			Sandals sw = new Sandals();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Sandals:\n" + "\n1. Casual" + "\n2. Synthetic" + "\n3. Trendy" + "\n4. Comfy"
					+ "\n5. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice3 = sc.nextInt();
			switch (choice3) {
			case 1:
				sw.casualSandals();
				break;
			case 2:
				sw.synthetic();
				break;
			case 3:
				sw.trendySandals();
				break;
			case 4:
				sw.comfySandals();
				break;
			case 5:
				menu();
				break;
			}
			break;

		case 3:
			Sneakers l = new Sneakers();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Sneakers:\n" + "\n1. Casual" + "\n2. Synthetic" + "\n3. Trendy" + "\n4. Comfy"
					+ "\n5. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice4 = sc.nextInt();
			switch (choice4) {
			case 1:
				l.casualSneakers();
				break;
			case 2:
				l.synthetic();
				break;
			case 3:
				l.trendySneakers();
				break;
			case 4:
				l.comfySneakers();
				break;

			case 5:
				menu();
				break;
			}

			break;

		case 4:
			Slipons f = new Slipons();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Loafers:\n" + "\n1. Casual" + "\n2. Synthetic" + "\n3. Trendy" + "\n4. Comfy"
					+ "\n5. GO BACK TO MAIN MENU");
			System.out.println("Enter Your Choice  : ");
			int choice5 = sc.nextInt();
			switch (choice5) {
			case 1:
				f.casualSlipons();
				break;
			case 2:
				f.synthetic();
				break;
			case 3:
				f.trendySlipons();
				break;
			case 4:
				f.comfySlipons();
				break;
			case 5:
				menu();
				break;
			}
			break;

		}
	}
}

class FaceCream extends Beauty {
	public void mamaEarth() {
		System.out.println("MamaEarth Vitamin C Face Cream :\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("MamaEarth Vitamin C Face Cream");
		} else {
			display();
		}
	}

	public void wow() {
		System.out.println("Wow Vitamin C Face Cream:\n" + "Comfortable " + "\n Price - 130");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Wow Vitamin C Face Cream");
		} else {
			display();
		}
	}

	public void beardoDefence() {
		System.out.println("Beardo Daily Defence Face Cream:\n" + "Comfortable " + "\n Price - 190");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Beardo Daily Defence Face Cream");
		} else {
			display();
		}
	}

	public void codeHydrating() {
		System.out.println("Code Hydrating Face Cream:\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Code Hydrating Face Cream");
		} else {
			display();
		}
	}

	public void mamaEarthUnisex() {
		System.out.println("MamaEarth Unisex White Face Cream :\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("MamaEarth Unisex White Face cream");
		} else {
			display();
		}
	}

}

class LipStick extends Beauty {
	public void mamaEarthMoisture() {
		System.out.println("MamaEarth Moisture lipstick:\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("MamaEarth Moisture lipstick");
		} else {
			display();
		}
	}

	public void maybeLLine() {
		System.out.println("Maybelline Superstay Matte Lipstick:\n" + "Comfortable " + "\n Price - 180");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Maybelline Superstay Matte Lipstick");
		} else {
			display();
		}
	}

	public void myGlamm() {
		System.out.println("MyGllam Liquid Matte Lipstick:\n" + "Comfortable " + "\n Price - 890");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("MyGllam Liquid Matte Lipstick");
		} else {
			display();
		}
	}

	public void mac() {
		System.out.println("MacCusmatic Matte Lipstick:\n" + "Comfortable " + "\n Price - 1500");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("MacCusmatic Matte Lipstick");
		} else {
			display();
		}
	}

	public void justHerbs() {
		System.out.println("Just Herbs Matte Lipstick:\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Just Herbs Matte Lipstick");
		} else {
			display();
		}
	}
}

class FaceWash extends Beauty {
	public void mamaEarth() {
		System.out.println("MamaEarth Vitamin C Face Wash :\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("MamaEarth Vitamin C Face Wash");
		} else {
			display();
		}
	}

	public void wow() {
		System.out.println("Wow Vitamin C Face Wash:\n" + "Comfortable " + "\n Price - 130");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Wow Vitamin C Face Wash");
		} else {
			display();
		}
	}

	public void beardoDefence() {
		System.out.println("Beardo Daily Defence Face Wash:\n" + "Comfortable " + "\n Price - 190");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Beardo Daily Defence Face Wash");
		} else {
			display();
		}
	}

	public void codeHydrating() {
		System.out.println("Code Hydrating Face Wash:\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Code Hydrating Face Wash");
		} else {
			display();
		}
	}

	public void mamaEarthUnisex() {
		System.out.println("MamaEarth Unisex White Face Wash :\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("MamaEarth Unisex White Face Wash");
		} else {
			display();
		}
	}
}

class Perfume extends Beauty {
	public void bellaVita() {
		System.out.println("Bella Vita Organic Perfume:\n" + "Comfortable " + "\n Price - 1950");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Bella Vita Organic Perfume");
		} else {
			display();
		}
	}

	public void wildStone() {
		System.out.println("Wild Stone Perfume:\n" + "Comfortable " + "\n Price - 12330");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Wild Stone Perfume");
		} else {
			display();
		}
	}

	public void dior() {
		System.out.println("Dior Sauvage Perfume:\n" + "Comfortable " + "\n Price - 108790");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Dior Sauvage Perfume");
		} else {
			display();
		}
	}

	public void versace() {
		System.out.println("Versace Bright Crystal Perfume:\n" + "Comfortable " + "\n Price - 17850");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Versace Bright Crystal Perfume");
		} else {
			display();
		}
	}

	public void carollina() {
		System.out.println("Carollina Herrera perfume:\n" + "Comfortable " + "\n Price - 150");

		System.out.println("\n Want to Purchase (Y/N)");
		String opt = sc.nextLine();

		if (opt.toLowerCase().equals("y")) {
			buyGF("Carollina Herrera perfume");
		} else {
			display();
		}
	}
}

class Beauty extends Products {

	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("\n*****************************************\n");
		System.out.println("\nWhich Product You Want ??\n " + "\n1. Lipstick" + "\n2. Face Cream" + "\n3. Face Wash"
				+ "\n4. Perfume" + "\n5. GO BACK TO MAIN MENU");
		System.out.println("\nEnter Your Choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			LipStick m = new LipStick();
			System.out.println("\n*****************************************\n");
			System.out.println(
					"Avialable LipSticks :\n" + "\n1. Just Herbs Matte Lipstick" + "\n2. MacCusmatic Matte Lipstick"
							+ "\n3. MyGllam Liquid Matte Lipstick" + "\n4. MamaEarth Moisture lipstick"
							+ "\n5. Maybelline Superstay Matte Lipstick" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("\nEnter Your Choice  : ");
			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				m.justHerbs();
				break;
			case 2:
				m.mac();
				break;
			case 3:
				m.myGlamm();
				break;
			case 4:
				m.mamaEarthMoisture();
				break;
			case 5:
				m.maybeLLine();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 2:
			FaceCream sw = new FaceCream();
			System.out.println("\n*****************************************\n");
			System.out.println("\nAvialable Face Cream :\n" + "\n1. MamaEarth Face Cream"
					+ "\n2. Code Hydrating Face Cream" + "\n3. Beardo Defance Face Cream"
					+ "\n4. MamaEarth Unisex White Face Cream" + "\n5. Wow face Cream" + "\n6. GO BACK TO MAIN MENU");
			System.out.println("\nEnter Your Choice  : ");
			int choice3 = sc.nextInt();
			switch (choice3) {
			case 1:
				sw.mamaEarth();
				break;
			case 2:
				sw.codeHydrating();
				break;
			case 3:
				sw.beardoDefence();
				break;
			case 4:
				sw.mamaEarthUnisex();
				break;
			case 5:
				sw.wow();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 3:
			FaceWash f = new FaceWash();
			System.out.println("\n*****************************************\n");
			System.out.println("Avialable Face Wash :\n" + "\n1. MamaEarth Face Wash" + "\n2. Code Hydrating Face Wash"
					+ "\n3. Beardo Defance Face Wash" + "\n4. MamaEarth Unisex White Face Wash" + "\n5. Wow face Wash"
					+ "\n6. GO BACK TO MAIN MENU");
			System.out.println("\nEnter Your Choice  : ");
			int choice4 = sc.nextInt();
			switch (choice4) {
			case 1:
				f.mamaEarth();
				break;
			case 2:
				f.codeHydrating();
				break;
			case 3:
				f.beardoDefence();
				break;
			case 4:
				f.mamaEarthUnisex();
				break;
			case 5:
				f.wow();
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 4:
			Perfume p = new Perfume();
			System.out.println("*****************************************\n");
			System.out.println("Avialable perfume :\n" + "\n1. Carollina Herrera perfume"
					+ "\n2. Versace Bright Crystal Perfume" + "\n3. Dior Sauvage Perfume" + "\n4. Wild Stone Perfume"
					+ "\n5. Bella Vita Organic Perfume" + "\n6. GO BACK TO MAIN MENU");

			System.out.println("\nEnter Your Choice  : ");
			int choice5 = sc.nextInt();
			switch (choice5) {
			case 1:
				p.carollina();
				break;
			case 2:
				p.versace();
				break;
			case 3:
				p.dior();
				break;
			case 4:
				p.wildStone();
				break;
			case 5:
				p.bellaVita();
				;
				break;
			case 6:
				menu();
				break;
			}
			break;

		case 5:
			menu();
			break;
		}
	}
}

public class Ecommerce {

	public static void main(String[] args) {
		System.out.println("*****************************************\n");
		System.out.println("\tWelcome to our Ecommerce\n");
		System.out.println("*****************************************\n");
		Products p = new Products();
		p.menu();
	}
}

