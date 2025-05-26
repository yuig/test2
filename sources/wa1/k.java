package wa1;

import android.content.Context;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.u0;
import i32.y0;
import jk2.j1;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import lb0.o;
import lh0.n3;
import m60.w;
import rg0.y;
import t3.s1;
import va1.b1;
import va1.e0;
import va1.e1;
import va1.f1;
import va1.l0;
import va1.z;
import wk1.q;
import wt1.c0;
import wt1.d0;
import wt1.p;
import x02.x2;
import xa1.l;
import yb0.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class k extends q implements com.pinterest.feature.settings.menu.a {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f128650a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f128651b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f128652c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f128653d;

    /* renamed from: e, reason: collision with root package name */
    public final mr1.a f128654e;

    /* renamed from: f, reason: collision with root package name */
    public final w f128655f;

    /* renamed from: g, reason: collision with root package name */
    public final UserDeserializer f128656g;

    /* renamed from: h, reason: collision with root package name */
    public final mo1.d f128657h;

    /* renamed from: i, reason: collision with root package name */
    public final n3 f128658i;

    /* renamed from: j, reason: collision with root package name */
    public final b60.b f128659j;

    /* renamed from: k, reason: collision with root package name */
    public final v f128660k;

    /* renamed from: l, reason: collision with root package name */
    public final np1.j f128661l;

    /* renamed from: m, reason: collision with root package name */
    public final z82.b f128662m;

    /* renamed from: n, reason: collision with root package name */
    public final m f128663n;

    /* renamed from: o, reason: collision with root package name */
    public final o f128664o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f128665p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uk1.d pinalytics, mr1.b activityProvider, boolean z13, boolean z14, uj2.q networkStateStream, x2 userRepository, mr1.a accountSwitcher, w eventManager, UserDeserializer userDeserializer, mo1.d intentHelper, n3 experiments, b60.b activeUserManager, v resources, np1.j handshakeManager, z82.b targetHandshakeManager, m userService, o preferencesManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(targetHandshakeManager, "targetHandshakeManager");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        this.f128650a = activityProvider;
        this.f128651b = z13;
        this.f128652c = z14;
        this.f128653d = userRepository;
        this.f128654e = accountSwitcher;
        this.f128655f = eventManager;
        this.f128656g = userDeserializer;
        this.f128657h = intentHelper;
        this.f128658i = experiments;
        this.f128659j = activeUserManager;
        this.f128660k = resources;
        this.f128661l = handshakeManager;
        this.f128662m = targetHandshakeManager;
        this.f128663n = userService;
        this.f128664o = preferencesManager;
        this.f128665p = xk2.m.b(new p91.v(6, this, pinalytics));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b((va1.w) this.f128665p.getValue());
    }

    @Override // wk1.q
    public final void onStateUpdated(c0 state, d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (state instanceof p) {
            addDisposable(nl.b.s(s1.f(((dh0.d) y.a()).g(y0.ANDROID_USER_SETTINGS_TAKEOVER, null, new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new i(this, 0), null, null, 6));
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((l) ((com.pinterest.feature.settings.menu.b) getView())).H0 = null;
        super.onUnbind();
    }

    public final void t3(e1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        kotlin.jvm.internal.j.z(getScope(), null, null, new c(this, item, null), 3);
    }

    public final void u3(e1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        kotlin.jvm.internal.j.z(getScope(), null, null, new e(this, item, null), 3);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.settings.menu.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        ((l) view).H0 = this;
        String uid = com.bumptech.glide.d.Q(this.f128659j).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        j1 j1Var = new j1(this.f128653d.C(uid), new t81.a(19, g.f128644i), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        addDisposable(nl.b.s(j1Var, new h(1, (va1.w) this.f128665p.getValue(), va1.w.class, "updateBrandedContent", "updateBrandedContent(Z)V", 0), null, null, 6));
    }

    public final void w3(f1 menuPageItem) {
        mr1.h parentAccount;
        n a13;
        Intrinsics.checkNotNullParameter(menuPageItem, "menuPageItem");
        boolean z13 = menuPageItem instanceof va1.y0;
        w wVar = this.f128655f;
        if (z13) {
            if (!((va1.y0) menuPageItem).f125283f) {
                wy0 f13 = ((b60.d) this.f128659j).f();
                if (f13 == null || (parentAccount = com.bumptech.glide.c.V(f13, this.f128656g)) == null) {
                    return;
                }
                l lVar = (l) ((com.pinterest.feature.settings.menu.b) getView());
                lVar.getClass();
                Intrinsics.checkNotNullParameter(parentAccount, "parentAccount");
                w f73 = lVar.f7();
                int i13 = n.f138503p;
                Context requireContext = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String string = lVar.getString(d52.c.settings_main_alert_page_unavailable_lba_sorry);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = lVar.getString(d52.c.settings_main_alert_page_unavailable_lba_description, dl2.b.j1(parentAccount.f88089b));
                String string3 = lVar.getString(d52.c.settings_main_alert_page_unavailable_lba_confirm_switch);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = lVar.getString(c52.e.close);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                a13 = xa0.j.a(requireContext, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new p91.v(7, lVar, parentAccount), (r20 & 64) != 0 ? yb0.k.f138492k : new xa1.j(lVar, 8), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
                f73.d(new yb0.e(a13));
                return;
            }
        } else {
            if ((menuPageItem instanceof z) || (menuPageItem instanceof b1)) {
                wVar.d(new y42.e(new p91.v(5, this, menuPageItem)));
                return;
            }
            if (menuPageItem instanceof va1.c0) {
                getPinalytics().U(new i0(d4.SETTINGS, a4.BRANDED_CONTENT_SETTINGS, null, null, null, u0.CREATOR_TOOL_BRANDED_CONTENT), h32.f1.TAP, null, null, null, false);
            } else if ((menuPageItem instanceof va1.d0) || (menuPageItem instanceof e0)) {
                NavigationImpl L = Navigation.L(menuPageItem.j(), "", menuPageItem.c());
                L.m0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE", e82.w.INSTAGRAM.getApiParam());
                wVar.d(L);
                return;
            } else if (menuPageItem instanceof l0) {
                getPinalytics().U(new i0(d4.SETTINGS, a4.HOMEFEED_CONTROL_ACTIVITY, null, g0.NAVIGATION, null, u0.HOMEFEED_TUNER_BUTTON), h32.f1.TAP, null, null, null, false);
            }
        }
        wVar.d(Navigation.L(menuPageItem.j(), "", menuPageItem.c()));
    }
}
