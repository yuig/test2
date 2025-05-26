package f2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final v1.a f60855a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.a f60856b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.a f60857c;

    /* renamed from: d, reason: collision with root package name */
    public final v1.a f60858d;

    /* renamed from: e, reason: collision with root package name */
    public final v1.a f60859e;

    public h() {
        v1.h hVar = g.f60850a;
        v1.h hVar2 = g.f60851b;
        v1.h hVar3 = g.f60852c;
        v1.h hVar4 = g.f60853d;
        v1.h hVar5 = g.f60854e;
        this.f60855a = hVar;
        this.f60856b = hVar2;
        this.f60857c = hVar3;
        this.f60858d = hVar4;
        this.f60859e = hVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f60855a, hVar.f60855a) && Intrinsics.d(this.f60856b, hVar.f60856b) && Intrinsics.d(this.f60857c, hVar.f60857c) && Intrinsics.d(this.f60858d, hVar.f60858d) && Intrinsics.d(this.f60859e, hVar.f60859e);
    }

    public final int hashCode() {
        return this.f60859e.hashCode() + ((this.f60858d.hashCode() + ((this.f60857c.hashCode() + ((this.f60856b.hashCode() + (this.f60855a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f60855a + ", small=" + this.f60856b + ", medium=" + this.f60857c + ", large=" + this.f60858d + ", extraLarge=" + this.f60859e + ')';
    }
}
