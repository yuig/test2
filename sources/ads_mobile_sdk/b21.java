package ads_mobile_sdk;

import a.m7;
import a.w0;
import a.z;
import android.content.Context;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b21 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f2636a;

    /* renamed from: b, reason: collision with root package name */
    public final p82 f2637b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2638c;

    /* renamed from: d, reason: collision with root package name */
    public final x f2639d;

    /* renamed from: e, reason: collision with root package name */
    public final h80 f2640e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v7 f2641f;

    public b21(wi.k baseRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 interstitialAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(interstitialAdComponentProvider, "interstitialAdComponentProvider");
        this.f2636a = baseRequest;
        this.f2637b = requestConfigurationWrapper;
        this.f2638c = context;
        this.f2639d = activityTracker;
        this.f2640e = delegatingThirdPartyEventEmitter;
        this.f2641f = interstitialAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        ic2 adapter = (ic2) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context c13 = this.f2639d.c();
        if (c13 == null) {
            c13 = this.f2638c;
        }
        Context context = c13;
        wi.k baseRequest = this.f2636a;
        wi.a0 requestConfiguration = this.f2637b.a();
        h80 delegatingThirdPartyEventEmitter = this.f2640e;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        RtbAdapter rtbAdapter = adapter.f6316b;
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = new MediationInterstitialAdConfiguration(context, config.f10389r, m7.a(config.f10359c), m7.b(baseRequest, adapter.f4426a), requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(config.f10359c, requestConfiguration));
        dc2 setInterstitialAd = new dc2(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setInterstitialAd, "setInterstitialAd");
        rtbAdapter.loadRtbInterstitialAd(mediationInterstitialAdConfiguration, new ea1(delegatingThirdPartyEventEmitter, listener, setInterstitialAd));
    }

    @Override // a.w6
    public final a.xd a(cf2 transaction, r0 config, ic2 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        a.xd xdVar = (a.xd) this.f2641f.get();
        z zVar = new z(adapter, this, 0);
        h50 h50Var = (h50) xdVar;
        h50Var.getClass();
        h50Var.f5858n = zVar;
        return h50Var;
    }

    public static final void a(ic2 adapter, b21 this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object context = this$0.f2639d.c();
        if (context == null) {
            context = this$0.f2638c;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (adapter) {
            MediationInterstitialAd mediationInterstitialAd = adapter.f6319e;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.a();
                Unit unit = Unit.f80348a;
            } else {
                Intrinsics.r("interstitialAd");
                throw null;
            }
        }
    }
}
