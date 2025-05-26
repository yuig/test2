package b3;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21318b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21319a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return this.f21319a == ((g0) obj).f21319a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21319a);
    }

    public final String toString() {
        int i13 = this.f21319a;
        return a(i13, 0) ? "Argb8888" : a(i13, 1) ? "Alpha8" : a(i13, 2) ? "Rgb565" : a(i13, 3) ? "F16" : a(i13, 4) ? "Gpu" : "Unknown";
    }
}
