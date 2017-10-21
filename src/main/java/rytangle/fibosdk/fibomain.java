package rytangle.fibosdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by root on 6/10/17.
 */
//
//public class fibomain {
//}


public class fibomain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("fibomain", "layout", package_name));
    }
    public void start(View view) {
        String package_name = getApplication().getPackageName();
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        // Toast toast = Toast.makeText(context, text, duration);
        // toast.show();
        EditText username = (EditText)findViewById(getApplication().getResources().getIdentifier("chat_text", "id", package_name));

        // Context context = getApplicationContext();
        CharSequence txt = String.valueOf(username.getText().toString());

        Toast toast = Toast.makeText(context, txt, duration);
        toast.show();

    }
    public void closeme(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Closed!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        this.finish();

    }
}