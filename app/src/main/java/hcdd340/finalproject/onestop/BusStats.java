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
        TextView time = findViewById(R.id.Time);
        TextView lastStop = findViewById(R.id.LastStopData);
        TextView cap = findViewById(R.id.CapacityData);
        ImageView map = findViewById(R.id.SampleMap);

        Intent intent = getIntent();
        String routeName = intent.getStringExtra("route");
        route.setText(routeName);

        if (routeName.equalsIgnoreCase("White Loop")) {
            map.setImageResource(R.drawable.whoop_map);
        } else if (routeName.equalsIgnoreCase("Vairo Express")) {
            map.setImageResource(R.drawable.ve_map);
            time.setText("23 minutes");
            lastStop.setText("Pattee");
            cap.setText("26 People");
        } else if (routeName.equalsIgnoreCase("Red Link")) {
            map.setImageResource(R.drawable.rl_map);
            time.setText("5 minutes");
            lastStop.setText("Beaver Stadium");
            cap.setText("12 People");
        } else {
                map.setImageResource((R.drawable.bloop_map));
                time.setText("11 minutes");
                lastStop.setText("BJC");
                cap.setText("15 People");
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
