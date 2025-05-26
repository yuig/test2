package pm;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes.dex */
public final class j extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f100598a;

    public j(String str) {
        this.f100598a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return bs1.c.x1(this.f100598a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f100598a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f100598a.equals(((j) obj).f100598a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f100598a);
    }

    public final int hashCode() {
        return this.f100598a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f100598a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return bs1.c.x1(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f100598a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return bs1.c.x1(str).longValue();
        }
    }

    public final String toString() {
        return this.f100598a;
    }
}
