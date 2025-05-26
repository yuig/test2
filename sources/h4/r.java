package h4;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f67608a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public static String b(int i13) {
        return a(i13, -1) ? "Unspecified" : a(i13, 0) ? "None" : a(i13, 1) ? "Characters" : a(i13, 2) ? "Words" : a(i13, 3) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f67608a == ((r) obj).f67608a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67608a);
    }

    public final String toString() {
        return b(this.f67608a);
    }
}
