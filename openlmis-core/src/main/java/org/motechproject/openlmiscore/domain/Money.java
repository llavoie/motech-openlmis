package org.motechproject.openlmiscore.domain;

import java.math.BigDecimal;
import static java.math.BigDecimal.ROUND_HALF_UP;

public class Money extends Number {

    private BigDecimal value;

    public Money(String value) {
        this.value = new BigDecimal(value).setScale(2, ROUND_HALF_UP);
    }

    public Money(BigDecimal value) {
        this(value.toString());
    }

    public Money multiply(BigDecimal decimal) {
        return new Money(value.multiply(decimal));
    }

    public boolean isNegative() {
        return value.signum() < 0;
    }

    public Money add(Money other) {
        return new Money(value.add(other.value));
    }

    public Integer compareTo(Money other) {
        return value.compareTo(other.value);
    }

    public BigDecimal toDecimal() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int intValue() {
        return value.toBigInteger().intValue();
    }

    @Override
    public long longValue() {
        return value.toBigInteger().longValue();
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value.doubleValue();
    }
}
