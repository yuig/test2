package ni1;

/* loaded from: classes2.dex */
public final class e1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f90648a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90649b;

    public e1(boolean z13, boolean z14) {
        this.f90648a = z13;
        this.f90649b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f90648a == e1Var.f90648a && this.f90649b == e1Var.f90649b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90649b) + (Boolean.hashCode(this.f90648a) * 31);
    }

    public final boolean j() {
        return this.f90649b;
    }

    public final boolean k() {
        return this.f90648a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoStateChanged(isVideoPlaying=");
        sb3.append(this.f90648a);
        sb3.append(", showAllIndicators=");
        return a.a.r(sb3, this.f90649b, ")");
    }
}
