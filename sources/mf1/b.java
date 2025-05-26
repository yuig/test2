package mf1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87130a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87131b;

    public b(boolean z13, int i13) {
        z13 = (i13 & 2) != 0 ? false : z13;
        this.f87130a = false;
        this.f87131b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f87130a == bVar.f87130a && this.f87131b == bVar.f87131b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87131b) + (Boolean.hashCode(this.f87130a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPinTypeInfo(isNativeVideoPin=");
        sb3.append(this.f87130a);
        sb3.append(", isPromotedPin=");
        return a.a.r(sb3, this.f87131b, ")");
    }
}
