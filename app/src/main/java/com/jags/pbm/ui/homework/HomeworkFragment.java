package com.jags.pbm.ui.homework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.jags.pbm.R;

import java.util.Calendar;

public class HomeworkFragment extends Fragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Find the Spinner in the layout
        Spinner mySpinner = view.findViewById(R.id.mySpinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireActivity(),
                R.array.spinner_items, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        mySpinner.setAdapter(adapter);

        // Set an item selected listener for the spinner
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Your action here
                String selectedItem = parentView.getItemAtPosition(position).toString();
                Toast.makeText(requireActivity(), "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Your action here
            }
        });

        // Find the DatePicker in the layout
        DatePicker myDatePicker = view.findViewById(R.id.myDatePicker);

        // Set the minimum date to today to prevent selecting past dates
        Calendar calendar = Calendar.getInstance();
        myDatePicker.setMinDate(calendar.getTimeInMillis());

        // Optional: Set a listener to get the selected date
        myDatePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // Your action here
                String selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                Toast.makeText(requireActivity(), "Date Selected: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homework, container, false);
    }
}
