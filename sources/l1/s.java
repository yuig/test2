package l1;

import ao2.m0;
import b3.s0;
import b3.w;
import c2.b1;
import c2.j3;
import c2.q0;
import i2.q1;
import i2.v3;
import i2.z1;
import k1.n1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import p1.x;
import p1.x0;
import p1.y;
import q3.p0;
import r1.g0;
import s80.y6;
import tc0.b0;
import uc0.h1;
import uc0.k1;
import uc0.l1;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f81371j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f81372k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f81373l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i13) {
        super(2);
        this.f81370i = i13;
        this.f81371j = obj;
        this.f81372k = obj2;
        this.f81373l = obj3;
    }

    public final void b(i2.o oVar, int i13) {
        String str;
        float f13;
        String str2;
        float f14;
        int i14 = this.f81370i;
        int i15 = 3;
        int i16 = 0;
        int i17 = 1;
        Object obj = this.f81373l;
        Object obj2 = this.f81371j;
        Object obj3 = this.f81372k;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                c cVar = (c) obj2;
                t.a(cVar, (u2.q) obj3, q2.i.c(1156688164, new n1(i17, (Function1) obj, cVar), oVar), oVar, 384, 0);
                return;
            case 1:
            case 2:
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        return;
                    }
                }
                u2.q n13 = androidx.compose.foundation.layout.b.n(androidx.compose.foundation.a.b((u2.q) obj3, w.f21378b, s0.f21349a), com.bumptech.glide.d.A(eo1.c.space_100, oVar));
                Function0 function0 = (Function0) obj2;
                Function1 function1 = (Function1) obj;
                y a13 = x.a(p1.l.f98545c, u2.b.f120025m, oVar, 0);
                i2.s sVar3 = (i2.s) oVar;
                int i18 = sVar3.P;
                z1 o13 = sVar3.o();
                u2.q X = m0.X(oVar, n13);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                if (!(sVar3.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar3.a0();
                if (sVar3.O) {
                    sVar3.n(iVar);
                } else {
                    sVar3.j0();
                }
                tb.f.f0(oVar, a13, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar3.O || !Intrinsics.d(sVar3.J(), Integer.valueOf(i18))) {
                    ep.b.y(i18, sVar3, i18, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                oe.f.e(function0, oVar, 0);
                oe.f.c(0, 2, oVar, null, function1);
                sVar3.r(true);
                return;
            case 3:
                if ((i13 & 3) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        return;
                    }
                }
                com.bumptech.glide.d.a(b1.f24558a.c(Float.valueOf(w.d(((w) ((v3) obj2).getValue()).f21392a))), q2.i.c(-1699085201, new q0((x0) obj3, (kl2.l) obj, i17), oVar), oVar, 56);
                return;
            case 4:
                if ((i13 & 3) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return;
                    }
                }
                u2.q c13 = androidx.compose.ui.layout.a.c("border");
                float f15 = j3.f24856a;
                u2.q f16 = androidx.compose.ui.draw.a.f(c13, new k1.p(((a3.f) ((q1) obj2).getValue()).f497a, (x0) obj3, i15));
                Function2 function2 = (Function2) obj;
                p0 e13 = p1.q.e(u2.b.f120013a, true);
                i2.s sVar6 = (i2.s) oVar;
                int i19 = sVar6.P;
                z1 o14 = sVar6.o();
                u2.q X2 = m0.X(oVar, f16);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar6.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar6.a0();
                if (sVar6.O) {
                    sVar6.n(iVar2);
                } else {
                    sVar6.j0();
                }
                tb.f.f0(oVar, e13, s3.j.f110801e);
                tb.f.f0(oVar, o14, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar6.O || !Intrinsics.d(sVar6.J(), Integer.valueOf(i19))) {
                    ep.b.y(i19, sVar6, i19, hVar2);
                }
                tb.f.f0(oVar, X2, s3.j.f110799c);
                if (function2 == null) {
                    sVar6.W(719996434);
                } else {
                    sVar6.W(-392416305);
                    function2.invoke(oVar, 0);
                }
                sVar6.r(false);
                sVar6.r(true);
                return;
            case 5:
                if ((i13 & 11) == 2) {
                    i2.s sVar7 = (i2.s) oVar;
                    if (sVar7.z()) {
                        sVar7.Q();
                        return;
                    }
                }
                u2.n nVar = u2.n.f120041b;
                u2.q n14 = androidx.compose.foundation.layout.b.n(nVar, com.bumptech.glide.d.A(eo1.c.space_500, oVar));
                y6 y6Var = (y6) obj2;
                Function0 function02 = (Function0) obj3;
                Function0 function03 = (Function0) obj;
                y a14 = x.a(p1.l.f98547e, u2.b.f120026n, oVar, 54);
                i2.s sVar8 = (i2.s) oVar;
                int i23 = sVar8.P;
                z1 o15 = sVar8.o();
                u2.q X3 = m0.X(oVar, n14);
                s3.k.Qo.getClass();
                s3.i iVar3 = s3.j.f110798b;
                if (!(sVar8.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar8.a0();
                if (sVar8.O) {
                    sVar8.n(iVar3);
                } else {
                    sVar8.j0();
                }
                tb.f.f0(oVar, a14, s3.j.f110801e);
                tb.f.f0(oVar, o15, s3.j.f110800d);
                s3.h hVar3 = s3.j.f110802f;
                if (sVar8.O || !Intrinsics.d(sVar8.J(), Integer.valueOf(i23))) {
                    ep.b.y(i23, sVar8, i23, hVar3);
                }
                tb.f.f0(oVar, X3, s3.j.f110799c);
                float A = com.bumptech.glide.d.A(eo1.c.space_100, oVar);
                sVar8.W(-1032603975);
                boolean z13 = !z.j(y6Var.f111860a);
                String str3 = y6Var.f111860a;
                if (z13) {
                    str = str3;
                    f13 = A;
                    dl2.b.c(new rn1.a(bs1.c.h2(str3), null, e0.b(vn1.b.CENTER_HORIZONTAL), null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), null, null, null, oVar, 8, 14);
                } else {
                    str = str3;
                    f13 = A;
                }
                sVar8.r(false);
                sVar8.W(-1032592649);
                String str4 = y6Var.f111861b;
                if (!z.j(str4)) {
                    sVar8.W(-1032591588);
                    float f17 = f13;
                    if (!z.j(str)) {
                        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, f17), oVar);
                    }
                    sVar8.r(false);
                    f14 = f17;
                    str2 = str4;
                    dl2.b.c(new rn1.a(bs1.c.h2(str4), null, e0.b(vn1.b.CENTER_HORIZONTAL), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), null, null, null, oVar, 8, 14);
                } else {
                    str2 = str4;
                    f14 = f13;
                }
                sVar8.r(false);
                sVar8.W(-1032577385);
                String str5 = y6Var.f111862c;
                if (!z.j(str5)) {
                    sVar8.W(-1032576236);
                    if ((!z.j(str)) || (!z.j(str2))) {
                        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, f14), oVar);
                    }
                    sVar8.r(false);
                    dl2.b.c(new rn1.a(bs1.c.h2(str5), null, e0.b(vn1.b.CENTER_HORIZONTAL), null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), null, null, null, oVar, 8, 14);
                }
                sVar8.r(false);
                if ((!z.j(y6Var.f111864e)) || (!z.j(y6Var.f111863d))) {
                    androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(eo1.c.space_300, oVar)), oVar);
                    gh0.b.v(y6Var, function02, function03, null, oVar, 8, 8);
                }
                sVar8.r(true);
                return;
            case 6:
                if ((i13 & 11) == 2) {
                    i2.s sVar9 = (i2.s) oVar;
                    if (sVar9.z()) {
                        sVar9.Q();
                        return;
                    }
                }
                ve.h.a(new rm1.d(new rm1.f((rm1.q) obj2, (rm1.i) obj3), (rm1.c) obj, null, 0, null, 28), null, null, oVar, 8, 6);
                return;
            case 7:
                if ((i13 & 11) == 2) {
                    i2.s sVar10 = (i2.s) oVar;
                    if (sVar10.z()) {
                        sVar10.Q();
                        return;
                    }
                }
                k1 k1Var = ((h1) ((v3) obj2).getValue()).f121790a;
                b0 b0Var = new b0((l1) obj3, i16);
                q1 q1Var = (q1) obj;
                boolean booleanValue = ((Boolean) q1Var.getValue()).booleanValue();
                i2.s sVar11 = (i2.s) oVar;
                sVar11.W(1778019817);
                Object J2 = sVar11.J();
                if (J2 == i2.n.f71185a) {
                    J2 = new w1.o(9, q1Var);
                    sVar11.g0(J2);
                }
                sVar11.r(false);
                kh2.s0.l(k1Var, b0Var, booleanValue, null, (Function1) J2, sVar11, 24576, 8);
                return;
        }
    }

    public final g0 e(long j13, n4.b bVar) {
        int i13 = this.f81370i;
        Object obj = this.f81373l;
        Object obj2 = this.f81372k;
        Object obj3 = this.f81371j;
        switch (i13) {
            case 1:
                if (n4.a.h(j13) == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                }
                x0 x0Var = (x0) obj3;
                n4.k kVar = n4.k.Ltr;
                int h10 = n4.a.h(j13) - bVar.R(androidx.compose.foundation.layout.b.e(x0Var, kVar) + androidx.compose.foundation.layout.b.f(x0Var, kVar));
                p1.h hVar = (p1.h) obj;
                int[] E0 = CollectionsKt.E0(((r1.b) ((r1.c) obj2)).a(h10, bVar.R(hVar.a())));
                int[] iArr = new int[E0.length];
                hVar.c(bVar, h10, E0, kVar, iArr);
                return new g0(E0, iArr);
            default:
                if (n4.a.g(j13) == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
                }
                x0 x0Var2 = (x0) obj3;
                int g13 = n4.a.g(j13) - bVar.R(x0Var2.a() + x0Var2.d());
                p1.j jVar = (p1.j) obj;
                int[] E02 = CollectionsKt.E0(((r1.b) ((r1.c) obj2)).a(g13, bVar.R(jVar.a())));
                int[] iArr2 = new int[E02.length];
                jVar.b(bVar, g13, E02, iArr2);
                return new g0(E02, iArr2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f81370i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 7:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u2.q qVar, Function0 function0, Function1 function1) {
        super(2);
        this.f81370i = 8;
        this.f81372k = qVar;
        this.f81371j = function0;
        this.f81373l = function1;
    }
}
