package ads_mobile_sdk;

import a.d7;
import a.m7;
import a.w0;
import a.z;
import android.content.Context;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qb2 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final h92 f10015a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.k f10016b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f10017c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f10018d;

    /* renamed from: e, reason: collision with root package name */
    public final x f10019e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f10020f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f10021g;

    public qb2(h92 requestType, wi.k baseRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 rewardedAdComponentProvider) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(rewardedAdComponentProvider, "rewardedAdComponentProvider");
        this.f10015a = requestType;
        this.f10016b = baseRequest;
        this.f10017c = requestConfigurationWrapper;
        this.f10018d = context;
        this.f10019e = activityTracker;
        this.f10020f = delegatingThirdPartyEventEmitter;
        this.f10021g = rewardedAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        ic2 adapter = (ic2) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f10015a == h92.f5905k) {
            Context context = this.f10018d;
            wi.k baseRequest = this.f10016b;
            wi.a0 requestConfiguration = this.f10017c.a();
            h80 delegatingThirdPartyEventEmitter = this.f10020f;
            adapter.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
            Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
            Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
            RtbAdapter rtbAdapter = adapter.f6316b;
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration(context, config.f10389r, m7.a(config.f10359c), m7.b(baseRequest, adapter.f4426a), requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(config.f10359c, requestConfiguration));
            gc2 setRewardedAd = new gc2(adapter);
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
            Intrinsics.checkNotNullParameter(setRewardedAd, "setRewardedAd");
            rtbAdapter.loadRtbRewardedInterstitialAd(mediationRewardedAdConfiguration, new ia1(delegatingThirdPartyEventEmitter, listener, setRewardedAd));
            return;
        }
        Context c13 = this.f10019e.c();
        if (c13 == null) {
            c13 = this.f10018d;
        }
        Context context2 = c13;
        wi.k baseRequest2 = this.f10016b;
        wi.a0 requestConfiguration2 = this.f10017c.a();
        h80 delegatingThirdPartyEventEmitter2 = this.f10020f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(baseRequest2, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration2, "requestConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter2, "delegatingThirdPartyEventEmitter");
        RtbAdapter rtbAdapter2 = adapter.f6316b;
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration(context2, config.f10389r, m7.a(config.f10359c), m7.b(baseRequest2, adapter.f4426a), requestConfiguration2.a(context2), requestConfiguration2.f129925a.getValue(), requestConfiguration2.f129926b.getValue(), m7.d(config.f10359c, requestConfiguration2));
        hc2 setRewardedAd2 = new hc2(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter2, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setRewardedAd2, "setRewardedAd");
        rtbAdapter2.loadRtbRewardedAd(mediationRewardedAdConfiguration2, new ia1(delegatingThirdPartyEventEmitter2, listener, setRewardedAd2));
    }

    @Override // a.w6
    public final d7 a(cf2 transaction, r0 config, ic2 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        d7 d7Var = (d7) this.f10021g.get();
        z zVar = new z(adapter, this, 3);
        l50 l50Var = (l50) d7Var;
        l50Var.getClass();
        l50Var.f7687n = zVar;
        return l50Var;
    }

    public static final void a(ic2 adapter, qb2 this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object context = this$0.f10019e.c();
        if (context == null) {
            context = this$0.f10018d;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (adapter) {
            MediationRewardedAd mediationRewardedAd = adapter.f6320f;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.a();
                Unit unit = Unit.f80348a;
            } else {
                Intrinsics.r("rewardedAd");
                throw null;
            }
        }
    }
}
