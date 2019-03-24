package com.simsek.hayri.abstracts;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
	public enum Topping {
		HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
	}

	final Set<Topping> toppings;

	public abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}

		public abstract Pizza build();

		protected abstract T self();
	}

	protected Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();

	}
}
