package e.a5835512034.projectappgas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Bundle User;
    private EditText inputuser,inputpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputpass = (EditText) findViewById(R.id.writepass);
        inputuser = (EditText) findViewById(R.id.writeuser);
        Button login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputpass.getText().toString().length()==0||inputuser.getText().toString().length()==0)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"please input USER and Password!!!",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    Intent gomain = new Intent(MainActivity.this, Shopmain.class);
                    startActivity(gomain);
                }
            }
        });
    }

    public void passworduser(View view) {
        if (inputuser.getText().toString().length()==0)
        {
            Toast toast = Toast.makeText(getApplicationContext(),"please input USER !!!",Toast.LENGTH_SHORT);
            toast.show();
        }
        else
        {
            Intent gopass = new Intent(MainActivity.this,PassActivity.class);
            User = new Bundle();
            User.putString("Userid",inputuser.getText().toString());
            gopass.putExtra("user",User);
            startActivity(gopass);
        }
    }
    public void regis(View view) {
        Intent gotoregis = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(gotoregis);
    }
}