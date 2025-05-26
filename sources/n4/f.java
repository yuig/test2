package n4;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f89176a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f89176a == ((f) obj).f89176a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89176a);
    }

    public final String toString() {
        long j13 = this.f89176a;
        if (j13 == y2.h.f136670b) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.b(Float.intBitsToFloat((int) (j13 >> 32)))) + ", " + ((Object) e.b(Float.intBitsToFloat((int) (j13 & 4294967295L)))) + ')';
    }
}
