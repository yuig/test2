package h4;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f67594a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public static String b(int i13) {
        return a(i13, -1) ? "Unspecified" : a(i13, 0) ? "None" : a(i13, 1) ? "Default" : a(i13, 2) ? "Go" : a(i13, 3) ? "Search" : a(i13, 4) ? "Send" : a(i13, 5) ? "Previous" : a(i13, 6) ? "Next" : a(i13, 7) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f67594a == ((n) obj).f67594a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67594a);
    }

    public final String toString() {
        return b(this.f67594a);
    }
}
