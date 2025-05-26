package tu1;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public final class q implements Interceptor, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final i f119425a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f119426b;

    /* renamed from: c, reason: collision with root package name */
    public final List f119427c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f119428d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f119429e;

    public q(i cronetEngineProvider, d0 cronetServiceClient, List requestInfoReceivers) {
        Intrinsics.checkNotNullParameter(cronetEngineProvider, "cronetEngineProvider");
        Intrinsics.checkNotNullParameter(cronetServiceClient, "cronetServiceClient");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        this.f119425a = cronetEngineProvider;
        this.f119426b = cronetServiceClient;
        this.f119427c = requestInfoReceivers;
        this.f119428d = new ConcurrentHashMap();
        this.f119429e = new ScheduledThreadPoolExecutor(1);
    }

    public final Response a(Call call, Response response) {
        ResponseBody responseBody = response.f95726g;
        if (responseBody == null) {
            throw new IllegalArgumentException("Response body was null".toString());
        }
        if (responseBody instanceof p) {
            return response;
        }
        Response.Builder e13 = response.e();
        Intrinsics.f(responseBody);
        e13.f95740g = new p(this, responseBody, call);
        return e13.b();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f119429e.shutdown();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        CronetEngine cronetEngine;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!this.f119425a.c()) {
            return chain.b(chain.d());
        }
        i iVar = this.f119425a;
        if (iVar.f119384d == null) {
            try {
                if (((Boolean) iVar.f119388h.getValue()).booleanValue() && iVar.c()) {
                    synchronized (iVar.f119383c) {
                        try {
                            if (iVar.f119384d == null) {
                                com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(rVar, "directExecutor(...)");
                                Intrinsics.checkNotNullParameter(rVar, "<set-?>");
                                iVar.f119385e = rVar;
                                iVar.f119384d = iVar.a();
                            }
                            Unit unit = Unit.f80348a;
                        } finally {
                        }
                    }
                }
            } catch (Throwable th3) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.A("CronetEngineProvider", th3);
            }
            cronetEngine = iVar.f119384d;
        } else {
            cronetEngine = iVar.f119384d;
        }
        CronetEngine cronetEngine2 = cronetEngine;
        if (cronetEngine2 == null) {
            return chain.b(chain.d());
        }
        if (chain.call().getF95912p()) {
            throw new IOException("Canceled");
        }
        Request d2 = chain.d();
        try {
            d0 d0Var = this.f119426b;
            Executor executor = this.f119425a.f119385e;
            if (executor == null) {
                Intrinsics.r("executor");
                throw null;
            }
            a0 a13 = d0Var.a(cronetEngine2, executor, d2, chain.a(), chain.c(), this.f119427c, true);
            this.f119428d.put(chain.call(), (UrlRequest) a13.f119343a);
            try {
                ((UrlRequest) a13.f119343a).start();
                return a(chain.call(), a13.a());
            } catch (IOException e13) {
                this.f119428d.remove(chain.call());
                throw e13;
            } catch (RuntimeException e14) {
                this.f119428d.remove(chain.call());
                throw e14;
            }
        } catch (IOException e15) {
            e15.printStackTrace();
            throw e15;
        }
    }
}
