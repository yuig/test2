package z3;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f140670a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public final /* synthetic */ int b() {
        return this.f140670a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f140670a == ((g) obj).f140670a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140670a);
    }

    public final String toString() {
        int i13 = this.f140670a;
        return a(i13, 0) ? "Button" : a(i13, 1) ? "Checkbox" : a(i13, 2) ? "Switch" : a(i13, 3) ? "RadioButton" : a(i13, 4) ? "Tab" : a(i13, 5) ? "Image" : a(i13, 6) ? "DropdownList" : "Unknown";
    }
}
