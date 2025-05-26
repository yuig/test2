package f31;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.f1;
import h32.u0;
import java.util.LinkedHashSet;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final rd.j f60989a;

    /* renamed from: b, reason: collision with root package name */
    public final k51.u f60990b;

    /* renamed from: c, reason: collision with root package name */
    public final g31.d f60991c;

    public a0(rd.j stateBasedPinalytics, k51.u viewOptionsSEP, g31.d allPinsNavigationSEPUtil) {
        Intrinsics.checkNotNullParameter(stateBasedPinalytics, "stateBasedPinalytics");
        Intrinsics.checkNotNullParameter(viewOptionsSEP, "viewOptionsSEP");
        Intrinsics.checkNotNullParameter(allPinsNavigationSEPUtil, "allPinsNavigationSEPUtil");
        this.f60989a = stateBasedPinalytics;
        this.f60990b = viewOptionsSEP;
        this.f60991c = allPinsNavigationSEPUtil;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        k0 request = (k0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof d0;
        g31.d dVar = this.f60991c;
        if (z13) {
            dVar.getClass();
            NavigationImpl w13 = Navigation.w1(i3.b());
            w13.y0("VALUE_SEARCH_LIBRARY", "com.pinterest.EXTRA_SEARCH_MODE");
            dVar.f63444a.d(w13);
            return;
        }
        if (request instanceof e0) {
            dVar.getClass();
            NavigationImpl w14 = Navigation.w1(i3.b());
            w14.y0("VALUE_SEARCH_LIBRARY", "com.pinterest.EXTRA_SEARCH_MODE");
            w14.Y1("com.pinterest.EXTRA_START_VOICE_SEARCH", true);
            dVar.f63444a.d(w14);
            return;
        }
        if (request instanceof b0) {
            dVar.getClass();
            dVar.f63444a.d(new jc0.s());
            return;
        }
        if (request instanceof c0) {
            boolean z14 = ((c0) request).f60995a;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
            if (!z14) {
                eventIntake.a(r.f61028a);
                return;
            }
            Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
            p70.a aVar = new p70.a(eventIntake, 17);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(h1.c(k41.b.Pin, k41.b.Collage));
            if (z14) {
                linkedHashSet.add(k41.b.Board);
            }
            eventIntake.a(new q(new c(new f9.f(aVar, linkedHashSet))));
            return;
        }
        if (request instanceof f0) {
            h32.i0 i0Var = ((f0) request).f61001a;
            u0 u0Var = u0.CREATE_BUTTON;
            h32.g0 g0Var = i0Var.f67084d;
            if (g0Var == null) {
                g0Var = h32.g0.NAVIGATION;
            }
            j(i0Var, g0Var, u0Var, f1.TAP);
            return;
        }
        if (request instanceof g0) {
            h32.i0 i0Var2 = ((g0) request).f61008a;
            u0 u0Var2 = u0.SEARCH_BOX_TEXT_INPUT;
            h32.g0 g0Var2 = i0Var2.f67084d;
            if (g0Var2 == null) {
                g0Var2 = h32.g0.NAVIGATION;
            }
            j(i0Var2, g0Var2, u0Var2, f1.TAP);
            return;
        }
        if (request instanceof h0) {
            h32.i0 i0Var3 = ((h0) request).f61011a;
            u0 u0Var3 = u0.SEARCH_BOX_VOICE_INPUT;
            h32.g0 g0Var3 = i0Var3.f67084d;
            if (g0Var3 == null) {
                g0Var3 = h32.g0.NAVIGATION;
            }
            j(i0Var3, g0Var3, u0Var3, f1.TAP);
            return;
        }
        if (!(request instanceof i0)) {
            if (request instanceof j0) {
                this.f60990b.e(scope, ((j0) request).f61016a, new tx0.j(eventIntake, 11));
                return;
            }
            return;
        }
        h32.i0 i0Var4 = ((i0) request).f61015a;
        u0 u0Var4 = u0.SEARCH_BOX_VOICE_INPUT;
        h32.g0 g0Var4 = i0Var4.f67084d;
        if (g0Var4 == null) {
            g0Var4 = h32.g0.NAVIGATION;
        }
        j(i0Var4, g0Var4, u0Var4, f1.VIEW);
    }

    public final void j(h32.i0 i0Var, h32.g0 g0Var, u0 u0Var, f1 f1Var) {
        this.f60989a.n(new zy.a(com.bumptech.glide.d.z0(i0Var, new nx.i0(g0Var, u0Var, 1)), f1Var, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN));
    }
}
