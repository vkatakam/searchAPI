import java.text.ParseException;
import org.json.JSONException;
import org.testng.annotations.Test;

public class SearchAPITest {

	SearchAPI rm = new SearchAPI();

	@Test
	public void testiTunesSearchByMusic() throws JSONException, ParseException,
			InterruptedException {
		System.out
				.println("--------------------------------Start of testiTunesSearchByMusic-Test-----------------------------------------");
		SearchAPI searchAPI = new SearchAPI();
		String mediaParams = searchAPI.getiTunesSearchByMusic();
		System.out.println("Search API Results:" + mediaParams);
		System.out
				.println("--------------------------------End of testiTunesSearchByMusic-Test-----------------------------------------");
	}

	@Test
	public void testiTunesSearchByAllMedia() throws JSONException,
			ParseException, InterruptedException {
		System.out
				.println("--------------------------------Start of testiTunesSearchByAllMedia-Test-----------------------------------------");
		SearchAPI searchAPI = new SearchAPI();
		String music = searchAPI.getiTunesSearchByAllMedia();
		System.out.println("Search API Results:" + music);
		System.out
				.println("--------------------------------End of testiTunesSearchByAllMedia-Test-----------------------------------------");
	}

	@Test
	public void testSearchByMovieUS() throws JSONException, ParseException,
			InterruptedException {
		System.out
				.println("--------------------------------Start of testSearchByMovieUS-Test-----------------------------------------");
		SearchAPI searchAPI = new SearchAPI();
		String mediaParams = searchAPI.getSearchByMovieUS();
		System.out.println("Search API Results:" + mediaParams);
		System.out
				.println("--------------------------------End of testSearchByMovieUS-Test-----------------------------------------");
	}

	@Test
	public void testSearchMovieIndia() throws JSONException, ParseException,
			InterruptedException {
		System.out
				.println("--------------------------------Start of testSearchMovieIndia-Test-----------------------------------------");
		SearchAPI searchAPI = new SearchAPI();
		String mediaParams = searchAPI.getSearchMovieIndia();
		System.out.println("Search API Results:" + mediaParams);
		System.out
				.println("--------------------------------End of testSearchMovieIndia-Test-----------------------------------------");
	}

	@Test
	public void testSearchMediaByTVShow() throws JSONException, ParseException,
			InterruptedException {
		System.out
				.println("--------------------------------Start of testSearchMediaByTVShow-Test-----------------------------------------");
		SearchAPI searchAPI = new SearchAPI();
		String mediaParams = searchAPI.getSearchMediaByTVShow();
		System.out.println("Search API Results:" + mediaParams);
		System.out
				.println("--------------------------------End of testSearchMediaByTVShow-Test-----------------------------------------");
	}

	@Test
	public void testSearchMediaByMusicVideo() throws JSONException,
			ParseException, InterruptedException {
		System.out
				.println("--------------------------------Start of testSearchMediaByMusicVideo-Test-----------------------------------------");
		SearchAPI searchAPI = new SearchAPI();
		String mediaParams = searchAPI.getSearchMediaByMusicVideo();
		System.out.println("Search API Results:" + mediaParams);
		System.out
				.println("--------------------------------End of testSearchMediaByMusicVideo-Test-----------------------------------------");
	}

}
