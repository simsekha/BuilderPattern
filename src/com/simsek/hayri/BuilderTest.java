package com.simsek.hayri;

import com.simsek.hayri.model.Calzone;
import com.simsek.hayri.model.NyPizza;
import static com.simsek.hayri.abstracts.Pizza.Topping.ONION;
import static com.simsek.hayri.abstracts.Pizza.Topping.SAUSAGE;
import static com.simsek.hayri.abstracts.Pizza.Topping.HAM;

import static com.simsek.hayri.model.NyPizza.Size.SMALL;


public class BuilderTest {

	public static void main(String[] args) {
		NyPizza pizza=new NyPizza.Builder(SMALL)
				.addTopping(SAUSAGE)
				.addTopping(ONION)
				.build();
		Calzone calzone=new Calzone.Builder()
				.addTopping(HAM)
				.sauceInside()
				.build();
	}

}
