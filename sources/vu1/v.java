package vu1;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import tu1.d0;
import tu1.g0;

/* loaded from: classes2.dex */
public final class v implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f126720a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f126721b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f126722c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f126723d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f126724e;

    /* renamed from: f, reason: collision with root package name */
    public final su1.i f126725f;

    /* renamed from: g, reason: collision with root package name */
    public final List f126726g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f126727h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f126728i;

    /* renamed from: j, reason: collision with root package name */
    public final int f126729j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f126730k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f126731l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f126732m;

    public v(OkHttpClient okHttpClient, d0 cronetServiceClient, tb0.h crashReporting, g0 engineProviderUnified, xk2.k cronetExceptionMapper, su1.i networkInspectorSource, List requestInfoReceivers, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(cronetServiceClient, "cronetServiceClient");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        Intrinsics.checkNotNullParameter(cronetExceptionMapper, "cronetExceptionMapper");
        Intrinsics.checkNotNullParameter(networkInspectorSource, "networkInspectorSource");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        this.f126720a = okHttpClient;
        this.f126721b = cronetServiceClient;
        this.f126722c = crashReporting;
        this.f126723d = engineProviderUnified;
        this.f126724e = cronetExceptionMapper;
        this.f126725f = networkInspectorSource;
        this.f126726g = requestInfoReceivers;
        this.f126727h = z13;
        this.f126728i = z14;
        this.f126729j = okHttpClient.callTimeoutMillis();
        this.f126730k = xk2.m.b(new u(this));
        this.f126731l = xk2.m.b(new t(this, 0));
        this.f126732m = xk2.m.b(new t(this, 1));
    }

    @Override // vu1.a0
    public final a0 a(OkHttpClient okHttpClient, uu1.c cVar) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        List list = this.f126726g;
        if (cVar != null) {
            list = CollectionsKt.m0(cVar, list);
        }
        boolean z13 = this.f126727h;
        boolean z14 = this.f126728i;
        return new v(okHttpClient, this.f126721b, this.f126722c, this.f126723d, this.f126724e, this.f126725f, list, z13, z14);
    }

    @Override // vu1.a0
    public final boolean b() {
        return this.f126723d.c();
    }

    @Override // vu1.a0
    public final OkHttpClient c() {
        return this.f126720a;
    }

    public final tb0.h d() {
        return this.f126722c;
    }

    public final xk2.k e() {
        return this.f126724e;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f126728i ? new p(this, request) : new i(this, request);
    }
}
