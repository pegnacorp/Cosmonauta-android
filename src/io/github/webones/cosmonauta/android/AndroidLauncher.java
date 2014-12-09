package io.github.webones.cosmonauta.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import io.github.webones.cosmonauta.Cosmonauta;
import io.github.webones.cosmonauta.CosmonautaGame;
import io.github.webones.cosmonauta.views.GameScreen;
import io.github.webones.cosmonauta.views.IntroScreen;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
//		initialize(new GameScreen(), config);
		initialize(new Cosmonauta(), config);
	}
}
