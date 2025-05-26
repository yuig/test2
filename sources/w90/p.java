package w90;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.q1;
import androidx.fragment.app.s0;
import androidx.fragment.app.w0;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.a4;
import h32.d4;
import h32.x3;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw90/p;", "Lp82/b;", "<init>", "()V", "draftPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p extends i0 {
    public static final /* synthetic */ int V0 = 0;
    public a82.b K0;
    public lb0.r L0;
    public final m1 M0;
    public View N0;
    public GestaltSpinner O0;
    public zy.a0 P0;
    public final int Q0;
    public final int R0;
    public final j S0;
    public final d4 T0;
    public final a4 U0;

    public p() {
        xk2.k q13 = jq.b.q(23, new q1(this, 22), xk2.n.NONE);
        int i13 = 21;
        this.M0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(h0.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.P0 = new zy.a0();
        this.Q0 = l0.fragment_collage_draft_picker;
        this.R0 = 96;
        this.S0 = new j(this, 0);
        this.T0 = d4.FEED;
        this.U0 = a4.COLLAGES_PICKER;
    }

    @Override // nl1.d, ku1.k
    public final void D5() {
        if (U6()) {
            super.D5();
        } else {
            P7();
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(e9().a(), 13);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new mq.z(e9().c(), 27);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        b3.G(adapter, 0, new j(this, 2), xa0.d.f134398a, new com.pinterest.boardAutoCollages.l(this, 1), new a8.v(this, 22), null, 96);
    }

    @Override // p82.b
    public final Function0 Y8() {
        return this.S0;
    }

    @Override // p82.b
    /* renamed from: Z8, reason: from getter */
    public final int getU0() {
        return this.R0;
    }

    @Override // p82.b
    /* renamed from: a9, reason: from getter */
    public final int getA0() {
        return this.Q0;
    }

    public final h0 e9() {
        return (h0) this.M0.getValue();
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.P0.e();
    }

    @Override // sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return 3;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.P0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF53439t0() {
        return this.U0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF53438s0() {
        return this.T0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(e9().c(), 28);
    }

    @Override // yq0.t
    public final v0 n8() {
        cp.b bVar = new cp.b(this, 4);
        requireContext();
        return new v0(new PinterestGridLayoutManager(bVar, 3));
    }

    @Override // w90.i0, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
    }

    @Override // p82.b, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean G = com.bumptech.glide.d.G(this, "{CollageDraftPickerExtras.}EXTRA_ALLOW_NAVIGATION_TO_COMPOSER", false);
        h0 e93 = e9();
        String R0 = dl2.b.R0(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_PIN_ID", ""));
        String R02 = dl2.b.R0(com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID", ""));
        d32.a aVar = d32.c.Companion;
        d32.c cVar = d32.c.UNKNOWN;
        int O = com.bumptech.glide.d.O(this, "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE", cVar.getValue());
        aVar.getClass();
        d32.c a13 = d32.a.a(O);
        if (a13 != null) {
            cVar = a13;
        }
        Navigation navigation = this.I;
        boolean d2 = Intrinsics.d(navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT") : null, "com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT_CUTOUT_TOOL");
        h32.i0 i03 = com.bumptech.glide.d.i0(null, this.U0, this.T0, "");
        String f13 = this.P0.f();
        lb0.r rVar = this.L0;
        if (rVar != null) {
            e93.h(R0, R02, cVar, d2, i03, f13, G, rVar);
        } else {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        int X = bs1.c.X(this, j0.collage_draft_picker_create_cell_height);
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.f52531a.setPaddingRelative(pinterestRecyclerView.getPaddingStart(), pinterestRecyclerView.getPaddingTop(), pinterestRecyclerView.getPaddingEnd(), X);
        }
        a8(new eb2.k(bs1.c.X(this, eo1.c.space_100)));
        l nextState = l.f128561j;
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        mm1.k kVar = this.E0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.i().T(nextState);
        l nextState2 = l.f128562k;
        Intrinsics.checkNotNullParameter(nextState2, "nextState");
        mm1.k kVar2 = this.E0;
        if (kVar2 == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar2.h().u(nextState2);
        View findViewById = v13.findViewById(k0.saving_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.N0 = findViewById;
        View findViewById2 = v13.findViewById(k0.saving_overlay_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.O0 = (GestaltSpinner) findViewById2;
        ComposeView composeView = (ComposeView) v13.findViewById(k0.fixed_footer_content);
        m mVar = new m(this, 0);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(mVar, true, -461448618));
        kh2.b0.D1(this, new o(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.P0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }

    @Override // nl1.d, ku1.k
    public final void z(Function1 shouldStopDismissingAt) {
        Intrinsics.checkNotNullParameter(shouldStopDismissingAt, "shouldStopDismissingAt");
        if (U6()) {
            super.z(shouldStopDismissingAt);
            return;
        }
        w0 parentFragmentManager = getParentFragmentManager();
        Bundle j13 = e0.t.j(new Pair("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_KEY_NEW_COLLAGE", Boolean.TRUE));
        s0 s0Var = (s0) parentFragmentManager.f18460l.get("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE");
        if (s0Var == null || !s0Var.b(androidx.lifecycle.r.STARTED)) {
            parentFragmentManager.f18459k.put("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE", j13);
        } else {
            s0Var.a("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE", j13);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Setting fragment result with key com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE and result " + j13);
        }
        P7();
    }
}
