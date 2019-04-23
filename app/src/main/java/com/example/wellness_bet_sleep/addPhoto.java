package com.example.wellness_bet_sleep;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class addPhoto extends AppCompatActivity {
    private static  final int RESULT_LOAD_IMAGE =1;
    ImageView imageToUpload;
    CardView cardViewUploadPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_photo);

        imageToUpload = (ImageView) findViewById(R.id.upload_photo);
        cardViewUploadPhoto =(CardView) findViewById(R.id.cardView_add_photo);

        imageToUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(v.getId()){
                    case R.id.upload_photo:

                        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);

                        break;
                    case R.id.cardView_add_photo:
                        break;
                }

            }

         /**   @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data){
                addPhoto.super.onActivityResult(requestCode, resultCode, data);
            } **/
        });
    }
}
