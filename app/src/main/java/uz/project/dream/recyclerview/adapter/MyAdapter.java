package uz.project.dream.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.subinkrishna.widget.CircularImageView;

import java.util.List;

import uz.project.dream.recyclerview.R;
import uz.project.dream.recyclerview.model.Items;

/**
 * Created by Abdufattokh on 7/20/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ItemViewHolder>{

    private Context context;
    private List<Items> itemsList;

    public MyAdapter(Context context, List<Items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @Override
    public MyAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ItemViewHolder holder, int position) {
        Items items = itemsList.get(position);
        holder.nameof.setText(items.getName());
        holder.age.setText(items.getAge());
        holder.imageView.setImageResource(R.drawable.one);
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        public TextView nameof;
        public TextView age;
        public CircularImageView imageView;

        public ItemViewHolder(View itemView) {
            super(itemView);

            nameof = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            imageView = itemView.findViewById(R.id.imagecirc);

        }
    }
}
