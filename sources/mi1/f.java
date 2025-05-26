package mi1;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87218a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87219b;

    public f(boolean z13, boolean z14) {
        this.f87218a = z13;
        this.f87219b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f87218a == fVar.f87218a && this.f87219b == fVar.f87219b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87219b) + (Boolean.hashCode(this.f87218a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PGCUserFunctionsXP(isEuDisclosure=");
        sb3.append(this.f87218a);
        sb3.append(", isAdsVMBadgeEnabled=");
        return a.a.r(sb3, this.f87219b, ")");
    }
}
