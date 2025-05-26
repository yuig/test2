package com.pinterest.feature.pin.closeup.datasource;

import b2.t;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import gx.n;
import gx.o;
import h32.a4;
import h32.d4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.a0;
import lh0.f4;
import lh0.g1;
import lh0.z0;
import lh0.z3;
import m60.g0;
import m60.u;
import m60.w;
import nx.d0;
import qz.f0;
import tb0.p;
import uj2.q;
import w01.n0;
import w01.p0;
import x02.i2;
import yk1.v;
import z32.m0;
import zy.q0;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f46940a = {32, 33, 28, 30, 31};

    public static final f0 a(g0 g0Var, boolean z13) {
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.RELATED_PIN_FIELDS));
        String d2 = g0Var.d();
        f0Var.e("page_size", d2);
        f0Var.e("image_header_links_count", d2);
        if (z13) {
            f0Var.e("video_ads_header_links_count", d2);
        }
        return f0Var;
    }

    public static final void b(vq0.f fVar, String str, uk1.d dVar, q qVar, v vVar, wa2.i iVar, ze1.c cVar, f4 f4Var, a0 a0Var, uk1.e eVar, q0 q0Var, Function0 function0, wk2.a aVar, i2 i2Var, o oVar, w01.g0 g0Var, b11.g gVar, n0 n0Var, p0 p0Var, xo0.o oVar2, boolean z13, boolean z14, boolean z15, r rVar, ni0.e eVar2, cz.e eVar3, mz.g gVar2) {
        String str2;
        uk1.d dVar2;
        String str3;
        fVar.o(RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL, new ni0.f(qVar, eVar2, dVar));
        fVar.o(92, new ac1.j(23));
        e3.a aVar2 = new e3.a(5);
        aVar2.p(d4.PIN, a4.PIN_PRODUCT, null, null);
        uk1.d dVar3 = new uk1.d(aVar2, dVar.f122379a, str);
        uk1.a aVar3 = (uk1.a) eVar;
        fVar.c(new int[]{89, 90}, new bu0.a(dVar3, qVar, cVar, function0, aVar3.f122378a));
        fVar.c(f46940a, new se1.c(dVar3, qVar, cVar, f4Var, iVar, vVar, aVar3.f122378a, function0, false, false, null, rVar, "feed", 7936));
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        fVar.o(100, new c11.b(dVar, wVar, aVar));
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        fVar.o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, new c11.b(dVar, wVar, aVar));
        fVar.o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID, new cg0.c(6, dVar, qVar));
        fVar.o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD, new ef1.a(dVar, qVar));
        fVar.o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL, new cg0.c(7, dVar, qVar));
        boolean z16 = fVar instanceof h0;
        h0 h0Var = z16 ? (h0) fVar : null;
        if (h0Var != null) {
            h0Var.W(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, new xs0.l(q0Var), new androidx.compose.foundation.lazy.layout.v(27, a0Var, dVar));
        }
        xk1.c cVar2 = fVar instanceof xk1.c ? (xk1.c) fVar : null;
        d0 d0Var = dVar.f122379a;
        if (cVar2 != null) {
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            n viewBinderInstance = new n(d0Var, oVar);
            g modelConverter = new g(str, 0);
            Intrinsics.checkNotNullParameter(cVar2, "<this>");
            Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
            Intrinsics.checkNotNullParameter(modelConverter, "modelConverter");
            cVar2.o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, new xk1.d(0, viewBinderInstance, modelConverter));
        }
        h0 h0Var2 = z16 ? (h0) fVar : null;
        if (h0Var2 != null) {
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            h0Var2.W(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, new n(d0Var, oVar), new g(str, 1));
        }
        if (z13) {
            Intrinsics.f(d0Var);
            str2 = "getPinalytics(...)";
            dVar2 = dVar;
            fVar.o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, new c11.d(str, d0Var, eVar, g0Var, aVar3.f122378a, cVar, qVar, vVar, oVar2, function0, i2Var, true, 1));
        } else {
            str2 = "getPinalytics(...)";
            dVar2 = dVar;
        }
        if (z14) {
            d0 d0Var2 = dVar2.f122379a;
            str3 = str2;
            Intrinsics.checkNotNullExpressionValue(d0Var2, str3);
            fVar.o(93, new r71.a(str, i2Var, gVar, d0Var2, eVar, n0Var));
        } else {
            str3 = str2;
        }
        if (z15) {
            d0 d0Var3 = dVar2.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var3, str3);
            fVar.o(96, new bu0.a(str, i2Var, gVar, d0Var3, p0Var));
        }
        uk1.d dVar4 = dVar2;
        fVar.o(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, new mz.f(eVar3, qVar, dVar4, gVar2));
        fVar.o(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, new mz.f(eVar3, qVar, dVar4, gVar2));
    }

    public static final void c(f0 f0Var, tb0.h hVar, mc.i iVar) {
        if (!iVar.f86903b) {
            iVar.a();
        }
        Object d2 = iVar.f86902a.d();
        Intrinsics.checkNotNullExpressionValue(d2, "blockingGet(...)");
        mc.d dVar = (mc.d) d2;
        f0Var.e("fields", dVar.f86886a);
        f0Var.c(dVar instanceof mc.c ? 1 : 0, "compressed_fields");
        if (dVar instanceof mc.b) {
            Throwable th3 = ((mc.b) dVar).f86885b;
            hVar.q(th3, String.valueOf(th3.getMessage()), p.RELATED_PINS);
        }
    }

    public static final int d(vh vhVar, a0 a0Var, t tVar) {
        String q13 = vhVar.q();
        m0 m0Var = vhVar.f42868z;
        boolean z13 = true;
        switch (m0Var == null ? -1 : f.f46937a[m0Var.ordinal()]) {
            case 1:
                return 92;
            case 2:
                return 96;
            case 3:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
            case 4:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
            case 5:
                return 93;
            case 6:
                kh khVar = vhVar.f42858p;
                Integer l13 = khVar != null ? khVar.l() : null;
                return (l13 != null && l13.intValue() == 1) ? RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW : RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN;
            case 7:
                if (q13 != null) {
                    int hashCode = q13.hashCode();
                    if (hashCode != -1809295830) {
                        if (hashCode != -199016082) {
                            if (hashCode == 1171022635 && q13.equals("HAIR_PATTERN_FILTER_QUERIES")) {
                                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
                            }
                        } else if (q13.equals("closeup_stl_3p_ads_only_module")) {
                            return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE;
                        }
                    } else if (q13.equals("SKIN_TONE_FILTER_QUERIES")) {
                        return 100;
                    }
                }
                return ((Number) tVar.invoke()).intValue();
            case 8:
                int size = kg.a.i0(vhVar).f138879a.size();
                boolean z14 = false;
                if (a0Var != null) {
                    z3 activate = z3.ACTIVATE_EXPERIMENT;
                    Intrinsics.checkNotNullParameter("enabled_frontend_v_five", "group");
                    Intrinsics.checkNotNullParameter(activate, "activate");
                    z0 z0Var = a0Var.f83294a;
                    if (!((g1) z0Var).k("shopping_unit_closeup_ui_v_two", "enabled_frontend_v_five", activate)) {
                        Intrinsics.checkNotNullParameter("employees", "group");
                        Intrinsics.checkNotNullParameter(activate, "activate");
                        if (!((g1) z0Var).k("shopping_unit_closeup_ui_v_two", "employees", activate)) {
                            z13 = false;
                        }
                    }
                    z14 = z13;
                }
                if (size >= 4 && z14) {
                    return RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL;
                }
                if (size >= 6) {
                    return RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID;
                }
                return -1;
            default:
                return ((Number) tVar.invoke()).intValue();
        }
    }
}
