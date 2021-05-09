package android.example.com.visualizerpreferences.AudioVisuals.settings;

import android.example.com.visualizerpreferences.R;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

// COMPLETED (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat
// This check box preference should have a default value of true, the key 'show_bass', a
// summaryOff of Hidden, a summaryOn of Shown and a title of 'Show Bass'
public class SettingsFragment extends PreferenceFragmentCompat {

    // COMPLETED (5) In SettingsFragment's onCreatePreferences method add the preference file using the
    // addPreferencesFromResource method
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
