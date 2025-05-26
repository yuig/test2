package ads_mobile_sdk;

import a.w0;
import ads_mobile_sdk.gq1;
import ads_mobile_sdk.n11;
import android.content.Context;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n11 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f8498a;

    /* renamed from: b, reason: collision with root package name */
    public final p82 f8499b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8500c;

    /* renamed from: d, reason: collision with root package name */
    public final x f8501d;

    /* renamed from: e, reason: collision with root package name */
    public final h80 f8502e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v7 f8503f;

    public n11(wi.k baseRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 interstitialAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(interstitialAdComponentProvider, "interstitialAdComponentProvider");
        this.f8498a = baseRequest;
        this.f8499b = requestConfigurationWrapper;
        this.f8500c = context;
        this.f8501d = activityTracker;
        this.f8502e = delegatingThirdPartyEventEmitter;
        this.f8503f = interstitialAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        gq1 adapter = (gq1) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context c13 = this.f8501d.c();
        if (c13 == null) {
            c13 = this.f8500c;
        }
        adapter.a(c13, this.f8498a, this.f8499b.a(), config.f10359c, listener, this.f8502e);
    }

    @Override // a.w6
    public final a.xd a(cf2 transaction, r0 config, final gq1 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        a.xd xdVar = (a.xd) this.f8503f.get();
        a.fd fdVar = new a.fd() { // from class: a.m8
            @Override // a.fd
            public final void a() {
                n11.a(gq1.this);
            }
        };
        h50 h50Var = (h50) xdVar;
        h50Var.getClass();
        h50Var.f5858n = fdVar;
        return h50Var;
    }

    public static final void a(gq1 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        MediationInterstitialAdapter mediationInterstitialAdapter = adapter.f5665d;
        if (mediationInterstitialAdapter != null) {
            mediationInterstitialAdapter.showInterstitial();
        } else {
            Intrinsics.r("interstitialAd");
            throw null;
        }
    }
}
