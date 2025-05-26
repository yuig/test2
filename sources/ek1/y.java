package ek1;

/* loaded from: classes2.dex */
public final class y implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59396a;

    /* renamed from: b, reason: collision with root package name */
    public final long f59397b;

    public y(long j13, boolean z13) {
        this.f59396a = z13;
        this.f59397b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f59396a == yVar.f59396a && this.f59397b == yVar.f59397b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f59397b) + (Boolean.hashCode(this.f59396a) * 31);
    }

    public final boolean j() {
        return this.f59396a;
    }

    public final String toString() {
        return "OnMarkImpressionStart(isPinHalfVisible=" + this.f59396a + ", startTime=" + this.f59397b + ")";
    }
}
