package m62;

/* loaded from: classes4.dex */
public final class w0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f86062a;

    public w0(float f13) {
        this.f86062a = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && Float.compare(this.f86062a, ((w0) obj).f86062a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f86062a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("TextSizeChanged(value="), this.f86062a, ")");
    }
}
