package apps.dailyvery.com.denissoundboard;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private static Context context;
    private static final float ROTATE_FROM = 0.0f;
    private static final float ROTATE_TO = -3.0f * 360.0f;// 3.141592654f * 32.0f;
    private String[] mSoundTx = {
            "ah","ah_re2",
            "ah_mi2","ah_fa2",
            "ah_sol2","ah_la2",
            "ah_si2","ah_do3",
            "ah_re3","ah_mi3",
            "ah_fa3","ah_sol3",
            "ah_la3","ah_si3"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.context = getApplicationContext();

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(MainActivity.this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    final int position, long id) {
                try {
                    String pos = mSoundTx[position];
                    final MediaPlayer mPlayer = MediaPlayer.create(context, getResources().getIdentifier(pos, "raw", "apps.dailyvery.com.denissoundboard"));
                    mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    mPlayer.start();

                    RotateAnimation r = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    r.setDuration((long) 2 * 1500);
                    //gridview.getAdapter().getView(position, this, this);
                    gridview.getChildAt(position - gridview.getFirstVisiblePosition()).findViewById(R.id.icon_image).startAnimation(r);
                    //.startAnimation(r);
                    mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                } catch (Exception e) {
                    Log.e(e.getMessage().toString(), e.getMessage().toString());
                }

            }
        });
    }
}
