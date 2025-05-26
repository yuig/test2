package c61;

/* loaded from: classes5.dex */
public final class r implements y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26636a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26637b;

    public r(boolean z13, boolean z14) {
        this.f26636a = z13;
        this.f26637b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f26636a == rVar.f26636a && this.f26637b == rVar.f26637b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26637b) + (Boolean.hashCode(this.f26636a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UpdateSearchBar(isTransparent=");
        sb3.append(this.f26636a);
        sb3.append(", shouldAnimate=");
        return a.a.r(sb3, this.f26637b, ")");
    }
}
