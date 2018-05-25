package test.gitauto.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import test.gitauto.com.variousapp.BuildConfig;
import test.gitauto.com.variousapp.R;

/**
 * Created by git on 2018-05-25.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        View view = getLayoutInflater().inflate(R.layout.activity_main,null);
        TextView txt = (TextView)view.findViewById(R.id.mainText);

        txt.setText("APP_NAME : " +BuildConfig.APP_NAME);


        setContentView(view);
    }
}
