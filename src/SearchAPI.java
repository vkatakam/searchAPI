import java.text.ParseException;
import org.json.JSONException;

public class SearchAPI {

	public String getiTunesSearchByMusic() throws JSONException,
			ParseException, InterruptedException {
		String searchAPIUrl = "https://itunes.apple.com/search?term=jack+johnson&country=US&media=music";
		String jsonString = JsonDataRead.callURL(searchAPIUrl);
		return jsonString;
	}

	public String getiTunesSearchByAllMedia() throws JSONException,
			ParseException, InterruptedException {
		String searchAPIUrl = "https://itunes.apple.com/search?term=jack+johnson&country=US&media=all&limit=200";
		String jsonString = JsonDataRead.callURL(searchAPIUrl);
		return jsonString;
	}

	public String getSearchByMovieUS() throws JSONException, ParseException,
			InterruptedException {
		String searchAPIUrl = "https://itunes.apple.com/search?term=jack+johnson&country=US&media=movie";
		String jsonString = JsonDataRead.callURL(searchAPIUrl);
		return jsonString;
	}

	public String getSearchMovieIndia() throws JSONException, ParseException,
			InterruptedException {
		String searchAPIUrl = "https://itunes.apple.com/search?term=jack+johnson&country=IN&media=movie";
		String jsonString = JsonDataRead.callURL(searchAPIUrl);
		return jsonString;
	}

	public String getSearchMediaByTVShow() throws JSONException,
			ParseException, InterruptedException {
		String searchAPIUrl = "https://itunes.apple.com/search?term=jack+johnson&country=US&media=tvShow";
		String jsonString = JsonDataRead.callURL(searchAPIUrl);
		return jsonString;
	}

	public String getSearchMediaByMusicVideo() throws JSONException,
			ParseException, InterruptedException {
		String searchAPIUrl = "https://itunes.apple.com/search?term=jack+johnson&country=US&media=musicVideo&limit=10";
		String jsonString = JsonDataRead.callURL(searchAPIUrl);
		return jsonString;
	}
}
