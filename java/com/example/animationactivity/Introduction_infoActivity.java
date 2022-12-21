package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaRouter;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Introduction_infoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_info);

        VideoView videoView = findViewById(R.id.videoView);
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.kidcode_intro;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}