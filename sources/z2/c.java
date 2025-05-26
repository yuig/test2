package z2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f140608a;

    public /* synthetic */ c(int i13) {
        this.f140608a = i13;
    }

    public static final /* synthetic */ c a(int i13) {
        return new c(i13);
    }

    public static final boolean b(int i13, int i14) {
        return i13 == i14;
    }

    public static String c(int i13) {
        return b(i13, 1) ? "Next" : b(i13, 2) ? "Previous" : b(i13, 3) ? "Left" : b(i13, 4) ? "Right" : b(i13, 5) ? "Up" : b(i13, 6) ? "Down" : b(i13, 7) ? "Enter" : b(i13, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final /* synthetic */ int d() {
        return this.f140608a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f140608a == ((c) obj).f140608a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140608a);
    }

    public final String toString() {
        return c(this.f140608a);
    }
}
