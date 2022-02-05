package com.example.fitbuddy;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ChallengesAdapter extends RecyclerView.Adapter<ChallengesAdapter.Viewholder> {

    private Context context;
    private ArrayList<ChallengesModel> challengesModelArrayList;

    // Constructor
    public ChallengesAdapter(Context context, ArrayList<ChallengesModel> challengesModelArrayList) {
        this.context = context;
        this.challengesModelArrayList = challengesModelArrayList;
    }

    @NonNull
    @Override
    public ChallengesAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.challenge_card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChallengesAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        ChallengesModel model = challengesModelArrayList.get(position);
        holder.titleTextView.setText(model.title);
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return challengesModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private final TextView titleTextView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.idTitleTextView);
        }
    }
}