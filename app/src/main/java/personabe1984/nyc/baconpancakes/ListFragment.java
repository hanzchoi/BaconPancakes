package personabe1984.nyc.baconpancakes;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListFragment extends Fragment {

    public interface OnRecipeSelectedInterface{
        void onListRecipeSelected(int index);
    }


    @Nullable
    @Override
    // This is what will be visible in our fragment
    // Need to return a view that represents our fragment list representing our fragment ist layout
    // Layout inflater is what we convert xml to View
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(LoggingFragment.TAG,"onCreateView");
        OnRecipeSelectedInterface listener = (OnRecipeSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listRecyclerView);
        ListAdapter listAdapter = new ListAdapter(listener);
        recyclerView.setAdapter(listAdapter);  // attached the adapter to the recyclerView

        //layout manager is responsible or determining where to lace the views
        // as well as when to reuse a view that's no longer visible
        // To make sure Recycler view to act like a vertical list we can use built in linearManager
        // Fragment always have to access their activity through the getActivity
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
}
