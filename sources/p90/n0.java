package p90;

import android.content.Context;
import c50.k6;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import la0.m1;
import r72.u1;
import r72.z1;
import s80.o6;
import v90.f1;
import v90.k1;
import v90.l1;
import v90.n1;
import v90.p1;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f99205j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, int i13) {
        super(1);
        this.f99204i = i13;
        this.f99205j = obj;
    }

    public final fa0.l b(fa0.l it) {
        int i13 = this.f99204i;
        Object obj = this.f99205j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return fa0.l.e(it, false, null, ((fa0.w0) obj).f61541a ? fa0.t0.f61537a : fa0.c.f61476a, null, null, 55);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return fa0.l.e(it, ((fa0.l0) ((fa0.m) obj)).f61512a, null, null, null, null, 62);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return fa0.l.e(it, false, (fa0.z) obj, null, null, null, 59);
        }
    }

    public final v90.a e(v90.a it) {
        int i13 = this.f99204i;
        Object obj = this.f99205j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return v90.a.e(it, null, false, null, null, null, null, null, null, ((p1) obj).getMode(), false, 1791);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                v90.t tVar = (v90.t) obj;
                y62.g gVar = tVar.f124961a;
                y62.f fVar = gVar.f137936c;
                boolean z13 = fVar == y62.f.LOADING;
                s90.r0 r0Var = it.f124853a;
                int[] iArr = f1.f124895a;
                int i14 = iArr[fVar.ordinal()];
                boolean z14 = i14 == 1 || i14 == 2;
                int i15 = iArr[tVar.f124961a.f137936c.ordinal()];
                u50.i0 label = i15 != 1 ? i15 != 2 ? u50.h0.f120562a : bs1.c.j2(new String[0], s90.d1.collage_cutout_search_state_no_objects_v2) : bs1.c.j2(new String[0], s90.d1.collage_cutout_search_state_searching_v2);
                r0Var.getClass();
                Intrinsics.checkNotNullParameter(label, "label");
                return v90.a.e(it, new s90.r0(label, z14), false, null, null, gVar, null, null, null, null, z13, 1006);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return v90.a.e(it, null, false, null, null, null, ((v90.q) ((v90.z) obj)).f124954a, null, null, null, false, 2015);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                s90.t0 t0Var = it.f124855c;
                s90.s0 s0Var = t0Var.f112024b;
                n1 n1Var = (n1) obj;
                n1 n1Var2 = n1.REFINE;
                return v90.a.e(it, null, false, s90.t0.e(t0Var, s90.s0.a(s0Var, false, n1Var == n1Var2, 1), s90.s0.a(it.f124855c.f112025c, false, n1Var == n1Var2, 1)), null, null, null, n1Var, null, null, false, 1979);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                x62.r rVar = (x62.r) obj;
                boolean z15 = rVar.f133995a > 0;
                boolean z16 = rVar.f133996b > 0;
                s90.t0 t0Var2 = it.f124855c;
                return v90.a.e(it, null, false, s90.t0.e(t0Var2, s90.s0.a(t0Var2.f112024b, z15, false, 2), s90.s0.a(it.f124855c.f112025c, z16, false, 2)), null, null, null, null, null, null, false, 2043);
        }
    }

    public final k1 f(k1 it) {
        int i13 = this.f99204i;
        Object obj = this.f99205j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return k1.b(it, null, ((v90.i) obj).f124903a, false, 95);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return k1.b(it, null, ((v90.j) obj).f124920a, false, 95);
        }
    }

    public final void h(l82.n start) {
        int i13 = this.f99204i;
        int i14 = 4;
        int i15 = 9;
        int i16 = 8;
        int i17 = 7;
        int i18 = 14;
        int i19 = 13;
        int i23 = 11;
        int i24 = 10;
        int i25 = 12;
        int i26 = 6;
        int i27 = 5;
        Object obj = this.f99205j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                v0 v0Var = (v0) obj;
                mb0.a aVar = (mb0.a) v0Var.f99241h.f63225b;
                start.a(aVar, new o6(19), aVar.a());
                r90.c cVar = v0Var.f99238e;
                start.a(cVar, new o6(21), cVar.a());
                sa0.j jVar = v0Var.f99239f;
                start.a(jVar, new o6(20), jVar.a());
                zy.d0 d0Var = v0Var.f99237d;
                start.a(d0Var, new o6(22), d0Var.a());
                o22.c cVar2 = v0Var.f99240g;
                start.a(cVar2, new o6(23), cVar2.a());
                break;
            case 2:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((w0) obj).f99243c);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                s90.q0 q0Var = (s90.q0) obj;
                sa0.j jVar2 = q0Var.f112007c;
                start.a(jVar2, new o6(24), jVar2.a());
                ua0.d dVar = q0Var.f112008d;
                start.a(dVar, new o6(25), dVar.a());
                sa0.y yVar = q0Var.f112009e;
                start.a(yVar, new o6(26), yVar.a());
                w60.d dVar2 = q0Var.f112010f;
                start.a(dVar2, new o6(27), dVar2.a());
                u90.c cVar3 = q0Var.f112011g;
                start.a(cVar3, new o6(28), cVar3.a());
                ua0.e eVar = q0Var.f112012h;
                start.a(eVar, new o6(29), eVar.a());
                zy.d0 d0Var2 = q0Var.f112013i;
                start.a(d0Var2, new s90.p0(0), d0Var2.a());
                break;
            case 12:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l1 l1Var = (l1) obj;
                ua0.d dVar3 = l1Var.f124935c;
                start.a(dVar3, new s90.p0(1), dVar3.a());
                sa0.y yVar2 = l1Var.f124936d;
                start.a(yVar2, new s90.p0(2), yVar2.a());
                u90.j jVar3 = l1Var.f124941i;
                start.a(jVar3, new s90.p0(3), jVar3.a());
                w60.d dVar4 = l1Var.f124937e;
                start.a(dVar4, new s90.p0(i14), dVar4.a());
                u90.c cVar4 = l1Var.f124938f;
                start.a(cVar4, new s90.p0(i27), cVar4.a());
                ua0.e eVar2 = l1Var.f124939g;
                start.a(eVar2, new s90.p0(i26), eVar2.a());
                zy.d0 d0Var3 = l1Var.f124940h;
                start.a(d0Var3, new s90.p0(i17), d0Var3.a());
                break;
            case 13:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                w90.h0 h0Var = (w90.h0) obj;
                mb0.a aVar2 = (mb0.a) h0Var.f128554k.f63225b;
                start.a(aVar2, new s90.p0(i16), aVar2.a());
                w60.d dVar5 = h0Var.f128547d;
                start.a(dVar5, new s90.p0(i23), dVar5.a());
                ua0.d dVar6 = h0Var.f128548e;
                start.a(dVar6, new s90.p0(i15), dVar6.a());
                ua0.e eVar3 = h0Var.f128549f;
                start.a(eVar3, new s90.p0(i25), eVar3.a());
                zy.d0 d0Var4 = h0Var.f128550g;
                start.a(d0Var4, new s90.p0(i19), d0Var4.a());
                w90.s sVar = h0Var.f128551h;
                start.a(sVar, new s90.p0(i24), sVar.a());
                o22.e eVar4 = h0Var.f128552i;
                start.a(eVar4, new s90.p0(i18), eVar4.a());
                break;
            case 15:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                ca0.b1 b1Var = (ca0.b1) obj;
                l82.n.b(start, b1Var.f27076c);
                w60.d dVar7 = b1Var.f27077d;
                start.a(dVar7, new s90.p0(21), dVar7.a());
                zy.d0 d0Var5 = b1Var.f27078e;
                start.a(d0Var5, new s90.p0(22), d0Var5.a());
                break;
            case 16:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                ea0.k0 k0Var = (ea0.k0) obj;
                ja0.e eVar5 = k0Var.f57966c;
                start.a(eVar5, new s90.p0(24), eVar5.a());
                mb0.a aVar3 = (mb0.a) k0Var.f57970g.f63225b;
                start.a(aVar3, new s90.p0(23), aVar3.a());
                zy.d0 d0Var6 = k0Var.f57967d;
                start.a(d0Var6, new s90.p0(25), d0Var6.a());
                w60.d dVar8 = k0Var.f57968e;
                start.a(dVar8, new s90.p0(26), dVar8.a());
                k92.l lVar = k0Var.f57969f;
                start.a(lVar, new s90.p0(27), lVar.a());
                break;
            case 23:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                fa0.k0 k0Var2 = (fa0.k0) obj;
                mb0.a aVar4 = (mb0.a) k0Var2.f61504h.f63225b;
                start.a(aVar4, new s90.p0(28), aVar4.a());
                ha0.j jVar4 = k0Var2.f61499c;
                start.a(jVar4, new s90.p0(29), jVar4.a());
                ha0.f fVar = k0Var2.f61500d;
                start.a(fVar, new k6(0), fVar.a());
                zy.d0 d0Var7 = k0Var2.f61501e;
                start.a(d0Var7, new k6(1), d0Var7.a());
                w60.d dVar9 = k0Var2.f61502f;
                start.a(dVar9, new k6(2), dVar9.a());
                k92.l lVar2 = k0Var2.f61503g;
                start.a(lVar2, new k6(3), lVar2.a());
                break;
            case 26:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                oa0.b bVar = ((ka0.w) obj).f78918c;
                start.a(bVar, new k6(i14), bVar.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                la0.n1 n1Var = (la0.n1) obj;
                mb0.a aVar5 = (mb0.a) n1Var.f82453o.f63225b;
                start.a(aVar5, new k6(i27), aVar5.a());
                zb0.i iVar = n1Var.f82443e;
                start.a(iVar, new k6(i26), iVar.a());
                oa0.b bVar2 = n1Var.f82446h;
                start.a(bVar2, new k6(i25), bVar2.a());
                na0.c cVar5 = n1Var.f82447i;
                start.a(cVar5, new k6(i24), cVar5.a());
                na0.e eVar6 = n1Var.f82449k;
                start.a(eVar6, new k6(i23), eVar6.a());
                k92.l lVar3 = n1Var.f82450l;
                start.a(lVar3, new k6(i19), lVar3.a());
                zy.d0 d0Var8 = n1Var.f82448j;
                start.a(d0Var8, new k6(i18), d0Var8.a());
                ta0.v vVar = n1Var.f82444f;
                start.a(vVar, new k6(i17), vVar.a());
                ta0.h0 h0Var2 = n1Var.f82445g;
                start.a(h0Var2, new k6(i16), h0Var2.a());
                nu.b bVar3 = n1Var.f82451m;
                start.a(bVar3, new k6(i15), bVar3.a());
                o22.i iVar2 = n1Var.f82452n;
                start.a(iVar2, new k6(15), iVar2.a());
                break;
        }
    }

    public final void i(yl1.l bind) {
        int i13 = this.f99204i;
        Object obj = this.f99205j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Context requireContext = ((fa0.t) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                bind.b(pk.a0.o1(requireContext));
                bind.a(yl1.d.PRIMARY.getColorPalette());
                bind.c(ea0.k.remix_closeup_action_button_label);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fa0.l lVar = (fa0.l) obj;
                boolean z13 = lVar.f61507b;
                bind.getClass();
                bind.f139350c = z13 ? fm1.c.VISIBLE : fm1.c.GONE;
                bind.f139349b = lVar.f61506a;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [ea0.x] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ea0.w wVar;
        int i13 = this.f99204i;
        boolean z13 = true;
        Object obj2 = this.f99205j;
        switch (i13) {
            case 0:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z14 = ((CutoutModel) obj2) != null;
                break;
            case 1:
                h((l82.n) obj);
                break;
            case 2:
                h((l82.n) obj);
                break;
            case 3:
                s90.a it2 = (s90.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                s90.r0 r0Var = it2.f111958b;
                bp1.h hVar = (bp1.h) obj2;
                u62.h hVar2 = u62.h.f120839a;
                boolean d2 = Intrinsics.d(hVar, hVar2);
                u62.d dVar = u62.d.f120835a;
                u62.f fVar = u62.f.f120837a;
                if (!d2 && !Intrinsics.d(hVar, fVar)) {
                    z13 = Intrinsics.d(hVar, dVar);
                }
                u50.i0 label = Intrinsics.d(hVar, hVar2) ? bs1.c.j2(new String[0], s90.d1.collage_cutout_search_state_searching) : Intrinsics.d(hVar, fVar) ? bs1.c.j2(new String[0], s90.d1.collage_cutout_search_state_no_objects) : Intrinsics.d(hVar, dVar) ? bs1.c.j2(new String[0], s90.d1.collage_cutout_search_state_error) : u50.h0.f120562a;
                r0Var.getClass();
                Intrinsics.checkNotNullParameter(label, "label");
                break;
            case 4:
                h((l82.n) obj);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                h((l82.n) obj);
                break;
            case 13:
                h((l82.n) obj);
                break;
            case 14:
                m62.s it3 = (m62.s) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                z1 z1Var = it3.f86045a;
                if (z1Var instanceof u1) {
                    u1 u1Var = (u1) z1Var;
                    MaskModel maskModel = ((y90.k0) ((y90.l0) obj2)).f138198a;
                    break;
                }
                break;
            case 15:
                h((l82.n) obj);
                break;
            case 16:
                h((l82.n) obj);
                break;
            case 17:
                i((yl1.l) obj);
                break;
            case 18:
                i((yl1.l) obj);
                break;
            case 19:
                fa0.j0 it4 = (fa0.j0) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                h((l82.n) obj);
                break;
            case 24:
                o12.b response = (o12.b) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List<dl1.s> list = response.f92783a;
                ja0.b bVar = (ja0.b) obj2;
                ArrayList arrayList = new ArrayList();
                for (dl1.s sVar : list) {
                    if (sVar instanceof f30) {
                        wVar = new ea0.w((f30) sVar);
                    } else {
                        if (sVar instanceof vh) {
                            vh vhVar = (vh) sVar;
                            bVar.getClass();
                            if (Intrinsics.d(vhVar.q(), "featured_collage_templates") && vhVar.f42865w.size() >= 2) {
                                List list2 = vhVar.f42865w;
                                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list2) {
                                    if (obj3 instanceof f30) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                kj kjVar = vhVar.f42855m;
                                String a13 = kjVar != null ? kjVar.a() : null;
                                if (a13 == null) {
                                    a13 = "";
                                }
                                kj kjVar2 = vhVar.R;
                                String a14 = kjVar2 != null ? kjVar2.a() : null;
                                wVar = new ea0.x(arrayList2, a13, a14 != null ? a14 : "");
                            }
                        }
                        wVar = null;
                    }
                    if (wVar != null) {
                        arrayList.add(wVar);
                    }
                }
                break;
            case 25:
                ka0.a it5 = (ka0.a) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                int i14 = ((ka0.c) ((ka0.d) obj2)).f78896a;
                it5.getClass();
                break;
            case 26:
                h((l82.n) obj);
                break;
            case 27:
                m1 it6 = (m1) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                break;
            case 28:
                h((l82.n) obj);
                break;
            default:
                z3.y semantics = (z3.y) obj;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                String str = ((ra0.e0) ((ra0.z) obj2).f107045a).f106919b;
                if (str != null) {
                    z3.w.f(semantics, str);
                }
                break;
        }
        return Unit.f80348a;
    }
}
