package org.twuni.swipernoswiping;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setResult( RESULT_CANCELED );
		finish();
	}

}
