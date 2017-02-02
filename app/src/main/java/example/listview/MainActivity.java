package example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> name_list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name_list = new ArrayList<String >();

        name_list.add("GURLAL");
        name_list.add("MICKEY");
        name_list.add("GAURAV");
        name_list.add("BABLEEN");
        name_list.add("SAMRITI");

        Adapter ad = new Adapter(name_list , MainActivity.this);

        RecyclerView rc = (RecyclerView) findViewById(R.id.recyclerview_id);

        rc.setLayoutManager(new GridLayoutManager(MainActivity.this,2));

        rc.setAdapter(ad);

    }
}
