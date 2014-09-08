package de.example.einheitenumrechnergradfahrenheit;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	Button berechnenbutton;
	EditText eingabegrad;
	TextView ergebnisanzeige;
	double ergebnis;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		berechnenbutton = (Button)findViewById(R.id.button1);
		eingabegrad = (EditText)findViewById(R.id.editText1);
		ergebnisanzeige = (TextView)findViewById(R.id.textView2);
		berechnenbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (eingabegrad.length() == 0) {
					ergebnisanzeige.setText("Keine Eingabe erfolgt");
				} else {
					//Formel: Grad Celsius in Fahrenheit = ((Celsius *9)/5)+32
					ergebnis = ((Double.parseDouble(eingabegrad.getText().toString())*9) /5)+32;
					ergebnisanzeige.setText(eingabegrad.getText() + "  Grad Celsius sind"
							+ " umgerechnet " + Double.toString(ergebnis) + " Grad Fahrenheit");
				}
			}
		});
	}

}
