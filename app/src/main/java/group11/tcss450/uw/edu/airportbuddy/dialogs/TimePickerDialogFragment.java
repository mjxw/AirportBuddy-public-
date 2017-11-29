package group11.tcss450.uw.edu.airportbuddy.dialogs;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TimePicker;
import android.widget.Toast;

import group11.tcss450.uw.edu.airportbuddy.interfaces.OnTimePickerListener;

/**
 * Dialog to pick a time.
 */
public class TimePickerDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    /**
     * reference to timepicker listener
     */
    private OnTimePickerListener mListener;

    /**
     * Tag for logs
     */
    private String mTag;

    /**
     * Constructor
     */
    public TimePickerDialogFragment() {
        // Required empty public constructor
    }

    /**
     * Create dialogue
     * @param savedInstanceState the saved instance
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
// Use the current time as the default values for the picker
        mTag = getArguments().getString("TAG");
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
// Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    /**
     * Method for attachment of this fragment
     * @param context the context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnTimePickerListener) {
            mListener = (OnTimePickerListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnTimePickerListener");
        }
    }

    /**
     * Method for on detach
     */
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * convert time properly for dashboard
     * @param view the view
     * @param hourOfDay the hour of day
     * @param minute the minutes
     */
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
//        Toast.makeText(getActivity(), "You picked " + hourOfDay + ":" + minute
//                , Toast.LENGTH_LONG).show();
        String ampm = "am";
        if (hourOfDay > 12) {
            ampm = "pm";
            hourOfDay -= 12;
        }
        String sMinute = String.valueOf(minute);
        if (minute < 10) {
            sMinute = "0" + String.valueOf(minute);
        }
        String time = String.valueOf(hourOfDay) + ":" + sMinute + " " + ampm;
        mListener.onTimePicked(time, mTag);
    }
}
