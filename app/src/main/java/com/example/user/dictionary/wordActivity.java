package com.example.user.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class wordActivity extends AppCompatActivity {
    private int value;
    private TextView prophecy,meaning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        Intent intent=getIntent();
        int value=intent.getIntExtra("value",0);

        prophecy=findViewById(R.id.prophecy);
        meaning=findViewById(R.id.meaning);

        if(value==0){
            prophecy.setText("this include drinks such as milk,fruits .");
            meaning.setText("much or many,a lot");
        }
        else if(value==1){
            prophecy.setText("Taylors constant talk about religion and other depressing subjects made him a total office buzzkill.");
            meaning.setText("person or thing that has a depressing effect");
        }
        else if(value==2){
         prophecy.setText("I will admit to watching some of those cheeseball daytime talk shows.");
        meaning.setText("lacking taste, style or originality");
    }
        else if(value==3){
        prophecy.setText("the great white hunter was on the prowl.");
        meaning.setText("one who predicts new styles and trends");
    }
        else if(value==4){
            prophecy.setText("He directed and acted in plays every season and became known for exploring Elizabethan theatre practices.");
            meaning.setText("a customary way of operation or behavior");
        }
        else if(value==5){
            prophecy.setText("“Lipstick, as a product intended for topical use with limited absorption, is ingested only in very small quantities,” the agency said on its website.");
            meaning.setText("have in mind as a purpose");
        }
        else if(value==6){
            prophecy.setText("the basketball player captioned the new photos of his kids with a simple heart emoji.");
            meaning.setText("a samll digital image or icon used to express an idea");
        }
        else if(value==7){
            prophecy.setText("Other neighbourhoods in the city offer foodies a choice of Chinese, Portuguese or Greek food..");
            meaning.setText("a person with a particular interest in food");
        }
        else if(value==8){
            prophecy.setText("I get very hangry if I miss a meal.");
            meaning.setText("bad-tempered or irritable as a result of hunger");
        }
        else if(value==9){
            prophecy.setText("Spain’s jobless rate for people ages 16 to 24 is approaching 50 percent.");
            meaning.setText("move towards");
        }
        else if(value==10){
            prophecy.setText(" someone making calls from home for the catalog company for which they work.");
            meaning.setText("moving jobs to employees' homes from offshoring");
        }
        else if(value==11){
            prophecy.setText("No one can blame an honest mechanic for holding a wealthy snob in utter contempt.");
            meaning.setText("without qualification");
        }
        else if(value==12){
            prophecy.setText("To raise a child to adulthood requires your heart, energy, time, and wealth.");
            meaning.setText("person who is technically an adult due to age but still acts like a child");
        }
        else if(value==13){
            prophecy.setText("she's a muggle: no IT background, understanding, or aptitude at all’. ");
            meaning.setText("a person who does not have a particular type of skill or knowledge");
        }
        else if(value==14){
            prophecy.setText("Stone magazine obtained the report and posted it Friday night.");
            meaning.setText("come into possession of");
        }
        else if(value==15){
            prophecy.setText("her taste for oversharing was part of a grassroots publicity campaign that cost her and her label nothing’.");
            meaning.setText("give out too much information");
        }
        else if(value==16){
            prophecy.setText(" someone in charge of a group of prostitutes.");
            meaning.setText("make something more showy or impressive");
        }
        else if(value==17){
            prophecy.setText("the knowledge you possess but rather behaviors you display in different situations .");
            meaning.setText("attributes that enable someone to interact harmoniously with others");
        }
        else if(value==18){
            prophecy.setText("Instant messaging and texting condense language to its lowest common denominator.");
            meaning.setText("the kind of text messages,containing short forms of words");
        }
        else if(value==19){
            prophecy.setText("two businesses working together.");
            meaning.setText("a relationship that only exixts through electronic media");
        }

    }
}