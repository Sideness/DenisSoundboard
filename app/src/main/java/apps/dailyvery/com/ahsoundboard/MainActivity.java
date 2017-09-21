package apps.dailyvery.com.ahsoundboard;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private String[] mSoundTx = {
            "ah","ah_re2",
            "ah_mi2","ah_fa2",
            "ah_sol2","ah_la2",
            "ah_si2","ah_do3",
            "ah_re3","ah_mi3",
            "ah_fa3","ah_sol3",
            "ah_la3","ah_si3"
    };

    private RelativeLayout do1, re, mi, fa, sol, la, si, do2, re2, mi2, fa2, sol2, la2, si2;
    private SoundPool soundPool;
    private int sdo1, sre, smi, sfa, ssol, sla, ssi, sdo2, sre2, smi2, sfa2, ssol2, sla2, ssi2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        do1 = (RelativeLayout) findViewById(R.id.ah_do);
        re = (RelativeLayout) findViewById(R.id.ah_re);
        mi = (RelativeLayout) findViewById(R.id.ah_mi);
        fa = (RelativeLayout) findViewById(R.id.ah_fa);
        sol = (RelativeLayout) findViewById(R.id.ah_sol);
        la = (RelativeLayout) findViewById(R.id.ah_la);
        si = (RelativeLayout) findViewById(R.id.ah_si);
        do2 = (RelativeLayout) findViewById(R.id.ah_do2);
        re2 = (RelativeLayout) findViewById(R.id.ah_re2);
        mi2 = (RelativeLayout) findViewById(R.id.ah_mi2);
        fa2 = (RelativeLayout) findViewById(R.id.ah_fa2);
        sol2 = (RelativeLayout) findViewById(R.id.ah_sol2);
        la2 = (RelativeLayout) findViewById(R.id.ah_la2);
        si2 = (RelativeLayout) findViewById(R.id.ah_si2);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }else{
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sdo1 = soundPool.load(this, R.raw.ah, 1);
        sre = soundPool.load(this, R.raw.ah_re2, 1);
        smi = soundPool.load(this, R.raw.ah_mi2, 1);
        sfa = soundPool.load(this, R.raw.ah_fa2, 1);
        ssol = soundPool.load(this, R.raw.ah_sol2, 1);
        sla = soundPool.load(this, R.raw.ah_la2, 1);
        ssi = soundPool.load(this, R.raw.ah_si2, 1);
        sdo2 = soundPool.load(this, R.raw.ah_do3, 1);
        sre2 = soundPool.load(this, R.raw.ah_re3, 1);
        smi2 = soundPool.load(this, R.raw.ah_mi3, 1);
        sfa2 = soundPool.load(this, R.raw.ah_fa3, 1);
        ssol2 = soundPool.load(this, R.raw.ah_sol3, 1);
        sla2 = soundPool.load(this, R.raw.ah_la3, 1);
        ssi2 = soundPool.load(this, R.raw.ah_si3, 1);

        do1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sdo1, 1, 1, 0, 0, 1);
            }
        });

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sre, 1, 1, 0, 0, 1);
            }
        });

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(smi, 1, 1, 0, 0, 1);
            }
        });

        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sfa, 1, 1, 0, 0, 1);
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(ssol, 1, 1, 0, 0, 1);
            }
        });

        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sla, 1, 1, 0, 0, 1);
            }
        });

        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(ssi, 1, 1, 0, 0, 1);
            }
        });

        do2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sdo2, 1, 1, 0, 0, 1);
            }
        });

        re2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sre2, 1, 1, 0, 0, 1);
            }
        });
        mi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(smi2, 1, 1, 0, 0, 1);
            }
        });
        fa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sfa2, 1, 1, 0, 0, 1);
            }
        });
        sol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(ssol2, 1, 1, 0, 0, 1);
            }
        });
        la2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sla2, 1, 1, 0, 0, 1);
            }
        });
        si2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(ssi2, 1, 1, 0, 0, 1);
            }
        });
    }
}
