package n4;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f89177b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f89178a;

    public static final float a(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static final float b(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f89178a == ((g) obj).f89178a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89178a);
    }

    public final String toString() {
        long j13 = this.f89178a;
        if (j13 == y2.h.f136670b) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(b(j13))) + " x " + ((Object) e.b(a(j13)));
    }
}
