package com.beanstack.saisiddhiengineering.ui.home;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;

import com.beanstack.saisiddhiengineering.MainActivity;
import com.beanstack.saisiddhiengineering.Model_Attendance;
import com.beanstack.saisiddhiengineering.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        TableLayout attendacetable = root.findViewById(R.id.attendancetbl1);
        updateAttendanceTable(getActivity(),attendacetable);
        ImageButton imageButton = root.findViewById(R.id.whatsapp);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm = getActivity().getPackageManager();
                Intent waIntent = new Intent(Intent.ACTION_SEND);
                waIntent.setType("text/plain");
                String text = "YOUR TEXT HERE";
                try {
                    PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                waIntent.setPackage("com.whatsapp");
                waIntent.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(waIntent, "Share with"));
            }
        });
        return root;
    }

    private TextView getRowsTextView(int id, String title, int color, int typeface,int bgColor) {
        TextView tv = new TextView(getActivity());
        tv.setId(id);
        tv.setText(title);
        tv.setTextColor(color);
        tv.setPadding(40, 40, 40, 40);
        tv.setTypeface(Typeface.DEFAULT, typeface);
        tv.setBackgroundResource(bgColor);
        tv.setLayoutParams(getLayoutParams());
        //tv.setOnClickListener((View.OnClickListener) this);
        return tv;
    }

    private TextView getTextView(int id, String title, int color, int typeface, int bgColor) {
        TextView tv = new TextView(getActivity());
        tv.setId(id);

        tv.setText(title.toUpperCase());
        tv.setTextColor(color);
        tv.setPadding(40, 40, 40, 40);
        tv.setTypeface(Typeface.DEFAULT, typeface);
        tv.setBackgroundColor(bgColor);
        tv.setBackgroundResource(bgColor);
        tv.setLayoutParams(getLayoutParams());
        return tv;
    }

    private TableLayout.LayoutParams getTblLayoutParams() {
        return new TableLayout.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT);
    }

    private ViewGroup.LayoutParams getLayoutParams() {
        TableRow.LayoutParams params = new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.weight = 1;
        return params;
    }
    private void updateAttendanceTable(FragmentActivity fragmentActivity, TableLayout attendacetable)
    {
        ArrayList<Model_Attendance> modelList = getTableModelList();
        TableRow tr = new TableRow(fragmentActivity);
        tr.setLayoutParams(getLayoutParams());
        //  tr.addView(getTextView(0, "Auditor id", Color.WHITE, Typeface.BOLD, R.color.colorAccent));
        tr.addView(getTextView(0, "Name", Color.BLACK, Typeface.BOLD, R.color.white ));
        tr.addView(getTextView(0, "Contacat", Color.BLACK, Typeface.BOLD, R.color.white ));

              attendacetable.addView(tr, getTblLayoutParams());
        for (int i = 0; i < modelList.size(); i++) {
            tr = new TableRow(fragmentActivity);
            tr.setLayoutParams(getLayoutParams());

            tr.addView(getRowsTextView(0, modelList.get(i).getcdate(), Color.BLACK, Typeface.BOLD, R.color.white));
            tr.addView(getRowsTextView(0, modelList.get(i).getcpunchin(), Color.BLACK, Typeface.BOLD ,R.color.white ));



            attendacetable.addView(tr, getTblLayoutParams());

        }
    }


    private ArrayList<Model_Attendance> getTableModelList()
    {
        ArrayList<Model_Attendance> modelList = new ArrayList<>();
        Model_Attendance modelClass = new Model_Attendance();
        modelClass.setcDate("hrishikesh");
        modelClass.setcpunchin("8600960063");
        modelList.add(modelClass);

        Model_Attendance modelClass1 = new Model_Attendance();
        modelClass1.setcDate("Priya");
        modelClass1.setcpunchin("8678987563");

        modelList.add(modelClass1);

        Model_Attendance modelClass2 = new Model_Attendance();
        modelClass2.setcDate("Ankita");
        modelClass2.setcpunchin("9876453241");

        modelList.add(modelClass2);

        Model_Attendance modelClass3 = new Model_Attendance();
        modelClass3.setcDate("hrishikesh");
        modelClass3.setcpunchin("8600960063");
        modelList.add(modelClass3);

        Model_Attendance modelClass4 = new Model_Attendance();
        modelClass4.setcDate("Priya");
        modelClass4.setcpunchin("8678987563");

        modelList.add(modelClass4);

        Model_Attendance modelClass5 = new Model_Attendance();
        modelClass5.setcDate("Ankita");
        modelClass5.setcpunchin("9876453241");

        modelList.add(modelClass5);

        Model_Attendance modelClass6 = new Model_Attendance();
        modelClass6.setcDate("hrishikesh");
        modelClass6.setcpunchin("8600960063");
        modelList.add(modelClass6);

        Model_Attendance modelClass7 = new Model_Attendance();
        modelClass7.setcDate("Priya");
        modelClass7.setcpunchin("8678987563");

        modelList.add(modelClass7);

        Model_Attendance modelClass8 = new Model_Attendance();
        modelClass8.setcDate("Ankita");
        modelClass8.setcpunchin("9876453241");

        modelList.add(modelClass8);
        return modelList;
    }


}
