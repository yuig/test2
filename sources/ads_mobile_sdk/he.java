package ads_mobile_sdk;

import a.m7;
import a.w0;
import a.z;
import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class he implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f5932a;

    /* renamed from: b, reason: collision with root package name */
    public final p82 f5933b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5934c;

    /* renamed from: d, reason: collision with root package name */
    public final x f5935d;

    /* renamed from: e, reason: collision with root package name */
    public final h80 f5936e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v7 f5937f;

    public he(wi.k adRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 appOpenAdComponentProvider) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(appOpenAdComponentProvider, "appOpenAdComponentProvider");
        this.f5932a = adRequest;
        this.f5933b = requestConfigurationWrapper;
        this.f5934c = context;
        this.f5935d = activityTracker;
        this.f5936e = delegatingThirdPartyEventEmitter;
        this.f5937f = appOpenAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        ic2 adapter = (ic2) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context c13 = this.f5935d.c();
        if (c13 == null) {
            c13 = this.f5934c;
        }
        Context context = c13;
        wi.k adRequest = this.f5932a;
        wi.a0 requestConfiguration = this.f5933b.a();
        h80 delegatingThirdPartyEventEmitter = this.f5936e;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        RtbAdapter rtbAdapter = adapter.f6316b;
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = new MediationAppOpenAdConfiguration(context, config.f10389r, m7.a(config.f10359c), m7.b(adRequest, adapter.f4426a), requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(config.f10359c, requestConfiguration));
        bc2 setAppOpenAd = new bc2(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setAppOpenAd, "setAppOpenAd");
        rtbAdapter.loadRtbAppOpenAd(mediationAppOpenAdConfiguration, new aa1(delegatingThirdPartyEventEmitter, listener, setAppOpenAd));
    }

    @Override // a.w6
    public final a.ac a(cf2 transaction, r0 config, ic2 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        a.ac acVar = (a.ac) this.f5937f.get();
        z zVar = new z(adapter, this, 1);
        d50 d50Var = (d50) acVar;
        d50Var.getClass();
        d50Var.f4174n = zVar;
        return d50Var;
    }

    public static final void a(ic2 adapter, he this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object context = this$0.f5935d.c();
        if (context == null) {
            context = this$0.f5934c;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (adapter) {
            MediationAppOpenAd mediationAppOpenAd = adapter.f6321g;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.a();
                Unit unit = Unit.f80348a;
            } else {
                Intrinsics.r("appOpenAd");
                throw null;
            }
        }
    }
}
