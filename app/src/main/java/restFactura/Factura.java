package restFactura;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.example.intern.restfactura.R;

import networking.HttpConnection;
import networking.HttpResponse;

/**
 * Created by intern on 9/11/2017.
 */

public class Factura extends AbstractActivity {
    private static final String URL = "http://localhost:8080/kepres2Web/api/rs/factura/list";
    private HttpResponse httpResponse;
    private Button btnFactura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setActivityTheme();
        getDataOverUrl();
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        MenuItem item = menu.findItem(R.id.item_premium);
        item.setVisible(false);

        return true;
    }

    private void startSelectedFragment(Fragment fragment) {

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_premium_info, fragment);
        transaction.commit();

    }

    private void getDataOverUrl() {

        HttpConnection connection = new HttpConnection() {

            @Override
            protected void onPostExecute(HttpResponse s) {
                if (s != null) {
                    Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
                    httpResponse = s;
                    createUI();
                } else {
                    Toast.makeText(getApplicationContext(), "No result", Toast.LENGTH_SHORT).show();
                }
            }
        };

        connection.execute(URL);
    }
}
