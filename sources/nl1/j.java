package nl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final a3.d f91305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f91306b;

    /* renamed from: c, reason: collision with root package name */
    public final float f91307c;

    /* renamed from: d, reason: collision with root package name */
    public final float f91308d;

    public j(a3.d visibleRect, long j13, float f13, float f14) {
        Intrinsics.checkNotNullParameter(visibleRect, "visibleRect");
        this.f91305a = visibleRect;
        this.f91306b = j13;
        this.f91307c = f13;
        this.f91308d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f91305a, jVar.f91305a) && n4.j.a(this.f91306b, jVar.f91306b) && Float.compare(this.f91307c, jVar.f91307c) == 0 && Float.compare(this.f91308d, jVar.f91308d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f91308d) + a.a.a(this.f91307c, a.a.c(this.f91306b, this.f91305a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Visible(visibleRect=" + this.f91305a + ", size=" + n4.j.d(this.f91306b) + ", fractionVisibleWidth=" + this.f91307c + ", fractionVisibleHeight=" + this.f91308d + ")";
    }
}
