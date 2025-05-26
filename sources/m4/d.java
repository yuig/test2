package m4;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f85787a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public static String b(int i13) {
        return a(i13, 1) ? "Hyphens.None" : a(i13, 2) ? "Hyphens.Auto" : a(i13, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f85787a == ((d) obj).f85787a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85787a);
    }

    public final String toString() {
        return b(this.f85787a);
    }
}
