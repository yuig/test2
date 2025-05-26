package tu1;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public abstract class l implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f119408a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f119409b;

    /* renamed from: c, reason: collision with root package name */
    public final uu1.b f119410c;

    /* renamed from: d, reason: collision with root package name */
    public final List f119411d;

    /* renamed from: e, reason: collision with root package name */
    public final tb0.h f119412e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f119413f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f119414g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f119415h;

    public l(tb0.h crashReporting, f http3CronetEngineFactory, h0 http2CronetEngineFactory, uu1.b requestListenerFactory, List requestInfoReceivers, boolean z13) {
        Intrinsics.checkNotNullParameter(http3CronetEngineFactory, "http3CronetEngineFactory");
        Intrinsics.checkNotNullParameter(http2CronetEngineFactory, "http2CronetEngineFactory");
        Intrinsics.checkNotNullParameter(requestListenerFactory, "requestListenerFactory");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f119408a = http3CronetEngineFactory;
        this.f119409b = http2CronetEngineFactory;
        this.f119410c = requestListenerFactory;
        this.f119411d = requestInfoReceivers;
        this.f119412e = crashReporting;
        this.f119413f = z13;
        this.f119414g = new AtomicReference(null);
        this.f119415h = xk2.m.b(new yj1.d(this, 26));
    }

    @Override // tu1.g0
    public final void a(String hostUrl) {
        List list = this.f119411d;
        Intrinsics.checkNotNullParameter(hostUrl, "hostUrl");
        try {
            com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
            CronetEngine b13 = b();
            Intrinsics.f(rVar);
            UrlRequest.Builder httpMethod = b().newUrlRequestBuilder(hostUrl, new b(hostUrl, b13, rVar), rVar).setHttpMethod("HEAD");
            httpMethod.addRequestAnnotation(new a("annotation_request_type", "HEAD"));
            if (!list.isEmpty()) {
                httpMethod.setRequestFinishedListener(this.f119410c.a(list));
            }
            httpMethod.build().start();
        } catch (Throwable th3) {
            this.f119412e.q(th3, "Failed to warm up host: ".concat(hostUrl), tb0.p.PERFORMANCE);
        }
    }

    @Override // tu1.g0
    public final CronetEngine b() {
        CronetEngine cronetEngine = (CronetEngine) this.f119414g.get();
        if (cronetEngine != null) {
            return cronetEngine;
        }
        throw new IllegalStateException("Engine is not initialized. Ensure engine availability by calling isEngineAvailable. Get engine instance only if isEngineAvailable returns true.");
    }

    @Override // tu1.g0
    public final boolean c() {
        return ((Boolean) this.f119415h.getValue()).booleanValue();
    }
}
