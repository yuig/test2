package fa0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kh2.g3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f61490b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f61491c;

    public i0(o82.i0 multiSectionStateTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f61490b = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: fa0.d0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((l) obj).f61510e;
            }
        }, new kotlin.jvm.internal.d0() { // from class: fa0.e0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((j0) obj).f61496d;
            }
        }, f0.f61482j);
        this.f61491c = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: fa0.g0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((l) obj).f61511f;
            }
        }, new kotlin.jvm.internal.d0() { // from class: fa0.h0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((j0) obj).f61497e;
            }
        }, f0.f61483k);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        j0 vmState = (j0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new l(true, !vmState.f61495c, i.f61489a, c.f61476a, new o82.a0(), new zy.a0()), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f61490b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens2 = this.f61491c;
        Intrinsics.checkNotNullParameter(lens2, "lens");
        Intrinsics.checkNotNullParameter(lens2, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens2.b(resultBuilder);
        ra0.c cVar = vmState.f61493a;
        resultBuilder.d(new b(cVar), new f(cVar, kotlin.collections.q0.f80391a));
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        m event = (m) sVar;
        l priorDisplayState = (l) oVar;
        j0 priorVMState = (j0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof e) {
            ll1.d event2 = ((e) event).f61478a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f61491c;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof q0) {
            o82.g0 event3 = ((q0) event).f61528a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens2 = this.f61490b;
            Intrinsics.checkNotNullParameter(lens2, "lens");
            Intrinsics.checkNotNullParameter(event3, "event");
            Intrinsics.checkNotNullParameter(lens2, "$lens");
            Intrinsics.checkNotNullParameter(event3, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens2.a(event3, resultBuilder);
        } else if (event instanceof w0) {
            resultBuilder.f(new p90.n0((w0) event, 20));
        } else if (event instanceof v0) {
            v0 v0Var = (v0) event;
            resultBuilder.h(new p90.n0(v0Var, 19));
            resultBuilder.f(q.f61526l);
            resultBuilder.b(v0Var.f61540b);
        } else if (event instanceof u0) {
            resultBuilder.f(q.f61525k);
            int i13 = i92.e.generic_error;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            resultBuilder.a(new m0(new k92.n(new k92.c(new u50.k0(i13, new ArrayList(0)), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
        } else if (event instanceof l0) {
            resultBuilder.f(new p90.n0(event, 21));
        } else if (event instanceof o0) {
            resultBuilder.f(new p90.n0(new n0(((o0) event).f61519a), 22));
        } else if (event instanceof p0) {
            resultBuilder.f(new p90.n0(i.f61489a, 22));
        } else if (event instanceof a) {
            resultBuilder.a(new h(al1.b.f15477a));
        } else if (event instanceof k) {
            j0 j0Var = (j0) resultBuilder.f82219b;
            f30 f30Var = j0Var.f61494b;
            ra0.c cVar = j0Var.f61493a;
            String pinId = cVar.f106906a;
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            b0 hVar = new h(new al1.d((ScreenLocation) com.pinterest.screens.r0.f51250a.getValue(), al1.n.b(new Pair("RemixPinSelection.REMIX_PIN_SELECTION_RESULT_KEY", pinId))));
            b0[] b0VarArr = new b0[2];
            j0 j0Var2 = (j0) resultBuilder.f82219b;
            Intrinsics.checkNotNullParameter(j0Var2, "<this>");
            b0VarArr[0] = new g(g3.o0(j0Var2.f61497e, null, h32.u0.COLLAGE_REMIX_COLLAGE_BUTTON, f1.TAP, null, null, null, new HashMap()));
            if (f30Var == null) {
                hVar = new f(cVar, kotlin.collections.e0.b(hVar));
            }
            b0VarArr[1] = hVar;
            resultBuilder.d(b0VarArr);
        } else {
            if (!(event instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = x.f61542a;
            j0 j0Var3 = (j0) resultBuilder.f82219b;
            resultBuilder.a(new s0(list, j0Var3.f61493a, j0Var3.f61497e.f143086a));
        }
        return resultBuilder.e();
    }
}
