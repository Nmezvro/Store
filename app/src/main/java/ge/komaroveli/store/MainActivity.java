package ge.komaroveli.store;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		
		View.OnClickListener onClick = new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Snackbar snackbar = Snackbar.make(view, ((TextView) view).getText(), Snackbar.LENGTH_LONG);
				snackbar.show();
			}
		};
		View.OnClickListener onClickTravelLayout = new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Snackbar snackbar = Snackbar.make(view, "Travel & Local", Snackbar.LENGTH_LONG);
				snackbar.show();
			}
		};
		View.OnClickListener onClickSimilar = new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Snackbar snackbar = Snackbar.make(view, "Similar", Snackbar.LENGTH_LONG);
				snackbar.show();
			}
		};
		
		
		Button btnUninstall = (Button) findViewById(R.id.btnUninstall);
		Button btnOpen = (Button) findViewById(R.id.btnOpen);
		LinearLayout travel = (LinearLayout) findViewById(R.id.travel);
		LinearLayout similar = (LinearLayout) findViewById(R.id.similar);
		
		btnOpen.setOnClickListener(onClick);
		btnUninstall.setOnClickListener(onClick);
		travel.setOnClickListener(onClickTravelLayout);
		similar.setOnClickListener(onClickSimilar);
		
		
		RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
		ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
		{
			@Override
			public void onRatingChanged(RatingBar ratingBar, float v, boolean b)
			{
				TextView tw_raiting = (TextView) findViewById(R.id.tw_raiting);
				tw_raiting.setText(Float.toString(v));
			}
		});
	}
}