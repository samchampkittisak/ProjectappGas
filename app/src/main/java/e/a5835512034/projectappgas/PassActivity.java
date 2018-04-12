package e.a5835512034.projectappgas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        TextView passuser = (TextView) findViewById(R.id.setuser);
        Bundle user = getIntent().getBundleExtra("user");
        passuser.setText(passuser.getText().toString()+user.getString("Userid"));
    }

    public void blogin(View view) {
        Intent golog = new Intent(PassActivity.this,MainActivity.class);
        startActivity(golog);
    }
}
