package ads_mobile_sdk;

import a.w0;
import android.content.Context;
import bj.n;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cl1 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f3950a;

    /* renamed from: b, reason: collision with root package name */
    public final n f3951b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f3952c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f3953d;

    /* renamed from: e, reason: collision with root package name */
    public final x f3954e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f3955f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f3956g;

    public cl1(wi.k baseRequest, n nativeRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 nativeAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(nativeAdComponentProvider, "nativeAdComponentProvider");
        this.f3950a = baseRequest;
        this.f3951b = nativeRequest;
        this.f3952c = requestConfigurationWrapper;
        this.f3953d = context;
        this.f3954e = activityTracker;
        this.f3955f = delegatingThirdPartyEventEmitter;
        this.f3956g = nativeAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        gq1 adapter = (gq1) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context c13 = this.f3954e.c();
        if (c13 == null) {
            c13 = this.f3953d;
        }
        adapter.a(c13, this.f3950a, this.f3951b, this.f3952c.a(), config.f10359c, listener, this.f3955f);
    }

    @Override // a.w6
    public final a.n3 a(cf2 transaction, r0 config, Object obj) {
        gq1 adapter = (gq1) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        j50 j50Var = (j50) this.f3956g.get();
        a.p1 p1Var = adapter.f5664c;
        if (p1Var != null) {
            j50Var.getClass();
            j50Var.f6694n = p1Var;
            a.p1 p1Var2 = adapter.f5664c;
            if (p1Var2 != null) {
                j50Var.f6695o = c3.c(p1Var2);
                return j50Var;
            }
            Intrinsics.r("nativeAdMapper");
            throw null;
        }
        Intrinsics.r("nativeAdMapper");
        throw null;
    }
}
