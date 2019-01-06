package com.example.user.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.list_view);

        ArrayList<ListItem> listItems =new ArrayList<ListItem>();

        ListItem obj1=new ListItem();
        obj1.setName("Buko");
        listItems.add(obj1);
        ListItem obj2=new ListItem();
        obj2.setName("Buzzkill");
        listItems.add(obj2);
        ListItem obj3=new ListItem();
        obj3.setName("Cheeseball");
        listItems.add(obj3);
        ListItem obj4=new ListItem();
        obj4.setName("Cool hunter");
        listItems.add(obj4);
        ListItem obj5=new ListItem();
        obj5.setName("Practice");
        listItems.add(obj5);
        ListItem obj6=new ListItem();
        obj6.setName("Intend");
        listItems.add(obj6);
        ListItem obj7=new ListItem();
        obj7.setName("Emoji");
        listItems.add(obj7);
        ListItem obj8=new ListItem();
        obj8.setName("Foodie");
        listItems.add(obj8);
        ListItem obj9=new ListItem();
        obj9.setName("Hanger");
        listItems.add(obj9);
        ListItem obj10=new ListItem();
        obj10.setName("Approach");
        listItems.add(obj10);
        ListItem obj11=new ListItem();
        obj11.setName("Homeshoring");
        listItems.add(obj11);
        ListItem obj12=new ListItem();
        obj12.setName("Utter");
        listItems.add(obj12);
        ListItem obj13=new ListItem();
        obj13.setName("Kadult");
        listItems.add(obj13);
        ListItem obj14=new ListItem();
        obj14.setName("Muggle");
        listItems.add(obj14);
        ListItem obj15=new ListItem();
        obj15.setName("Obtain");
        listItems.add(obj15);
        ListItem obj16=new ListItem();
        obj16.setName("overshare");
        listItems.add(obj16);
        ListItem obj17=new ListItem();
        obj17.setName("Pimp");
        listItems.add(obj17);
        ListItem obj18=new ListItem();
        obj18.setName("Soft skills");
        listItems.add(obj18);
        ListItem obj19=new ListItem();
        obj19.setName("Textspeak");
        listItems.add(obj19);
        ListItem obj20=new ListItem();
        obj20.setName("Telationship");
        listItems.add(obj20);



        final MyListAdapter adapter=new MyListAdapter(MainActivity.this,listItems);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // ListItem obj=adapter.getItem(position);
                int value=position;
                Intent intent=new Intent(MainActivity.this,wordActivity.class);
                intent.putExtra("value",value);
                startActivity(intent);


            }
        });

    }
}