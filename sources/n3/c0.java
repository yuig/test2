package n3;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f89040a;

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f89040a == ((c0) obj).f89040a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89040a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f89040a + ')';
    }
}
