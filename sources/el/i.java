package el;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class i extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f59493a;

    public i(String str) {
        this.f59493a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new NotSerializableException("serialization is not supported");
    }

    private Object writeReplace() {
        throw new NotSerializableException("serialization is not supported");
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f59493a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f59493a.equals(((i) obj).f59493a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f59493a);
    }

    public final int hashCode() {
        return this.f59493a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f59493a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f59493a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f59493a;
    }
}
