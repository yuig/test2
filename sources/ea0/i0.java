package ea0;

import com.pinterest.collage.remix.screens.CollageRemixLocation;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import h32.d4;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import kh2.g3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f57961b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f57962c;

    public i0(o82.i0 multiSectionStateTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f57961b = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: ea0.d0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((l) obj).f57975d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ea0.e0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((j0) obj).f57964b;
            }
        }, f0.f57954j);
        this.f57962c = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: ea0.g0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((l) obj).f57976e;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ea0.h0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((j0) obj).f57965c;
            }
        }, f0.f57955k);
    }

    public static void g(boolean z13, ra0.c ids, l82.e eVar) {
        b0[] b0VarArr = new b0[2];
        j0 j0Var = (j0) eVar.f82219b;
        String id3 = ids.f106906a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(id3, "id");
        d4 d4Var = d4.COLLAGE;
        b0VarArr[0] = new g(g3.o0(j0Var.f57965c, null, null, f1.TAP, z13 ? a4.FEATURED_COLLAGE : a4.COLLAGE, d4Var, id3, new HashMap()));
        boolean z14 = ((j0) eVar.f82219b).f57963a;
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(ids, "ids");
        NavigationImpl w13 = Navigation.w1(CollageRemixLocation.COLLAGE_REMIX_CLOSEUP);
        w13.m0("SOURCE_PIN_ID", ids.f106906a);
        w13.m0("SOURCE_SHUFFLE_ID", ids.f106907b);
        w13.m0("SOURCE_USER_ID", ids.f106908c);
        w13.Y1("RetrievalExtras.COLLAGE_IS_TEMPLATES", z14);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        b0VarArr[1] = new h(new al1.a(w13));
        eVar.d(b0VarArr);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        j0 vmState = (j0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        boolean z13 = !vmState.f57963a;
        int i13 = k.collage_remix_selection_title;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        l82.e resultBuilder = l82.d.d(new l(new u50.k0(i13, new ArrayList(0)), z13, false, new o82.a0(), new zy.a0()), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f57961b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens2 = this.f57962c;
        Intrinsics.checkNotNullParameter(lens2, "lens");
        Intrinsics.checkNotNullParameter(lens2, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens2.b(resultBuilder);
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
        if (event instanceof m0) {
            o82.g0 event2 = ((m0) event).f57978a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f57961b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof f) {
            ll1.d event3 = ((f) event).f57953a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens2 = this.f57962c;
            Intrinsics.checkNotNullParameter(lens2, "lens");
            Intrinsics.checkNotNullParameter(event3, "event");
            Intrinsics.checkNotNullParameter(lens2, "$lens");
            Intrinsics.checkNotNullParameter(event3, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens2.a(event3, resultBuilder);
        } else if (event instanceof a) {
            resultBuilder.a(new h(al1.b.f15477a));
        } else if (event instanceof b) {
            g(false, kh2.n.p(((b) event).f57947a), resultBuilder);
        } else if (event instanceof c) {
            g(true, ((c) event).f57948a, resultBuilder);
        } else if (event instanceof r0) {
            ra0.c ids = ((r0) event).f57999a;
            Intrinsics.checkNotNullParameter(ids, "ids");
            resultBuilder.a(new e(ids, kotlin.collections.e0.b(new h(new al1.d((ScreenLocation) com.pinterest.screens.r0.f51250a.getValue(), al1.n.b(new Pair("RemixPinSelection.REMIX_PIN_SELECTION_RESULT_KEY", ids.f106906a)))))));
        } else if (event instanceof q0) {
            resultBuilder.f(new cp.t(((q0) event).f57996a, 16));
        } else if (event instanceof p0) {
            resultBuilder.f(p.f57990n);
            resultBuilder.b(((p0) event).f57993b);
        } else {
            if (!(event instanceof o0)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.f(p.f57989m);
            int i13 = i92.e.generic_error;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            resultBuilder.a(new l0(new k92.n(new k92.c(new u50.k0(i13, new ArrayList(0)), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
        }
        return resultBuilder.e();
    }
}
