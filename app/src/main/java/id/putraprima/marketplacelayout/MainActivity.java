package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_services = (Button) findViewById(R.id.button_service);
        button_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginpage();
            }
        });
    }

    public void openLoginpage() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
