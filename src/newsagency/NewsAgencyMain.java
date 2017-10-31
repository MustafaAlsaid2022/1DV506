package newsagency;

public class NewsAgencyMain {

	public static void main(String[] args) {
		/*Register and send a new newspaper with its news */
		NewsPaper news=new NewsPaper();
		news.register("new york");
		news.sendNews("new york news");
		System.out.println("the news : "+news.getNews());
		/*Register and send a new newspaper with its news */
		NewsPaper np=new NewsPaper(); 
		np.register("network");
		np.sendNews("network security news");
		System.out.println("the news : "+np.getNews());
		
		/*return newspaper list*/
		Agency agency=new Agency();
		System.out.println(); //empty line//
		System.out.println("newspaper registered in the agency:");
		for(int i=0;i<agency.getNewsPaper().size();i++){
			System.out.println(agency.getNewsPaper().get(i));
		}
	}

}
