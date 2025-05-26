package h4;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f67609a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public static String b(int i13) {
        return a(i13, 0) ? "Unspecified" : a(i13, 1) ? "Text" : a(i13, 2) ? "Ascii" : a(i13, 3) ? "Number" : a(i13, 4) ? "Phone" : a(i13, 5) ? "Uri" : a(i13, 6) ? "Email" : a(i13, 7) ? "Password" : a(i13, 8) ? "NumberPassword" : a(i13, 9) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f67609a == ((s) obj).f67609a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67609a);
    }

    public final String toString() {
        return b(this.f67609a);
    }
}
