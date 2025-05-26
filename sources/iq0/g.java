package iq0;

import a.cb;
import a.z0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import eq0.m;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import qa2.n;
import so.b7;
import so.oa;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liq0/g;", "Lgq0/d;", "Leq0/e;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends k implements eq0.e {

    /* renamed from: f1, reason: collision with root package name */
    public static final /* synthetic */ int f73404f1 = 0;
    public hq0.f X0;
    public m Y0;
    public uk1.e Z0;

    /* renamed from: a1, reason: collision with root package name */
    public i2 f73405a1;

    /* renamed from: b1, reason: collision with root package name */
    public b7 f73406b1;

    /* renamed from: c1, reason: collision with root package name */
    public final d4 f73407c1 = d4.CONVERSATION;

    /* renamed from: d1, reason: collision with root package name */
    public final a4 f73408d1 = a4.USER_PINS;

    /* renamed from: e1, reason: collision with root package name */
    public final g0 f73409e1 = g0.MODAL_CONVERSATION_DISCOVERY;

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // gq0.d, sq0.e
    public final n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        return new eq0.d(s7(), y32.f.CLOSEUP_LONGPRESS, new z0(this, 5)).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String g93 = g9();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        boolean S1 = dl2.b.S1(com.bumptech.glide.d.Q(getActiveUserManager()), g93);
        uk1.e eVar = this.Z0;
        eq0.n nVar = null;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(new fq0.a(S1, ((uk1.a) eVar).f122378a, 0));
        i2 i2Var = this.f73405a1;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        b7 b7Var = this.f73406b1;
        if (b7Var == null) {
            Intrinsics.r("conversationUserPinsTabPresenterFactory");
            throw null;
        }
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_ID", "");
        String g94 = g9();
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID", "");
        if (Z2.length() > 0) {
            String Z3 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_THREAD_ID", "");
            nVar = new eq0.n(Z3.length() == 0 ? null : Z3, Z2, null, null, false);
        }
        return b7Var.a(Z, g94, nVar, f7(), a13);
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF128048d1() {
        return this.f73409e1;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.f73408d1;
    }

    @Override // gq0.d, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140010x0() {
        return this.f73407c1;
    }

    @Override // gq0.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext);
        String string = legoEmptyStateView.getResources().getString(xc0.i.empty_user_pin_tab_see_other_ideas);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoEmptyStateView.b(new b41.c(1, string, new zp0.a(this, 2)));
        legoEmptyStateView.i();
        String string2 = legoEmptyStateView.getResources().getString(x0.library_empty_feed_me);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        legoEmptyStateView.e(string2);
        legoEmptyStateView.setPaddingRelative(legoEmptyStateView.getPaddingStart(), legoEmptyStateView.getResources().getDimensionPixelOffset(r0.lego_empty_state_view_top_spacing), legoEmptyStateView.getPaddingEnd(), legoEmptyStateView.getPaddingBottom());
        O8(legoEmptyStateView, 49);
    }

    @Override // eq0.e
    public final void r(m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.Y0 = listener;
    }

    @Override // eq0.e
    public final void y5(hq0.f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.X0 = listener;
    }
}
