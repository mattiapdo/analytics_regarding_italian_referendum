package twitter;

import java.io.IOException;
import java.nio.channels.Pipe.SinkChannel;

import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterException;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

import twitter4j.TwitterFactory;
import twitter4j.TwitterObjectFactory;
import twitter4j.Twitter;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Stream {
	
	private static void storeJSON(String rawJSON, String fileName) throws IOException {
	    FileOutputStream fos = null;
	    OutputStreamWriter osw = null;
	    BufferedWriter bw = null;
	    try {
	        fos = new FileOutputStream(fileName);
	        osw = new OutputStreamWriter(fos, "UTF-8");
	        bw = new BufferedWriter(osw);
	        bw.write(rawJSON);
	        bw.flush();
	    } finally {
	        if (bw != null) {
	            try {
	                bw.close();
	            } catch (IOException ignore) {
	            }
	        }
	        if (osw != null) {
	            try {
	                osw.close();
	            } catch (IOException ignore) {
	            }
	        }
	        if (fos != null) {
	            try {
	                fos.close();
	            } catch (IOException ignore) {
	            }
	        }
	    }
	}


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws TwitterException, IOException{
		
		/*
		StatusListener listener = new StatusListener(){
			
			public void onStatus(Status status) {
				if (status.getLang().equals("it"))
				System.out.println(status.getUser().getName() +  " : " + status.getText());
				}
			public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {}
			public void onTrackLimitationNotice(int numberOfLimitedStatuses) {}
			public void onException(Exception ex) { ex.printStackTrace(); }
			public void onScrubGeo(long userId, long upToStatusId) {}
			public void onStallWarning(StallWarning warning) {}
			
		};
		*/
		
		// configure access to Twitter
		ConfigurationBuilder cfg = new ConfigurationBuilder();
		
		String access_token = "617197581-1fgWrzcDvAqlyOuhCGekqoqjNZmjAwk3e7fSRuwo";
		String access_token_secret = "bGT6URAfCRf93X9zAA66YuGCUFx1FM3P2OImBJrLenOHC";
		String consumer_key = "Gwtp7uC76drg2AI19jq2ph2xn";
		String consumer_secret = "7kh1gnePQ3lTiklJaInNNKOZ2T5eMrBMILETOcKXzeRjuNUOx6";
		
		cfg.setJSONStoreEnabled(true);
		cfg.setOAuthAccessToken(access_token);
		cfg.setOAuthAccessTokenSecret(access_token_secret);
		cfg.setOAuthConsumerKey(consumer_key);
		cfg.setOAuthConsumerSecret(consumer_secret);
		cfg.setTweetModeExtended(true);
		
		
		//TwitterStream twitterStream = new TwitterStreamFactory(cfg.build()).getInstance();
		//twitterStream.addListener(listener);
		
		//twitterStream.sample();
		
		Twitter  twitter = new TwitterFactory(cfg.build()).getInstance();
		//System.out.println(twitter.getId()+ "\n"+twitter.getAccountSettings()+ "\n"+twitter.getAPIConfiguration()+ "\n"+twitter.getAuthorization()+ "\n");
		//System.out.println("\n\n*"+twitter.getTermsOfService());
		System.out.println("\n\n*"+twitter.getAPIConfiguration());
        /*
		System.out.println("Saving public timeline.");
        try {
            new File("statuses").mkdir();
            List<Status> statuses = twitter.getHomeTimeline();
            for (Status status : statuses) {
                String rawJSON = TwitterObjectFactory.getRawJSON(status);
                String fileName = "./statuses/" + status.getId() + ".json";
                storeJSON(rawJSON, fileName);
                System.out.println(fileName + " - " + status.getText());
            }
            System.out.print("\ndone.");
            System.exit(0);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Failed to store tweets: " + ioe.getMessage());
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            System.exit(-1);
        }
        */
		
		/*
		List<Status> statuses;
        String current_user = "matteorenzi";
               
        try {
			
			 // The Twitter REST API doesn't allow you to restrict the date returned by date or time 
			 // but we do allow you to provide a since_id and max_id. 
			 // If you know the ID of a Tweet that happened after the maximum timestamp you are 
			 // interested in you could pass it as max_id.
			 
			long since_id = 1079305571336110080L;
			long max_id = 1079305474443497462L;
			
			Paging p = new Paging();
			p.setCount(100);
            statuses = twitter.getUserTimeline(current_user, p);
            
            System.out.println("Showing @" + current_user + "'s user timeline.\n");
            for (Status status : statuses) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getCreatedAt() + " - " + status.getId());
            }
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline for " + current_user + ":" +  te.getMessage());
            System.exit(-1);
        }
		*/
        
        /*
        try {
        	String str_query = "from:matteorenzi since:2017-12-25 until:2017-12-28";
            Query query = new Query();
            query.query(str_query);
            //query.setSinceId(1079305571336110080L);
            //query.setMaxId(1079305571337113180L);
            
            
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText() + " - " + tweet.getCreatedAt());
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
		*/
		/*
		int statusesPerPage = 200;
        int page = 1;
        String username = "matteosalvinimi";
       
		Date from = new Date(18, 12, 15);
        Date to = new Date(18, 12, 27);
        
        
        try {
            int c = 0;

            Paging paging = new Paging(page, statusesPerPage);
            List<Status> statuses = twitter.getUserTimeline(username, paging);

            page_loop:
            while (statuses.size() > 0) {
                System.out.println("Showing @" + username + "'s home timeline, page " + page);
                for (Status status : statuses) {
                    if (status.getCreatedAt().before(from) && status.getCreatedAt().after(to)){
                        System.out.println("\nbreak\n");
                    	break page_loop;
                    }
                    //System.out.println(status.getCreatedAt() + " - " + status.getText());
                    System.out.println(paging.toString() + c++);
                    System.out.println(status.getCreatedAt());
                }
                paging = new Paging(page++, statusesPerPage);
                statuses = twitter.getUserTimeline(username, paging);
                System.out.println(statuses.size());
                
            }
        } catch (TwitterException te) {
            te.printStackTrace();
        }
		*/
	}
	
		
}