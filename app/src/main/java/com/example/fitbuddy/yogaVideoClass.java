package com.example.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class yogaVideoClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_exercise_class);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.videoclip);

        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoView);
        //allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
