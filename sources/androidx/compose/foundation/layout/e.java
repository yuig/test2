package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import p1.d0;
import p1.p1;
import u2.g;
import u2.h;
import u2.i;
import u2.q;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f17182a;

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f17183b;

    /* renamed from: c, reason: collision with root package name */
    public static final FillElement f17184c;

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f17185d;

    /* renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f17186e;

    /* renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f17187f;

    /* renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f17188g;

    /* renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f17189h;

    /* renamed from: i, reason: collision with root package name */
    public static final WrapContentElement f17190i;

    static {
        d0 d0Var = d0.Horizontal;
        f17182a = new FillElement(d0Var, 1.0f);
        d0 d0Var2 = d0.Vertical;
        f17183b = new FillElement(d0Var2, 1.0f);
        d0 d0Var3 = d0.Both;
        f17184c = new FillElement(d0Var3, 1.0f);
        g gVar = u2.b.f120026n;
        int i13 = 2;
        int i14 = 0;
        f17185d = new WrapContentElement(d0Var, false, new p1(gVar, i13), gVar);
        g gVar2 = u2.b.f120025m;
        f17186e = new WrapContentElement(d0Var, false, new p1(gVar2, i13), gVar2);
        h hVar = u2.b.f120023k;
        f17187f = new WrapContentElement(d0Var2, false, new p1(hVar, i14), hVar);
        h hVar2 = u2.b.f120022j;
        f17188g = new WrapContentElement(d0Var2, false, new p1(hVar2, i14), hVar2);
        i iVar = u2.b.f120017e;
        int i15 = 1;
        f17189h = new WrapContentElement(d0Var3, false, new p1(iVar, i15), iVar);
        i iVar2 = u2.b.f120013a;
        f17190i = new WrapContentElement(d0Var3, false, new p1(iVar2, i15), iVar2);
    }

    public static final q a(q qVar, float f13, float f14) {
        return qVar.j(new UnspecifiedConstraintsElement(f13, f14));
    }

    public static final q b(q qVar, float f13) {
        return qVar.j(f13 == 1.0f ? f17182a : new FillElement(d0.Horizontal, f13));
    }

    public static final q c(q qVar, float f13) {
        return qVar.j(new SizeElement(0.0f, f13, 0.0f, f13, true, 5));
    }

    public static final q d(q qVar, float f13, float f14) {
        return qVar.j(new SizeElement(0.0f, f13, 0.0f, f14, true, 5));
    }

    public static final q e(q qVar, float f13) {
        return qVar.j(new SizeElement(0.0f, f13, 0.0f, f13, false, 5));
    }

    public static final q f(q qVar, float f13) {
        return qVar.j(new SizeElement(f13, f13, f13, f13, false));
    }

    public static final q g(q qVar, float f13, float f14) {
        return qVar.j(new SizeElement(f13, f14, f13, f14, false));
    }

    public static q h(q qVar, float f13, float f14, float f15, float f16, int i13) {
        return qVar.j(new SizeElement(f13, (i13 & 2) != 0 ? Float.NaN : f14, (i13 & 4) != 0 ? Float.NaN : f15, (i13 & 8) != 0 ? Float.NaN : f16, false));
    }

    public static final q i(float f13) {
        return new SizeElement(f13, 0.0f, f13, 0.0f, false, 10);
    }

    public static final q j(q qVar, float f13) {
        return qVar.j(new SizeElement(f13, f13, f13, f13, true));
    }

    public static final q k(q qVar, float f13, float f14) {
        return qVar.j(new SizeElement(f13, f14, f13, f14, true));
    }

    public static final q l(q qVar, float f13, float f14, float f15, float f16) {
        return qVar.j(new SizeElement(f13, f14, f15, f16, true));
    }

    public static final q m(q qVar, float f13) {
        return qVar.j(new SizeElement(f13, 0.0f, f13, 0.0f, true, 10));
    }

    public static q n(q qVar, float f13) {
        return qVar.j(new SizeElement(f13, 0.0f, Float.NaN, 0.0f, true, 10));
    }

    public static q o(q qVar) {
        h hVar = u2.b.f120023k;
        return qVar.j(Intrinsics.d(hVar, hVar) ? f17187f : Intrinsics.d(hVar, u2.b.f120022j) ? f17188g : new WrapContentElement(d0.Vertical, false, new p1(hVar, 0), hVar));
    }

    public static q p(q qVar, i iVar, int i13) {
        int i14 = 1;
        int i15 = i13 & 1;
        i iVar2 = u2.b.f120017e;
        if (i15 != 0) {
            iVar = iVar2;
        }
        return qVar.j(Intrinsics.d(iVar, iVar2) ? f17189h : Intrinsics.d(iVar, u2.b.f120013a) ? f17190i : new WrapContentElement(d0.Both, false, new p1(iVar, i14), iVar));
    }

    public static q q(q qVar) {
        g gVar = u2.b.f120026n;
        return qVar.j(Intrinsics.d(gVar, gVar) ? f17185d : Intrinsics.d(gVar, u2.b.f120025m) ? f17186e : new WrapContentElement(d0.Horizontal, false, new p1(gVar, 2), gVar));
    }
}
