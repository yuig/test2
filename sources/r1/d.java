package r1;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f105872a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f105872a == ((d) obj).f105872a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f105872a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f105872a + ')';
    }
}
