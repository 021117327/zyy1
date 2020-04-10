package com.example.logintest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView=(TextView)findViewById(R.id.textView5);
        Bundle bundle=new Bundle();
        bundle=getIntent().getExtras();
        String name =bundle.getString("name");
        textView.setText(name+",登陆成功");
    }
}
