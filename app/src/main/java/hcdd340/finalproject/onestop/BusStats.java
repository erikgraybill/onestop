package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BusStats extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ONESTOP_BUSSTATS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onestop_bus_stats);

        TextView route = findViewById(R.id.ROUTENAME);
        ImageView map = findViewById(R.id.SampleMap);

        Intent intent = getIntent();
        String routeName = intent.getStringExtra("route");
        route.setText(routeName);

        if (routeName.equalsIgnoreCase("White Loop")) {
            map.setImageResource(R.drawable.whoop_map);
        }

        Button back = findViewById(R.id.Back4);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int eventSourceId = view.getId();
        Log.d(TAG, String.format("event source id: %s", eventSourceId));

        if (eventSourceId == R.id.Back4) {
            handleBackClick();
        }
    }

    private void handleBackClick() {
        finish();
    }
}
