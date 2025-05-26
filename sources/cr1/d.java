package cr1;

import kotlin.jvm.internal.Intrinsics;
import lh0.x1;
import okhttp3.OkHttpClient;
import vu1.a0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f53099a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f53100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53101c;

    /* renamed from: d, reason: collision with root package name */
    public final p00.b f53102d;

    /* renamed from: e, reason: collision with root package name */
    public final rz.c f53103e;

    /* renamed from: f, reason: collision with root package name */
    public final rq2.a f53104f;

    /* renamed from: g, reason: collision with root package name */
    public final er1.b f53105g;

    /* renamed from: h, reason: collision with root package name */
    public final x1 f53106h;

    public d(rz.c adapterFactory, p00.b converterFactory, x1 experiments, er1.b authenticationFailureRouterFactory, a0 privateCronetClient, String url, OkHttpClient baseClient, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        Intrinsics.checkNotNullParameter(privateCronetClient, "privateCronetClient");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(authenticationFailureRouterFactory, "authenticationFailureRouterFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f53099a = baseClient;
        this.f53100b = privateCronetClient;
        this.f53101c = url;
        this.f53102d = converterFactory;
        this.f53103e = adapterFactory;
        this.f53104f = gsonConverterFactory;
        this.f53105g = authenticationFailureRouterFactory;
        this.f53106h = experiments;
    }
}
