package hcdd340.finalproject.onestop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BuyPass extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ONESTOP_BUYPASS";

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
        }
        else if (eventSourceId == R.id.MonthPassButton) {
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
        String month = getString(R.string.month_pass);
        intent.putExtra("passType", month);
        intent.putExtra("charge","$13.20");
        startActivity(intent);
    }

    private void handleWeekClick() {
        Intent intent = new Intent(this, CreditCardInfo.class);
        intent.putExtra("passType","Week Pass");
        intent.putExtra("charge","$8.80");
        startActivity(intent);
    }

    private void handleDayClick() {
        Intent intent = new Intent(this, CreditCardInfo.class);
        intent.putExtra("passType","Day Pass");
        intent.putExtra("charge","$4.40");
        startActivity(intent);
    }

    private void handleSingleClick() {
        Intent intent = new Intent(this, CreditCardInfo.class);
        intent.putExtra("passType","Single Ride");
        intent.putExtra("charge","$2.20");
        startActivity(intent);
    }
}
