public class TestAccountsArray
{
	public static void main(String[] args) 
	{
		Account acs[] = new Account[20];
		acs[0] = new Account("12345679");
		acs[1] = new Account("12345660");
		acs[2] = new Account("34567860");
		acs[3] = new Account("45679010");
		acs[4] = new Account("32145675");
		acs[5] = new Account("61325678");
		acs[6] = new Account("54567874");	
		
		for(int i = 0; i<20; i++{
			System.out.println(acs[i]);
		}
	}
}