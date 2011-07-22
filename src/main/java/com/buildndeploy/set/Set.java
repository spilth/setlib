package com.buildndeploy.set;

public class Set {
	private Card first, second, third;
	
	public Set(Card first, Card second, Card third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public Card getFirst() {
		return first;
	}

	public Card getSecond() {
		return second;
	}

	public Card getThird() {
		return third;
	}

	public String toString() {
		return new StringBuffer().append(first).append(",").append(second).append(",").append(third).toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		result = prime * result + ((third == null) ? 0 : third.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Set other = (Set) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		if (third == null) {
			if (other.third != null)
				return false;
		} else if (!third.equals(other.third))
			return false;
		return true;
	}
	
}
