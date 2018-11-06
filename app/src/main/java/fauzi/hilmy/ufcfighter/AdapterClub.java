package fauzi.hilmy.ufcfighter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import fauzi.hilmy.ufcfighter.model.ResponseFighter;

import static fauzi.hilmy.ufcfighter.DetailActivity.EXTRA_FIGHTER;

public class AdapterClub extends RecyclerView.Adapter<AdapterClub.MyViewHolder> {
    private List<ResponseFighter> item;
    private Context context;

    public AdapterClub(List<ResponseFighter> item, Context context) {
        this.item = item;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterClub.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClub.MyViewHolder myViewHolder, final int i) {
        Picasso.get()
                .load(item.get(i).getThumbnail())
                .fit()
                .into(myViewHolder.imgClub);

        myViewHolder.txtClub.setText(item.get(i).getFirstName() + " " + item.get(i).getLastName());
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(EXTRA_FIGHTER, item.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgClub;
        TextView txtClub;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgClub = itemView.findViewById(R.id.imgClub);
            txtClub = itemView.findViewById(R.id.txtClub);
        }
    }
}
