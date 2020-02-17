package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {
    public Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfilepage();
            }
        });


        Spinner mySpinner = (Spinner) findViewById(R.id.triang);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(RegisterActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

    }

    public void openProfilepage(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    public void backToLogin(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

}
