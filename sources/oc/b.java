package oc;

import ao2.f0;
import ed.m;
import fd.f;
import fd.j;
import java.util.ArrayList;
import java.util.List;
import kl2.l;
import ko2.e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pc.c0;
import pc.h0;
import pc.u;
import pc.y;
import qc.g;

/* loaded from: classes.dex */
public final class b implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public dd.a f93993a;

    /* renamed from: b, reason: collision with root package name */
    public dd.a f93994b;

    /* renamed from: c, reason: collision with root package name */
    public final u f93995c = new u();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f93996d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f93997e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f93998f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f93999g;

    /* renamed from: h, reason: collision with root package name */
    public pc.f0 f94000h;

    /* renamed from: i, reason: collision with root package name */
    public String f94001i;

    /* renamed from: j, reason: collision with root package name */
    public ed.c f94002j;

    /* renamed from: k, reason: collision with root package name */
    public String f94003k;

    /* renamed from: l, reason: collision with root package name */
    public Long f94004l;

    /* renamed from: m, reason: collision with root package name */
    public f f94005m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f94006n;

    /* renamed from: o, reason: collision with root package name */
    public j f94007o;

    /* renamed from: p, reason: collision with root package name */
    public l f94008p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f94009q;

    /* renamed from: r, reason: collision with root package name */
    public g f94010r;

    /* renamed from: s, reason: collision with root package name */
    public List f94011s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f94012t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f94013u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f94014v;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f94015w;

    public b() {
        ArrayList arrayList = new ArrayList();
        this.f93996d = arrayList;
        this.f93997e = arrayList;
        this.f93998f = new ArrayList();
        this.f94000h = y.f99612b;
        e eVar = bd.e.f22692a;
    }

    @Override // pc.h0
    public final Object a(c0 executionContext) {
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        pc.f0 c13 = this.f94000h.c(executionContext);
        Intrinsics.checkNotNullParameter(c13, "<set-?>");
        this.f94000h = c13;
        return this;
    }

    public final void b(ad.a interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f93996d.add(interceptor);
    }

    public final c c() {
        dd.a mVar;
        dd.a aVar;
        dd.a aVar2 = this.f93993a;
        ArrayList interceptors = this.f93998f;
        if (aVar2 != null) {
            if (this.f94001i != null) {
                throw new IllegalStateException("Apollo: 'httpServerUrl' has no effect if 'networkTransport' is set".toString());
            }
            if (this.f94002j != null) {
                throw new IllegalStateException("Apollo: 'httpEngine' has no effect if 'networkTransport' is set".toString());
            }
            if (!interceptors.isEmpty()) {
                throw new IllegalStateException("Apollo: 'addHttpInterceptor' has no effect if 'networkTransport' is set".toString());
            }
            if (this.f94006n != null) {
                throw new IllegalStateException("Apollo: 'httpExposeErrorBody' has no effect if 'networkTransport' is set".toString());
            }
            dd.a aVar3 = this.f93993a;
            Intrinsics.f(aVar3);
            mVar = aVar3;
        } else {
            if (this.f94001i == null) {
                throw new IllegalStateException("Apollo: 'serverUrl' is required".toString());
            }
            ArrayList arrayList = new ArrayList();
            String serverUrl = this.f94001i;
            Intrinsics.f(serverUrl);
            Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
            ed.c httpEngine = this.f94002j;
            if (httpEngine != null) {
                Intrinsics.checkNotNullParameter(httpEngine, "httpEngine");
            } else {
                httpEngine = null;
            }
            Boolean bool = this.f94006n;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            arrayList.clear();
            arrayList.addAll(interceptors);
            qc.d dVar = new qc.d(serverUrl);
            if (httpEngine == null) {
                httpEngine = new ed.b();
            }
            mVar = new m(dVar, httpEngine, arrayList, booleanValue);
        }
        dd.a aVar4 = this.f93994b;
        if (aVar4 == null) {
            String str = this.f94003k;
            if (str == null) {
                str = this.f94001i;
            }
            if (str == null) {
                aVar = mVar;
                return new c(mVar, this.f93995c.a(), aVar, CollectionsKt.l0(kotlin.collections.f0.k(null), this.f93996d), this.f94000h, this.f93999g, this.f94010r, this.f94011s, this.f94012t, this.f94013u, this.f94014v, this);
            }
            fd.m mVar2 = new fd.m();
            mVar2.b(str);
            j webSocketEngine = this.f94007o;
            if (webSocketEngine != null) {
                Intrinsics.checkNotNullParameter(webSocketEngine, "webSocketEngine");
                mVar2.f61782c = webSocketEngine;
            }
            Long l13 = this.f94004l;
            if (l13 != null) {
                mVar2.f61783d = l13;
            }
            f protocolFactory = this.f94005m;
            if (protocolFactory != null) {
                Intrinsics.checkNotNullParameter(protocolFactory, "protocolFactory");
                mVar2.f61784e = protocolFactory;
            }
            l lVar = this.f94008p;
            if (lVar != null) {
                mVar2.f61785f = lVar;
            }
            Function1 function1 = this.f94009q;
            if (function1 != null) {
                mVar2.f61780a = function1;
            }
            aVar4 = mVar2.a();
        } else {
            if (this.f94003k != null) {
                throw new IllegalStateException("Apollo: 'webSocketServerUrl' has no effect if 'subscriptionNetworkTransport' is set".toString());
            }
            if (this.f94007o != null) {
                throw new IllegalStateException("Apollo: 'webSocketEngine' has no effect if 'subscriptionNetworkTransport' is set".toString());
            }
            if (this.f94004l != null) {
                throw new IllegalStateException("Apollo: 'webSocketIdleTimeoutMillis' has no effect if 'subscriptionNetworkTransport' is set".toString());
            }
            if (this.f94005m != null) {
                throw new IllegalStateException("Apollo: 'wsProtocolFactory' has no effect if 'subscriptionNetworkTransport' is set".toString());
            }
            if (this.f94008p != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenWhen' has no effect if 'subscriptionNetworkTransport' is set".toString());
            }
            if (this.f94009q != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenServerUrl' has no effect if 'subscriptionNetworkTransport' is set".toString());
            }
        }
        aVar = aVar4;
        return new c(mVar, this.f93995c.a(), aVar, CollectionsKt.l0(kotlin.collections.f0.k(null), this.f93996d), this.f94000h, this.f93999g, this.f94010r, this.f94011s, this.f94012t, this.f94013u, this.f94014v, this);
    }
}
