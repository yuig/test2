package vu1;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class c0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f126659a;

    public c0(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f126659a = okHttpClient;
    }

    @Override // vu1.a0
    public final a0 a(OkHttpClient okHttpClient, uu1.c cVar) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return new c0(okHttpClient);
    }

    @Override // vu1.a0
    public final boolean b() {
        return true;
    }

    @Override // vu1.a0
    public final OkHttpClient c() {
        return this.f126659a;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f126659a.newCall(request);
    }
}
