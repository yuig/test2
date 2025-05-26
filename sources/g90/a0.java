package g90;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import h32.f1;
import h32.i0;
import kh2.g3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l82.h0;

/* loaded from: classes5.dex */
public final class a0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f64507b;

    public a0(lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f64507b = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: g90.x
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f64505c;
            }
        }, new kotlin.jvm.internal.d0() { // from class: g90.y
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b0) obj).f64511c;
            }
        }, z.f64569i);
    }

    public static void g(l82.e eVar, ScreenLocation screenLocation, boolean z13, i0 i0Var, String str) {
        if (z13) {
            eVar.d(new t(new zy.e0(new zy.a(i0Var, f1.COLLAGE_CUTOUT_DRAWER_CLOSE, str, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
        }
        eVar.a(new u(new al1.f(kotlin.collections.e0.b(screenLocation))));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        b0 vmState = (b0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new a(), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f64507b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        resultBuilder.a(new s(vmState.f64509a));
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        f1 f1Var;
        h event = (h) sVar;
        a priorDisplayState = (a) oVar;
        b0 priorVMState = (b0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof f) {
            ll1.d event2 = ((f) event).f64526a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            h0 lens = this.f64507b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof e) {
            resultBuilder.f(new sv.y(this, event, priorVMState, 9));
        } else if (event instanceof b) {
            g(resultBuilder, ((b) event).f64508a, priorVMState.f64512d, priorVMState.f64511c.f143086a, priorVMState.f64513e);
        } else if (event instanceof g) {
            g(resultBuilder, ((g) event).f64527a, priorVMState.f64512d, priorVMState.f64511c.f143086a, priorVMState.f64513e);
        } else if (event instanceof d) {
            if (priorVMState.f64512d) {
                i0 i0Var2 = priorVMState.f64511c.f143086a;
                d dVar = (d) event;
                int i13 = w.f64566a[dVar.f64520a.ordinal()];
                if (i13 == 1) {
                    f1Var = f1.COLLAGE_CUTOUT_ITEM_SWIPE_RIGHT;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f1Var = f1.COLLAGE_CUTOUT_ITEM_SWIPE_LEFT;
                }
                f1 f1Var2 = f1Var;
                String str = dVar.f64521b;
                String str2 = priorVMState.f64513e;
                resultBuilder.d(new t(new zy.e0(new zy.a(i0Var2, f1Var2, str2, null, g3.B(str2, priorVMState.f64514f, str), null, false, false, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM))));
            }
        } else if ((event instanceof c) && priorVMState.f64512d) {
            i0 i0Var3 = priorVMState.f64511c.f143086a;
            String str3 = ((c) event).f64515a;
            f1 f1Var3 = f1.COLLAGE_CUTOUT_ITEM_VIEW;
            String str4 = priorVMState.f64513e;
            resultBuilder.d(new t(new zy.e0(new zy.a(i0Var3, f1Var3, str4, null, g3.B(str4, priorVMState.f64514f, str3), null, false, false, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM))));
        }
        return resultBuilder.e();
    }
}
