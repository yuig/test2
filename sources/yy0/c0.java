package yy0;

import c2.j4;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import l82.h0;
import l82.i0;
import la0.l1;

/* loaded from: classes5.dex */
public final class c0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f140428b;

    public c0(lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        this.f140428b = b(pinalyticsTransformer, new kotlin.jvm.internal.d0() { // from class: yy0.z
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((d) obj).f140434d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: yy0.a0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((d0) obj).f140438b;
            }
        }, b0.f140425i);
    }

    public static /* synthetic */ void h(c0 c0Var, l82.e eVar, f1 f1Var, u0 u0Var, String str, int i13) {
        c0Var.g(null, (i13 & 2) != 0 ? null : u0Var, f1Var, eVar, (i13 & 8) != 0 ? null : str);
    }

    @Override // l82.d
    public final l82.c0 c(i0 i0Var) {
        d0 vmState = (d0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        d dVar = new d();
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        Intrinsics.checkNotNullParameter("enabled_31_2", "group");
        String str = (String) vmState.f140437a.get("ap_android_nux_revamp_additional_use_cases");
        d0 b13 = d0.b(vmState, null, (str == null || !kotlin.text.z.i(str, "enabled_31_2", true)) ? 1 : 2, 63);
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        Intrinsics.checkNotNullParameter("enabled_31_2", "group");
        String str2 = (String) vmState.f140437a.get("ap_android_nux_revamp_additional_use_cases");
        int i13 = 3;
        l82.e eVar = new l82.e(dVar, b13, kotlin.collections.e0.b(new p(str2 != null ? kotlin.text.z.i(str2, "enabled_31_2", true) : false ? 5 : 3)));
        eVar.f(new tk0.h0(i13, eVar));
        return eVar.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        int i13;
        l event = (l) sVar;
        d priorDisplayState = (d) oVar;
        d0 priorVMState = (d0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof k) {
            resultBuilder.f(new ky0.b(1, ((k) event).f140461a, resultBuilder));
        } else if (event instanceof j) {
            h(this, resultBuilder, f1.USE_CASE_IMPRESSION_ONE_PIXEL, null, ((j) event).f140460a, 6);
        } else if (event instanceof i) {
            String str = ((i) event).f140459a;
            List<f0> list = ((d) resultBuilder.f82218a).f140431a;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            for (f0 f0Var : list) {
                if (Intrinsics.d(f0Var.f140450a, str)) {
                    boolean z13 = !f0Var.f140454e;
                    String id3 = f0Var.f140450a;
                    Intrinsics.checkNotNullParameter(id3, "id");
                    u50.i0 title = f0Var.f140452c;
                    Intrinsics.checkNotNullParameter(title, "title");
                    u50.i backgroundColor = f0Var.f140453d;
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    f0Var = new f0(id3, f0Var.f140451b, title, backgroundColor, z13, f0Var.f140455f);
                }
                arrayList.add(f0Var);
            }
            int i14 = ((d0) resultBuilder.f82219b).f140443g;
            Object obj = null;
            if (arrayList.isEmpty()) {
                i13 = 0;
            } else {
                Iterator it = arrayList.iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    if (((f0) it.next()).f140454e && (i15 = i15 + 1) < 0) {
                        kotlin.collections.f0.o();
                        throw null;
                    }
                }
                i13 = i15;
            }
            resultBuilder.f(new j4(i14, resultBuilder, i14 - i13, i13, arrayList));
            resultBuilder.a(new q(str, !((d0) resultBuilder.f82219b).f140439c));
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.d(((f0) next).f140450a, str)) {
                    obj = next;
                    break;
                }
            }
            f0 f0Var2 = (f0) obj;
            boolean z14 = f0Var2 != null ? f0Var2.f140454e : false;
            f1 f1Var = z14 ? f1.SELECT : f1.UNSELECT;
            u0 u0Var = u0.USE_CASE;
            h(this, resultBuilder, f1Var, u0Var, str, 4);
            g(bs1.c.p(new Pair("selected", String.valueOf(z14))), u0Var, f1.TAP, resultBuilder, str);
        } else if (event instanceof e) {
            h(this, resultBuilder, f1.TAP, u0.NEXT_BUTTON, null, 12);
            h(this, resultBuilder, f1.NUX_STEP_END, null, null, 14);
        } else {
            if (!(event instanceof h)) {
                if (event instanceof f) {
                    l82.f0 transformation = this.f140428b.c(((f) event).f140449a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation, "transformation");
                    transformation.i(resultBuilder);
                } else if (event instanceof g) {
                    h(this, resultBuilder, ((g) event).f140457a.getEventType(), null, null, 14);
                }
                return resultBuilder.e();
            }
            h(this, resultBuilder, f1.NUX_DROP_OFF, null, null, 14);
        }
        return resultBuilder.e();
    }

    public final void g(nx.d dVar, u0 u0Var, f1 f1Var, l82.e eVar, String str) {
        eVar.a(new s(new zy.e0(new zy.a(com.bumptech.glide.d.z0(((d0) eVar.f82219b).f140438b.f143086a, new l1(u0Var, 3)), f1Var, str, dVar, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
    }
}
