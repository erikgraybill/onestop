package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BuyPass extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ONESTOP_BUYPASS";
    private String pass;
    private String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onestop_buy_pass);

        Button single = findViewById(R.id.SingleButton);
        single.setOnClickListener(this);

        Button day = findViewById(R.id.DayPassButton);
        day.setOnClickListener(this);

        Button week = findViewById(R.id.WeekPassButton);
        week.setOnClickListener(this);

        Button month = findViewById(R.id.MonthPassButton);
        month.setOnClickListener(this);

        Button back = findViewById(R.id.backed);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int eventSourceId = view.getId();
        Log.d(TAG, String.format("event source id: %s", eventSourceId));

        if (eventSourceId == R.id.SingleButton) {
            handleSingleClick();
        } else if (eventSourceId == R.id.DayPassButton) {
            handleDayClick();
        }else if (eventSourceId == R.id.WeekPassButton) {
            handleWeekClick();
        } else if (eventSourceId == R.id.MonthPassButton) {
            handleMonthClick();
        } else if (eventSourceId == R.id.backed) {
            handleBackClick();
        }
        else {
            Log.d(TAG, String.format("Unknown click event source: %s", eventSourceId));
        }
    }

    private void handleBackClick() {
        finish();
    }

    private void handleMonthClick() {
        Intent intent = new Intent(this, CreditCardInfo.class);
        pass = getString(R.string.month_pass);
        price = getString(R.string.month_price);
        intent.putExtra("passType",pass);
        intent.putExtra("charge",price);
        startActivity(intent);
    }

    private void handleWeekClick() {
        Intent intent = new Intent(this, CreditCardInfo.class);
        pass = getString(R.string.week_pass);
        price = getString(R.string.week_price);
        intent.putExtra("passType",pass);
        intent.putExtra("charge",price);
        startActivity(intent);
    }

    private void handleDayClick() {
        Intent intent = new Intent(this, CreditCardInfo.class);
        pass = getString(R.string.day_pass);
        price = getString(R.string.day_price);
        intent.putExtra("passType",pass);
        intent.putExtra("charge",price);
        startActivity(intent);
    }

    private void handleSingleClick() {
        Intent intent = new Intent(this, CreditCardInfo.class);
        pass = getString(R.string.single_ride);
        price = getString(R.string.single_price);
        intent.putExtra("passType",pass);
        intent.putExtra("charge",price);
        startActivity(intent);
    }
}
