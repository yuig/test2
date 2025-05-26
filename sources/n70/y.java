package n70;

/* loaded from: classes5.dex */
public final class y implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f89701a;

    public y(boolean z13) {
        this.f89701a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f89701a == ((y) obj).f89701a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.f89701a) * 31);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateBottomNavState(shouldShow="), this.f89701a, ", shouldAnimate=false)");
    }
}
