package k81;

import c71.b0;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.o00;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;

/* loaded from: classes5.dex */
public final class e implements ov1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f78595a;

    public e(l lVar) {
        this.f78595a = lVar;
    }

    @Override // ov1.d
    public final void t1(List selectedOneBarModules) {
        o00 v13;
        String p13;
        String moduleId;
        k00 q13;
        k00 q14;
        k00 q15;
        Map w13;
        Object obj;
        k00 q16;
        Map w14;
        Object obj2;
        String obj3;
        Map u13;
        Object obj4;
        Intrinsics.checkNotNullParameter(selectedOneBarModules, "selectedOneBarModules");
        l lVar = this.f78595a;
        lVar.f78658z0.Z();
        lVar.f78636o0 = true;
        g00 g00Var = (g00) CollectionsKt.firstOrNull(selectedOneBarModules);
        String str = null;
        if (!com.bumptech.glide.d.o0(g00Var != null ? Boolean.valueOf(pe.i.Q0(g00Var)) : null)) {
            lVar.f78640q0 = false;
            lVar.e4();
            return;
        }
        lVar.T.postDelayed(new a(lVar, 4), 500L);
        String obj5 = (g00Var == null || (u13 = g00Var.u()) == null || (obj4 = u13.get("hybrid_search_params")) == null) ? null : obj4.toString();
        j81.e eVar = lVar.f78658z0;
        eVar.k0(obj5);
        eVar.m0(null);
        eVar.j0((g00Var == null || (q16 = g00Var.q()) == null || (w14 = q16.w()) == null || (obj2 = w14.get("journey_depth")) == null || (obj3 = obj2.toString()) == null) ? null : Integer.valueOf((int) Float.parseFloat(obj3)).toString());
        eVar.o0((g00Var == null || (q15 = g00Var.q()) == null || (w13 = q15.w()) == null || (obj = w13.get("source_module_id")) == null) ? null : obj.toString());
        eVar.p0("hybrid_search_filter");
        eVar.i0(null);
        String y13 = (g00Var == null || (q14 = g00Var.q()) == null) ? null : q14.y();
        if (y13 == null) {
            f0 f0Var = eVar.f49121k;
            if (f0Var != null) {
                f0Var.h("selected_descriptors");
            }
        } else {
            f0 f0Var2 = eVar.f49121k;
            if (f0Var2 != null) {
                f0Var2.e("selected_descriptors", y13);
            }
        }
        i81.d dVar = (i81.d) lVar.getViewIfBound();
        if (dVar != null) {
            h61.h hVar = h61.h.PINS;
            if (g00Var != null && (q13 = g00Var.q()) != null) {
                str = q13.y();
            }
            ((l81.l) dVar).I9(new b0(hVar, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, -4, 1048575));
        }
        i81.d dVar2 = (i81.d) lVar.getViewIfBound();
        String str2 = "";
        if (dVar2 != null) {
            if (g00Var == null || (moduleId = g00Var.getUid()) == null) {
                moduleId = "";
            }
            Intrinsics.checkNotNullParameter(moduleId, "moduleId");
            ov1.k kVar = ((l81.l) dVar2).P2;
            if (kVar != null) {
                kVar.a(moduleId);
            }
        }
        i81.d dVar3 = (i81.d) lVar.getViewIfBound();
        if (dVar3 != null) {
            if (g00Var != null && (v13 = g00Var.v()) != null && (p13 = v13.p()) != null) {
                str2 = p13;
            }
            ((l81.l) dVar3).M9(str2);
        }
        lVar.f78640q0 = true;
        lVar.loadData();
    }
}
