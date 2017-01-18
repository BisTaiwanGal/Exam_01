package com.missingbismarcktons.exam_01;
import android.view.Gravity;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    private EditText edUsername, edPassword;
    private TextView tvUsername, tvPassword;
    private Button btnLogin;

    //The onCreate(Bundle) method is called when an instance of the activity subclass is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This method inflates a layout and puts it on screen. each widget in the layout file is instantiated as defined by its attributes.
        setContentView(R.layout.activity_login);

        // must cast the returned View to specified one
        edUsername = (EditText) findViewById(R.id.edUsername);
        edPassword = (EditText) findViewById(R.id.edPassword);

        tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvPassword = (TextView) findViewById(R.id.tvPassword);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edUsername.getText().toString();
                String password = edPassword.getText().toString();

                if(!id.isEmpty() && !password.isEmpty()){
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    i.putExtra("id", id);
                    startActivity(i);
                }
                else{
                    // static makeText(Context context, CharSequence text, int duration)
                    Toast toast = Toast.makeText(getApplicationContext(), "Don't leave your username or password blank", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });

    }
}

