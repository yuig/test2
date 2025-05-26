package g4;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f63466a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public static String b(int i13) {
        return a(i13, 0) ? "None" : a(i13, 1) ? "All" : a(i13, 2) ? "Weight" : a(i13, 3) ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f63466a == ((k) obj).f63466a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63466a);
    }

    public final String toString() {
        return b(this.f63466a);
    }
}
