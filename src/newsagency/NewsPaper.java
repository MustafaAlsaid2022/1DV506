package newsagency;

public class NewsPaper {
	
	Agency agency=new Agency();
	
	public void register(Object name){
		
		agency.addNewsPaper(name);//Add newspaper to news agency
			
	}
	
	public void sendNews(Object news){
		
		agency.collectNews(news);//Add news to the agency
		
		
	}
	
	public  Object getNews(){
		
		return agency.broadCast();
		
		
		 
	}
	

}
