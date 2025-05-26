package ns;

/* loaded from: classes3.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91905a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f91906b;

    public d(boolean z13, boolean z14) {
        this.f91905a = z13;
        this.f91906b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f91905a == dVar.f91905a && this.f91906b == dVar.f91906b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91906b) + (Boolean.hashCode(this.f91905a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UpdateSearchBar(isTransparent=");
        sb3.append(this.f91905a);
        sb3.append(", shouldAnimate=");
        return a.a.r(sb3, this.f91906b, ")");
    }
}
