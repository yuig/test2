package nv;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92345a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92346b;

    public c(boolean z13, boolean z14) {
        this.f92345a = z13;
        this.f92346b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f92345a == cVar.f92345a && this.f92346b == cVar.f92346b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92346b) + (Boolean.hashCode(this.f92345a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinValidationContext(isInAdsOnlyModule=");
        sb3.append(this.f92345a);
        sb3.append(", isInStlModule=");
        return a.a.r(sb3, this.f92346b, ")");
    }
}
