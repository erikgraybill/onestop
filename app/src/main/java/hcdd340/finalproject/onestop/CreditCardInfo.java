package hcdd340.finalproject.onestop;

import android.os.Bundle;
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

        Button routes = findViewById(R.id.SeeRoutesButton);
        routes.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String passType = extras.getString("passType");
            String charge = extras.getString("charge");
            pass.setText(passType);
            total.setText(charge);
        }
    }

    @Override
    public void onClick(View view) {

    }
}
