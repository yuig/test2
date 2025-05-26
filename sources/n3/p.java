package n3;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f89106a;

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static String b(long j13) {
        return "PointerId(value=" + j13 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f89106a == ((p) obj).f89106a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89106a);
    }

    public final String toString() {
        return b(this.f89106a);
    }
}
