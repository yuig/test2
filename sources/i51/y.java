package i51;

import androidx.compose.foundation.lazy.layout.z0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh2.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import l82.i0;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class y extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final x31.o f71618b;

    public y() {
        x31.o filterBarStateTransformer = new x31.o(new lt.j(2));
        Intrinsics.checkNotNullParameter(filterBarStateTransformer, "filterBarStateTransformer");
        this.f71618b = filterBarStateTransformer;
    }

    @Override // l82.d
    public final l82.c0 c(i0 i0Var) {
        a0 vmState = (a0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        boolean z13 = vmState.f71567b;
        x31.p pVar = vmState.f71573h;
        x31.c M0 = ph.a.M0(bp1.h.J(pVar.f131638d, new v(vmState, 0)), pVar);
        int i13 = z.f71619a[vmState.f71570e.ordinal()];
        u41.e eVar = null;
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rm1.q qVar = rm1.q.ARROWS_VERTICAL;
            u41.e eVar2 = u41.f.f120485a;
            eVar = new u41.e(new bm1.m(bm1.o.SMALL, null, new bm1.b(null, qVar, true), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN));
        }
        return new l82.c0(new g(z13, eVar, null, M0, false, vmState.f71571f, false), vmState, q0.f80391a);
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        l82.c0 e13;
        r event = (r) sVar;
        g priorDisplayState = (g) oVar;
        a0 priorVMState = (a0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        int i13 = 1;
        if (event instanceof p) {
            wy0 user = ((p) event).f71601a;
            Intrinsics.checkNotNullParameter(priorVMState, "<this>");
            Intrinsics.checkNotNullParameter(user, "user");
            boolean q13 = dl2.b.q1(user);
            Integer p43 = user.p4();
            Intrinsics.checkNotNullExpressionValue(p43, "getSecretBoardCount(...)");
            boolean z13 = p43.intValue() > 0;
            Boolean b33 = user.b3();
            Intrinsics.checkNotNullExpressionValue(b33, "getHasArchivedBoards(...)");
            boolean booleanValue = b33.booleanValue();
            int i14 = 3;
            d[] elements = new d[3];
            elements[0] = q13 ? b.f71574a : null;
            elements[1] = z13 ? c.f71579a : null;
            elements[2] = booleanValue ? a.f71564a : null;
            Intrinsics.checkNotNullParameter(elements, "elements");
            ArrayList A = kotlin.collections.c0.A(elements);
            Set F0 = ph.a.F0(priorVMState.f71573h);
            ArrayList arrayList = new ArrayList();
            for (Object obj : F0) {
                if (!CollectionsKt.L(A, (x31.a) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((x31.a) it.next()).a());
            }
            Map map = priorVMState.f71573h.f131640f;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!arrayList2.contains((x31.r) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            a0 b13 = a0.b(priorVMState, q13, z13, booleanValue, null, x31.p.b(priorVMState.f71573h, A, null, linkedHashMap, null, null, 471), RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL);
            resultBuilder.h(new v(b13, i13));
            resultBuilder.f(new v(b13, i14));
            if (!priorVMState.f71567b && b13.f71567b) {
                List<x31.a> list = b13.f71573h.f131638d;
                ArrayList arrayList3 = new ArrayList(g0.q(list, 10));
                for (x31.a aVar : list) {
                    f1 f1Var = f1.VIEW;
                    h32.i0 z03 = com.bumptech.glide.d.z0(b13.f71572g.f143086a, w.f71611l);
                    HashMap hashMap = new HashMap();
                    hashMap.put("profile_filter", aVar.a().nameForLogging());
                    arrayList3.add(new s(new e0(new zy.a(z03, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION))));
                }
                resultBuilder.b(arrayList3);
            }
            e13 = resultBuilder.e();
        } else if (event instanceof j) {
            x31.p pVar = priorVMState.f71573h;
            List list2 = pVar.f131638d;
            int a13 = y0.a(g0.q(list2, 10));
            int i15 = 16;
            if (a13 < 16) {
                a13 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a13);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                linkedHashMap2.put(((x31.a) it2.next()).a(), bm1.n.UNSELECTED);
            }
            a0 b14 = a0.b(priorVMState, false, false, false, null, x31.p.b(pVar, null, null, linkedHashMap2, null, null, 479), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            resultBuilder.h(new v(b14, 4));
            resultBuilder.f(new y11.c(i15, priorDisplayState, b14));
            e13 = resultBuilder.e();
        } else if (event instanceof n) {
            resultBuilder.f(w.f71612m);
            resultBuilder.a(u2.X(u0.BOARDS_DISPLAY_OPTIONS_BUTTON, priorVMState.f71572g, null));
            e13 = resultBuilder.e();
        } else if (event instanceof h) {
            resultBuilder.f(w.f71613n);
            e13 = resultBuilder.e();
        } else if (event instanceof o) {
            resultBuilder.h(new x(event, 0));
            resultBuilder.f(new x(event, 1));
            e13 = resultBuilder.e();
        } else {
            if (!(event instanceof m)) {
                if (!(event instanceof q)) {
                    if (event instanceof k) {
                        HashMap hashMap2 = new HashMap();
                        k kVar = (k) event;
                        hashMap2.put("is_checked", String.valueOf(kVar.f71595b));
                        resultBuilder.a(u2.X(kVar.f71594a, priorVMState.f71572g, hashMap2));
                        return resultBuilder.e();
                    }
                    if (event instanceof i) {
                        resultBuilder.f(w.f71609j);
                        return resultBuilder.e();
                    }
                    if (!(event instanceof l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.f(w.f71610k);
                    return resultBuilder.e();
                }
                q qVar = (q) event;
                l82.c0 e14 = this.f71618b.e(qVar.f71602a, priorDisplayState.f71587d, priorVMState.f71573h);
                j0 j0Var = new j0();
                i0 i0Var2 = e14.f82213b;
                g e15 = g.e(priorDisplayState, false, null, (x31.a) CollectionsKt.T(ph.a.F0((x31.p) i0Var2)), (x31.c) e14.f82212a, false, null, false, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
                j0Var.f80434a = e15;
                if (qVar.f71602a instanceof x31.f) {
                    u41.e eVar = priorDisplayState.f71585b;
                    j0Var.f80434a = g.e(e15, false, eVar != null ? u41.e.a(eVar, bm1.m.e(eVar.f120483a, null, null, null, ph.a.F0((x31.p) i0Var2).isEmpty(), null, 0, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL), null, 2) : null, null, null, false, null, false, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
                }
                resultBuilder.f(new z0(10, j0Var));
                resultBuilder.h(new bt0.r(e14, 24));
                List list3 = e14.f82214c;
                ArrayList arrayList4 = new ArrayList(g0.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(new s((k0) it3.next()));
                }
                resultBuilder.b(arrayList4);
                return resultBuilder.e();
            }
            m mVar = (m) event;
            resultBuilder.a(new t(mVar.f71597a, mVar.f71598b, false));
            resultBuilder.a(u2.X(u0.EDIT_BOARDS_VISIBILITY, priorVMState.f71572g, null));
            e13 = resultBuilder.e();
        }
        return e13;
    }
}
