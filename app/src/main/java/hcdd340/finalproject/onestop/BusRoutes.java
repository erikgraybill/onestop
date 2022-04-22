package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BusRoutes extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ONESTOP_ROUTES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onestop_see_routes);

        Button bloop = findViewById(R.id.BLButton);
        bloop.setOnClickListener(this);

        Button whoop = findViewById(R.id.WLButton);
        whoop.setOnClickListener(this);

        //Button routes = findViewById(R.id.SeeRoutesButton);
        //routes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int eventSourceId = view.getId();
        Log.d(TAG, String.format("event source id: %s", eventSourceId));

        if (eventSourceId == R.id.BLButton) {
            handleBLClick();
        } else if (eventSourceId == R.id.WLButton) {
            handleWLClick();
        }
    }

    private void handleWLClick() {
        Intent intent = new Intent(this, BusStats.class);
        startActivity(intent);
    }

    private void handleBLClick() {
        Intent intent = new Intent(this, BusStats.class);
        startActivity(intent);
    }
}
