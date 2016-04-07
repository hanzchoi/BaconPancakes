package personabe1984.nyc.baconpancakes;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListFragment extends Fragment {

    @Nullable
    @Override
    // This is what will be visible in our fragment
    // Need to return a view that represents our fragment list representing our fragment ist layout
    // Layout inflater is what we convert sml to View
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }
}
