package ads_mobile_sdk;

import a.d7;
import a.m7;
import a.w0;
import a.z;
import android.content.Context;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ra2 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final h92 f10563a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.k f10564b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f10565c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f10566d;

    /* renamed from: e, reason: collision with root package name */
    public final x f10567e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f10568f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f10569g;

    public ra2(h92 requestType, wi.k baseRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 rewardedAdComponentProvider) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(rewardedAdComponentProvider, "rewardedAdComponentProvider");
        this.f10563a = requestType;
        this.f10564b = baseRequest;
        this.f10565c = requestConfigurationWrapper;
        this.f10566d = context;
        this.f10567e = activityTracker;
        this.f10568f = delegatingThirdPartyEventEmitter;
        this.f10569g = rewardedAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        u91 adapter = (u91) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f10563a == h92.f5905k) {
            Context context = this.f10566d;
            wi.k baseRequest = this.f10564b;
            wi.a0 requestConfiguration = this.f10565c.a();
            nm.u serverParameterData = config.f10359c;
            h80 delegatingThirdPartyEventEmitter = this.f10568f;
            adapter.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
            Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
            Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
            Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
            Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
            Adapter adapter2 = adapter.f4426a;
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration(context, "", m7.a(serverParameterData), m7.b(baseRequest, adapter.f4426a), requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(serverParameterData, requestConfiguration));
            t91 setRewardedAd = new t91(adapter);
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
            Intrinsics.checkNotNullParameter(setRewardedAd, "setRewardedAd");
            adapter2.loadRewardedInterstitialAd(mediationRewardedAdConfiguration, new ia1(delegatingThirdPartyEventEmitter, listener, setRewardedAd));
            return;
        }
        Context c13 = this.f10567e.c();
        if (c13 == null) {
            c13 = this.f10566d;
        }
        Context context2 = c13;
        wi.k baseRequest2 = this.f10564b;
        wi.a0 requestConfiguration2 = this.f10565c.a();
        nm.u serverParameterData2 = config.f10359c;
        h80 delegatingThirdPartyEventEmitter2 = this.f10568f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(baseRequest2, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration2, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData2, "serverParameterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter2, "delegatingThirdPartyEventEmitter");
        Adapter adapter3 = adapter.f4426a;
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration(context2, "", m7.a(serverParameterData2), m7.b(baseRequest2, adapter.f4426a), requestConfiguration2.a(context2), requestConfiguration2.f129925a.getValue(), requestConfiguration2.f129926b.getValue(), m7.d(serverParameterData2, requestConfiguration2));
        s91 setRewardedAd2 = new s91(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter2, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setRewardedAd2, "setRewardedAd");
        adapter3.loadRewardedAd(mediationRewardedAdConfiguration2, new ia1(delegatingThirdPartyEventEmitter2, listener, setRewardedAd2));
    }

    @Override // a.w6
    public final d7 a(cf2 transaction, r0 config, u91 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        d7 d7Var = (d7) this.f10569g.get();
        z zVar = new z(adapter, this, 4);
        l50 l50Var = (l50) d7Var;
        l50Var.getClass();
        l50Var.f7687n = zVar;
        return l50Var;
    }

    public static final void a(u91 adapter, ra2 this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object context = this$0.f10567e.c();
        if (context == null) {
            context = this$0.f10566d;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        MediationRewardedAd mediationRewardedAd = adapter.f11894e;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.a();
        } else {
            Intrinsics.r("rewardedAd");
            throw null;
        }
    }
}
