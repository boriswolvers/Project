package com.nl.mprog.example.boris.strengthprogramapp.classes;

/**
 * Created by Boris on 11-01-2017.
 * This is the adapter Class for the recyclerviewer. Main function of this class is to set the
 * cardviews in the recyclerviewer with the right descriptions. It also contains a call to
 * an onclicklistener.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nl.mprog.example.boris.strengthprogramapp.R;
import com.nl.mprog.example.boris.strengthprogramapp.activity.InfoProgramsActivity;
import com.nl.mprog.example.boris.strengthprogramapp.fragment.ProgramsFragment;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    // Declaration of variables
    private Context context;
    private List<WorkoutProgramData> my_data;

    // Initialize adapter
    public CustomAdapter(Context context, List<WorkoutProgramData> my_data) {
        this.context = context;
        this.my_data = my_data;

    }


    // Registrates when a cardview item is clicked -> activates onlicklistener in MainActivity
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);

        //itemView.setOnClickListener(ProgramsFragment.MyOnClickListener);

        return new ViewHolder(itemView);
    }

    // Sets a CardViewItem with the right image and text from the list (containing ArtData objects)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.workout_name.setText(my_data.get(position).getWorkout_name());
        holder.description.setText(my_data.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    // FindViewById methods for obtaining textview and imageview of CardViewItem
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView workout_name;
        public TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            workout_name = (TextView)itemView.findViewById(R.id.textviewWorkoutName);
            description = (TextView)itemView.findViewById(R.id.textviewDescription);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),workout_name.getText(),Toast.LENGTH_LONG).show();

                    // Go to another activity with the extra information of program
                    Intent showInfo = new Intent(v.getContext(), InfoProgramsActivity.class);
                    showInfo.putExtra("title_workout", workout_name.getText());
                    context.startActivity(showInfo);
                }
            });
        }
    }

//    public static class ViewHolder extends RecyclerView.ViewHolder {
//
//        public TextView workout_name;
//        public TextView description;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            workout_name = (TextView)itemView.findViewById(R.id.textviewWorkoutName);
//            description = (TextView)itemView.findViewById(R.id.textviewDescription);
//        }
//
//        ViewHolder(View itemView) {
//            super(itemView);
//            cv = (CardView)itemView.findViewById(R.id.cv);
//            personName = (TextView)itemView.findViewById(R.id.person_name);
//            personAge = (TextView)itemView.findViewById(R.id.person_age);
//            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(v.getContext(),personName.getText(),Toast.LENGTH_LONG).show();
//
//                }
//            });
//        }
//    }
}
