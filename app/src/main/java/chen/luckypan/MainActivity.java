package chen.luckypan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private LuckyPanView mLuckyPanView;
    private ImageView iv_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLuckyPanView = (LuckyPanView) findViewById(R.id.surface_pan);
        iv_go = (ImageView) findViewById(R.id.iv_go);

        iv_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mLuckyPanView.isStart()) {
                    mLuckyPanView.luckyStart(1);
                    iv_go.setImageResource(R.drawable.stop);
                } else {
                    if (!mLuckyPanView.isShouldEnd()) {
                        mLuckyPanView.luckyEnd();
                        iv_go.setImageResource(R.drawable.start);
                    }
                }
            }
        });

    }
}
