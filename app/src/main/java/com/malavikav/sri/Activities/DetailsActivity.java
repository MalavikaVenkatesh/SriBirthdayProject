package com.malavikav.sri.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.cert.CertPathBuilder;
import java.util.Random;

import com.malavikav.sri.R;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView,suprise;
    TextView textView;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = (ImageView) findViewById(R.id.imageDp);
        textView = (TextView) findViewById(R.id.text);
        suprise  = (ImageView) findViewById(R.id.suprise);
        intent = getIntent();

        final KonfettiView konfettiView = findViewById(R.id.viewKonfetti);

        konfettiView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
//                konfettiView.build()
//                        .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
//                        .setDirection(0.0, 359.0)
//                        .setSpeed(1f, 5f)
//                        .setFadeOutEnabled(true)
//                        .setTimeToLive(2000L)
//                        .addShapes(Shape.Square.INSTANCE, Shape.Circle.INSTANCE)
//                        .addSizes(new Size(12, 5f))
//                        .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
//                        .streamFor(300, 5000L);

                konfettiView.build()
                        .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA,Color.GRAY, Color.BLUE,Color.RED)
                        .setDirection(0.0, 359.0)
                        .setSpeed(1f, 5f)
                        .setFadeOutEnabled(true)
                        .setTimeToLive(2000L)
                        .addShapes(Shape.Square.INSTANCE, Shape.Circle.INSTANCE)
                        .addSizes(new Size(12, 5))
                        .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
                        .streamFor(300, 5000L);
            }
        });

