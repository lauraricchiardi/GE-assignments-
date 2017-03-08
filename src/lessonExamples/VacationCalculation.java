package lessonExamples;

public class VacationCalculation {

	public int number;
	public String destination;
	public double pricemin;
	public double pricemax;
	
	public void count () {
		
		VacationTime [] mydestination =new VacationTime [3];
		mydestination[0]=new VacationTime ("Maldives",2340,3400);	
		mydestination[1]=new VacationTime ("Iceland",1960,2560);
		mydestination[2]=new VacationTime ("Botswana",2980,3960);
		int vacations = mydestination.length; 
		System.out.println("We have "+vacations +" offers available : "+mydestination[0].destination+", "+mydestination[1].destination+" ,"+mydestination[2].destination);
		}
	
}
