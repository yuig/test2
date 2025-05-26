package tj0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.v0;
import com.pinterest.framework.screens.ScreenDescription;
import df.j1;
import h32.a4;
import h32.d4;
import i32.y0;
import jk2.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;
import so.oa;
import so.s3;
import x02.i2;
import x02.m0;
import x02.x0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltj0/t;", "Ltj0/d;", "Lmj0/c;", "Lnr0/j;", "Ldl1/s;", "", "<init>", "()V", "default_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t extends r implements mj0.c {

    /* renamed from: h1, reason: collision with root package name */
    public static final /* synthetic */ int f117888h1 = 0;
    public i92.k Y0;
    public rg0.s Z0;

    /* renamed from: a1, reason: collision with root package name */
    public zf0.f f117889a1;

    /* renamed from: b1, reason: collision with root package name */
    public i2 f117890b1;

    /* renamed from: c1, reason: collision with root package name */
    public uk1.e f117891c1;

    /* renamed from: d1, reason: collision with root package name */
    public s3 f117892d1;

    /* renamed from: e1, reason: collision with root package name */
    public lh0.q f117893e1;

    /* renamed from: f1, reason: collision with root package name */
    public x0 f117894f1;

    /* renamed from: g1, reason: collision with root package name */
    public final a4 f117895g1 = a4.BOARD_IDEAS;

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Bundle f49207c;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "unfollow_board")) {
            x0 x0Var = this.f117894f1;
            String boardUid = null;
            if (x0Var == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            ScreenDescription screenDescription = this.f76937a;
            if (screenDescription != null && (f49207c = screenDescription.getF49207c()) != null) {
                boardUid = f49207c.getString("com.pinterest.EXTRA_BOARD_ID");
            }
            if (boardUid == null) {
                boardUid = "";
            }
            Intrinsics.checkNotNullParameter(boardUid, "boardUid");
            d1 d1Var = new d1(x0Var.I(new m0(boardUid), new fx1.d(false, 11), new fx1.d(false, 12)));
            Intrinsics.checkNotNullExpressionValue(d1Var, "ignoreElements(...)");
            d1Var.i(new xo.b(16), new pj0.f(8, a.f117856p));
        }
    }

    @Override // mj0.c
    public final void U5() {
        if (this.f117889a1 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        xk2.v vVar = zf0.f.f141903e;
        y0 y0Var = y0.ANDROID_OWN_BOARD_MORE_IDEAS_TAKEOVER;
        i32.l lVar = i32.l.ANDROID_MORE_IDEAS_ON_BOARD_EDUCATION_TOAST;
        if (!j1.D0(y0Var, lVar)) {
            ur0.g.d(y0Var, this, null);
            return;
        }
        rg0.s sVar = this.Z0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        rg0.n c13 = ((dh0.d) sVar).c(y0Var);
        if (c13 == null) {
            return;
        }
        i92.k kVar = this.Y0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        ag2.e eVar = c13.f108068j;
        kVar.m(eVar != null ? eVar.b() : null);
        if (c13.f108060b == lVar.getValue()) {
            c13.g();
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Bundle f49207c;
        Bundle f49207c2;
        Bundle f49207c3;
        Bundle f49207c4;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        qa2.n W8 = W8();
        W8.f103320a.Y = true;
        bVar.d(W8);
        uk1.e eVar = this.f117891c1;
        z32.f fVar = null;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        boolean z13 = false;
        bVar.g(new s(((uk1.a) eVar).f122378a, 0));
        i2 i2Var = this.f117890b1;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        s3 s3Var = this.f117892d1;
        if (s3Var == null) {
            Intrinsics.r("moreIdeasPresenterFactory");
            throw null;
        }
        ScreenDescription screenDescription = this.f76937a;
        String string = (screenDescription == null || (f49207c4 = screenDescription.getF49207c()) == null) ? null : f49207c4.getString("com.pinterest.EXTRA_BOARD_ID");
        if (string == null) {
            string = "";
        }
        String str = string;
        ScreenDescription screenDescription2 = this.f76937a;
        nj0.a aVar = new nj0.a(str, null, (screenDescription2 == null || (f49207c3 = screenDescription2.getF49207c()) == null) ? null : f49207c3.getString("com.pinterest.EXTRA_FROM_NEWSHUB_ID"), null, 26);
        hk0.m mVar = hk0.m.BOARD;
        x22.c cVar = x22.c.HOME_FEED_SWIPE;
        ScreenDescription screenDescription3 = this.f76937a;
        if (screenDescription3 != null && (f49207c2 = screenDescription3.getF49207c()) != null) {
            z13 = f49207c2.getBoolean("com.pinterest.EXTRA_HIDE_ONE_TAP_SAVE_BUTTON", false);
        }
        boolean z14 = !z13;
        ScreenDescription screenDescription4 = this.f76937a;
        if (screenDescription4 != null && (f49207c = screenDescription4.getF49207c()) != null) {
            int i13 = f49207c.getInt("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE");
            z32.f.Companion.getClass();
            fVar = z32.d.a(i13);
        }
        return s3Var.a(aVar, mVar, cVar, a13, z14, false, true, fVar);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.f117895g1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF140467e0() {
        Bundle f49207c;
        ScreenDescription screenDescription = this.f76937a;
        return (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null || !f49207c.getBoolean("com.pinterest.EXTRA_IS_MORE_IDEAS_FROM_HOME_FEED_REFERRER", false)) ? d4.BOARD : d4.FEED;
    }

    @Override // tj0.d
    public final boolean j9(gb2.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.f64754b == wa2.p.STATE_GEN_AI_TOPIC_OPT_OUT || super.j9(state);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(t60.c.fragment_board_new_ideas_tab, t60.b.p_recycler_view);
        eVar.c(t60.b.swipe_container);
        eVar.f979c = t60.b.empty_state_container;
        return eVar;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        v0 n83 = super.n8();
        lh0.q qVar = this.f117893e1;
        if (qVar == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (qVar.b()) {
            l2 l2Var = n83.f19650a;
            PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
            if (pinterestStaggeredGridLayoutManager != null) {
                pinterestStaggeredGridLayoutManager.a1();
            }
        }
        return n83;
    }

    @Override // tj0.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            lh0.q qVar = this.f117893e1;
            if (qVar == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            if (qVar.a(z3.ACTIVATE_EXPERIMENT)) {
                g83.O2(null);
            }
        }
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.BOARD_MORE_IDEAS;
    }
}
