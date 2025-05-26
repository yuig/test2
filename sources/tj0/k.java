package tj0;

import a.cb;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import i32.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import so.oa;
import so.s3;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltj0/k;", "Ltj0/d;", "", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "default_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends p implements mj0.c {
    public i92.k Y0;
    public rg0.s Z0;

    /* renamed from: a1, reason: collision with root package name */
    public zf0.f f117875a1;

    /* renamed from: b1, reason: collision with root package name */
    public m60.f0 f117876b1;

    /* renamed from: c1, reason: collision with root package name */
    public i2 f117877c1;

    /* renamed from: d1, reason: collision with root package name */
    public uk1.e f117878d1;

    /* renamed from: e1, reason: collision with root package name */
    public s3 f117879e1;

    /* renamed from: f1, reason: collision with root package name */
    public final a4 f117880f1;

    public k() {
        this.Y = true;
        this.f117880f1 = a4.BOARD_IDEAS;
    }

    @Override // tj0.d, sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        super.L7();
    }

    @Override // tj0.d, sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER, new jh0.d(this, 9));
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        rm1.q qVar = rm1.q.ARROW_BACK;
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
        Context context3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
        Context context4 = gestaltToolbarImpl.getContext();
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context4.getDrawable(drawableRes);
        int i13 = eo1.b.color_themed_text_default;
        Intrinsics.checkNotNullParameter(context3, "context");
        if (drawable2 != null) {
            drawable = sh.f.d(i13 == 0 ? context3.getColor(df0.a.f54892a) : context3.getColor(i13), context3, drawable2);
        } else {
            drawable = null;
        }
        String string = getString(x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.T(drawable, string);
        gestaltToolbarImpl.Z(j.f117874a[l9().ordinal()] == 1 ? t60.d.ideas_for_your_board : f62.e.board_view_content_more_ideas_title_updated, fm1.c.VISIBLE);
        gestaltToolbarImpl.m();
    }

    @Override // mj0.c
    public final void U5() {
        if (this.f117875a1 == null) {
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
        String f49940b;
        pj0.s a13;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        qa2.n W8 = W8();
        W8.f103320a.Y = true;
        bVar.d(W8);
        uk1.e eVar = this.f117878d1;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.f117877c1;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a14 = bVar.a();
        s3 s3Var = this.f117879e1;
        if (s3Var == null) {
            Intrinsics.r("moreIdeasPresenterFactory");
            throw null;
        }
        Navigation navigation = this.I;
        if (navigation == null || (f49940b = navigation.v0("com.pinterest.EXTRA_BOARD_ID")) == null) {
            Navigation navigation2 = this.I;
            f49940b = navigation2 != null ? navigation2.getF49940b() : null;
        }
        m60.f0 f0Var = this.f117876b1;
        if (f0Var == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var.N(f49940b, "Board id not sent to fragment through navigation!", new Object[0]);
        if (f49940b == null) {
            f49940b = "";
        }
        String str = f49940b;
        Navigation navigation3 = this.I;
        String v03 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_FROM_NEWSHUB_ID") : null;
        Navigation navigation4 = this.I;
        a13 = s3Var.a(new nj0.a(str, null, v03, navigation4 != null ? navigation4.v0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS") : null, 18), hk0.m.BOARD, l9(), a14, (r19 & 16) != 0 ? true : !(this.I != null ? r1.S("com.pinterest.EXTRA_HIDE_ONE_TAP_SAVE_BUTTON", false) : false), (r19 & 32) != 0 ? true : true, (r19 & 64) != 0 ? true : true, null);
        return a13;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.f117880f1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF140467e0() {
        return j.f117874a[l9().ordinal()] == 1 ? d4.FEED : d4.BOARD;
    }

    @Override // mj0.c
    public final void j6(mj0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public final x22.c l9() {
        Navigation navigation = this.I;
        if (navigation == null) {
            return x22.c.OTHER;
        }
        int J1 = navigation.J1("com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
        x22.c.Companion.getClass();
        x22.c a13 = x22.a.a(J1);
        return a13 == null ? x22.c.OTHER : a13;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(t60.c.fragment_board_more_ideas_tool, t60.b.p_recycler_view);
        eVar.c(t60.b.swipe_container);
        eVar.f979c = t60.b.empty_state_container;
        return eVar;
    }

    @Override // tj0.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(t60.b.board_more_ideas_tool_header);
        ((CollapsingToolbarLayout) findViewById).setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.BOARD_MORE_IDEAS;
    }
}
