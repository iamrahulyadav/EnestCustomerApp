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

import static com.enestcustomerapp.utils.SessionManager.privacy;

public class PrivecyPolicyActivity extends BaseActivity {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.txt_privacy)
    TextView txtPrivacy;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privecypolicy);
        ButterKnife.bind(this);
        sessionManager = new SessionManager(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            txtPrivacy.setText(Html.fromHtml(sessionManager.getStringData(privacy), Html.FROM_HTML_MODE_COMPACT));
        } else {
            txtPrivacy.setText(Html.fromHtml(sessionManager.getStringData(privacy)));
        }
    }
}
