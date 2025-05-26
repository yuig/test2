package n4;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f89191b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f89192a;

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static String b(long j13) {
        return a(j13, 0L) ? "Unspecified" : a(j13, 4294967296L) ? "Sp" : a(j13, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f89192a == ((n) obj).f89192a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89192a);
    }

    public final String toString() {
        return b(this.f89192a);
    }
}
