package edu.osu.cse694;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					// TODO use the login activity or whateva
					// Intent openLogin = new
					// Intent("edu.osu.dailey.TUTORIALACTIVITY");
					// startActivity(openLogin);
				}
			}
		};
		timer.start();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO go to login activity
		return super.onTouchEvent(event);
		// Intent openLogin = new
		// Intent("edu.osu.dailey.TUTORIALACTIVITY");
		// startActivity(openLogin);
	}

	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}

}
