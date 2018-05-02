package com.example.tarikul.firebasedatabaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    DatabaseReference databaseReference;
    ModelClass modelClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modelClass = new ModelClass();

        databaseReference = FirebaseDatabase.getInstance().getReference("tarik");

        insertDataFirebase();

    }


    public void insertDataFirebase(){
        modelClass.setUserName("Md.Tarikul Islam");
        modelClass.setPhoneNumber("01734424773");

        databaseReference.child(modelClass.getPhoneNumber()).setValue(modelClass);
    }
}
