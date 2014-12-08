package io.github.webones.cosmonauta.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import io.github.webones.cosmonauta.CosmonautaGame;
import io.github.webones.cosmonauta.views.GameScreen;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
//		((Object) config).useAccelerometer(true);
		initialize(new GameScreen(), config);
	}
}
