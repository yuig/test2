package b4;

import a.cb;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f21639b = b7.c.h(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21640c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f21641a;

    public /* synthetic */ p0(long j13) {
        this.f21641a = j13;
    }

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static final boolean b(long j13) {
        return ((int) (j13 >> 32)) == ((int) (j13 & 4294967295L));
    }

    public static final int c(long j13) {
        return d(j13) - e(j13);
    }

    public static final int d(long j13) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        return i13 > i14 ? i13 : i14;
    }

    public static final int e(long j13) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        return i13 > i14 ? i14 : i13;
    }

    public static final boolean f(long j13) {
        return ((int) (j13 >> 32)) > ((int) (j13 & 4294967295L));
    }

    public static String g(long j13) {
        StringBuilder sb3 = new StringBuilder("TextRange(");
        sb3.append((int) (j13 >> 32));
        sb3.append(", ");
        return cb.l(sb3, (int) (j13 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f21641a == ((p0) obj).f21641a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21641a);
    }

    public final String toString() {
        return g(this.f21641a);
    }
}
