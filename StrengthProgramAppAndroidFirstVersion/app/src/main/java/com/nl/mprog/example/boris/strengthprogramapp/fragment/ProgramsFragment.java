package com.nl.mprog.example.boris.strengthprogramapp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.nl.mprog.example.boris.strengthprogramapp.R;
import com.nl.mprog.example.boris.strengthprogramapp.classes.CustomAdapter;
import com.nl.mprog.example.boris.strengthprogramapp.classes.WorkoutProgramData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ProgramsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ProgramsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProgramsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;


    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private CustomAdapter adapter;
    private List<WorkoutProgramData> programData_list;
    static View.OnClickListener myOnClickListener;

    static String[] workoutNameArray= {"StrongLifts 5x5", "Candito 6 week program", "Starting strength"};
    static String[] descriptionArray = {"5x5 pogram is for gaining strength simple and yet effective. Program is centered around the main lifts, which should be performed for 5 sets of 5 reps. Goal is to increase each lift 2.5 kg each workout.",
            "Jonnie Candito is a well known powerlifter who made a training program of his own. Just enter what weights you are currently lifting for an exercise and the program calculates what to do.",
            "This program is a strength training program from powerlifter Mark Rippetoe. Three workouts per week, alternating workout A with workout B. Progress is similar to 5x5 program."};

    public ProgramsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProgramsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProgramsFragment newInstance(String param1, String param2) {
        ProgramsFragment fragment = new ProgramsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_programs, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        recyclerView = (RecyclerView) getView().findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        programData_list = new ArrayList<>();

        programData_list.add(new WorkoutProgramData(workoutNameArray[0], descriptionArray[0]));
        programData_list.add(new WorkoutProgramData(workoutNameArray[1], descriptionArray[1]));
        programData_list.add(new WorkoutProgramData(workoutNameArray[2], descriptionArray[2]));

        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new CustomAdapter(getActivity(), programData_list);
        recyclerView.setAdapter(adapter);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

//    public class MyOnClickListener implements View.OnClickListener {
//
//        private final Context context;
//
//        private MyOnClickListener(Context context) {
//            this.context = context;
//        }
//
//        @Override
//        public void onClick(View v) {
//            // Gets position inside recyclerview, use that to find object number in Artdata-object
//            // int pos = recyclerView.getChildPosition(v);
//            // ArtData dataOfList = data_list.get(pos);
//            // String objectNumber = dataOfList.getObjectNumber();
//
//            Toast toast = Toast.makeText(getActivity(), "HAHA!", Toast.LENGTH_SHORT);
//            toast.show();
//
//            // Go to another activity with the extra information of artwork
//            //    Intent showArt = new Intent(MainActivity.this, showArt.class);
//            //   showArt.putExtra("jsonInfo", artInformation);
//            //   startActivity(showArt);
//        }
//    }
}
