package tj0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.PinFeed;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.PinterestRecyclerView;
import jk2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltj0/d;", "Lwk1/k;", "Ldl1/s;", "Lmj0/d;", "Lmj0/e;", "<init>", "()V", "boardMoreIdeasLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class d extends o<dl1.s> implements mj0.d, mj0.e {
    public static final /* synthetic */ int U0 = 0;
    public b0 R0;
    public ek2.j S0;
    public int T0;

    public d() {
        this.Y = true;
        this.T0 = -1;
    }

    @Override // mj0.e
    public final void C5(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        View view = getView();
        if (view != null) {
            bs1.c.s2(view, message);
        }
    }

    @Override // sq0.e, np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        super.I4(pinUid, pinFeed, i13, i14, str);
        this.T0 = p8() + i14;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public void K7() {
        PinterestRecyclerView pinterestRecyclerView;
        super.K7();
        int i13 = this.T0;
        if (i13 != -1 && (pinterestRecyclerView = this.f139736j0) != null) {
            pinterestRecyclerView.i(i13, 0);
        }
        this.T0 = -1;
    }

    @Override // sq0.e, yq0.b0
    public void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, dl2.b.m2(s7(), W8(), new b10.z(23, requireContext, this)));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL, dl2.b.m2(s7(), W8(), new c(this, requireContext, adapter)));
        adapter.G(160, new c(requireContext, adapter, this, 1));
        adapter.H(new int[]{RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN}, dl2.b.m2(s7(), W8(), new c(requireContext, adapter, this, 2)));
        adapter.H(new int[]{RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN}, dl2.b.m2(s7(), W8(), new c(requireContext, adapter, this, 3)));
        adapter.G(241213245, new jh0.d(this, 7));
    }

    public boolean j9(gb2.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.f64754b == wa2.p.STATE_HIDDEN) {
            if (state.f64755c != wa2.o.UI_ONLY) {
                return true;
            }
        }
        return false;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ek2.j jVar = this.S0;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        super.onDestroy();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(7, a.f117850j);
        dVar.getClass();
        xj2.c F = new jk2.x(new j1(pk2.f.j(new j1(dVar, aVar, 0), new qt.b(7, a.f117851k), 2, "filter(...)"), new lb0.c(28, a.f117852l), 0), new com.pinterest.framework.multisection.datasource.pagedlist.h(28, new b(this, 0)), 2).F(new pj0.f(6, new b(this, 1)), new pj0.f(7, a.f117853m), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.S0 = (ek2.j) F;
    }

    @Override // mj0.d
    public final boolean t3() {
        return !com.bumptech.glide.d.G(this, "EXTRA_NAVBAR_HIDE", false);
    }
}
