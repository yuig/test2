package ni1;

/* loaded from: classes2.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f90836a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90837b;

    public w2(boolean z13, boolean z14) {
        this.f90836a = z13;
        this.f90837b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return this.f90836a == w2Var.f90836a && this.f90837b == w2Var.f90837b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90837b) + (Boolean.hashCode(this.f90836a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdDebugConfig(isAdDebugRedTitleEnabledDCO=");
        sb3.append(this.f90836a);
        sb3.append(", isAdDebugRedTitleEnabledAmazonVideo=");
        return a.a.r(sb3, this.f90837b, ")");
    }
}
