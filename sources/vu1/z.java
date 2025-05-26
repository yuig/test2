package vu1;

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
import tu1.d0;
import tu1.g0;

/* loaded from: classes4.dex */
public final class z implements Interceptor, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f126749a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f126750b;

    /* renamed from: c, reason: collision with root package name */
    public final List f126751c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f126752d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f126753e;

    public z(g0 engineProviderUnified, d0 cronetServiceClient, su1.i networkInspectorSource, List requestInfoReceivers) {
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        Intrinsics.checkNotNullParameter(cronetServiceClient, "cronetServiceClient");
        Intrinsics.checkNotNullParameter(networkInspectorSource, "networkInspectorSource");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        this.f126749a = engineProviderUnified;
        this.f126750b = cronetServiceClient;
        this.f126751c = requestInfoReceivers;
        this.f126752d = new ConcurrentHashMap();
        this.f126753e = new ScheduledThreadPoolExecutor(1);
    }

    public final void a() {
        this.f126753e.scheduleAtFixedRate(new s81.g(this, 14), 10000L, 500L, TimeUnit.MILLISECONDS);
    }

    public final Response c(Call call, Response response) {
        ResponseBody responseBody = response.f95726g;
        if (responseBody == null) {
            throw new IllegalArgumentException("Response body was null".toString());
        }
        if (responseBody instanceof y) {
            return response;
        }
        Response.Builder e13 = response.e();
        Intrinsics.f(responseBody);
        e13.f95740g = new y(this, responseBody, call);
        return e13.b();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f126753e.shutdown();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        g0 g0Var = this.f126749a;
        if (!g0Var.c()) {
            return chain.b(chain.d());
        }
        if (chain.call().getF95912p()) {
            throw new IOException("Canceled");
        }
        Request d2 = chain.d();
        try {
            d0 d0Var = this.f126750b;
            CronetEngine b13 = g0Var.b();
            com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(rVar, "directExecutor(...)");
            tu1.a0 a13 = d0Var.a(b13, rVar, d2, chain.a(), chain.c(), this.f126751c, true);
            ConcurrentHashMap concurrentHashMap = this.f126752d;
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
