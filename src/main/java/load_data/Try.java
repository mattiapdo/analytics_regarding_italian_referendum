package load_data;

import twitter4j.TwitterException;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xmlLine = "<o><t>1480170614348</t><l>it</l><p><![CDATA[{\"in_reply_to_status_id_str\":null,\"in_reply_to_status_id\":null,\"created_at\":\"Sat Nov 26 14:29:46 +0000 2016\",\"in_reply_to_user_id_str\":null,\"source\":\"<a href=\\\"http://twitter.com/download/android\\\" rel=\\\"nofollow\\\">Twitter for Android<\\/a>\",\"retweeted_status\":{\"in_reply_to_status_id_str\":null,\"in_reply_to_status_id\":null,\"coordinates\":null,\"created_at\":\"Sat Nov 26 14:18:14 +0000 2016\",\"truncated\":false,\"in_reply_to_user_id_str\":null,\"source\":\"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone<\\/a>\",\"retweet_count\":3,\"retweeted\":false,\"geo\":null,\"filter_level\":\"low\",\"in_reply_to_screen_name\":null,\"is_quote_status\":false,\"entities\":{\"urls\":[],\"hashtags\":[{\"indices\":[0,7],\"text\":\"SaiChe\"},{\"indices\":[60,77],\"text\":\"MarcoMengoniLive\"}],\"user_mentions\":[{\"indices\":[22,35],\"screen_name\":\"mengonimarco\",\"id_str\":\"96948912\",\"name\":\"Marco Mengoni\",\"id\":96948912}],\"symbols\":[]},\"id_str\":\"802516818250252289\",\"in_reply_to_user_id\":null,\"favorite_count\":2,\"id\":802516818250252289,\"text\":\"#SaiChe Io Ti Aspetto @mengonimarco alla Discoteca Laziale? #MarcoMengoniLive\",\"place\":{\"country_code\":\"IT\",\"country\":\"Italia\",\"full_name\":\"Roma, Lazio\",\"bounding_box\":{\"coordinates\":[[[12.234427,41.655874],[12.234427,42.140959],[12.855864,42.140959],[12.855864,41.655874]]],\"type\":\"Polygon\"},\"place_type\":\"city\",\"name\":\"Roma\",\"attributes\":{},\"id\":\"7d588036fe12e124\",\"url\":\"https://api.twitter.com/1.1/geo/id/7d588036fe12e124.json\"},\"contributors\":null,\"lang\":\"it\",\"user\":{\"utc_offset\":3600,\"friends_count\":65,\"profile_image_url_https\":\"https://pbs.twimg.com/profile_images/786703564756443136/1Sjph-ai_normal.jpg\",\"listed_count\":0,\"profile_background_image_url\":\"http://abs.twimg.com/images/themes/theme15/bg.png\",\"default_profile_image\":false,\"favourites_count\":14,\"description\":\"Living in Rome || Marketing Student || Singer || Fitness&Crossfit || Fashion addicted\",\"created_at\":\"Tue Jul 20 20:37:18 +0000 2010\",\"is_translator\":false,\"profile_background_image_url_https\":\"https://abs.twimg.com/images/themes/theme15/bg.png\",\"protected\":false,\"screen_name\":\"andrew_ske_\",\"id_str\":\"168796079\",\"profile_link_color\":\"4A913C\",\"id\":168796079,\"geo_enabled\":true,\"profile_background_color\":\"000000\",\"lang\":\"it\",\"profile_sidebar_border_color\":\"000000\",\"profile_text_color\":\"000000\",\"verified\":false,\"profile_image_url\":\"http://pbs.twimg.com/profile_images/786703564756443136/1Sjph-ai_normal.jpg\",\"time_zone\":\"Rome\",\"url\":null,\"contributors_enabled\":false,\"profile_background_tile\":false,\"profile_banner_url\":\"https://pbs.twimg.com/profile_banners/168796079/1476399722\",\"statuses_count\":20,\"follow_request_sent\":null,\"followers_count\":23,\"profile_use_background_image\":false,\"default_profile\":false,\"following\":null,\"name\":\"Andrea Schettino\",\"location\":\"Roma, Lazio\",\"profile_sidebar_fill_color\":\"000000\",\"notifications\":null},\"favorited\":false},\"retweet_count\":0,\"retweeted\":false,\"geo\":null,\"filter_level\":\"low\",\"in_reply_to_screen_name\":null,\"is_quote_status\":false,\"id_str\":\"802519720310243334\",\"in_reply_to_user_id\":null,\"favorite_count\":0,\"id\":802519720310243334,\"text\":\"RT @andrew_ske_: #SaiChe Io Ti Aspetto @mengonimarco alla Discoteca Laziale? #MarcoMengoniLive\",\"place\":null,\"lang\":\"it\",\"favorited\":false,\"coordinates\":null,\"truncated\":false,\"timestamp_ms\":\"1480170586074\",\"entities\":{\"urls\":[],\"hashtags\":[{\"indices\":[17,24],\"text\":\"SaiChe\"},{\"indices\":[77,94],\"text\":\"MarcoMengoniLive\"}],\"user_mentions\":[{\"indices\":[3,15],\"screen_name\":\"andrew_ske_\",\"id_str\":\"168796079\",\"name\":\"Andrea Schettino\",\"id\":168796079},{\"indices\":[39,52],\"screen_name\":\"mengonimarco\",\"id_str\":\"96948912\",\"name\":\"Marco Mengoni\",\"id\":96948912}],\"symbols\":[]},\"contributors\":null,\"user\":{\"utc_offset\":null,\"friends_count\":185,\"profile_image_url_https\":\"https://pbs.twimg.com/profile_images/378800000440191186/4bf1a3c69bb97dd6b5169f29b6b31cda_normal.jpeg\",\"listed_count\":70,\"profile_background_image_url\":\"http://abs.twimg.com/images/themes/theme3/bg.gif\",\"default_profile_image\":false,\"favourites_count\":17563,\"description\":\"Sempre #prontacorrere\",\"created_at\":\"Sat May 18 18:49:32 +0000 2013\",\"is_translator\":false,\"profile_background_image_url_https\":\"https://abs.twimg.com/images/themes/theme3/bg.gif\",\"protected\":false,\"screen_name\":\"uraniasole\",\"id_str\":\"1439123106\",\"profile_link_color\":\"088253\",\"id\":1439123106,\"geo_enabled\":false,\"profile_background_color\":\"EDECE9\",\"lang\":\"it\",\"profile_sidebar_border_color\":\"FFFFFF\",\"profile_text_color\":\"634047\",\"verified\":false,\"profile_image_url\":\"http://pbs.twimg.com/profile_images/378800000440191186/4bf1a3c69bb97dd6b5169f29b6b31cda_normal.jpeg\",\"time_zone\":null,\"url\":null,\"contributors_enabled\":false,\"profile_background_tile\":false,\"profile_banner_url\":\"https://pbs.twimg.com/profile_banners/1439123106/1401571481\",\"statuses_count\":107809,\"follow_request_sent\":null,\"followers_count\":595,\"profile_use_background_image\":true,\"default_profile\":false,\"following\":null,\"name\":\"Urania 3\",\"location\":null,\"profile_sidebar_fill_color\":\"E3E2DE\",\"notifications\":null}}]]></p></o>";
		
		StatusWrapper sw = new StatusWrapper();
			
		try {
			sw.load(xmlLine);
			System.out.println("fatto");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("non fatto");
		}
		
		String json = sw.getRawJson();
		System.out.println(json);
		
		System.out.println("...");
		
		
	}

}
