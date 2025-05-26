package nm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v extends s {

    /* renamed from: a */
    public final Serializable f91367a;

    public v(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f91367a = bool;
    }

    public static boolean s(v vVar) {
        Serializable serializable = vVar.f91367a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // nm.s
    public final boolean b() {
        Serializable serializable = this.f91367a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(p());
    }

    @Override // nm.s
    public final double c() {
        return this.f91367a instanceof Number ? n().doubleValue() : Double.parseDouble(p());
    }

    @Override // nm.s
    public final float d() {
        return this.f91367a instanceof Number ? n().floatValue() : Float.parseFloat(p());
    }

    @Override // nm.s
    public final int e() {
        return this.f91367a instanceof Number ? n().intValue() : Integer.parseInt(p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        Serializable serializable = this.f91367a;
        Serializable serializable2 = vVar.f91367a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (s(this) && s(vVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? r().equals(vVar.r()) : n().longValue() == vVar.n().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : bs1.c.x1(p())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : bs1.c.x1(vVar.p())) == 0;
        }
        double c13 = c();
        double c14 = vVar.c();
        if (c13 != c14) {
            return Double.isNaN(c13) && Double.isNaN(c14);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f91367a;
        if (serializable == null) {
            return 31;
        }
        if (s(this)) {
            doubleToLongBits = n().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(n().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // nm.s
    public final long l() {
        return this.f91367a instanceof Number ? n().longValue() : Long.parseLong(p());
    }

    @Override // nm.s
    public final Number n() {
        Serializable serializable = this.f91367a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new pm.j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // nm.s
    public final String p() {
        Serializable serializable = this.f91367a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return n().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger r() {
        Serializable serializable = this.f91367a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (s(this)) {
            return BigInteger.valueOf(n().longValue());
        }
        String p13 = p();
        bs1.c.w(p13);
        return new BigInteger(p13);
    }

    public v(Number number) {
        Objects.requireNonNull(number);
        this.f91367a = number;
    }

    public v(String str) {
        Objects.requireNonNull(str);
        this.f91367a = str;
    }
}
