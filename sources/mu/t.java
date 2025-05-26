package mu;

/* loaded from: classes3.dex */
public final class t implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88242a;

    public t(boolean z13) {
        this.f88242a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f88242a == ((t) obj).f88242a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(this.f88242a) * 31);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateBottomNavState(shouldShow="), this.f88242a, ", shouldAnimate=true)");
    }
}
