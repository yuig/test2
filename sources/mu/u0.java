package mu;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88245a;

    public u0(boolean z13) {
        this.f88245a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && this.f88245a == ((u0) obj).f88245a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88245a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("ToolbarDisplayState(shouldShowMusicAttribution="), this.f88245a, ")");
    }
}
