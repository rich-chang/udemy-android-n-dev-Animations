package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart2 = findViewById(R.id.bart2);
        bart2.setTranslationX(-1000f);
        bart2.setTranslationY(-1000f);
    }

    public void fade(View vie) {
        ImageView bart2 = findViewById(R.id.bart2);
        //ViewPropertyAnimator viewPropertyAnimator_bart2 = bart2.animate().alpha(0.1f).setDuration(2000);

        //bart2.animate().translationXBy(1000f).setDuration(2000);
        //bart2.animate().scaleX(0.3f).scaleY(0.3f).setDuration(2000);
        bart2.animate()
                .translationX(500f)
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(3600f)
                .setDuration(2000);

        /*
        ImageView bart1 = findViewById(R.id.bart1);
        ViewPropertyAnimator viewPropertyAnimator_bart1 = bart1.animate().alpha(0.1f).setDuration(2000);
        Log.i("animation-bart1", viewPropertyAnimator_bart1.toString());
        */
    }
}
