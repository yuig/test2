package ads_mobile_sdk;

import a.m7;
import a.w0;
import a.z;
import android.content.Context;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l11 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f7609a;

    /* renamed from: b, reason: collision with root package name */
    public final p82 f7610b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7611c;

    /* renamed from: d, reason: collision with root package name */
    public final x f7612d;

    /* renamed from: e, reason: collision with root package name */
    public final h80 f7613e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v7 f7614f;

    public l11(wi.k baseRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 interstitialAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(interstitialAdComponentProvider, "interstitialAdComponentProvider");
        this.f7609a = baseRequest;
        this.f7610b = requestConfigurationWrapper;
        this.f7611c = context;
        this.f7612d = activityTracker;
        this.f7613e = delegatingThirdPartyEventEmitter;
        this.f7614f = interstitialAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        u91 adapter = (u91) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context c13 = this.f7612d.c();
        if (c13 == null) {
            c13 = this.f7611c;
        }
        Context context = c13;
        wi.k baseRequest = this.f7609a;
        wi.a0 requestConfiguration = this.f7610b.a();
        nm.u serverParameterData = config.f10359c;
        h80 delegatingThirdPartyEventEmitter = this.f7613e;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Adapter adapter2 = adapter.f4426a;
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = new MediationInterstitialAdConfiguration(context, "", m7.a(serverParameterData), m7.b(baseRequest, adapter.f4426a), requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(serverParameterData, requestConfiguration));
        p91 setInterstitialAd = new p91(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setInterstitialAd, "setInterstitialAd");
        adapter2.loadInterstitialAd(mediationInterstitialAdConfiguration, new ea1(delegatingThirdPartyEventEmitter, listener, setInterstitialAd));
    }

    @Override // a.w6
    public final a.xd a(cf2 transaction, r0 config, u91 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        a.xd xdVar = (a.xd) this.f7614f.get();
        z zVar = new z(adapter, this, 2);
        h50 h50Var = (h50) xdVar;
        h50Var.getClass();
        h50Var.f5858n = zVar;
        return h50Var;
    }

    public static final void a(u91 adapter, l11 this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object context = this$0.f7612d.c();
        if (context == null) {
            context = this$0.f7611c;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        MediationInterstitialAd mediationInterstitialAd = adapter.f11893d;
        if (mediationInterstitialAd != null) {
            mediationInterstitialAd.a();
        } else {
            Intrinsics.r("interstitialAd");
            throw null;
        }
    }
}
