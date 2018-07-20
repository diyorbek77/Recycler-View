package uz.project.dream.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import uz.project.dream.recyclerview.adapter.MyAdapter;
import uz.project.dream.recyclerview.model.Items;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Items> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            Items listItems = new Items(
                    "Item " + (i+1),
                    "Description",
                    "Image"
            );
            items.add(listItems);
        }
        adapter = new MyAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }
}
