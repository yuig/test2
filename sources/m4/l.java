package m4;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f85802a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public static String b(int i13) {
        return a(i13, 1) ? "Ltr" : a(i13, 2) ? "Rtl" : a(i13, 3) ? "Content" : a(i13, 4) ? "ContentOrLtr" : a(i13, 5) ? "ContentOrRtl" : a(i13, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f85802a == ((l) obj).f85802a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85802a);
    }

    public final String toString() {
        return b(this.f85802a);
    }
}