//        konfettiView.build()
//                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.GRAY, Color.BLUE,Color.RED)
//                .setDirection(0.0, 359.0)
//                .setSpeed(1f, 30f)
//                .setFadeOutEnabled(true)
//                .setTimeToLive(5000L)
//                .addShapes(Shape.Square.INSTANCE, Shape.Circle.INSTANCE)
//                .addSizes(new Size(14, 2))
//                .streamFor(500, 60000L);





        int number = intent.getIntExtra("message",0);

        switch (number){
            case 1:
                loadOne();
                break;
            case 2:
                loadTwo();
                break;
            case 3:
                loadThree();
                break;
            case 4:
                loadFour();
                break;
            case 5:
                loadFive();
                break;
            case 6:
                loadSix();
                break;
            case 7:
                loadSeven();
                break;
            default:
                loadOne();
        }

        setImage();
    }

    public void setImage(){
        Random rand = new Random();

        int random_n = rand.nextInt(10);

        switch (random_n){
            case 1:
                suprise.setImageResource(R.drawable.sri_sup1);
                break;
            case 2:
                suprise.setImageResource(R.drawable.sri_sup2);
                break;
            case 3:
                suprise.setImageResource(R.drawable.sri_sup3);
                break;
            case 4:
                suprise.setImageResource(R.drawable.sri_sup4);
                break;
            case 5:
                suprise.setImageResource(R.drawable.sri_sup5);
                break;
            case 6:
                suprise.setImageResource(R.drawable.sri_sup6);
                break;
            case 7:
                suprise.setImageResource(R.drawable.sri_sup7);
                break;
            case 8:
                suprise.setImageResource(R.drawable.sri_sup8);
                break;
            case 9:
                suprise.setImageResource(R.drawable.sri_sup9);
                break;
            default:
                suprise.setImageResource(R.drawable.cake);
        }
    }


    public void loadOne(){
        imageView.setImageResource(R.drawable.sri11);
        textView.setText("மாமேய் nee romba nallavan daa unakku nalladhey nadakkum.namma friendship yeppadi palli paruvathula aarambichu continue aagudho vayasaagara varaikkum irukkanum. லவ் யூ மச்சான்.you make our life beautiful too ❤❤");
    }

    public void loadTwo(){
        imageView.setImageResource(R.drawable.sri12);
        textView.setText("Hi da.. I’m writing this on April 14.. a day before your birthday.. mom sent me the video she edited for your birthday today.. having a look at all those pictures made me realise how far we’ve come... and I can’t imagine how we used to fight in Lower classes.. thanks to “unaku vandha dhAn Sri puriyum” Pavi, we started sitting together in 7th grade.. at that point.. I sure didn’t expect we’ll be here.. but now I expect we definitely will carry the friendship to grace.. those pictures of us.. the video has me in almost every frame showing that how consumed we are in each other’s lives.. I hope our plans turn out as we wanted and we either fly together or cook together after a few years... it’s gonna be your birthday in a few hours.. like I said.. if not for the quarantine.. we would’ve celebrated as usual.. but it’s ok.. for my birthday we’ll celebrate together.. and from next year.. we’ll have destination celebrations.. one new destination for each of us’s birthday... if not at least a week before or after.. stay with me forever, stay happy... live long.. HAPPY BIRTHDAY \uD83E\uDD73");
    }

    public void loadThree(){
        imageView.setImageResource(R.drawable.sri13);
        textView.setText("Wish you a many more happy returns of the sri❤️❤️\uD83E\uDD70\uD83E\uDD70\uD83E\uDD70\uD83E\uDD70 wsh u al success in ur lyf da\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73 let u get al d thngs u deserve sri\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D epayume happy ah sirichitu iru da\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07 don't worry for the thngs happened... Ellame nallathuke nu edhutukko\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01 always I will b n ur side\uD83D\uDE0C\uD83D\uDE0C\uD83D\uDE0C\uD83D\uDE0C keep n touch & always stay b contact da\uD83E\uDD17\uD83E\uDD17\uD83E\uDD17\uD83E\uDD17 I wsh this bond shld b everlasting forever & evr\uD83E\uDD70\uD83E\uDD70\uD83E\uDD70 enaku unna rmbaaa pidikum loose... Namma dailyum pesikka maatom but always my luv on u NVR evr fade away man\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D luv u loose boii\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E");
    }

    public void loadFour(){
        imageView.setImageResource(R.drawable.sri14);
        textView.setText("Yo kutty..ur my favourite person and u wil alwys remain the best in my life..years of friendship and love that we built will grow more stronger in the upcoming days and am waitg for more kiting snacking and mottamadi sessions with you..u alwys motivate and encourage me in whtver thgs am upto and u hve alwys got my back.. you hve been a savior for many during maths exm prep hehe..u make sure evyone around u is doin gud and wil turn every situation in a positive way..we will stick together no matter what and this wil last forever and ever..may evry single dream of yours come true and may life make ur days as beautiful as ur heart..u can alwys count on me and I'll be there ..u wil forever remain in my prayers and thanks for eveytg uve done to me..thks for wiping my tears wen I was low thanks for makg me more happy during gud times..love u forever..happy 21 big man..let's go have some chats after this quarantine and am missing yr terrace a lot");
    }

    public void loadFive(){
        imageView.setImageResource(R.drawable.sri15);
        textView.setText("Many many happy returns of the day Sri. Glad that I have an amazing friend like you. Thanks for all the memories and would definitely cherish the future memories too. Be happy, be you and yes life is beautiful♥️");
    }

    public void loadSix(){
        imageView.setImageResource(R.drawable.sri16);
        textView.setText("Happy Birthday Sridhar . God bless u babe. I am missing too much. so soon our dreams will come true . stay strong health . love u lots babe\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18");
    }
    public void loadSeven(){
        imageView.setImageResource(R.drawable.sri17);
        textView.setText("Happy Birthday ARIES Boy :) \n\nThe Aries male personality is practically an archetype of raw masculinity. Both the fiery and cardinal forces that govern Aries make for a highly aggressive and even unbalanced individual. For this reason, Aries males are hard to tame and often suffer a lack of self-restraint. ");
    }

    public void loadEight(){
        imageView.setImageResource(R.drawable.sri_sup2);
        textView.setText("Hi Hows u ");
    }

}
