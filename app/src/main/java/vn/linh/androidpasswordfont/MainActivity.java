package vn.linh.androidpasswordfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPassword = findViewById(R.id.edit_text_password);

        enableInputHiddenPassword(edtPassword);

        findViewById(R.id.button_show_hide_password).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPasswordVisible(edtPassword)) {
                    enableInputHiddenPassword(edtPassword);
                } else {
                    enableInputVisiblePassword(edtPassword);
                }
                edtPassword.setSelection(edtPassword.getText().length());
            }
        });
    }

    final int INPUT_TYPE_VISIBLE_PASSWORD =
            InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;
    final int INPUT_TYPE_HIDDEN_PASSWORD =
            InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD;

    private boolean isPasswordVisible(EditText editText) {
        return editText.getInputType() == INPUT_TYPE_VISIBLE_PASSWORD;
    }

    private void enableInputVisiblePassword(EditText editText) {
        Typeface cache = editText.getTypeface();
        editText.setInputType(INPUT_TYPE_VISIBLE_PASSWORD);
        editText.setTypeface(cache);
    }

    private void enableInputHiddenPassword(EditText editText) {
        Typeface cache = editText.getTypeface();
        editText.setInputType(INPUT_TYPE_HIDDEN_PASSWORD);
        editText.setTypeface(cache);
    }
}
