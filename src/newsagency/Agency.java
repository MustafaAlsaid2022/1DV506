package newsagency;

import java.util.ArrayList;

public class Agency {
	/* Create a static fields for newspapers and news list */
	private static ArrayList<Object> newspapersList = new ArrayList<Object>();
	private static ArrayList<Object> newsList = new ArrayList<Object>();

	public Agency() {

	}

	public void addNewsPaper(Object name) {

		newspapersList.add(name);

	}
	
	public ArrayList<Object> getNewsPaper(){
		return newspapersList;
	}

 public void collectNews(Object news) {

		newsList.add(news);

	}

	public Object broadCast() {

		newsList.remove(Agency.newsList);

		return newsList;
	}

}
