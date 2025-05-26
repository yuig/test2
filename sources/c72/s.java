package c72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26922a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26923b;

    /* renamed from: c, reason: collision with root package name */
    public final double f26924c;

    /* renamed from: d, reason: collision with root package name */
    public final r72.n f26925d;

    public /* synthetic */ s(r72.l lVar) {
        this(true, false, 1.25d, lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f26922a == sVar.f26922a && this.f26923b == sVar.f26923b && Double.compare(this.f26924c, sVar.f26924c) == 0 && Intrinsics.d(this.f26925d, sVar.f26925d);
    }

    public final int hashCode() {
        int a13 = a.c.a(this.f26924c, ep.b.e(this.f26923b, Boolean.hashCode(this.f26922a) * 31, 31), 31);
        r72.n nVar = this.f26925d;
        return a13 + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "MapShuffleItemConfig(ignoreOffset=" + this.f26922a + ", ignoreRotation=" + this.f26923b + ", scale=" + this.f26924c + ", borderEffect=" + this.f26925d + ")";
    }

    public s(boolean z13, boolean z14, double d2, r72.n nVar) {
        this.f26922a = z13;
        this.f26923b = z14;
        this.f26924c = d2;
        this.f26925d = nVar;
    }
}
