package com.huynh.android.placestoseeinwa;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewOfAirShow;
    AnimationDrawable blueAngleAnimation;
    TextView headerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup  for the animation - Blue Angle Airshow 2015 images
        this.imageViewOfAirShow = (ImageView) this.findViewById(R.id.blueangle);
        if (this.imageViewOfAirShow != null) {
            this.imageViewOfAirShow.setBackgroundResource(R.drawable.blue_angle);
            this.blueAngleAnimation = (AnimationDrawable) this.imageViewOfAirShow.getBackground();
        }

        // Set the text color for the app title to "R.color.orange1_for_text" when the current time in millisecond is even;
        // otherwise, set the app title color to R.color.blue1_for_text
        this.headerTextView = (TextView) this.findViewById(R.id.appHeader);
        if (this.headerTextView != null) {
            int colorResource;
            if (System.currentTimeMillis() %2 == 0)    // Even number
            {
                colorResource = ContextCompat.getColor(this, R.color.orange1_for_text);
            }
            else {
                colorResource = ContextCompat.getColor(this, R.color.blue1_for_text);
            }
            this.headerTextView.setTextColor(colorResource);
        }
    }

    // Start the animation automatically
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        this.blueAngleAnimation.start();
    }

    // Handler to navigate to a different activity on mouse click
    public void TulipFieldOnClickHandler(View view)
    {
        Context context = this;
        Intent intent = new Intent(context, Main2Activity.class);
        this.startActivity(intent);
    }

    // Handler for the mouse click on the "<About>" button
    public void AboutButtonClickHandler(View view)
    {
        Context context = this;
        Intent intent = new Intent(context, AboutActivity.class);
        this.startActivity(intent);
    }
}