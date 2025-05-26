package pb;

import a.cb;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99416a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f99418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f99419d;

    public h(boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f99416a = z13;
        this.f99417b = z14;
        this.f99418c = z15;
        this.f99419d = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f99416a == hVar.f99416a && this.f99417b == hVar.f99417b && this.f99418c == hVar.f99418c && this.f99419d == hVar.f99419d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99419d) + ep.b.e(this.f99418c, ep.b.e(this.f99417b, Boolean.hashCode(this.f99416a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NetworkState(isConnected=");
        sb3.append(this.f99416a);
        sb3.append(", isValidated=");
        sb3.append(this.f99417b);
        sb3.append(", isMetered=");
        sb3.append(this.f99418c);
        sb3.append(", isNotRoaming=");
        return cb.m(sb3, this.f99419d, ')');
    }
}
