package e7;

import a7.m0;

/* loaded from: classes3.dex */
public final class f implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f57531a;

    /* renamed from: b, reason: collision with root package name */
    public final float f57532b;

    public f(float f13, float f14) {
        bf.b.h("Invalid latitude or longitude", f13 >= -90.0f && f13 <= 90.0f && f14 >= -180.0f && f14 <= 180.0f);
        this.f57531a = f13;
        this.f57532b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f57531a == fVar.f57531a && this.f57532b == fVar.f57532b;
    }

    public final int hashCode() {
        return Float.valueOf(this.f57532b).hashCode() + ((Float.valueOf(this.f57531a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f57531a + ", longitude=" + this.f57532b;
    }
}
