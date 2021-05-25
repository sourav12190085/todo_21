package gcit.edu.todo_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView=findViewById(R.id.textView1);
    }
    public void startTask(View view){
        mTextView.setText("Nappinggg............");
        new SimpleAsyncTask(mTextView).execute();
    }
}