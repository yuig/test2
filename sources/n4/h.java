package n4;

import a.cb;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f89179b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f89180a;

    public /* synthetic */ h(long j13) {
        this.f89180a = j13;
    }

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static final long b(long j13, long j14) {
        return ((((int) (j13 >> 32)) - ((int) (j14 >> 32))) << 32) | ((((int) (j13 & 4294967295L)) - ((int) (j14 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j13, long j14) {
        return ((((int) (j13 >> 32)) + ((int) (j14 >> 32))) << 32) | ((((int) (j13 & 4294967295L)) + ((int) (j14 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j13) {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append((int) (j13 >> 32));
        sb3.append(", ");
        return cb.l(sb3, (int) (j13 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f89180a == ((h) obj).f89180a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89180a);
    }

    public final String toString() {
        return d(this.f89180a);
    }
}
