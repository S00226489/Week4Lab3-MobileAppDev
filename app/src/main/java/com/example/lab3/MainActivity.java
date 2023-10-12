package com.example.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(View view) {
        String danceType = "";
        int viewId = view.getId();

        if (viewId == R.id.button3) {
            danceType = "Samba";
        } else if (viewId == R.id.button2) {
            danceType = "Rock 'n' Roll";
        } else if (viewId == R.id.button1) {
            danceType = "Hip Hop";
        }

        if (!danceType.isEmpty()) {
            String toastMessage = "You chose: " + danceType;
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}

