package com.example.prit.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView selectImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gallery gallery = (Gallery)findViewById(R.id.gallary);
        selectImage = (ImageView)findViewById(R.id.imageView);
        gallery.setSpacing(1);
        final GalleryImageAdapter galleryImageAdapter = new GalleryImageAdapter(this);
        gallery.setAdapter(galleryImageAdapter);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectImage.setImageResource(galleryImageAdapter.mImageIds[i]);


                //gggggggggggggggggg
            }
        });
        }
}
