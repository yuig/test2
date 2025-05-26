package un0;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import nx.d0;
import oo1.j;
import tl1.i;
import wt1.c0;
import wt1.o;
import wt1.p;
import yk1.n;
import yk1.v;
import yq0.t;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f122827j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h hVar, int i13) {
        super(1);
        this.f122826i = i13;
        this.f122827j = hVar;
    }

    public final void b(Throwable it) {
        int i13 = this.f122826i;
        h hVar = this.f122827j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                hVar.E = false;
                hVar.f122839g.i(((yk1.a) hVar.f122840h).f139224a.getString(x0.generic_error));
                break;
            default:
                v vVar = hVar.f122840h;
                j.r(((yk1.a) vVar).f139224a.getString(x0.pinmarklet_generic_error), it);
                hVar.E = false;
                break;
        }
    }

    public final void e(c0 c0Var) {
        int i13 = this.f122826i;
        h hVar = this.f122827j;
        switch (i13) {
            case 4:
                if (!hVar.M.t0()) {
                    d0 pinalytics = hVar.getPinalytics();
                    f1 f1Var = f1.BOARD_END;
                    g0 g0Var = g0.DYNAMIC_GRID_STORY;
                    HashMap hashMap = new HashMap();
                    String str = hVar.f122833a;
                    hashMap.put("board_id", str);
                    String str2 = hVar.f122834b;
                    hashMap.put("board_section_id", str2);
                    v7 v7Var = hVar.f122857y;
                    bs1.c.G1("board_pin_count", v7Var != null ? String.valueOf(v7Var.l1()) : null, hashMap);
                    ba baVar = hVar.f122858z;
                    bs1.c.G1("board_section_pin_count", baVar != null ? String.valueOf(baVar.x()) : null, hashMap);
                    Unit unit = Unit.f80348a;
                    d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
                    if (hVar.B3()) {
                        d0 pinalytics2 = hVar.getPinalytics();
                        f1 f1Var2 = f1.RENDER;
                        u0 u0Var = u0.MORE_IDEAS_SECTION_NAME;
                        HashMap x13 = a.a.x("board_id", str, "board_section_id", str2);
                        v7 v7Var2 = hVar.f122857y;
                        bs1.c.G1("board_pin_count", v7Var2 != null ? String.valueOf(v7Var2.l1()) : null, x13);
                        ba baVar2 = hVar.f122858z;
                        bs1.c.G1("board_section_pin_count", baVar2 != null ? String.valueOf(baVar2.x()) : null, x13);
                        pinalytics2.h0((r18 & 1) != 0 ? f1.TAP : f1Var2, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : x13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        break;
                    }
                }
                break;
            default:
                if ((c0Var instanceof p) && hVar.f122856x.G.isSelectAllBackendToggled()) {
                    i iVar = c0Var.f131096b;
                    o oVar = iVar instanceof o ? (o) iVar : null;
                    List list = oVar != null ? oVar.f131124b : null;
                    if (list != null) {
                        ArrayList newPins = new ArrayList();
                        for (Object obj : list) {
                            if (obj instanceof f30) {
                                newPins.add(obj);
                            }
                        }
                        rk0.j jVar = hVar.f122856x;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(newPins, "newPins");
                        jVar.E.addAll(newPins);
                        jVar.n();
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f122826i;
        h hVar = this.f122827j;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                zo.c cVar = zo.c.DEFAULT;
                zo.c f13 = kg.o.f(intValue, cVar);
                d0 pinalytics = hVar.getPinalytics();
                i0 p13 = hVar.getPinalytics().p();
                pinalytics.c0(p13 != null ? com.bumptech.glide.d.z0(p13, b.f122819j) : null, kg.o.j(f13), g0.SHEET, null);
                sn0.a aVar = (sn0.a) hVar.getViewIfBound();
                if (aVar != null) {
                    ((wn0.j) aVar).x2();
                }
                zo.c f14 = kg.o.f(intValue, cVar);
                List w33 = hVar.w3();
                if (hVar.isBound() && hVar.x3() >= 0) {
                    hVar.B = f14;
                    sn0.a aVar2 = (sn0.a) hVar.getViewIfBound();
                    if (aVar2 != null) {
                        ((wn0.j) aVar2).o9(w33.size(), f14);
                    }
                }
                break;
            case 1:
                n nVar = (sn0.a) hVar.getViewIfBound();
                if (nVar != null) {
                    ((t) nVar).setLoadState(yk1.i.LOADING);
                }
                break;
            case 2:
                super/*wk1.q*/.loadData();
                break;
            case 3:
                uk1.c cVar2 = (sn0.a) hVar.getViewIfBound();
                if (cVar2 != null) {
                    ((nl1.d) cVar2).D5();
                }
                break;
            case 4:
                e((c0) obj);
                break;
            case 5:
                e((c0) obj);
                break;
            case 6:
                b((Throwable) obj);
                break;
            case 7:
                j.s(hVar.F, null, (z40.n) obj);
                hVar.E = false;
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
