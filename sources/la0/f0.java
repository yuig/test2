package la0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.feature.profile.filters.FilterBarView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.x3;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import o82.b3;
import o82.o2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lla0/f0;", "Lo82/v2;", "<init>", "()V", "retrieval_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f0 extends p1 {
    public static final /* synthetic */ int V0 = 0;
    public qa2.j0 L0;
    public t2 M0;
    public ni1.d0 N0;
    public a82.b O0;
    public final androidx.lifecycle.m1 P0;
    public FilterBarView Q0;
    public View R0;
    public GestaltSpinner S0;
    public zy.a0 T0;
    public final xk2.v U0;

    public f0() {
        androidx.fragment.app.q1 q1Var = new androidx.fragment.app.q1(this, 27);
        xk2.n nVar = xk2.n.NONE;
        xk2.k a13 = xk2.m.a(nVar, new ca0.b0(4, q1Var));
        int i13 = 26;
        this.P0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(n1.class), new mq.e0(a13, i13), new mq.f0(null, a13, i13), new mq.g0(this, a13, i13));
        xk2.m.a(nVar, new a0(this, 6));
        this.T0 = new zy.a0();
        this.U0 = xk2.m.b(new a0(this, 0));
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_COLLAGE_COMPOSER_RESULT_CODE") && result.getBoolean("com.pinterest.EXTRA_COLLAGE_COMPOSER_RESULT_KEY_SAVED") && this.f76939c) {
            kh2.j.x2(l9(), new p(o82.d0.f93560a));
        }
    }

    @Override // o82.v2, o82.i3
    public final List R8() {
        return CollectionsKt.l0(kotlin.collections.e0.b(new tq0.k((ca0.y) T8())), super.R8());
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (com.bumptech.glide.d.O(this, "RetrievalExtras.COLLAGE_RETRIEVAL_TITLE_RES_ID", 0) == 0) {
            ((GestaltToolbarImpl) toolbar).B();
            return;
        }
        rm1.q qVar = rm1.q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.g0();
        gestaltToolbarImpl.P(drawableRes, eo1.b.color_themed_icon_default);
        gestaltToolbarImpl.Y(com.bumptech.glide.d.O(this, "RetrievalExtras.COLLAGE_RETRIEVAL_TITLE_RES_ID", 0));
        gestaltToolbarImpl.m();
    }

    @Override // o82.i3
    public final u50.r T8() {
        return new ca0.y(l9().c(), 7);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(l9().a(), 16);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(l9().c(), 5);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        final int i13 = 1;
        a0 a0Var = new a0(this, i13);
        xa0.d dVar = xa0.d.f134398a;
        final int i14 = 0;
        b3.G(adapter, 0, a0Var, dVar, new ns.i(5), new o2(this) { // from class: la0.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f82489b;

            {
                this.f82489b = this;
            }

            @Override // o82.o2
            public final Object invoke(Object obj) {
                int i15 = i14;
                f0 this$0 = this.f82489b;
                xa0.f vmState = (xa0.f) obj;
                switch (i15) {
                    case 0:
                        int i16 = f0.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        break;
                    default:
                        int i17 = f0.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        break;
                }
                return this$0.m9(vmState);
            }
        }, null, 96);
        int i15 = 2;
        b3.G(adapter, 1, new a0(this, i15), dVar, new com.pinterest.boardAutoCollages.l(this, i15), new o2(this) { // from class: la0.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f82489b;

            {
                this.f82489b = this;
            }

            @Override // o82.o2
            public final Object invoke(Object obj) {
                int i152 = i13;
                f0 this$0 = this.f82489b;
                xa0.f vmState = (xa0.f) obj;
                switch (i152) {
                    case 0:
                        int i16 = f0.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        break;
                    default:
                        int i17 = f0.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(vmState, "vmState");
                        break;
                }
                return this$0.m9(vmState);
            }
        }, null, 96);
        adapter.H(2, new a0(this, 3));
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.T0.e();
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getV0() {
        if (k9()) {
            return h32.g0.COLLAGES_TAB;
        }
        return null;
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        if (com.bumptech.glide.d.G(this, "RetrievalExtras.COLLAGE_IS_IN_TABBED_VIEW", false)) {
            return 3;
        }
        return hf0.b.f69004d;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.T0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF103167r0() {
        return k9() ? a4.USER_SELF : a4.COLLAGES_FEED;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF73869c0() {
        return k9() ? d4.USER : d4.FEED;
    }

    public final boolean k9() {
        return com.bumptech.glide.d.G(this, "RetrievalExtras.COLLAGE_IS_PROFILE_TAB", false);
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new ca0.y(l9().c(), 6);
    }

    public final n1 l9() {
        return (n1) this.P0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(ka0.a0.fragment_collage_retrieval_feed, ka0.z.p_recycler_view);
        eVar.c(ka0.z.swipe_container);
        eVar.f979c = ka0.z.empty_state_container;
        return eVar;
    }

    public final xa0.a m9(xa0.f fVar) {
        xa0.a aVar;
        if ((fVar instanceof xa0.d) || Intrinsics.d(fVar, xa0.b.f134395a)) {
            return new xa0.a(null, 0, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        }
        if (fVar instanceof xa0.e) {
            xa0.e eVar = (xa0.e) fVar;
            aVar = new xa0.a(eVar.b(), eVar.d(), false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
        } else {
            if (!(fVar instanceof xa0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            e30 R6 = new f30().R6();
            xa0.c cVar = (xa0.c) fVar;
            R6.h2(cVar.b());
            aVar = new xa0.a(R6.a(), cVar.d(), true, false, !com.bumptech.glide.d.G(this, "RetrievalExtras.COLLAGE_IS_IN_TABBED_VIEW", false), !com.bumptech.glide.d.G(this, "RetrievalExtras.COLLAGE_IS_IN_TABBED_VIEW", false), 24);
        }
        return aVar;
    }

    @Override // o82.v2, yq0.t
    public final androidx.recyclerview.widget.v0 n8() {
        cp.b bVar = new cp.b(this, 5);
        requireContext();
        return new androidx.recyclerview.widget.v0(new PinterestGridLayoutManager(bVar, getT0()));
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n1 l93 = l9();
        Serializable W = com.bumptech.glide.d.W(this, "RetrievalExtras.COLLAGE_RETRIEVAL_TYPE");
        xa0.l lVar = W instanceof xa0.l ? (xa0.l) W : null;
        if (lVar == null) {
            lVar = xa0.l.ALL;
        }
        xa0.l lVar2 = lVar;
        boolean k93 = k9();
        Serializable W2 = com.bumptech.glide.d.W(this, "RetrievalExtras.COLLAGE_RETRIEVAL_DRAFT_SELECTION_RESULT");
        xa0.q qVar = W2 instanceof xa0.q ? (xa0.q) W2 : null;
        if (qVar == null) {
            qVar = xa0.q.OpenComposer;
        }
        xa0.q qVar2 = qVar;
        h32.i0 i03 = com.bumptech.glide.d.i0(getV0(), getF103167r0(), getF73869c0(), "");
        String f13 = this.T0.f();
        Context context = getContext();
        l93.h(lVar2, k93, qVar2, i03, f13, context != null ? dl2.b.A1(context) : false);
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        kh2.j.x2(l9(), q.f82459a);
        super.onDestroyView();
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        PinterestEmptyStateLayout pinterestEmptyStateLayout;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        int X = bs1.c.X(this, eo1.c.margin_half);
        H8(X, k9() ? 0 : X, X, bs1.c.X(this, eo1.c.bottom_nav_height));
        View findViewById = v13.findViewById(ka0.z.filter_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FilterBarView filterBarView = (FilterBarView) findViewById;
        Intrinsics.checkNotNullParameter(filterBarView, "<set-?>");
        this.Q0 = filterBarView;
        View findViewById2 = v13.findViewById(ka0.z.progress_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        Intrinsics.checkNotNullParameter(findViewById2, "<set-?>");
        this.R0 = findViewById2;
        View findViewById3 = v13.findViewById(ka0.z.progress_overlay_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById3;
        Intrinsics.checkNotNullParameter(gestaltSpinner, "<set-?>");
        this.S0 = gestaltSpinner;
        if (k9() && (pinterestEmptyStateLayout = this.f139733g0) != null) {
            pinterestEmptyStateLayout.h((EmptyStateBannerView) this.U0.getValue(), 1);
        }
        kh2.j.x2(l9(), r.f82461a);
        kh2.b0.D1(this, new d0(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.T0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(ka0.z.toolbar);
    }
}
