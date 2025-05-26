package m4;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f85783a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f85783a, ((a) obj).f85783a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f85783a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f85783a + ')';
    }
}
