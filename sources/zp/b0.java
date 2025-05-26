package zp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.pinterest.activity.library.modal.PostSaveUpsellModalViewProviderImpl;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes3.dex */
public final class b0 extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142336a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f142337b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f142338c;

    /* renamed from: d, reason: collision with root package name */
    public Object f142339d;

    public /* synthetic */ b0(nx.d0 d0Var, f9.f fVar) {
        this(d0Var, fVar, (String) null);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        int i13 = this.f142336a;
        Unit unit = null;
        Object obj = this.f142338c;
        Object obj2 = this.f142337b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
                d0 d0Var = new d0(context, (aq.j) obj2, (wy0) obj);
                this.f142339d = d0Var;
                modalViewWrapper.x(d0Var);
                modalViewWrapper.p(context.getResources().getString(ry1.f.advanced_settings));
                return modalViewWrapper;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar = new jc0.n(context);
                nVar.T(false);
                ha2.b bVar = (ha2.b) obj;
                ha2.d0 b13 = bVar.b();
                if (b13 != null) {
                    nVar.Z(bs1.c.W(nVar, b13.f68425a), bs1.c.W(nVar, b13.f68426b), bs1.c.W(nVar, b13.f68427c), bs1.c.W(nVar, b13.f68428d));
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    nVar.Z(0, 0, 0, 0);
                }
                nVar.x(new br0.i(context, (nx.d0) obj2, nVar.z(), bVar, (String) this.f142339d));
                return nVar;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f142339d = new ir0.b(context, (nx.d0) obj2);
                jc0.n nVar2 = new jc0.n(context);
                ir0.b bVar2 = (ir0.b) this.f142339d;
                if (bVar2 == null) {
                    Intrinsics.r("modalView");
                    throw null;
                }
                nVar2.x(bVar2);
                nVar2.Z(0, 0, 0, 0);
                nVar2.T(false);
                return nVar2;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                su0.k kVar = new su0.k(context, (String) obj2, (String) obj, (List) this.f142339d);
                jc0.n nVar3 = new jc0.n(context);
                nVar3.x(kVar);
                nVar3.T(false);
                return nVar3;
            case 4:
                jc0.n nVar4 = new jc0.n(context, true);
                Context context2 = kb0.a.f79058b;
                d view = ((PostSaveUpsellModalViewProviderImpl) ((oa) ((i01.q0) j1.b0(i01.q0.class, m60.f0.W()))).f113720ha.get()).create(context, (f30) obj, (v7) obj2, (rg0.n) this.f142339d);
                nVar4.T(false);
                nVar4.q(true);
                Intrinsics.checkNotNullParameter(view, "view");
                ScrollView scrollView = nVar4.f75427s;
                scrollView.setVisibility(0);
                scrollView.addView(view);
                return nVar4;
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar5 = new jc0.n(context);
                nVar5.x(new la1.f(context, (wy0) obj, (x10.d) obj2, (ka1.b) this.f142339d));
                nVar5.T(false);
                return nVar5;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar6 = new jc0.n(context);
                List badges = (List) obj2;
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(badges, "badges");
                df1.a aVar = new df1.a(context);
                if (!aVar.f54894b) {
                    aVar.f54894b = true;
                    ((df1.b) aVar.generatedComponent()).getClass();
                }
                View.inflate(context, zb2.d.modal_verified_merchant_explainer, aVar);
                aVar.setOrientation(1);
                aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                aVar.setGravity(1);
                if (!badges.isEmpty()) {
                    PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) aVar.findViewById(zb2.c.verified_merchant_badges);
                    pinterestRecyclerView.j(new vs.b(badges, str));
                    bs1.c.U1(pinterestRecyclerView);
                }
                nVar6.x(aVar);
                nVar6.q(true);
                nVar6.k();
                nVar6.o(true);
                nVar6.D(new px0.g(this, context, nVar6, 15));
                nVar6.L(m60.x0.learn_more);
                nVar6.Y(false);
                nVar6.d0(false);
                nVar6.T(false);
                nVar6.a0();
                return nVar6;
        }
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        switch (this.f142336a) {
            case 0:
                return -1;
            default:
                return -2;
        }
    }

    @Override // jc0.b, jc0.a0
    public final String getSavedInstanceStateKey() {
        switch (this.f142336a) {
            case 0:
                return b0.class.getName();
            case 4:
                return b0.class.getName();
            default:
                return super.getSavedInstanceStateKey();
        }
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
    }

    @Override // jc0.a0
    public final void onDisplayed() {
        switch (this.f142336a) {
            case 2:
                ir0.b bVar = (ir0.b) this.f142339d;
                if (bVar == null) {
                    Intrinsics.r("modalView");
                    throw null;
                }
                String str = (String) this.f142338c;
                zf0.f fVar = bVar.f73501h;
                if (fVar == null) {
                    Intrinsics.r("educationHelper");
                    throw null;
                }
                i32.y0 y0Var = i32.y0.ANDROID_CREATOR_ONBOARDING_LANDING_PAGE;
                rg0.n b13 = j1.D0(y0Var, i32.l.CREATOR_ONBOARDING_LANDING_PAGE_DEEP_LINK) ? ((dh0.d) fVar.f141904a).b(y0Var) : null;
                if (b13 != null) {
                    vd0.c json = b13.f108070l;
                    Intrinsics.checkNotNullExpressionValue(json, "json");
                    Intrinsics.checkNotNullParameter(json, "json");
                    vd0.c m13 = json.m("display_data");
                    vd0.c m14 = (m13 == null || !m13.e(str)) ? m13 != null ? m13.m("default") : null : m13.m(str);
                    String d2 = m14 != null ? m14.d("banner_img") : null;
                    String d13 = m14 != null ? m14.d("title") : null;
                    String d14 = m14 != null ? m14.d("body") : null;
                    if (m14 != null) {
                        m14.d("cta");
                    }
                    if (d2 != null) {
                        bVar.f73500g = d2;
                    }
                    if (d13 != null) {
                        pk.a0.q(bVar.f73499f, bs1.c.h2(d13));
                    }
                    if (d14 != null) {
                        pk.a0.q(bVar.f73498e, bs1.c.h2(d14));
                    }
                }
                String str2 = bVar.f73500g;
                if (str2 != null) {
                    bVar.f73497d.V1(str2, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : bVar.getContext().getDrawable(td0.a.creator_onboarding_banner), (r18 & 64) != 0 ? null : null, null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public b0(aq.j editablePinWrapper, wy0 user) {
        Intrinsics.checkNotNullParameter(editablePinWrapper, "editablePinWrapper");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f142337b = editablePinWrapper;
        this.f142338c = user;
    }

    public b0(f30 f30Var, v7 v7Var, rg0.n nVar) {
        this.f142338c = f30Var;
        this.f142337b = v7Var;
        this.f142339d = nVar;
    }

    public b0(wy0 wy0Var, x10.d settingsApi, ka1.b settingsPresenter) {
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(settingsPresenter, "settingsPresenter");
        this.f142338c = wy0Var;
        this.f142337b = settingsApi;
        this.f142339d = settingsPresenter;
    }

    public b0(String overlayTitle, String str, ArrayList options) {
        Intrinsics.checkNotNullParameter(overlayTitle, "overlayTitle");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f142337b = overlayTitle;
        this.f142338c = str;
        this.f142339d = options;
    }

    public b0(List badges, String str, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f142337b = badges;
        this.f142338c = str;
        this.f142339d = baseActivityHelper;
    }

    public b0(nx.d0 pinalytics, f9.f configuration, String str) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f142337b = pinalytics;
        this.f142338c = configuration;
        this.f142339d = str;
    }

    public b0(nx.d0 pinalytics, String str) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f142337b = pinalytics;
        this.f142338c = str;
    }
}
