package s90;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112019a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f112020b;

    public s0(boolean z13, boolean z14) {
        this.f112019a = z13;
        this.f112020b = z14;
    }

    public static s0 a(s0 s0Var, boolean z13, boolean z14, int i13) {
        if ((i13 & 1) != 0) {
            z13 = s0Var.f112019a;
        }
        if ((i13 & 2) != 0) {
            z14 = s0Var.f112020b;
        }
        s0Var.getClass();
        return new s0(z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f112019a == s0Var.f112019a && this.f112020b == s0Var.f112020b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112020b) + (Boolean.hashCode(this.f112019a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CutoutToolbarButtonState(enabled=");
        sb3.append(this.f112019a);
        sb3.append(", visible=");
        return a.a.r(sb3, this.f112020b, ")");
    }
}
