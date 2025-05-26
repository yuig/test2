package gk1;

/* loaded from: classes2.dex */
public final class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65215a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65216b;

    public b0(boolean z13, boolean z14) {
        this.f65215a = z13;
        this.f65216b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f65215a == b0Var.f65215a && this.f65216b == b0Var.f65216b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65216b) + (Boolean.hashCode(this.f65215a) * 31);
    }

    public final boolean j() {
        return this.f65215a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoStateChanged(isVideoPlaying=");
        sb3.append(this.f65215a);
        sb3.append(", showAllIndicators=");
        return a.a.r(sb3, this.f65216b, ")");
    }
}
