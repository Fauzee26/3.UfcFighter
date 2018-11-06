package fauzi.hilmy.ufcfighter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import fauzi.hilmy.ufcfighter.model.ResponseFighter;

public class DetailActivity extends AppCompatActivity {

    public static String EXTRA_FIGHTER = "fighter";
    ResponseFighter fighter;
    @BindView(R.id.imgFighter)
    ImageView imgFighter;
    @BindView(R.id.txtNama)
    TextView txtNama;
    @BindView(R.id.txtWins)
    TextView txtWins;
    @BindView(R.id.txtDraw)
    TextView txtDraw;
    @BindView(R.id.txtLose)
    TextView txtLose;
    @BindView(R.id.txt_weight)
    TextView txtWeight;
    @BindView(R.id.imgActiveNotFighting)
    ImageView imgActiveNotFighting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fighter = getIntent().getParcelableExtra(EXTRA_FIGHTER);

        Picasso.get()
                .load(fighter.getProfileImage())
                .fit()
                .into(imgFighter);
        txtNama.setText(fighter.getFirstName() + " " + fighter.getLastName());
        txtWins.setText(String.valueOf(fighter.getWins()));
        txtDraw.setText(String.valueOf(fighter.getDraws()));
        txtLose.setText(String.valueOf(fighter.getLosses()));
        txtWeight.setText(fighter.getWeightClass());

        if (fighter.getFighterStatus().equals("Active")) {
            imgActiveNotFighting.setImageResource(R.drawable.active);
        } else {
            imgActiveNotFighting.setImageResource(R.drawable.notfighting);
        }
    }
}
