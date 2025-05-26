package tc0;

import a.cb;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import c2.j1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.z1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p1.c1;
import p1.e1;
import uc0.g1;
import uc0.m2;
import uc0.n2;
import uc0.o2;
import uc0.p2;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117239i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f117240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(List list, int i13) {
        super(4);
        this.f117239i = i13;
        this.f117240j = list;
    }

    public final void b(q1.c cVar, int i13, i2.o oVar, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23 = this.f117239i;
        List list = this.f117240j;
        switch (i23) {
            case 0:
                if ((i14 & 6) == 0) {
                    i15 = i14 | (((i2.s) oVar).h(cVar) ? 4 : 2);
                } else {
                    i15 = i14;
                }
                if ((i14 & 48) == 0) {
                    i15 |= ((i2.s) oVar).f(i13) ? 32 : 16;
                }
                if ((i15 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                h0 h0Var = (h0) list.get(i13);
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-1401531170);
                if (h0Var instanceof f0) {
                    sVar2.W(-45207968);
                    gh0.b.k((f0) h0Var, sVar2, 8);
                    sVar2.r(false);
                } else if (h0Var instanceof d0) {
                    sVar2.W(-45203905);
                    gh0.b.i((d0) h0Var, sVar2, 8);
                    sVar2.r(false);
                } else if (h0Var instanceof g0) {
                    sVar2.W(-45199488);
                    gh0.b.l((g0) h0Var, null, sVar2, 8, 2);
                    sVar2.r(false);
                } else if (h0Var instanceof e0) {
                    sVar2.W(-45195073);
                    gh0.b.j((e0) h0Var, null, sVar2, 8, 2);
                    sVar2.r(false);
                } else {
                    sVar2.W(-1400993011);
                    sVar2.r(false);
                }
                sVar2.r(false);
                break;
            case 1:
            default:
                if ((i14 & 6) == 0) {
                    i19 = i14 | (((i2.s) oVar).h(cVar) ? 4 : 2);
                } else {
                    i19 = i14;
                }
                if ((i14 & 48) == 0) {
                    i19 |= ((i2.s) oVar).f(i13) ? 32 : 16;
                }
                if ((i19 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                u41.e eVar = (u41.e) list.get(i13);
                i2.s sVar4 = (i2.s) oVar;
                sVar4.W(-1170787350);
                u41.f.a(eVar, null, sVar4, 8, 2);
                sVar4.r(false);
                break;
            case 2:
                if ((i14 & 6) == 0) {
                    i16 = i14 | (((i2.s) oVar).h(cVar) ? 4 : 2);
                } else {
                    i16 = i14;
                }
                if ((i14 & 48) == 0) {
                    i16 |= ((i2.s) oVar).f(i13) ? 32 : 16;
                }
                if ((i16 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                g1 g1Var = (g1) list.get(i13);
                i2.s sVar6 = (i2.s) oVar;
                sVar6.W(-1845519051);
                j1.c(null, 0L, 0.0f, 0.0f, sVar6, 0, 15);
                kh2.s0.j(g1Var, null, sVar6, 0, 2);
                sVar6.r(false);
                break;
            case 3:
                if ((i14 & 6) == 0) {
                    i17 = i14 | (((i2.s) oVar).h(cVar) ? 4 : 2);
                } else {
                    i17 = i14;
                }
                if ((i14 & 48) == 0) {
                    i17 |= ((i2.s) oVar).f(i13) ? 32 : 16;
                }
                if ((i17 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar7 = (i2.s) oVar;
                    if (sVar7.z()) {
                        sVar7.Q();
                        break;
                    }
                }
                p2 p2Var = (p2) list.get(i13);
                i2.s sVar8 = (i2.s) oVar;
                sVar8.W(-1116447774);
                if (p2Var instanceof m2) {
                    sVar8.W(1488008962);
                    kh2.j1.b((m2) p2Var, null, sVar8, 0, 2);
                    sVar8.r(false);
                } else if (p2Var instanceof n2) {
                    sVar8.W(1488013797);
                    kh2.j1.c((n2) p2Var, null, sVar8, 0, 2);
                    sVar8.r(false);
                } else if (p2Var instanceof o2) {
                    sVar8.W(1488018692);
                    kh2.j1.k((o2) p2Var, null, sVar8, 0, 2);
                    sVar8.r(false);
                } else {
                    sVar8.W(-1115989378);
                    sVar8.r(false);
                }
                sVar8.r(false);
                break;
            case 4:
                if ((i14 & 6) == 0) {
                    i18 = i14 | (((i2.s) oVar).h(cVar) ? 4 : 2);
                } else {
                    i18 = i14;
                }
                if ((i14 & 48) == 0) {
                    i18 |= ((i2.s) oVar).f(i13) ? 32 : 16;
                }
                if ((i18 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar9 = (i2.s) oVar;
                    if (sVar9.z()) {
                        sVar9.Q();
                        break;
                    }
                }
                k31.e eVar2 = (k31.e) list.get(i13);
                i2.s sVar10 = (i2.s) oVar;
                sVar10.W(1009995233);
                kh2.b0.n(eVar2, null, null, sVar10, 0, 6);
                sVar10.r(false);
                break;
        }
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        switch (this.f117239i) {
            case 0:
                b((q1.c) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                return Unit.f80348a;
            case 1:
                r1.q qVar = (r1.q) obj;
                int intValue = ((Number) obj2).intValue();
                i2.o oVar = (i2.o) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i13 = (((i2.s) oVar).h(qVar) ? 4 : 2) | intValue2;
                } else {
                    i13 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i13 |= ((i2.s) oVar).f(intValue) ? 32 : 16;
                }
                if ((i13 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return Unit.f80348a;
                    }
                }
                g1 g1Var = (g1) this.f117240j.get(intValue);
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-1450956595);
                u2.n nVar = u2.n.f120041b;
                u2.q c13 = androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(oc0.o.item_grid_height, sVar2));
                e1 a13 = c1.a(p1.l.f98543a, u2.b.f120022j, sVar2, 0);
                int i14 = sVar2.P;
                z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(sVar2, c13);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                boolean z13 = sVar2.f71265a instanceof i2.f;
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar);
                } else {
                    sVar2.j0();
                }
                s3.h hVar = s3.j.f110801e;
                tb.f.f0(sVar2, a13, hVar);
                s3.h hVar2 = s3.j.f110800d;
                tb.f.f0(sVar2, o13, hVar2);
                s3.h hVar3 = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i14))) {
                    ep.b.y(i14, sVar2, i14, hVar3);
                }
                s3.h hVar4 = s3.j.f110799c;
                tb.f.f0(sVar2, X, hVar4);
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true);
                FillElement fillElement = androidx.compose.foundation.layout.e.f17183b;
                u2.q j13 = layoutWeightElement.j(fillElement);
                p1.e eVar = p1.l.f98545c;
                u2.g gVar = u2.b.f120025m;
                p1.y a14 = p1.x.a(eVar, gVar, sVar2, 0);
                int i15 = sVar2.P;
                z1 o14 = sVar2.o();
                u2.q X2 = ao2.m0.X(sVar2, j13);
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(sVar2, a14, hVar);
                tb.f.f0(sVar2, o14, hVar2);
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar2, i15, hVar3);
                }
                tb.f.f0(sVar2, X2, hVar4);
                kh2.s0.i(g1Var, androidx.compose.foundation.layout.e.b(p1.z.a(p1.a0.f98480a, nVar, 1.0f), 1.0f), sVar2, 0, 0);
                j1.c(null, 0L, 0.0f, 0.0f, sVar2, 0, 15);
                sVar2.r(true);
                p1.y a15 = p1.x.a(eVar, gVar, sVar2, 0);
                int i16 = sVar2.P;
                z1 o15 = sVar2.o();
                u2.q X3 = ao2.m0.X(sVar2, nVar);
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(sVar2, a15, hVar);
                tb.f.f0(sVar2, o15, hVar2);
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar2, i16, hVar3);
                }
                tb.f.f0(sVar2, X3, hVar4);
                j1.c(androidx.compose.foundation.layout.e.m(fillElement, com.bumptech.glide.d.A(oc0.o.divider_thickness, sVar2)), 0L, 0.0f, 0.0f, sVar2, 0, 14);
                sVar2.r(true);
                sVar2.r(true);
                sVar2.r(false);
                return Unit.f80348a;
            case 2:
                b((q1.c) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                return Unit.f80348a;
            case 3:
                b((q1.c) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                return Unit.f80348a;
            case 4:
                b((q1.c) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                return Unit.f80348a;
            default:
                b((q1.c) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                return Unit.f80348a;
        }
    }
}
