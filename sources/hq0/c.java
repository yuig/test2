package hq0;

import com.pinterest.api.model.f30;
import com.pinterest.framework.multisection.datasource.pagedlist.g;
import com.pinterest.framework.multisection.datasource.pagedlist.s;
import eq0.k;
import eq0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ni1.d0;
import ni1.t2;
import nx.d1;
import sk0.x;
import wk1.i;
import wk1.n;

/* loaded from: classes5.dex */
public final class c extends n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f69902a;

    /* renamed from: b, reason: collision with root package name */
    public final eq0.n f69903b;

    /* renamed from: c, reason: collision with root package name */
    public final w f69904c;

    /* renamed from: d, reason: collision with root package name */
    public final oc.c f69905d;

    /* renamed from: e, reason: collision with root package name */
    public final no1.e f69906e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f69907f;

    /* renamed from: g, reason: collision with root package name */
    public final as1.b f69908g;

    /* renamed from: h, reason: collision with root package name */
    public final t2 f69909h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f69910i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f69911j;

    /* renamed from: k, reason: collision with root package name */
    public final g f69912k;

    /* renamed from: l, reason: collision with root package name */
    public final b f69913l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String convoId, eq0.n nVar, w eventManager, wk1.c params, oc.c apolloClient, no1.e conversationRemoteDataSource, d1 trackingParamAttacher, as1.b imageResolutionProvider, t2 pinRepViewModelFactory, d0 pinModelToVMStateConverterFactory) {
        super(params);
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(imageResolutionProvider, "imageResolutionProvider");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        Intrinsics.checkNotNullParameter(pinModelToVMStateConverterFactory, "pinModelToVMStateConverterFactory");
        this.f69902a = convoId;
        this.f69903b = nVar;
        this.f69904c = eventManager;
        this.f69905d = apolloClient;
        this.f69906e = conversationRemoteDataSource;
        this.f69907f = trackingParamAttacher;
        this.f69908g = imageResolutionProvider;
        this.f69909h = pinRepViewModelFactory;
        this.f69910i = pinModelToVMStateConverterFactory;
        g gVar = new g(new s(apolloClient, new ex.d(1, 16), a.f69899k, new x(27, convoId, this), a.f69898j, null, null, null, 8160), new kp.n(1), "", null);
        gVar.o(1, new h90.m(params, this));
        this.f69912k = gVar;
        this.f69913l = new b(this);
    }

    @Override // eq0.m
    public final void Y0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (isBound()) {
            yk1.n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            nr0.e eVar = (nr0.e) view;
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            k kVar = this.f69911j ? k.POPULAR_TAB : k.RELATED_TAB;
            String uid2 = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            eq0.c.c(eVar, this.f69902a, uid, kVar, this.f69904c, this.f69906e, this.f69905d, this.f69907f.c(uid2), this.f69903b, pin);
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f69912k);
    }

    @Override // wk1.n
    public final List convertToPlankModels(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof dl1.s) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f69904c.j(this.f69913l);
        super.onUnbind();
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(eq0.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        this.f69904c.h(this.f69913l);
        view.r(this);
    }
}
