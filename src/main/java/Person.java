
public class Person {
	
	private String 	name;
	private String 	surname;
	private String 	email;
	private String 	employer;
	private int 	radio;
	private String 	other;
	private String 	whatDoYouDo;
	
	

	Person(String name, String surname, String email, String employer, int radio, String other, String whatDoYouDo){

		
		
		this.name 			= name;
		this.surname 		= surname;
		this.email 			= email;
		this.employer 		= employer;
		
		if(radio != 5)
			this.other 		= "Nic";
		else 
			this.other		= new TranslateRadio(radio).radioTranslated;
		
		this.whatDoYouDo	= whatDoYouDo;
		
	}

	

}
