package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreditCardInfo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onestop_credit_card_info);

        TextView pass = findViewById(R.id.PassType);
        pass.setOnClickListener(this);

        TextView total = findViewById(R.id.TOTAL);
        total.setOnClickListener(this);

        //Button routes = findViewById(R.id.SeeRoutesButton);
        //routes.setOnClickListener(this);

        Intent intent = getIntent();
        String passType = intent.getStringExtra("passType");
        String charge = intent.getStringExtra("charge");
        pass.setText(passType);
        total.setText(charge);
        Log.d("test", String.format("pass: %s, %s", pass.getText(), total.getText()));
    }

    @Override
    public void onClick(View view) {

    }
}
