package org.techtown.blackboxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FileActivity extends AppCompatActivity {

    private Button btn_stream;
    private Button btn_file;
    private Button btn_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);

        btn_stream = findViewById(R.id.btn_stream);
        btn_file = findViewById(R.id.btn_file);
        btn_setting = findViewById(R.id.btn_setting);


        btn_stream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FileActivity.this,StreamActivity.class);
                startActivity(intent); // 액티비티 이동.

            }
        });

        btn_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FileActivity.this,FileActivity.class);
                startActivity(intent);
            }
        });

        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FileActivity.this,SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}