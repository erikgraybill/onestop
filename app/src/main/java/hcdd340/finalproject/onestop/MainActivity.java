package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ONESTOP_MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onestop_home);

        Button button = findViewById(R.id.PassWallet);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int eventSourceId = view.getId();
        Log.d(TAG, String.format("event source id: %s", eventSourceId));

        if (eventSourceId == R.id.PassWallet) {
            handlePassWalletClick();
        }/* else if (eventSourceId == R.id.button_details) {
            handleDetailsButtonClick();
        } else if (eventSourceId == R.id.psu_logo) {
            handleLogoClick();
        } else if (eventSourceId == R.id.id_label) {
            handleIDLabelClick();
        }*/
        else {
            Log.d(TAG, String.format("Unknown click event source: %s", eventSourceId));
        }
    }

    private void handlePassWalletClick() {
        //Intent intent = new Intent(this, LogInActivity.class);
        //startActivity(intent);
    }
}