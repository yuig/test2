package sv;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import h32.f1;
import h32.i0;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import l82.h0;
import zy.e0;
import zy.l0;

/* loaded from: classes3.dex */
public final class a0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f115259b;

    public a0(lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f115259b = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: sv.v
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((i) obj).f115299d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: sv.w
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((c0) obj).f115266c;
            }
        }, x.f115316i);
    }

    public static void g(l82.e eVar, i0 i0Var, String str, String str2, String str3) {
        eVar.d(new s(new e0(new zy.a(i0Var, f1.COLLAGE_CUTOUT_ITEM_VIEW, str3, null, g3.B(str3, str2, str), null, false, false, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM))));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        c0 vmState = (c0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new i(), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f115259b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        resultBuilder.a(new p(vmState.f115264a));
        resultBuilder.d(new q(vmState.f115267d));
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        o event = (o) sVar;
        i priorDisplayState = (i) oVar;
        c0 priorVMState = (c0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof m) {
            resultBuilder.f(new y(this, event, priorVMState, 0));
            g(resultBuilder, priorVMState.f115266c.f143086a, priorVMState.f115270g, priorVMState.f115268e, priorVMState.f115267d);
        } else if (event instanceof n) {
            ScreenLocation screenLocation = ((n) event).f115309a;
            resultBuilder.d(new s(new e0(new zy.a(priorVMState.f115266c.f143086a, f1.COLLAGE_CUTOUT_DRAWER_CLOSE, priorVMState.f115267d, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
            resultBuilder.a(new t(new al1.f(kotlin.collections.e0.b(screenLocation))));
        } else if (event instanceof l) {
            int i13 = priorVMState.f115269f;
            l lVar = (l) event;
            int i14 = lVar.f115305a;
            if (i13 != i14) {
                l0 l0Var = priorVMState.f115266c;
                i0 i0Var2 = l0Var.f143086a;
                f1 f1Var = i14 > i13 ? f1.COLLAGE_CUTOUT_ITEM_SWIPE_LEFT : f1.COLLAGE_CUTOUT_ITEM_SWIPE_RIGHT;
                String str = priorVMState.f115267d;
                String str2 = priorVMState.f115268e;
                resultBuilder.d(new s(new e0(new zy.a(i0Var2, f1Var, str, null, g3.B(str, str2, priorVMState.f115270g), null, false, false, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM))));
                g(resultBuilder, l0Var.f143086a, lVar.f115306b, str2, priorVMState.f115267d);
                resultBuilder.h(new z(event, 0));
            }
        } else if (event instanceof k) {
            i0 i0Var3 = priorVMState.f115266c.f143086a;
            f1 f1Var2 = f1.COLLAGE_CUTOUT_ITEM_CLICKTHROUGH;
            String str3 = priorVMState.f115267d;
            resultBuilder.d(new s(new e0(new zy.a(i0Var3, f1Var2, str3, null, g3.B(str3, priorVMState.f115268e, priorVMState.f115270g), null, false, false, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM))));
        } else if (event instanceof j) {
            resultBuilder.f(new z(event, 1));
        }
        return resultBuilder.e();
    }
}
