package a31;

import android.content.Intent;
import android.net.Uri;
import b31.g;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.f1;
import h32.g0;
import h32.u0;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nk1.l;
import nx.f0;
import qb0.f;
import uj2.q;
import w01.e0;
import x02.x2;
import xk2.m;
import yk1.i;
import yk1.r;
import yk1.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends t implements z21.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f505a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f506b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f507c;

    /* renamed from: d, reason: collision with root package name */
    public final w f508d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f509e;

    /* renamed from: f, reason: collision with root package name */
    public final v f510f;

    /* renamed from: g, reason: collision with root package name */
    public final f f511g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f512h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f513i;

    /* renamed from: j, reason: collision with root package name */
    public final d30.a f514j;

    /* renamed from: k, reason: collision with root package name */
    public final lu1.b f515k;

    /* renamed from: l, reason: collision with root package name */
    public final l f516l;

    /* renamed from: m, reason: collision with root package name */
    public wy0 f517m;

    /* renamed from: n, reason: collision with root package name */
    public String f518n;

    /* renamed from: o, reason: collision with root package name */
    public String f519o;

    /* renamed from: p, reason: collision with root package name */
    public String f520p;

    /* renamed from: q, reason: collision with root package name */
    public String f521q;

    /* renamed from: r, reason: collision with root package name */
    public vz0 f522r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f523s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String userId, boolean z13, boolean z14, uk1.d presenterPinalytics, w eventManager, x2 userRepository, v viewResources, qb0.a formatter, f0 pinalyticsFactory, q networkStateStream, b60.b activeUserManager, d30.a verifiedMerchantService, lu1.b baseActivityHelper, l userFollowConfirmationProvider) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(verifiedMerchantService, "verifiedMerchantService");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(userFollowConfirmationProvider, "userFollowConfirmationProvider");
        this.f505a = userId;
        this.f506b = z13;
        this.f507c = z14;
        this.f508d = eventManager;
        this.f509e = userRepository;
        this.f510f = viewResources;
        this.f511g = formatter;
        this.f512h = pinalyticsFactory;
        this.f513i = activeUserManager;
        this.f514j = verifiedMerchantService;
        this.f515k = baseActivityHelper;
        this.f516l = userFollowConfirmationProvider;
        this.f521q = "";
        this.f523s = m.b(new e0(this, 12));
    }

    public final void p3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_EDIT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.f508d.d(Navigation.L((ScreenLocation) i3.f50992z.getValue(), "", ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue()));
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(z21.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((g) view).K0 = this;
        ((g) ((z21.b) getView())).setLoadState(i.LOADING);
        xj2.c F = this.f509e.e0().T(this.f505a).F(new a21.a(20, new b(this, 1)), new a21.a(21, c.f502k), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void r3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_PHONE_OPTION, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        ((g) ((z21.b) getView())).c8();
        String phoneNumber = this.f518n;
        if (phoneNumber != null) {
            g gVar = (g) ((z21.b) getView());
            gVar.getClass();
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:".concat(phoneNumber)));
            if (intent.resolveActivity(gVar.requireContext().getPackageManager()) != null) {
                gVar.startActivity(intent);
            }
        }
    }

    public final void s3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_EMAIL_OPTION, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        ((g) ((z21.b) getView())).c8();
        String emailAddress = this.f520p;
        if (emailAddress != null) {
            g gVar = (g) ((z21.b) getView());
            gVar.getClass();
            Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{emailAddress});
            if (intent.resolveActivity(gVar.requireContext().getPackageManager()) != null) {
                gVar.startActivity(intent);
            }
        }
    }

    public final void t3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_FOLLOW_BUTTON, (r18 & 4) != 0 ? null : g0.USER_FOLLOW, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        nk1.m mVar = (nk1.m) this.f523s.getValue();
        if (mVar != null) {
            mVar.f();
        }
    }

    public final void u3() {
        Boolean bool;
        boolean z13;
        wy0 wy0Var = this.f517m;
        if (wy0Var != null) {
            wy0 f13 = ((b60.d) this.f513i).f();
            if (f13 != null && dl2.b.S1(f13, wy0Var.getId())) {
                Integer P2 = wy0Var.P2();
                Intrinsics.checkNotNullExpressionValue(P2, "getExplicitBoardFollowingCount(...)");
                if (P2.intValue() > 0) {
                    z13 = true;
                    bool = Boolean.valueOf(z13);
                }
            }
            z13 = false;
            bool = Boolean.valueOf(z13);
        } else {
            bool = null;
        }
        NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50984r.getValue());
        w13.m0("com.pinterest.EXTRA_USER_ID", this.f505a);
        w13.Y1("com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", true);
        w13.Y1("com.pinterest.EXTRAS_KEY_WRAP_IN_APP_BAR", false);
        w13.Y1("com.pinterest.EXTRAS_KEY_SHOW_BOARDS_TAB", bool != null ? bool.booleanValue() : false);
        w13.Y1("com.pinterest.EXTRAS_KEY_SHOW_COUNT", false);
        this.f508d.d(w13);
    }

    public final void v3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_MESSAGE_OPTION, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        ((g) ((z21.b) getView())).c8();
        ig1.b.U0(this.f505a, this.f512h, this.f508d);
    }

    public final void w3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.VERIFIED_MERCHANT_BADGE, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        ((g) ((z21.b) getView())).c8();
        this.f508d.d(new jc0.v(u2.J(this.f522r, this.f515k), false, 0L, 30));
    }

    public final void x3() {
        String E4;
        wy0 wy0Var = this.f517m;
        this.f508d.d((wy0Var == null || (E4 = wy0Var.E4()) == null) ? null : Navigation.z0((ScreenLocation) i3.f50972f.getValue(), E4));
    }
}
