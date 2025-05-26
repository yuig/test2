package y01;

/* loaded from: classes5.dex */
public final class q0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136474a;

    public q0(boolean z13) {
        this.f136474a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.f136474a == ((q0) obj).f136474a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136474a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnMaybeShowScreenshotUpsell(willShowEducation="), this.f136474a, ")");
    }
}
