package m62;

/* loaded from: classes4.dex */
public final class a1 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f85955a;

    public a1(float f13) {
        this.f85955a = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Float.compare(this.f85955a, ((a1) obj).f85955a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f85955a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("ValueChanged(value="), this.f85955a, ")");
    }
}
