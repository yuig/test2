package z3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f140665a = 0;

    public static final boolean a(int i13, int i14) {
        return i13 == i14;
    }

    public final /* synthetic */ int b() {
        return this.f140665a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f140665a == ((e) obj).f140665a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140665a);
    }

    public final String toString() {
        int i13 = this.f140665a;
        return a(i13, 0) ? "Polite" : a(i13, 1) ? "Assertive" : "Unknown";
    }
}
