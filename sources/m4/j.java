package m4;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f85797a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public static String b(int i13) {
        return a(i13, 1) ? "Left" : a(i13, 2) ? "Right" : a(i13, 3) ? "Center" : a(i13, 4) ? "Justify" : a(i13, 5) ? "Start" : a(i13, 6) ? "End" : a(i13, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f85797a == ((j) obj).f85797a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85797a);
    }

    public final String toString() {
        return b(this.f85797a);
    }
}
