package com.enestcustomerapp.activity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.enestcustomerapp.R;
import com.enestcustomerapp.utils.SessionManager;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.enestcustomerapp.utils.SessionManager.aboutUs;

public class AboutsActivity extends BaseActivity {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.txt_about)
    TextView txtAbout;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abouts);
        ButterKnife.bind(this);
        sessionManager = new SessionManager(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            txtAbout.setText(Html.fromHtml(sessionManager.getStringData(aboutUs), Html.FROM_HTML_MODE_COMPACT));
        } else {
            txtAbout.setText(Html.fromHtml(sessionManager.getStringData(aboutUs)));
        }
    }
}
