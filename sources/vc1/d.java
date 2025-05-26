package vc1;

import android.content.Context;
import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l4;
import dl1.s;
import ek2.f;
import fk2.l;
import fk2.x;
import h32.f1;
import h32.u0;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import l91.g;
import lh0.t3;
import m60.t;
import m60.w;
import m60.x0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import sq0.c0;
import uc1.h;
import va1.m1;
import va1.r;
import wc1.e;
import wk1.i;
import wk1.q;
import x02.x2;
import xa0.j;
import yb0.n;

/* loaded from: classes5.dex */
public final class d extends q implements tc1.a, t {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f125601a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f125602b;

    /* renamed from: c, reason: collision with root package name */
    public final w f125603c;

    /* renamed from: d, reason: collision with root package name */
    public final lb2.q f125604d;

    /* renamed from: e, reason: collision with root package name */
    public final com.pinterest.identity.authentication.c f125605e;

    /* renamed from: f, reason: collision with root package name */
    public final wv0.c f125606f;

    /* renamed from: g, reason: collision with root package name */
    public h f125607g;

    /* renamed from: h, reason: collision with root package name */
    public m1 f125608h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f125609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mr1.b activityProvider, uk1.d pinalytics, uj2.q networkStateStream, x2 userRepository, t3 experiments, cr1.a accountService, w eventManager, lb2.q authManager, com.pinterest.identity.authentication.a authNavigationHelper) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        this.f125601a = activityProvider;
        this.f125602b = accountService;
        this.f125603c = eventManager;
        this.f125604d = authManager;
        this.f125605e = authNavigationHelper;
        this.f125606f = new wv0.c(userRepository, experiments, accountService);
    }

    public static NavigationImpl t3(h hVar) {
        String O2;
        wy0 wy0Var = hVar.f121902a;
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        boolean[] zArr = wy0Var.V1;
        return (zArr.length <= 38 || !zArr[38] || (O2 = wy0Var.O2()) == null || !z.i(O2, "confirmed", true)) ? Navigation.w1((ScreenLocation) l4.f51090e.getValue()) : Navigation.w1((ScreenLocation) l4.f51092g.getValue());
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f125606f);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        if (this.f125609i) {
            this.f125609i = false;
        } else if (this.f125608h != null) {
            this.f125608h = null;
        } else {
            loadData();
        }
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isBound()) {
            h hVar = this.f125607g;
            if (hVar != null) {
                this.f125607g = null;
                this.f125603c.d(t3(hVar));
            }
            m1 m1Var = this.f125608h;
            if (m1Var != null) {
                w3(m1Var, true);
            }
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f125603c.j(this);
        ((e) ((tc1.b) getView())).D0 = null;
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(tc1.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        e eVar = (e) view;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.D0 = this;
        this.f125603c.h(this);
    }

    public final void v3(r item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof uc1.d) {
            this.f125603c.d(Navigation.w1((ScreenLocation) l4.f51089d.getValue()));
        }
    }

    public final void w3(m1 item, boolean z13) {
        Intrinsics.checkNotNullParameter(item, "item");
        int i13 = 1;
        f i14 = new l(new x(this.f125602b.C("gplus/").h(wj2.c.a()).l(tk2.e.f118017c), new ec1.a(15, new b(this, 3)), ck2.i.f27924d, ck2.i.f27923c), new a(this, i13), 0).i(new ta1.b(item, this, z13), new ec1.a(16, new c(this, item, i13)));
        Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
        addDisposable(i14);
    }

    public final void x3(m1 item, boolean z13) {
        n a13;
        n a14;
        Intrinsics.checkNotNullParameter(item, "item");
        int i13 = 0;
        if (item instanceof uc1.e) {
            if (!z13) {
                this.f125603c.d(Navigation.w1((ScreenLocation) l4.f51091f.getValue()));
                return;
            }
            h hVar = ((uc1.e) item).f121899h;
            this.f125602b.r().H(tk2.e.f118017c).A(wj2.c.a()).F(new ec1.a(17, new ic1.c(3, this, hVar)), new ec1.a(18, new b(this, i13)), ck2.i.f27923c, ck2.i.f27924d);
            return;
        }
        if (item instanceof uc1.b) {
            int i14 = 2;
            int i15 = 1;
            if (z13) {
                getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TOGGLE_ON, (r18 & 2) != 0 ? null : u0.GPLUS_CONNECT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                kk2.g f13 = this.f125604d.f(lr1.h.GoogleUnifiedAuthMethod, this.f125601a);
                this.f125609i = true;
                new kk2.h(new kk2.g(f13.l(wj2.c.a()).r(tk2.e.f118017c), new ec1.a(12, new b(this, i15)), 2), new a(this, i13), 1).o(new ec1.a(13, new b(this, i14)), new ec1.a(14, new c(this, item, i13)));
                return;
            }
            uc1.b bVar = (uc1.b) item;
            if (!bVar.f121891h.f3() || bVar.f121891h.e3().booleanValue()) {
                e eVar = (e) ((tc1.b) getView());
                eVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                w f73 = eVar.f7();
                int i16 = n.f138503p;
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String string = eVar.getString(l52.c.disconnect_gplus_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = eVar.getString(l52.c.disconnect_gplus_message);
                String string3 = eVar.getString(l52.c.disconnect_text);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = eVar.getString(x0.cancel);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                a13 = j.a(requireContext, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new wc1.d(eVar, item, i15), (r20 & 64) != 0 ? yb0.k.f138492k : new wc1.d(eVar, item, i14), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : new ic1.c(4, eVar, item));
                f73.d(new yb0.e(a13));
                return;
            }
            Intrinsics.checkNotNullParameter(item, "item");
            z3(item, true);
            e eVar2 = (e) ((tc1.b) getView());
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            w f74 = eVar2.f7();
            int i17 = n.f138503p;
            Context requireContext2 = eVar2.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            String string5 = eVar2.getString(l52.c.settings_login_options_create_password_title);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = eVar2.getString(l52.c.settings_login_options_create_password_description_google);
            String string7 = eVar2.getString(l52.c.settings_login_options_create);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            String string8 = eVar2.getString(x0.cancel);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            a14 = j.a(requireContext2, string5, string6, string7, (r20 & 16) != 0 ? "" : string8, (r20 & 32) != 0 ? yb0.k.f138491j : new wc1.d(eVar2, item, i13), (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
            f74.d(new yb0.e(a14));
        }
    }

    public final void z3(m1 m1Var, boolean z13) {
        int indexOf = CollectionsKt.F0(this.f125606f.f135191h).indexOf(m1Var);
        m1Var.f125210e = z13;
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).i(indexOf);
        }
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull za1.d event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        if (isBound()) {
            if ((event instanceof za1.b) || (event instanceof za1.a)) {
                loadData();
                return;
            }
            if (event instanceof za1.c) {
                Iterator it = CollectionsKt.F0(this.f125606f.f135191h).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((s) obj) instanceof uc1.e) {
                            break;
                        }
                    }
                }
                s sVar = (s) obj;
                if (sVar != null) {
                    ((uc1.e) sVar).f125210e = !r0.f125210e;
                }
                Object adapter = getAdapter();
                if (adapter != null) {
                    ((b2) adapter).h();
                }
            }
        }
    }
}
