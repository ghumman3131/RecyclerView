package example.listview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ghumman on 2/2/2017.
 */

public class Adapter extends RecyclerView.Adapter<View_holder> {

    public ArrayList<String> nameList;
    public Activity ab;

    public Adapter(ArrayList<String> name_list , Activity a)
    {
        nameList = name_list;
        ab = a;
    }
    @Override
    public View_holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(ab).inflate(R.layout.cell_view,parent,false);
        View_holder viewholder = new View_holder(v);
        return  viewholder;
    }

    @Override
    public void onBindViewHolder(View_holder holder, int position)
    {
        holder.text_box.setText(nameList.get(position));

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
