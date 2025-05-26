package k51;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import ha2.b0;
import ha2.c0;
import ha2.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final class u implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final rd.j f78335a;

    /* renamed from: b, reason: collision with root package name */
    public final g f78336b;

    /* renamed from: c, reason: collision with root package name */
    public final w f78337c;

    public u(rd.j stateBasedPinalytics, g userPrefsSEPUtil, w eventManager) {
        Intrinsics.checkNotNullParameter(stateBasedPinalytics, "stateBasedPinalytics");
        Intrinsics.checkNotNullParameter(userPrefsSEPUtil, "userPrefsSEPUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f78335a = stateBasedPinalytics;
        this.f78336b = userPrefsSEPUtil;
        this.f78337c = eventManager;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, m request, u50.r eventIntake) {
        k41.f fVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof j;
        w wVar = this.f78337c;
        if (z13) {
            a.c.y(wVar);
            return;
        }
        if (!(request instanceof k)) {
            if (request instanceof l) {
                b22.l updatedPinsViewType = ((l) request).f78327a;
                g gVar = this.f78336b;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(updatedPinsViewType, "updatedPinsViewType");
                gVar.f78321a.h("PREF_PROFILE_PIN_VIEW_TYPE", updatedPinsViewType.ordinal());
                return;
            }
            if (request instanceof h) {
                h hVar = (h) request;
                i0 i0Var = hVar.f78322a;
                int ordinal = hVar.f78323b.ordinal();
                u0 u0Var = ordinal == b22.l.WIDE.ordinal() ? u0.PROFILE_PIN_REP_VIEW_SINGLE_COLUMN_OPTION : ordinal == b22.l.COMPACT.ordinal() ? u0.PROFILE_PIN_REP_VIEW_DENSE_OPTION : u0.PROFILE_PIN_REP_VIEW_DEFAULT_OPTION;
                g0 g0Var = hVar.f78322a.f67084d;
                if (g0Var == null) {
                    g0Var = g0.PROFILE_PIN_REP_VIEW_TYPE_TOGGLE;
                }
                k(i0Var, g0Var, u0Var);
                return;
            }
            if (request instanceof i) {
                i0 i0Var2 = ((i) request).f78324a;
                u0 u0Var2 = u0.PINS_DISPLAY_OPTIONS_BUTTON;
                g0 g0Var2 = i0Var2.f67084d;
                if (g0Var2 == null) {
                    g0Var2 = g0.NAVIGATION;
                }
                k(i0Var2, g0Var2, u0Var2);
                return;
            }
            return;
        }
        b22.l pinsViewType = ((k) request).f78326a;
        Intrinsics.checkNotNullParameter(pinsViewType, "pinsViewType");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        k41.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(pinsViewType, "pinsViewType");
        int i13 = k41.d.f78305a[pinsViewType.ordinal()];
        if (i13 == 1) {
            fVar = k41.f.Wide;
        } else if (i13 == 2) {
            fVar = k41.f.Default;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = k41.f.Compact;
        }
        p70.a aVar = new p70.a(eventIntake, 20);
        x xVar = new x(oz1.e.lego_profile_view_option_title, null, null, null, null, 30);
        c0[] c0VarArr = new c0[3];
        int i14 = oz1.e.lego_profile_pins_view_option_wide;
        k41.f fVar2 = k41.f.Wide;
        c0VarArr[0] = new c0(i14, fVar2.ordinal(), null, fVar == fVar2, false, null, null, null, null, null, 4084);
        int i15 = oz1.e.lego_profile_view_option_standard;
        k41.f fVar3 = k41.f.Default;
        c0VarArr[1] = new c0(i15, fVar3.ordinal(), null, fVar == fVar3, false, null, null, null, null, null, 4084);
        int i16 = oz1.e.lego_profile_view_option_compact;
        k41.f fVar4 = k41.f.Compact;
        c0VarArr[2] = new c0(i16, fVar4.ordinal(), null, fVar == fVar4, false, null, null, null, null, null, 4084);
        wVar.d(new jc0.v(new lp.k(new ha2.a(e0.b(new b0(xVar, f0.j(c0VarArr), aVar)), false, (Integer) null, 14)), false, 0L, 30));
        eventIntake.a(p.f78331a);
    }

    public final void k(i0 i0Var, g0 g0Var, u0 u0Var) {
        this.f78335a.n(new zy.a(com.bumptech.glide.d.z0(i0Var, new nx.i0(g0Var, u0Var, 2)), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN));
    }
}
