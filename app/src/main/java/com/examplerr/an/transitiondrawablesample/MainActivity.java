package com.examplerr.an.transitiondrawablesample;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Demonstrates the use of TransitionDrawable using the two images.
 */
public class MainActivity extends AppCompatActivity {

    ImageView birdImageView;
    TransitionDrawable transitionDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birdImageView = (ImageView) findViewById(R.id.bird_image_view);
        transitionDrawable = (TransitionDrawable)
            ContextCompat.getDrawable(this, R.drawable.transition);

        birdImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                birdImageView.setImageDrawable(transitionDrawable);
                // The reverseTransition() makes transition both ways.
                // Use startTransition() to always start with the first layer.
                transitionDrawable.reverseTransition(1000);
            }
        });
    }
}
