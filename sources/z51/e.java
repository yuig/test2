package z51;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.v0;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.scheduledpins.view.ScheduledPinDateTabView;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import dl1.s;
import ek.i;
import h32.a4;
import h32.d4;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.e2;
import nx.d0;
import pk.a0;
import rl2.g0;
import so.a3;
import so.oa;
import wk1.k;
import x02.i2;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lz51/e;", "Lwk1/k;", "Ldl1/s;", "Lz51/g;", "Lnr0/j;", "<init>", "()V", "l3/c", "scheduledPins_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends k<s> implements g {

    /* renamed from: a1, reason: collision with root package name */
    public static final SimpleDateFormat f140868a1 = new SimpleDateFormat("MMMM", Locale.getDefault());
    public i2 M0;
    public uk1.e N0;
    public a3 O0;
    public GestaltText Q0;
    public GestaltTabLayout R0;
    public boolean V0;
    public f X0;
    public final qc2.d P0 = new qc2.d();
    public int S0 = -1;
    public int T0 = -1;
    public int U0 = -1;
    public boolean W0 = true;
    public final d4 Y0 = d4.FEED;
    public final a4 Z0 = a4.USER_SCHEDULED_PINS;

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, new d(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, new d(this, 1));
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.b0(getString(q22.c.scheduled_pin_feed_toolbar_title));
        gestaltToolbarImpl.u().setTint(bs1.c.C(this, eo1.b.color_themed_text_default));
    }

    @Override // yk1.k
    public final m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        i2 i2Var = this.M0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        uk1.e eVar = this.N0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).f(s7(), ""));
        wk1.c a13 = bVar.a();
        a3 a3Var = this.O0;
        if (a3Var != null) {
            return a3Var.a(a13);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    public final boolean g9(int i13) {
        GestaltTabLayout gestaltTabLayout = this.R0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = gestaltTabLayout.n(i13);
        View view = n13 != null ? n13.f59129f : null;
        ScheduledPinDateTabView scheduledPinDateTabView = view instanceof ScheduledPinDateTabView ? (ScheduledPinDateTabView) view : null;
        if (scheduledPinDateTabView == null) {
            return false;
        }
        GestaltTabLayout gestaltTabLayout2 = this.R0;
        if (gestaltTabLayout2 != null) {
            return this.P0.d(scheduledPinDateTabView, gestaltTabLayout2, null) > 0.0f;
        }
        Intrinsics.r("tabLayout");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF115288p0() {
        return this.Z0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.Y0;
    }

    public final void h9(Date date) {
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        Integer n43 = f13 != null ? f13.n4() : null;
        if (n43 != null && n43.intValue() >= 100) {
            FragmentActivity requireActivity = requireActivity();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            g0.h0(requireActivity, requireContext);
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(calendar.getTime().getTime());
        d0 s73 = s7();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        t.M0(s73, requireContext2, ou1.e.SCHEDULED_PIN_FEED, null, null, seconds, 24);
    }

    public final void i9() {
        GestaltTabLayout gestaltTabLayout = this.R0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        int size = gestaltTabLayout.f33126b.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (g9(i13)) {
                break;
            } else {
                i13++;
            }
        }
        GestaltTabLayout gestaltTabLayout2 = this.R0;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        int size2 = gestaltTabLayout2.f33126b.size();
        int i14 = i13;
        for (int i15 = i13 + 1; i15 < size2 && g9(i15); i15++) {
            i14 = i15;
        }
        if (i13 == -1) {
            return;
        }
        if (i13 == this.S0 && i14 == this.T0) {
            return;
        }
        this.S0 = i13;
        this.T0 = i14;
        f fVar = this.X0;
        if (fVar != null) {
            ((y51.c) fVar).z3(i13, i14);
        }
    }

    public final void j9(boolean z13) {
        GestaltText gestaltText = this.Q0;
        if (gestaltText == null) {
            Intrinsics.r("tabHeader");
            throw null;
        }
        a0.w1(gestaltText);
        GestaltTabLayout gestaltTabLayout = this.R0;
        if (gestaltTabLayout != null) {
            gestaltTabLayout.setVisibility(z13 ? 0 : 8);
        } else {
            Intrinsics.r("tabLayout");
            throw null;
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(q22.b.fragment_scheduled_pin_feed, q22.a.p_recycler_view);
        eVar.f979c = q22.a.empty_state_container;
        eVar.c(q22.a.swipe_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        v0 n83 = super.n8();
        l2 l2Var = n83.f19650a;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager != null) {
            pinterestStaggeredGridLayoutManager.f1(0);
        }
        return n83;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(q22.a.tab_header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.Q0 = (GestaltText) findViewById;
        int i13 = 2;
        i iVar = new i(this, i13);
        View findViewById2 = v13.findViewById(q22.a.tab_layout);
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById2;
        int i14 = eo1.d.empty_indicator;
        if (i14 != 0) {
            gestaltTabLayout.x(com.bumptech.glide.c.I(gestaltTabLayout.getContext(), i14));
        } else {
            gestaltTabLayout.x(null);
        }
        gestaltTabLayout.setPaddingRelative(0, 0, 0, 0);
        gestaltTabLayout.b(iVar);
        gestaltTabLayout.getViewTreeObserver().addOnScrollChangedListener(new e2(this, i13));
        gestaltTabLayout.getViewTreeObserver().addOnGlobalLayoutListener(new cu.k(this, 4));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.R0 = gestaltTabLayout;
        b8(new c0(this, 21));
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        O8(new b(requireContext, new c(this)), 48);
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f(true);
        }
        super.onViewCreated(v13, bundle);
    }
}
