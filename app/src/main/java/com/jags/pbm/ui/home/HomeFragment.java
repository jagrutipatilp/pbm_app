package com.jags.pbm.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jags.pbm.databinding.FragmentHomeBinding;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set up line chart
        GraphView performanceChart = binding.performanceChart;
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(getPerformanceDataPoints());
        performanceChart.addSeries(series);

        // Set up bar chart
        GraphView attendanceChart = binding.attendanceChart;
        // Add your bar chart series here

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private DataPoint[] getPerformanceDataPoints() {
        // Sample data points for performance chart
        return new DataPoint[]{
                new DataPoint(0, 10),
                new DataPoint(1, 20),
                new DataPoint(2, 30),
                new DataPoint(3, 40)
        };
    }
}
