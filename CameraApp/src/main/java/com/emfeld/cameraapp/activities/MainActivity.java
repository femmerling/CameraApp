package com.emfeld.cameraapp.activities;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.FrameLayout;

import com.emfeld.cameraapp.R;
import com.emfeld.cameraapp.objects.CameraPreview;

public class MainActivity extends ActionBarActivity {

    private Camera mCamera;
    private CameraPreview mPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout preview = (FrameLayout)findViewById(R.id.camera_preview);
        mCamera = getCameraInstance();
        mPreview = new CameraPreview(this,mCamera, preview.getWidth(), preview.getHeight());

        preview.addView(mPreview);
    }

    public static Camera getCameraInstance(){
        Camera camera = null;
        try{
            camera = Camera.open();
        }
        catch(Exception e){

        }

        return camera;
    }
}
