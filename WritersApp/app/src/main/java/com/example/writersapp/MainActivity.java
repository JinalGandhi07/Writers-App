package com.example.writersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textpara);
        String para="1. Colonel Sanders | Kentucky Fried Chicken\n" +
                "\n" +
                "Once, there was an older man, who was broke, living in a tiny house and owned a beat up car. He was living off of $99 social security checks. At 65 years of age, he decide things had to change. So he thought about what he had to offer. His friends raved about his chicken recipe. He decided that this was his best shot at making a change.\n" +
                "\n" +
                "He left Kentucky and traveled to different states to try to sell his recipe. He told restaurant owners that he had a mouthwatering chicken recipe. He offered the recipe to them for free, just asking for a small percentage on the items sold. Sounds like a good deal, right?\n" +
                "\n" +
                "Unfortunately, not to most of the restaurants. He heard NO over 1000 times. Even after all of those rejections, he didn’t give up. He believed his chicken recipe was something special. He got rejected 1009 times before he heard his first yes.\n" +
                "\n" +
                "With that one success Colonel Hartland Sanders changed the way Americans eat chicken. Kentucky Fried Chicken, popularly known as KFC, was born.\n" +
                "\n" +
                "Remember, never give up and always believe in yourself in spite of rejection.\n" +
                "\n" +
                "2. The Obstacle in our Path\n" +
                "\n" +
                "There once was a very wealthy and curious king. This king had a huge boulder placed in the middle of a road. Then he hid nearby to see if anyone would try to remove the gigantic rock from the road.\n" +
                "\n" +
                "The first people to pass by were some of the king’s wealthiest merchants and courtiers. Rather than moving it, they simply walked around it. A few loudly blamed the King for not maintaining the roads. Not one of them tried to move the boulder.\n" +
                "\n" +
                "Finally, a peasant came along. His arms were full of vegetables. When he got near the boulder, rather than simply walking around it as the others had, the peasant put down his load and tried to move the stone to the side of the road. It took a lot of effort but he finally succeeded.\n" +
                "\n" +
                "The peasant gathered up his load and was ready to go on his way when he say a purse lying in the road where the boulder had been. The peasant opened the purse. The purse was stuffed full of gold coins and a note from the king. The king’s note said the purse’s gold was a reward for moving the boulder from the road.\n" +
                "\n" +
                "The king showed the peasant what many of us never understand: every obstacle presents an opportunity to improve our condition.\n" +
                "\n" +
                "3. Value\n" +
                "\n" +
                "A popular speaker started off a seminar by holding up a $20 bill. A crowd of 200 had gathered to hear him speak. He asked, “Who would like this $20 bill?”\n" +
                "\n" +
                "200 hands went up.\n" +
                "\n" +
                "He said, “I am going to give this $20 to one of you but first, let me do this.” He crumpled the bill up.\n" +
                "\n" +
                "He then asked, “Who still wants it?”\n" +
                "\n" +
                "All 200 hands were still raised.\n" +
                "\n" +
                "“Well,” he replied, “What if I do this?” Then he dropped the bill on the ground and stomped on it with his shoes.\n" +
                "\n" +
                "He picked it up, and showed it to the crowd. The bill was all crumpled and dirty.\n" +
                "\n" +
                "“Now who still wants it?”\n" +
                "\n" +
                "All the hands still went up.\n" +
                "\n" +
                "“My friends, I have just showed you a very important lesson. No matter what I did to the money, you still wanted it because it did not decrease in value. It was still worth $20. Many times in our lives, life crumples us and grinds us into the dirt. We make bad decisions or deal with poor circumstances. We feel worthless. But no matter what has happened or what will happen, you will never lose your value. You are special – Don’t ever forget it!";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}