package hq0;

import com.pinterest.api.model.f30;
import eq0.k;
import eq0.m;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import nx.d1;
import so.n6;
import wk1.i;
import wk1.n;

/* loaded from: classes5.dex */
public final class f extends n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f69926a;

    /* renamed from: b, reason: collision with root package name */
    public final eq0.n f69927b;

    /* renamed from: c, reason: collision with root package name */
    public final w f69928c;

    /* renamed from: d, reason: collision with root package name */
    public final oc.c f69929d;

    /* renamed from: e, reason: collision with root package name */
    public final no1.e f69930e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f69931f;

    /* renamed from: g, reason: collision with root package name */
    public final d31.a f69932g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String convoId, String userId, eq0.n nVar, w eventManager, wk1.c params, g0 pageSizeProvider, nr0.m gridViewBinderDelegateFactory, oc.c apolloClient, no1.e conversationRemoteDataSource, d1 trackingParamAttacher) {
        super(params);
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(gridViewBinderDelegateFactory, "gridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f69926a = convoId;
        this.f69927b = nVar;
        this.f69928c = eventManager;
        this.f69929d = apolloClient;
        this.f69930e = conversationRemoteDataSource;
        this.f69931f = trackingParamAttacher;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar2 = params.f130131b;
        this.f69932g = new d31.a(userId, pageSizeProvider, ((n6) gridViewBinderDelegateFactory).a(presenterPinalytics, nVar2.f103320a, nVar2, params.f130137h));
    }

    @Override // eq0.m
    public final void Y0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (isBound()) {
            yk1.n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            String id3 = pin.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            k kVar = k.YOURS_TAB;
            String id4 = pin.getId();
            Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
            eq0.c.c((nr0.e) view, this.f69926a, id3, kVar, this.f69928c, this.f69930e, this.f69929d, this.f69931f.c(id4), this.f69927b, pin);
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f69932g);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        if (this.f69932g.f49127q.size() <= 0) {
            getPinalytics().N(f1.VIEW, null, h32.g0.CONVERSATION_SEND_A_PIN_USER_EMPTY_STATE, this.f69926a, false);
        }
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(eq0.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        view.y5(this);
        view.r(this);
    }
}
