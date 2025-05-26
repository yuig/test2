package n4;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f89186a;

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static final int b(long j13) {
        return (int) (j13 & 4294967295L);
    }

    public static final int c(long j13) {
        return (int) (j13 >> 32);
    }

    public static String d(long j13) {
        return ((int) (j13 >> 32)) + " x " + ((int) (j13 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f89186a == ((j) obj).f89186a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89186a);
    }

    public final String toString() {
        return d(this.f89186a);
    }
}
