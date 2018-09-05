package vn.linh.androidpasswordfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

import static android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD;

public class MainActivity extends AppCompatActivity {

    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPassword = findViewById(R.id.edit_text_password);

        Typeface cache = edtPassword.getTypeface();
        edtPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        edtPassword.setTypeface(cache);

    }
}
