package k3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f78222a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f78222a == ((a) obj).f78222a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78222a);
    }

    public final String toString() {
        int i13 = this.f78222a;
        return i13 == 1 ? "Touch" : i13 == 2 ? "Keyboard" : "Error";
    }
}
