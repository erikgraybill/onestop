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

        Button rink = findViewById(R.id.RLButton);
        rink.setOnClickListener(this);

        Button vairo = findViewById(R.id.VEButton);
        vairo.setOnClickListener(this);

        Button waup = findViewById(R.id.WDButton);
        waup.setOnClickListener(this);

        Button boal = findViewById(R.id.BButton);
        boal.setOnClickListener(this);

        Button toft = findViewById(R.id.HMButton);
        toft.setOnClickListener(this);

        Button back = findViewById(R.id.BACK);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int eventSourceId = view.getId();
        Log.d(TAG, String.format("event source id: %s", eventSourceId));

        if (eventSourceId == R.id.BLButton) {
            handleBLClick();
        } else if (eventSourceId == R.id.WLButton) {
            handleWLClick();
        } else if (eventSourceId == R.id.RLButton) {
            handleRLClick();
        } else if (eventSourceId == R.id.VEButton) {
            handleVEClick();
        } else if (eventSourceId == R.id.WDButton) {
            handleWDClick();
        } else if (eventSourceId == R.id.BButton) {
            handleBClick();
        } else if (eventSourceId == R.id.HMButton) {
            handleHMClick();
        } else if (eventSourceId == R.id.BACK) {
            handleBackClick();
        }
    }

    private void handleBackClick() {
        finish();
    }

    private void handleHMClick() {
        Intent intent = new Intent(this, BusStats.class);
        intent.putExtra("route",getString(R.string.toftrees));
        startActivity(intent);
    }

    private void handleBClick() {
        Intent intent = new Intent(this, BusStats.class);
        intent.putExtra("route",getString(R.string.boalsburg));
        startActivity(intent);
    }

    private void handleWDClick() {
        Intent intent = new Intent(this, BusStats.class);
        intent.putExtra("route",getString(R.string.waupelani_drive));
        startActivity(intent);
    }

    private void handleVEClick() {
        Intent intent = new Intent(this, BusStats.class);
        intent.putExtra("route",getString(R.string.vairo_express));
        startActivity(intent);
    }

    private void handleRLClick() {
        Intent intent = new Intent(this, BusStats.class);
        intent.putExtra("route",getString(R.string.red_link));
        startActivity(intent);
    }

    private void handleWLClick() {
        Intent intent = new Intent(this, BusStats.class);
        intent.putExtra("route",getString(R.string.white_loop));
        startActivity(intent);
    }

    private void handleBLClick() {
        Intent intent = new Intent(this, BusStats.class);
        intent.putExtra("route",getString(R.string.blue_loop));
        startActivity(intent);
    }
}
