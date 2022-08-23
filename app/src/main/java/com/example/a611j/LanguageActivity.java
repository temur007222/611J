package com.example.a611j;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.intellij.lang.annotations.Language;

import java.util.Locale;

public class LanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        initViews();
    }
    
    void initViews(){
        Button uzbek = findViewById(R.id.uzbek);
        uzbek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("uz");
            }
        });

        Button korean = findViewById(R.id.korean);
        korean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("ko");
            }
        });
        Button japanese = findViewById(R.id.japanese);
        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("ja");
            }
        });

        Button chinese = findViewById(R.id.chinese);
        chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("zh");
            }
        });
    }

    void setLocale(String language){
        Locale locale = new Locale(language);
        Locale.setDefault(locale);

        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
        finish();
    }
}
