package iw0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m2;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import nk1.g;
import nk1.h;
import nk1.j;
import nr0.e;
import nr0.l;
import nr0.m;
import oa2.r;
import qz.f0;
import so.n6;
import uj2.q;
import uk1.d;
import wk1.i;
import wk1.n;
import x02.a2;
import x02.v1;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73754a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73755b;

    /* renamed from: c, reason: collision with root package name */
    public final v1 f73756c;

    /* renamed from: d, reason: collision with root package name */
    public final v f73757d;

    /* renamed from: e, reason: collision with root package name */
    public final w f73758e;

    /* renamed from: f, reason: collision with root package name */
    public final g f73759f;

    /* renamed from: g, reason: collision with root package name */
    public j f73760g;

    /* renamed from: h, reason: collision with root package name */
    public final d31.a f73761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z13, String interestUid, g0 pageSizeProvider, wk1.c params, x12.a pagedListService, v1 interestRepository, yk1.a viewResources, w eventManager, m dynamicGridViewBinderDelegateFactory) {
        super(params);
        Intrinsics.checkNotNullParameter(interestUid, "interestUid");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        this.f73754a = z13;
        this.f73755b = interestUid;
        this.f73756c = interestRepository;
        this.f73757d = viewResources;
        this.f73758e = eventManager;
        this.f73759f = new g(getPinalytics(), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        l viewBinderDelegate = ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h);
        Intrinsics.checkNotNullParameter(interestUid, "interestUid");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        d31.a aVar = new d31.a(z13 ? j1.V("klp/%s/feed/", interestUid) : j1.V("interests/%s/feed/", interestUid), viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.R()}, null, pagedListService, null, 0L, null, 7900);
        f0 f0Var = new f0();
        f0Var.e("page_size", pageSizeProvider.d());
        f0Var.e("fields", n00.b.a(n00.c.DEFAULT_PIN_FEED));
        aVar.f49121k = f0Var;
        this.f73761h = aVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f73761h);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(hw0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((e) view);
        Intrinsics.checkNotNullParameter(this, "interestPinsListener");
        ((jw0.d) view).W0 = this;
        q P = this.f73756c.P(this.f73755b);
        gw0.a aVar = new gw0.a(2, new r0(25, this, view));
        gw0.a aVar2 = new gw0.a(3, b.f73751k);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        addDisposable(P.F(aVar, aVar2, cVar, a2Var));
        addDisposable(this.f73761h.f49129s.F(new gw0.a(4, new a(this, 1)), new gw0.a(5, b.f73752l), cVar, a2Var));
    }

    public final void v3() {
        j jVar = this.f73760g;
        if (jVar != null) {
            jVar.f();
        }
    }

    public final void w3(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        NavigationImpl w13 = Navigation.w1((ScreenLocation) m2.f51122a.getValue());
        w13.m0("com.pinterest.EXTRA_SEARCH_PREFILLED_QUERY", text);
        this.f73758e.d(w13);
    }

    public final void x3(h hVar) {
        hw0.a aVar = (hw0.a) getView();
        yl1.b actionButtonState = (yl1.b) r.f93960i.invoke(hVar, this.f73757d, Boolean.FALSE);
        jw0.d dVar = (jw0.d) aVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        GestaltButton.SmallSecondaryButton smallSecondaryButton = dVar.R0;
        if (smallSecondaryButton != null) {
            smallSecondaryButton.d(new jw0.b(actionButtonState, 0));
        }
    }
}
