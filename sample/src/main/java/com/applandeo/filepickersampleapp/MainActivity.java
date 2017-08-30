package com.applandeo.filepickersampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.applandeo.FilePicker;
import com.applandeo.listeners.OnSelectFileListener;

public class MainActivity extends AppCompatActivity {

    private TextView mSelectedPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openPicker = (Button) findViewById(R.id.openPicker);
        mSelectedPath = (TextView) findViewById(R.id.selectedPath);

        openPicker.setOnClickListener(
                view -> new FilePicker.Builder(this, listener)
//                        .setMainDirectory(Environment.getExternalStorageDirectory().getPath())
                        .hideFiles(false) //to show only directories
//                        .directory("/")
                        .show());
    }

    private OnSelectFileListener listener = file -> mSelectedPath.setText(file.getPath());
}
