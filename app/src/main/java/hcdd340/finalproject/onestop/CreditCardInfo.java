package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreditCardInfo extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ONESTOP_CREDITCARD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onestop_credit_card_info);

        TextView pass = findViewById(R.id.PassType);
        pass.setOnClickListener(this);

        TextView total = findViewById(R.id.TOTAL);
        total.setOnClickListener(this);

        Button back = findViewById(R.id.BACKbutton);
        back.setOnClickListener(this);

        Intent intent = getIntent();
        String passType = intent.getStringExtra("passType");
        String charge = intent.getStringExtra("charge");
        pass.setText(passType);
        total.setText(charge);
        Log.d("test", String.format("pass: %s, %s", pass.getText(), total.getText()));
    }

    @Override
    public void onClick(View view) {
        int eventSourceId = view.getId();
        Log.d(TAG, String.format("event source id: %s", eventSourceId));

        if (eventSourceId == R.id.BACKbutton) {
            handleBackClick();
        }
    }

    private void handleBackClick() {
        finish();
    }
}
