package ca0;

import com.pinterest.api.model.PinnableImage;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.HashMap;
import kh2.g3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f27178b;

    public y0(lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f27178b = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: ca0.u0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((d) obj).f27093l;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ca0.v0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a1) obj).f27071h;
            }
        }, w0.f27170j);
    }

    public static void g(y0 y0Var, l82.e eVar, h32.u0 u0Var, h32.f1 f1Var, HashMap auxData, int i13) {
        if ((i13 & 1) != 0) {
            u0Var = null;
        }
        h32.u0 u0Var2 = u0Var;
        if ((i13 & 4) != 0) {
            f1Var = h32.f1.TAP;
        }
        h32.f1 eventType = f1Var;
        y0Var.getClass();
        a1 a1Var = (a1) eVar.f82219b;
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        eVar.a(new p0(g3.p0(a1Var.f27071h, null, u0Var2, null, null, eventType, auxData, 19)));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        a1 vmState = (a1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new d(null, null, vmState.f27070g, false, 3583), vmState);
        com.google.firebase.messaging.a0 transformation = this.f27178b.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(d2);
        d2.a(o0.f27149a);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        u event = (u) sVar;
        d priorDisplayState = (d) oVar;
        a1 priorVMState = (a1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof l) {
            l82.f0 transformation = this.f27178b.c(((l) event).f27141a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
        } else if (event instanceof t) {
            resultBuilder.h(new x0(event, 4));
            resultBuilder.f(new x0(event, 5));
        } else if (event instanceof j) {
            resultBuilder.h(new x0(event, 6));
            resultBuilder.f(new x0(event, 7));
        } else if (event instanceof e) {
            resultBuilder.h(new x0(event, 8));
            resultBuilder.f(new x0(event, 9));
        } else if (event instanceof k) {
            resultBuilder.h(new x0(event, 10));
            resultBuilder.f(new x0(event, 11));
        } else if (event instanceof g) {
            resultBuilder.h(new x0(event, 12));
            resultBuilder.f(new x0(event, 0));
        } else if (event instanceof i) {
            resultBuilder.f(new x0(event, 1));
            resultBuilder.h(new x0(event, 2));
        } else if (event instanceof m) {
            resultBuilder.h(new x0(event, 3));
            resultBuilder.f(f0.f27109k);
        } else if (event instanceof h) {
            NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.j0.f50998a.getValue(), "", ml1.b.MODAL_TRANSITION.getValue());
            L.m0("com.pinterest.EXTRA_BOARD_PICKER_TYPE", "com.pinterest.EXTRA_BOARD_PICKER_TYPE_SIMPLE");
            L.Y1("com.pinterest.EXTRA_ALLOW_PROFILE_SAVE_OPTION", true);
            Unit unit = Unit.f80348a;
            Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
            resultBuilder.d(new q0(new al1.a(L)));
        } else if (event instanceof f) {
            resultBuilder.a(new q0(al1.b.f15477a));
        } else if (event instanceof r) {
            resultBuilder.a(new q0(new al1.e("CollageComposerExtras.COLLAGE_SAVED_RESULT_CODE", al1.n.a(new Pair("CollageComposerExtras.COLLAGE_SAVED_RESULT_KEY", Boolean.TRUE)))));
            g(this, resultBuilder, h32.u0.SHUFFLES_COLLAGE_CREATE_SAVE_FOR_LATER_BUTTON, null, kh2.d.j(priorVMState.f27064a, null), 6);
        } else if (event instanceof n) {
            a1 a1Var = (a1) resultBuilder.f82219b;
            resultBuilder.a(new r0(a1Var.f27064a, a1Var.f27068e, a1Var.f27065b, a1Var.f27066c, a1Var.f27067d, a1Var.f27069f, a1Var.f27070g));
            g(this, resultBuilder, h32.u0.SHUFFLES_COLLAGE_CREATE_PUBLISH_BUTTON, null, kh2.d.j(a1Var.f27064a, null), 6);
        } else if (event instanceof q) {
            q qVar = (q) event;
            if (qVar instanceof o) {
                h32.f1 f1Var = h32.f1.PIN_CREATE_ATTEMPTED;
                Pair pair = new Pair("pin_creation_method", da0.g.Collage.getValue());
                o oVar2 = (o) qVar;
                PinnableImage pinnableImage = oVar2.f27147a;
                HashMap o13 = bs1.c.o(pair, new Pair("image_url", pinnableImage.f35569f), new Pair("source_url", pinnableImage.f35570g));
                String str = oVar2.f27148b;
                if (str != null) {
                    o13.put("board_id", str);
                }
                Unit unit2 = Unit.f80348a;
                g(this, resultBuilder, null, f1Var, o13, 3);
            } else {
                if (!(qVar instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                resultBuilder.d(new q0(new al1.e("CollageComposerExtras.COLLAGE_PUBLISHED_RESULT_CODE", al1.n.a(new Pair("CollageComposerExtras.COLLAGE_PUBLISHED_RESULT_KEY", Boolean.TRUE)))));
            }
        } else {
            if (!(event instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.d(new s0(((s) event).f27161a));
        }
        return resultBuilder.e();
    }
}
