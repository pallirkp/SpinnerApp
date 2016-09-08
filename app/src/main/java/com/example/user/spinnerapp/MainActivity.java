package com.example.user.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.myspinner);
        populateSpinner();
        sp.setOnItemSelectedListener(this);
    }
    public void populateSpinner(){
        ArrayAdapter<CharSequence> xadapter;
        xadapter = ArrayAdapter.createFromResource(this,R.array.age,android.R.layout.simple_spinner_item);
        sp.setAdapter(xadapter);
    }
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        String item = parent.getItemAtPosition(position).toString();
        int index = parent.getSelectedItemPosition();
        switch(index)
        {
            case 0:
                Toast.makeText(parent.getContext(), "The baby is INFANT",Toast.LENGTH_LONG).show();
                        break;
            case 1:
                Toast.makeText(parent.getContext(), "The baby is CHILD..",Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(parent.getContext(), "The Baby is CHILD..",Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(parent.getContext(), "The Boy/Girl is TEENAGER",Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(parent.getContext(), "The Boy/Girl is YOUNG..",Toast.LENGTH_LONG).show();
                break;
            case 5:
                Toast.makeText(parent.getContext(), "It is a MIDDLE AGED MAN/LADY",Toast.LENGTH_LONG).show();
                break;
            case 6:
                Toast.makeText(parent.getContext(), "It is an OLD MAN...!",Toast.LENGTH_LONG).show();
                break;
        }
    }
    public void onNothingSelected(AdapterView<?> x){}

}
