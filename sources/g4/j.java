package g4;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f63465a;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f63465a == ((j) obj).f63465a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63465a);
    }

    public final String toString() {
        int i13 = this.f63465a;
        return a(i13, 0) ? "Normal" : a(i13, 1) ? "Italic" : "Invalid";
    }
}
