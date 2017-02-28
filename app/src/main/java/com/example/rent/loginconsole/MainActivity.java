package com.example.rent.loginconsole;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean isWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText login = (EditText) findViewById(R.id.login);
        final EditText password = (EditText) findViewById(R.id.password);
        final TextInputLayout loginInputLayout = (TextInputLayout) findViewById(R.id.login_input_layout);
        final TextInputLayout passwordInputLayout = (TextInputLayout) findViewById(R.id.password_input_layout);

                final Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isWrong = false;
                if (login.getText().toString().isEmpty() ||
                        !login.getText().toString().contains("@")) {
                    loginInputLayout.setError("niepoprawny login");
                    isWrong = true;
                }

                if (password.getText().toString().isEmpty()) {
                    passwordInputLayout.setError("niepoprawne haslo");
                    isWrong = true;
                }

                if (isWrong) {
                    Snackbar.make(v, "login lub haslo jest niepoprawne", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Close", new View.OnClickListener() {

                                @Override
                                public void onClick(View v) {

                                }
                            })
                            .show();
//                    Toast.makeText(MainActivity.this, );

                    }
                }

        });

    }
}
