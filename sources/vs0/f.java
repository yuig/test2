package vs0;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;
import m60.g0;
import ni1.d0;
import nr0.m;
import so.n6;
import wk1.i;
import wk1.n;
import xs0.l;
import yk1.r;
import yk1.u;
import yk1.v;

/* loaded from: classes5.dex */
public final class f extends n implements a {

    /* renamed from: a, reason: collision with root package name */
    public final v f126545a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f126546b;

    /* renamed from: c, reason: collision with root package name */
    public ts0.b f126547c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f126548d;

    /* renamed from: e, reason: collision with root package name */
    public final ss0.c f126549e;

    /* renamed from: f, reason: collision with root package name */
    public final xk1.e f126550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g0 pageSizeProvider, wk1.c params, m dynamicGridViewBinderDelegateFactory, r1 experiments, yk1.a viewResources, b60.b userManager, l pinActivityCellViewBinder, d0 pinRepVmStateConverterFactory) {
        super(params);
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(pinActivityCellViewBinder, "pinActivityCellViewBinder");
        Intrinsics.checkNotNullParameter(pinRepVmStateConverterFactory, "pinRepVmStateConverterFactory");
        this.f126545a = viewResources;
        this.f126546b = userManager;
        this.f126547c = ts0.b.All;
        this.f126548d = xk2.m.b(e.f126544i);
        uk1.d presenterPinalytics = getPresenterPinalytics();
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        this.f126549e = new ss0.c(presenterPinalytics, pageSizeProvider, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics2, nVar.f103320a, nVar, params.f130137h), userManager, experiments, pinActivityCellViewBinder, pinRepVmStateConverterFactory);
        xk1.e eVar = new xk1.e();
        eVar.u(RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
        this.f126550f = eVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wy0 f13 = ((b60.d) this.f126546b).f();
        if (f13 != null && Intrinsics.d(f13.K2(), Boolean.TRUE)) {
            ((i) dataSources).b(this.f126550f);
        }
        ((i) dataSources).b(this.f126549e);
    }

    @Override // yk1.t, yk1.p
    public final void bindPinalytics(r rVar) {
        rs0.b view = (rs0.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        getPresenterPinalytics().c(a4.HOMEFEED_CONTROL_ACTIVITY, d4.HOMEFEED_CONTROL, null);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        wy0 f13 = ((b60.d) this.f126546b).f();
        if (f13 != null && Intrinsics.d(f13.K2(), Boolean.FALSE) && isBound()) {
            this.f126550f.y();
            this.f126549e.i2();
        }
        p3();
    }

    public final void u3() {
        rs0.b bVar = (rs0.b) getView();
        v3(u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN);
        bVar.Y4(new ha2.a(e0.b(el.a.m(this.f126547c, new d(1, this, f.class, "handleFilterSelection", "handleFilterSelection(I)V", 0))), false, (Integer) null, 14));
    }

    @Override // yk1.t, yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }

    public final void v3(u0 u0Var) {
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // yk1.t
    public final void bindPinalytics(u uVar) {
        rs0.b view = (rs0.b) uVar;
        Intrinsics.checkNotNullParameter(view, "view");
        getPresenterPinalytics().c(a4.HOMEFEED_CONTROL_ACTIVITY, d4.HOMEFEED_CONTROL, null);
    }
}
