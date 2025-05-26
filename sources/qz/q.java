package qz;

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;
import rq.l2;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static OkHttpClient f105426a;

    /* renamed from: b, reason: collision with root package name */
    public static final a10.e f105427b = new a10.e(1);

    /* renamed from: c, reason: collision with root package name */
    public static final a10.e f105428c = new a10.e(0);

    public static final void a(tu1.g0 engineProviderUnified) {
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        new l(engineProviderUnified, hb0.a.PRIORITY_MAX, 0).b();
    }

    public static final OkHttpClient b(Context context, lb0.q qVar, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        OkHttpClient okHttpClient = f105426a;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        List connectionSpecs = kotlin.collections.e0.b(new ConnectionSpec.Builder(ConnectionSpec.f95571e).a());
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        if (!Intrinsics.d(connectionSpecs, builder.f95692s)) {
            builder.D = null;
        }
        builder.f95692s = Util.A(connectionSpecs);
        ConnectionPool connectionPool = new ConnectionPool(15, TimeUnit.MINUTES);
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        builder.f95675b = connectionPool;
        if (qVar != null) {
            builder.a(new su1.m(qVar));
        }
        OkHttpClient okHttpClient2 = new OkHttpClient(builder);
        OkHttpClient.Builder newBuilder = okHttpClient2.newBuilder();
        h0 eventListenerFactory = new h0();
        newBuilder.getClass();
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        newBuilder.f95678e = eventListenerFactory;
        if (!z13) {
            if (dl2.b.U1(context)) {
                new m(newBuilder, hb0.a.PRIORITY_MAX).b();
            } else {
                new n(newBuilder, hb0.a.PRIORITY_MAX).b();
            }
        }
        f105426a = okHttpClient2;
        return okHttpClient2;
    }

    public static final void c(vu1.b0 b0Var, String str) {
        new kk2.k(new a.g0(7, b0Var, str), 1).r(tk2.e.f118017c).o(new dv.a(10, o.f105416j), new dv.a(11, new l2(str, 21)));
    }

    public static final void d(Context context, tu1.g0 engineProviderUnified, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        if (dl2.b.U1(context)) {
            new p(engineProviderUnified, z13, hb0.a.PRIORITY_MAX).b();
        } else {
            new l(engineProviderUnified, hb0.a.PRIORITY_MAX, 1).b();
        }
    }

    public static final void e(vu1.b0 networkClient) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        c(networkClient, "https://i.pinimg.com/_/_/warm/");
        c(networkClient, "https://v1.pinimg.com/_/_/warm");
    }
}
