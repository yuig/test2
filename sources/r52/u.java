package r52;

/* loaded from: classes4.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f106300a;

    public u(int i13) {
        this.f106300a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f106300a == ((u) obj).f106300a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106300a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ShowLimitReachedToast(pinCount="), this.f106300a, ")");
    }
}
