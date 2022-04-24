package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ONESTOP_MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onestop_home);

        TextView wallet = findViewById(R.id.PassWallet);
        wallet.setOnClickListener(this);

        Button routes = findViewById(R.id.SeeRoutesButton);
        routes.setOnClickListener(this);

        ShapeableImageView pic = findViewById(R.id.BlueLoop);
        pic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int eventSourceId = view.getId();
        Log.d(TAG, String.format("event source id: %s", eventSourceId));

        if (eventSourceId == R.id.PassWallet) {
            handlePassWalletClick();
        } else if (eventSourceId == R.id.SeeRoutesButton) {
            handleRoutesClick();
        }else if (eventSourceId == R.id.BlueLoop) {
            handlePicClick();
        }
        else {
            Log.d(TAG, String.format("Unknown click event source: %s", eventSourceId));
        }
    }

    private void handlePicClick() {
        Intent intent = new Intent(this, BusStats.class);
        startActivity(intent);
    }

    private void handleRoutesClick() {
        Intent intent = new Intent(this, BusRoutes.class);
        startActivity(intent);
    }

    private void handlePassWalletClick() {
        Intent intent = new Intent(this, BuyPass.class);
        startActivity(intent);
    }
}