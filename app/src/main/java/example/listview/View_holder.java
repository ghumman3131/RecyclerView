package example.listview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ghumman on 2/2/2017.
 */

public class View_holder extends RecyclerView.ViewHolder {

    TextView text_box;

    public View_holder(View itemView) {
        super(itemView);

       text_box = (TextView) itemView.findViewById(R.id.cell_text);
    }
}
