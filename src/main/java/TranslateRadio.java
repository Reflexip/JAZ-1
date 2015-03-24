
public class TranslateRadio {
	private String[] radioList = {"Ogłoszenie w pracy", "Ogłoszenie na uczelni", "Facebook", "Znajomi", "Inne"};
	public String radioTranslated;
	
	TranslateRadio(int radio){
		this.radioTranslated = radioList[radio - 1];
	}
	
}
