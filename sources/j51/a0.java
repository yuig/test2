package j51;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.feature.profile.pills.view.PillView;
import df.j1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f74706r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f74707s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f74708t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, View view, bl2.c cVar) {
        super(2, cVar);
        this.f74707s = d0Var;
        this.f74708t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a0 a0Var = new a0(this.f74707s, this.f74708t, cVar);
        a0Var.f74706r = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((i51.g) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        PillView pillView;
        wy0 f13;
        ViewGroup viewGroup;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i51.g gVar = (i51.g) this.f74706r;
        boolean z13 = gVar.f71590g;
        d0 d0Var = this.f74707s;
        if (z13) {
            c51.e eVar = d0Var.f74721a1;
            if (eVar != null) {
                ((g51.n) eVar).onRecyclerRefresh();
            }
            d0Var.m9().f71578e.e().a(i51.l.f71596a);
        }
        boolean z14 = gVar.f71584a;
        View view = this.f74708t;
        u41.e eVar2 = gVar.f71585b;
        if ((z14 && bs1.c.j1(view)) || (eVar2 != null && bs1.c.j1(d0Var.f74729i1))) {
            bs1.c.U1(view);
        }
        FilterBarView filterBarView = d0Var.f74728h1;
        x31.c cVar = gVar.f71587d;
        if (filterBarView != null) {
            tx0.j events = new tx0.j(d0Var.m9().f71578e.e(), 15);
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            Intrinsics.checkNotNullParameter(events, "events");
            filterBarView.o(i51.g.e(gVar, false, null, null, ph.a.N0(cVar, events), false, null, false, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL).f71587d.f131617a);
        }
        i51.d dVar = (i51.d) gVar.f71586c;
        Integer num = null;
        if (!Intrinsics.d(dVar, d0Var.f74730j1)) {
            i51.d dVar2 = d0Var.f74730j1;
            d0Var.f74730j1 = dVar;
            i51.b bVar = i51.b.f71574a;
            if (Intrinsics.d(dVar, bVar)) {
                ViewGroup viewGroup2 = d0Var.f74727g1;
                EmptyStateBannerView emptyStateBannerView = viewGroup2 instanceof EmptyStateBannerView ? (EmptyStateBannerView) viewGroup2 : null;
                if (emptyStateBannerView != null) {
                    emptyStateBannerView.o(kh2.b0.y0(d0Var.n9(), new s(d0Var, 21), c0.f74716i));
                }
                yk1.v n93 = d0Var.n9();
                Intrinsics.checkNotNullParameter(n93, "<this>");
                g92.d x03 = j1.x0(((yk1.a) n93).f139225b);
                Intrinsics.checkNotNullParameter(x03, "<this>");
                if ((x03 == g92.d.CALICO || x03 == g92.d.CALICO_0_0_1_BETA_7) && (viewGroup = d0Var.f74727g1) != null) {
                    viewGroup.setPaddingRelative(viewGroup.getPaddingStart(), bs1.c.X(d0Var, nz1.a.profile_boards_empty_state_top_spacing_group_filter_calico), viewGroup.getPaddingEnd(), viewGroup.getPaddingBottom());
                }
            } else if (Intrinsics.d(dVar2, bVar)) {
                ViewGroup viewGroup3 = d0Var.f74727g1;
                EmptyStateBannerView emptyStateBannerView2 = viewGroup3 instanceof EmptyStateBannerView ? (EmptyStateBannerView) viewGroup3 : null;
                if (emptyStateBannerView2 != null) {
                    emptyStateBannerView2.o(kh2.b0.Z(d0Var.n9(), new s(d0Var, 22)));
                }
            }
            c51.e eVar3 = d0Var.f74721a1;
            if (eVar3 != null) {
                ((g51.n) eVar3).L3(dVar);
            }
        }
        boolean z15 = false;
        byte b13 = 0;
        int i13 = 1;
        if (eVar2 == null) {
            bs1.c.X0(d0Var.f74729i1);
        } else {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            if ((!cVar.f131617a.f131615a.f120474a.isEmpty()) && (pillView = d0Var.f74729i1) != null) {
                bs1.c.U1(pillView);
                u41.g tap = new u41.g(nz1.c.boards_tab_sort_button, new x(d0Var, b13 == true ? 1 : 0));
                int i14 = nz1.f.accessibility_filter_icon_profile_boards_tab;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                bm1.m pill = bm1.m.e(eVar2.f120483a, null, null, null, false, null, 0, new k0(i14, new ArrayList(0)), 63);
                Intrinsics.checkNotNullParameter(pill, "pill");
                Intrinsics.checkNotNullParameter(tap, "tap");
                pillView.o(new u41.e(pill, tap));
            }
        }
        if (gVar.f71588e && !d0Var.f74732l1) {
            d0Var.f74732l1 = true;
            d0Var.Y4(new ha2.a(kh2.b0.m0(gVar.f71589f, d0Var.o9(), true, false, !d0Var.k9() || ((f13 = ((b60.d) d0Var.getActiveUserManager()).f()) != null && Intrinsics.d(f13.L2(), Boolean.TRUE)), true, new y11.c(18, gVar, d0Var), new x(d0Var, i13)), z15, num, 14));
        }
        return Unit.f80348a;
    }
}
