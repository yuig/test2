package s80;

/* loaded from: classes5.dex */
public final class d7 implements e7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f111504a = 0.92f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7) && Float.compare(this.f111504a, ((d7) obj).f111504a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f111504a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("FadeAndScale(initialScale="), this.f111504a, ")");
    }
}
