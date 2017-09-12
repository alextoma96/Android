package networking;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by intern on 9/11/2017.
 */

public class HttpConnection {
    URL url;
    HttpURLConnection urlConnection;

    private HttpResponse parseJsonResponse(String jsonString) throws JSONException {
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray array = new JSONArray(jsonObject);
        JSONArray Client = jsonObject.getJSONArray("client");

    }

}
