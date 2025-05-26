package tu1;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public final class s implements Interceptor, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f119435a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f119436b;

    /* renamed from: c, reason: collision with root package name */
    public final List f119437c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f119438d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f119439e;

    public s(g0 engineProviderUnified, d0 cronetServiceClient, List requestInfoReceivers) {
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        Intrinsics.checkNotNullParameter(cronetServiceClient, "cronetServiceClient");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        this.f119435a = engineProviderUnified;
        this.f119436b = cronetServiceClient;
        this.f119437c = requestInfoReceivers;
        this.f119438d = new ConcurrentHashMap();
        this.f119439e = new ScheduledThreadPoolExecutor(1);
    }

    public final void a() {
        this.f119439e.scheduleAtFixedRate(new s81.g(this, 13), 10000L, 500L, TimeUnit.MILLISECONDS);
    }

    public final Response c(Call call, Response response) {
        ResponseBody responseBody = response.f95726g;
        if (responseBody == null) {
            throw new IllegalArgumentException("Response body was null".toString());
        }
        if (responseBody instanceof r) {
            return response;
        }
        Response.Builder e13 = response.e();
        Intrinsics.f(responseBody);
        e13.f95740g = new r(this, responseBody, call);
        return e13.b();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f119439e.shutdown();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (chain.call().getF95912p()) {
            throw new IOException("Canceled");
        }
        Request d2 = chain.d();
        try {
            d0 d0Var = this.f119436b;
            CronetEngine b13 = this.f119435a.b();
            com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(rVar, "directExecutor(...)");
            a0 a13 = d0Var.a(b13, rVar, d2, chain.a(), chain.c(), this.f119437c, true);
            ConcurrentHashMap concurrentHashMap = this.f119438d;
            Call call = chain.call();
            Object obj = a13.f119343a;
            concurrentHashMap.put(call, (UrlRequest) obj);
            try {
                ((UrlRequest) obj).start();
                return c(chain.call(), a13.a());
            } catch (IOException e13) {
                concurrentHashMap.remove(chain.call());
                throw e13;
            } catch (RuntimeException e14) {
                concurrentHashMap.remove(chain.call());
                throw e14;
            }
        } catch (IOException e15) {
            e15.printStackTrace();
            throw e15;
        }
    }
}
