package y31;

/* loaded from: classes5.dex */
public final class t implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136856a;

    public t(boolean z13) {
        this.f136856a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f136856a == ((t) obj).f136856a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136856a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("AvatarTapped(hasQuikkly="), this.f136856a, ")");
    }
}
