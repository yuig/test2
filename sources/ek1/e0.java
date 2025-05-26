package ek1;

/* loaded from: classes2.dex */
public final class e0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59229a;

    public e0(boolean z13) {
        this.f59229a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.f59229a == ((e0) obj).f59229a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59229a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateImpressionWithMrcBtrThresholdsReached(isMrcBtrObserved="), this.f59229a, ")");
    }
}
