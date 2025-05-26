package kv0;

import android.app.Application;
import android.content.Context;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.d0;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import h32.f1;
import h32.u0;
import jk2.e0;
import kh2.k3;
import kh2.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uj2.a0;

/* loaded from: classes5.dex */
public final class f implements jv0.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f80949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80950b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80951c;

    /* renamed from: d, reason: collision with root package name */
    public final jv0.p f80952d;

    /* renamed from: e, reason: collision with root package name */
    public final uk1.d f80953e;

    /* renamed from: f, reason: collision with root package name */
    public final jv0.i f80954f;

    /* renamed from: g, reason: collision with root package name */
    public final ag1.b f80955g;

    /* renamed from: h, reason: collision with root package name */
    public final i22.d f80956h;

    /* renamed from: i, reason: collision with root package name */
    public final bw0.f f80957i;

    /* renamed from: j, reason: collision with root package name */
    public final tb0.h f80958j;

    /* renamed from: k, reason: collision with root package name */
    public final ag1.h f80959k;

    /* renamed from: l, reason: collision with root package name */
    public jv0.j f80960l;

    /* renamed from: m, reason: collision with root package name */
    public ln0 f80961m;

    /* renamed from: n, reason: collision with root package name */
    public xj2.b f80962n;

    public f(Context context, String draftId, String str, jv0.p navigator, n70.o presenterPinalytics, jv0.i viewModelProvider, ag1.b dataManager, i22.d ideaPinLocalDataRepository, bw0.f storyPinWorkerUtils, tb0.h crashReporting, ag1.h ideaPinSessionDataManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(ideaPinLocalDataRepository, "ideaPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(storyPinWorkerUtils, "storyPinWorkerUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(ideaPinSessionDataManager, "ideaPinSessionDataManager");
        this.f80949a = context;
        this.f80950b = draftId;
        this.f80951c = str;
        this.f80952d = navigator;
        this.f80953e = presenterPinalytics;
        this.f80954f = viewModelProvider;
        this.f80955g = dataManager;
        this.f80956h = ideaPinLocalDataRepository;
        this.f80957i = storyPinWorkerUtils;
        this.f80958j = crashReporting;
        this.f80959k = ideaPinSessionDataManager;
        this.f80962n = new xj2.b();
    }

    public static void e(f fVar, tp tpVar, Function1 function1) {
        e eVar = e.f80948i;
        e0 M = fVar.f80956h.M(fVar.f80950b);
        a0 a0Var = tk2.e.f118017c;
        hk2.k e13 = new hk2.h(M.h(a0Var).e(a0Var), new bv0.k(6, new r0(16, tpVar, fVar)), 1).e(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(e13, "observeOn(...)");
        fVar.f80962n.a(nl.b.o(e13, new t90.n(10, function1), new d0(5, eVar)));
    }

    @Override // jv0.o
    public final void a(l3.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean d2 = Intrinsics.d(action, jv0.k.f77635b);
        is1.v vVar = is1.v.f73649j;
        String str = this.f80950b;
        i22.d dVar = this.f80956h;
        if (d2) {
            hk2.k e13 = dVar.M(str).h(tk2.e.f118017c).e(wj2.c.a());
            Intrinsics.checkNotNullExpressionValue(e13, "observeOn(...)");
            nl.b.o(e13, new d(this, 3), vVar);
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77634a)) {
            nx.d0 d0Var = this.f80953e.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.IDEA_PIN_PRODUCT_TAG_ADD_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            mv0.y yVar = (mv0.y) this.f80952d;
            yVar.getClass();
            NavigationImpl w13 = Navigation.w1(d2.p());
            w13.m0("com.pinterest.EXTRA_SEARCH_TYPE", "STORY_PIN_PRODUCTS");
            w13.Y1("com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", true);
            yVar.M1(w13);
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77636c)) {
            d();
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77637d)) {
            ln0 ln0Var = this.f80961m;
            if (ln0Var != null) {
                c(ln0Var, new d(this, 2));
                return;
            }
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77638e)) {
            d();
            return;
        }
        if (action instanceof jv0.m) {
            this.f80962n.a(nl.b.o(dVar.M(str), new r0(15, this, ((jv0.m) action).f77642a), vVar));
            return;
        }
        int i13 = 8;
        if (Intrinsics.d(action, jv0.k.f77639f)) {
            this.f80962n.a(nl.b.o(dVar.M(str), new d(this, i13), vVar));
        } else if (Intrinsics.d(action, jv0.k.f77640g)) {
            this.f80962n.a(nl.b.o(dVar.M(str), new d(this, i13), vVar));
        } else {
            if (action instanceof jv0.l) {
                return;
            }
            boolean z13 = action instanceof jv0.n;
        }
    }

    @Override // jv0.o
    public final void b(jv0.j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f80962n.f135163b) {
            this.f80962n = new xj2.b();
        }
        this.f80960l = view;
        hk2.k e13 = this.f80956h.M(this.f80950b).h(tk2.e.f118017c).e(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(e13, "observeOn(...)");
        this.f80962n.a(nl.b.o(e13, new d(this, 7), is1.v.f73649j));
    }

    public final void c(ln0 storyPinLocalData, d dVar) {
        xk2.v vVar = uv0.n.f123180a;
        Context context = this.f80949a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storyPinLocalData, "storyPinLocalData");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        kk2.t r13 = s0.E((Application) applicationContext, context, storyPinLocalData.y(), k3.a0(storyPinLocalData), null).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        kk2.t l13 = r13.l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        this.f80962n.a(nl.b.q(l13, new go0.r(this, storyPinLocalData, dVar, 24), new d(this, 1)));
    }

    public final void d() {
        jv0.j jVar = this.f80960l;
        if (jVar != null) {
            ((mv0.y) jVar).X8(false);
        }
        jv0.j jVar2 = this.f80960l;
        if (jVar2 != null) {
            ((mv0.y) jVar2).W8(false);
        }
        hk2.k e13 = this.f80956h.M(this.f80950b).h(tk2.e.f118017c).e(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(e13, "observeOn(...)");
        nl.b.o(e13, new d(this, 5), new d(this, 6));
    }

    @Override // jv0.o
    public final void onUnbind() {
        this.f80960l = null;
        this.f80962n.dispose();
    }
}
