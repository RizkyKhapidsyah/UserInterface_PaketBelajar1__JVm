package com.rizkykhapidsyah.uipb.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.rizkykhapidsyah.uipb.R;

public class UserInterface5 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface5);

        cb = findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            cb.setText("checkbox : checked");
        } else {
            cb.setText("checkbox : unchecked");
        }
    }

}