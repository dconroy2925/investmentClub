
public class investmentClub {
	
	public static void main(String[] args) {
		class employee {
			String name;
			int balance;
			employee(String id, int bal){
				name = id;
				balance = bal;
			}
		public String getInitials() {
			String initials = "";
			for(int i = 0;i < name.length();i++) {
			char currentChar = name.charAt(i);
			if (currentChar >= 'A' && currentChar <='Z')
			initials = initials + currentChar + '.';
			}
			return initials;
		}}
		employee a[] = new employee [16];
		a[0] = new employee("Janelly Antonio", 278);
		
		a[1] = new employee("Daniel Conroy", 329);
		
		a[2]= new employee("Wenhao Jin", 445); 
		
		a[3]= new employee("Nathaniel Jones", 402);
		
		a[4] = new employee("Sean Kirchner", 388);
		
		a[5] = new employee("Sabrina Lin", 275);
		
		a[6]= new employee("Eric Luna", 243);
		
		a[7]= new employee("Kevin Luna", 334);
				
		a[8] = new employee("Zayad Maanane", 412);
		
		a[9] = new employee("Hanne Nicolaisen", 393);
		
		a[10]= new employee("Jackson Nogles", 299);
		
		a[11]= new employee("Emily Parvar", 343);
		
		a[12]= new employee("Jaspreet Singh", 317);

		a[13]= new employee("Athena Stebe", 265);
		
		a[14]= new employee("Melanie Taylor", 354);
		
		a[15]= new employee("Appolo Tankeh", 234);
		

		for(int i = 0;i < a.length;i++)
			System.out.println("Initials: " + a[i].getInitials() + " Balance : " + a[i].balance);
	
		
		
		
	}
	

}
