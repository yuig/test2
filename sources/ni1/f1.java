package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90669b;

    /* renamed from: c, reason: collision with root package name */
    public final si1.a f90670c;

    /* renamed from: d, reason: collision with root package name */
    public final si1.a f90671d;

    /* renamed from: e, reason: collision with root package name */
    public final si1.a f90672e;

    /* renamed from: f, reason: collision with root package name */
    public final si1.a f90673f;

    /* renamed from: g, reason: collision with root package name */
    public final si1.a f90674g;

    /* renamed from: h, reason: collision with root package name */
    public final int f90675h;

    /* renamed from: i, reason: collision with root package name */
    public final int f90676i;

    /* renamed from: j, reason: collision with root package name */
    public final int f90677j;

    /* renamed from: k, reason: collision with root package name */
    public final int f90678k;

    /* renamed from: l, reason: collision with root package name */
    public final int f90679l;

    /* renamed from: m, reason: collision with root package name */
    public final long f90680m;

    public f1(int i13, int i14, si1.a aVar, si1.a aVar2, si1.a aVar3, si1.a globalVisiblePinRect, si1.a pinDrawableRect, int i15, int i16, int i17, int i18, int i19, long j13) {
        Intrinsics.checkNotNullParameter(globalVisiblePinRect, "globalVisiblePinRect");
        Intrinsics.checkNotNullParameter(pinDrawableRect, "pinDrawableRect");
        this.f90668a = i13;
        this.f90669b = i14;
        this.f90670c = aVar;
        this.f90671d = aVar2;
        this.f90672e = aVar3;
        this.f90673f = globalVisiblePinRect;
        this.f90674g = pinDrawableRect;
        this.f90675h = i15;
        this.f90676i = i16;
        this.f90677j = i17;
        this.f90678k = i18;
        this.f90679l = i19;
        this.f90680m = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f90668a == f1Var.f90668a && this.f90669b == f1Var.f90669b && Intrinsics.d(this.f90670c, f1Var.f90670c) && Intrinsics.d(this.f90671d, f1Var.f90671d) && Intrinsics.d(this.f90672e, f1Var.f90672e) && Intrinsics.d(this.f90673f, f1Var.f90673f) && Intrinsics.d(this.f90674g, f1Var.f90674g) && this.f90675h == f1Var.f90675h && this.f90676i == f1Var.f90676i && this.f90677j == f1Var.f90677j && this.f90678k == f1Var.f90678k && this.f90679l == f1Var.f90679l && this.f90680m == f1Var.f90680m;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f90669b, Integer.hashCode(this.f90668a) * 31, 31);
        si1.a aVar = this.f90670c;
        int hashCode = (b13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        si1.a aVar2 = this.f90671d;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        si1.a aVar3 = this.f90672e;
        return Long.hashCode(this.f90680m) + ep.b.b(this.f90679l, ep.b.b(this.f90678k, ep.b.b(this.f90677j, ep.b.b(this.f90676i, ep.b.b(this.f90675h, (this.f90674g.hashCode() + ((this.f90673f.hashCode() + ((hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final int j() {
        return this.f90678k;
    }

    public final int k() {
        return this.f90679l;
    }

    public final long l() {
        return this.f90680m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LongPress(gestureX=");
        sb3.append(this.f90668a);
        sb3.append(", gestureY=");
        sb3.append(this.f90669b);
        sb3.append(", mediaPieceBounds=");
        sb3.append(this.f90670c);
        sb3.append(", chipsBounds=");
        sb3.append(this.f90671d);
        sb3.append(", userAttributionBounds=");
        sb3.append(this.f90672e);
        sb3.append(", globalVisiblePinRect=");
        sb3.append(this.f90673f);
        sb3.append(", pinDrawableRect=");
        sb3.append(this.f90674g);
        sb3.append(", rootViewWidth=");
        sb3.append(this.f90675h);
        sb3.append(", pinRepViewHeight=");
        sb3.append(this.f90676i);
        sb3.append(", gridTop=");
        sb3.append(this.f90677j);
        sb3.append(", rawX=");
        sb3.append(this.f90678k);
        sb3.append(", rawY=");
        sb3.append(this.f90679l);
        sb3.append(", timestamp=");
        return a.a.o(sb3, this.f90680m, ")");
    }
}
