package vu1;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f126654a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f126655b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f126656c;

    public b0(a0 cronetClientUnified, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(cronetClientUnified, "cronetClientUnified");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f126654a = cronetClientUnified;
        this.f126655b = crashReporting;
        this.f126656c = xk2.m.b(new yj1.d(this, 27));
    }

    @Override // vu1.a0
    public final a0 a(OkHttpClient okHttpClient, uu1.c cVar) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return new b0(this.f126654a.a(okHttpClient, cVar), this.f126655b);
    }

    @Override // vu1.a0
    public final boolean b() {
        return this.f126654a.b();
    }

    @Override // vu1.a0
    public final OkHttpClient c() {
        return this.f126654a.c();
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ((a0) this.f126656c.getValue()).newCall(request);
    }
}
