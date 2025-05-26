package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends s {

    /* renamed from: b, reason: collision with root package name */
    public final String f106583b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106584c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106585d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106586e;

    /* renamed from: f, reason: collision with root package name */
    public final float f106587f;

    /* renamed from: g, reason: collision with root package name */
    public final float f106588g;

    /* renamed from: h, reason: collision with root package name */
    public final float f106589h;

    /* renamed from: i, reason: collision with root package name */
    public final float f106590i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f106591j;

    /* renamed from: k, reason: collision with root package name */
    public final float f106592k;

    /* renamed from: l, reason: collision with root package name */
    public final float f106593l;

    public o(String type, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z13, float f23, float f24) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f106583b = type;
        this.f106584c = f13;
        this.f106585d = f14;
        this.f106586e = f15;
        this.f106587f = f16;
        this.f106588g = f17;
        this.f106589h = f18;
        this.f106590i = f19;
        this.f106591j = z13;
        this.f106592k = f23;
        this.f106593l = f24;
    }

    @Override // r72.j0
    public final String a() {
        String value = this.f106583b;
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public final q b() {
        for (q qVar : q.values()) {
            if (Intrinsics.d(qVar.getType(), this.f106583b)) {
                return qVar;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f106583b, oVar.f106583b) && Float.compare(this.f106584c, oVar.f106584c) == 0 && Float.compare(this.f106585d, oVar.f106585d) == 0 && Float.compare(this.f106586e, oVar.f106586e) == 0 && Float.compare(this.f106587f, oVar.f106587f) == 0 && Float.compare(this.f106588g, oVar.f106588g) == 0 && Float.compare(this.f106589h, oVar.f106589h) == 0 && Float.compare(this.f106590i, oVar.f106590i) == 0 && this.f106591j == oVar.f106591j && Float.compare(this.f106592k, oVar.f106592k) == 0 && Float.compare(this.f106593l, oVar.f106593l) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106593l) + a.a.a(this.f106592k, ep.b.e(this.f106591j, a.a.a(this.f106590i, a.a.a(this.f106589h, a.a.a(this.f106588g, a.a.a(this.f106587f, a.a.a(this.f106586e, a.a.a(this.f106585d, a.a.a(this.f106584c, this.f106583b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // r72.j0
    public final String toString() {
        String type;
        q b13 = b();
        return (b13 == null || (type = b13.getType()) == null) ? "unknown" : type;
    }
}
