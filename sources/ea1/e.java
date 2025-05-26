package ea1;

/* loaded from: classes5.dex */
public final class e implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58044a;

    public e(boolean z13) {
        this.f58044a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f58044a == ((e) obj).f58044a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58044a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("AutoOrgToggled(isEnabled="), this.f58044a, ")");
    }
}
