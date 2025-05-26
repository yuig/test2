package vu1;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.chromium.net.CronetEngine;
import tu1.d0;

/* loaded from: classes2.dex */
public final class s implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f126704a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f126705b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f126706c;

    /* renamed from: d, reason: collision with root package name */
    public final tu1.m f126707d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f126708e;

    /* renamed from: f, reason: collision with root package name */
    public final su1.i f126709f;

    /* renamed from: g, reason: collision with root package name */
    public final List f126710g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f126711h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f126712i;

    /* renamed from: j, reason: collision with root package name */
    public final int f126713j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f126714k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f126715l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f126716m;

    public s(OkHttpClient okHttpClient, d0 cronetServiceClient, tb0.h crashReporting, tu1.m cronetEngineProvider, xk2.k cronetExceptionMapper, su1.i networkInspectorSource, List requestInfoReceivers, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(cronetServiceClient, "cronetServiceClient");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(cronetEngineProvider, "cronetEngineProvider");
        Intrinsics.checkNotNullParameter(cronetExceptionMapper, "cronetExceptionMapper");
        Intrinsics.checkNotNullParameter(networkInspectorSource, "networkInspectorSource");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        this.f126704a = okHttpClient;
        this.f126705b = cronetServiceClient;
        this.f126706c = crashReporting;
        this.f126707d = cronetEngineProvider;
        this.f126708e = cronetExceptionMapper;
        this.f126709f = networkInspectorSource;
        this.f126710g = requestInfoReceivers;
        this.f126711h = z13;
        this.f126712i = z14;
        this.f126713j = z13 ? okHttpClient.callTimeoutMillis() : okHttpClient.connectTimeoutMillis();
        this.f126714k = xk2.m.b(new r(this));
        this.f126715l = xk2.m.b(new q(this, 0));
        this.f126716m = xk2.m.b(new q(this, 1));
    }

    @Override // vu1.a0
    public final a0 a(OkHttpClient okHttpClient, uu1.c cVar) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        List list = this.f126710g;
        if (cVar != null) {
            list = CollectionsKt.m0(cVar, list);
        }
        boolean z13 = this.f126711h;
        boolean z14 = this.f126712i;
        return new s(okHttpClient, this.f126705b, this.f126706c, this.f126707d, this.f126708e, this.f126709f, list, z13, z14);
    }

    @Override // vu1.a0
    public final boolean b() {
        return this.f126707d.f119419d;
    }

    @Override // vu1.a0
    public final OkHttpClient c() {
        return this.f126704a;
    }

    public final CronetEngine d() {
        tu1.m mVar = this.f126707d;
        CronetEngine cronetEngine = null;
        if (!((Boolean) mVar.f119417b.f119375b.getValue()).booleanValue()) {
            return null;
        }
        if (mVar.f119418c == null) {
            synchronized (mVar) {
                if (mVar.f119418c == null) {
                    try {
                        CronetEngine build = new CronetEngine.Builder(((tu1.d) ((tu1.e) mVar.f119416a).f119373a).f119362a).enableHttp2(true).build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        cronetEngine = build;
                    } catch (Throwable unused) {
                    }
                    mVar.f119418c = cronetEngine;
                }
                Unit unit = Unit.f80348a;
            }
        }
        return mVar.f119418c;
    }

    public final tb0.h e() {
        return this.f126706c;
    }

    public final xk2.k f() {
        return this.f126708e;
    }

    public final EventListener.Factory g() {
        return (EventListener.Factory) this.f126714k.getValue();
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return d() == null ? this.f126704a.newCall(request) : new d(this, request);
    }
}
