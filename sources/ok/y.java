package ok;

/* loaded from: classes3.dex */
public final class y extends v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f95446a;

    public y(Object obj) {
        this.f95446a = obj;
    }

    @Override // ok.v
    public final Object b() {
        return this.f95446a;
    }

    @Override // ok.v
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f95446a.equals(((y) obj).f95446a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f95446a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f95446a + ")";
    }
}
