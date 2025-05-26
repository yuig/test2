package tj0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import i32.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import so.oa;
import so.s3;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltj0/m;", "Ltj0/d;", "", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "default_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m extends q implements mj0.c {
    public i2 Y0;
    public uk1.e Z0;

    /* renamed from: a1, reason: collision with root package name */
    public s3 f117881a1;

    /* renamed from: b1, reason: collision with root package name */
    public m60.f0 f117882b1;

    /* renamed from: c1, reason: collision with root package name */
    public CollapsingToolbarLayout f117883c1;

    /* renamed from: d1, reason: collision with root package name */
    public androidx.recyclerview.widget.c0 f117884d1;

    /* renamed from: e1, reason: collision with root package name */
    public final d4 f117885e1;

    /* renamed from: f1, reason: collision with root package name */
    public final a4 f117886f1;

    public m() {
        this.Y = true;
        this.f117885e1 = d4.BOARD_SECTION;
        this.f117886f1 = a4.BOARD_SECTION_IDEAS;
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Q(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default, x0.back);
        gestaltToolbarImpl.Z(f62.e.board_view_content_more_ideas_title_updated, fm1.c.VISIBLE);
        gestaltToolbarImpl.m();
    }

    @Override // mj0.c
    public final void U5() {
        ur0.g.d(y0.ANDROID_OWN_BOARD_SECTION_MORE_IDEAS_TAKEOVER, this, null);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String v03;
        x22.c cVar;
        pj0.s a13;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.Z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.Y0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a14 = bVar.a();
        s3 s3Var = this.f117881a1;
        if (s3Var == null) {
            Intrinsics.r("moreIdeasPresenterFactory");
            throw null;
        }
        Navigation navigation = this.I;
        String v04 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_ID") : null;
        m60.f0 f0Var = this.f117882b1;
        if (f0Var == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var.N(v04, "Board id not sent to fragment through navigation!", new Object[0]);
        String str = v04 == null ? "" : v04;
        Navigation navigation2 = this.I;
        if (navigation2 == null || (v03 = navigation2.getF49940b()) == null) {
            Navigation navigation3 = this.I;
            v03 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_BOARD_SECTION_ID") : null;
        }
        m60.f0 f0Var2 = this.f117882b1;
        if (f0Var2 == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var2.N(v03, "Board section id not sent to fragment through navigation!", new Object[0]);
        String str2 = v03 == null ? "" : v03;
        Navigation navigation4 = this.I;
        nj0.a aVar = new nj0.a(str, str2, navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_FROM_NEWSHUB_ID") : null, null, 24);
        hk0.m mVar = hk0.m.BOARD_SECTION;
        Navigation navigation5 = this.I;
        if (navigation5 != null) {
            int J1 = navigation5.J1("com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
            x22.c.Companion.getClass();
            cVar = x22.a.a(J1);
            if (cVar == null) {
                cVar = x22.c.OTHER;
            }
        } else {
            cVar = x22.c.OTHER;
        }
        a13 = s3Var.a(aVar, mVar, cVar, a14, (r19 & 16) != 0 ? true : !(this.I != null ? r0.S("com.pinterest.EXTRA_HIDE_ONE_TAP_SAVE_BUTTON", false) : false), (r19 & 32) != 0 ? true : true, (r19 & 64) != 0 ? true : true, null);
        return a13;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.f117886f1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.f117885e1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(t60.c.fragment_board_more_ideas_tool, t60.b.p_recycler_view);
        eVar.f979c = t60.b.empty_state_container;
        eVar.c(t60.b.swipe_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        androidx.recyclerview.widget.c0 c0Var = this.f117884d1;
        if (c0Var == null) {
            Intrinsics.r("headerScrollListener");
            throw null;
        }
        A8(c0Var);
        super.onDestroyView();
    }

    @Override // tj0.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(t60.b.board_more_ideas_tool_header);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById;
        collapsingToolbarLayout.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f117883c1 = collapsingToolbarLayout;
        androidx.recyclerview.widget.c0 c0Var = new androidx.recyclerview.widget.c0(this, 8);
        this.f117884d1 = c0Var;
        b8(c0Var);
    }
}
