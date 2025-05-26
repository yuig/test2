package ads_mobile_sdk;

import a.m7;
import a.w0;
import a.z;
import android.content.Context;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wd implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f12988a;

    /* renamed from: b, reason: collision with root package name */
    public final p82 f12989b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12990c;

    /* renamed from: d, reason: collision with root package name */
    public final x f12991d;

    /* renamed from: e, reason: collision with root package name */
    public final h80 f12992e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v7 f12993f;

    public wd(wi.k adRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 appOpenAdComponentProvider) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(appOpenAdComponentProvider, "appOpenAdComponentProvider");
        this.f12988a = adRequest;
        this.f12989b = requestConfigurationWrapper;
        this.f12990c = context;
        this.f12991d = activityTracker;
        this.f12992e = delegatingThirdPartyEventEmitter;
        this.f12993f = appOpenAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        u91 adapter = (u91) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context c13 = this.f12991d.c();
        if (c13 == null) {
            c13 = this.f12990c;
        }
        Context context = c13;
        wi.k adRequest = this.f12988a;
        wi.a0 requestConfiguration = this.f12989b.a();
        nm.u serverParameterData = config.f10359c;
        h80 delegatingThirdPartyEventEmitter = this.f12992e;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Adapter adapter2 = adapter.f4426a;
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = new MediationAppOpenAdConfiguration(context, "", m7.a(serverParameterData), m7.b(adRequest, adapter.f4426a), requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(serverParameterData, requestConfiguration));
        n91 setAppOpenAd = new n91(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setAppOpenAd, "setAppOpenAd");
        adapter2.loadAppOpenAd(mediationAppOpenAdConfiguration, new aa1(delegatingThirdPartyEventEmitter, listener, setAppOpenAd));
    }

    @Override // a.w6
    public final a.ac a(cf2 transaction, r0 config, u91 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        a.ac acVar = (a.ac) this.f12993f.get();
        z zVar = new z(adapter, this, 5);
        d50 d50Var = (d50) acVar;
        d50Var.getClass();
        d50Var.f4174n = zVar;
        return d50Var;
    }

    public static final void a(u91 adapter, wd this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object context = this$0.f12991d.c();
        if (context == null) {
            context = this$0.f12990c;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        MediationAppOpenAd mediationAppOpenAd = adapter.f11895f;
        if (mediationAppOpenAd != null) {
            mediationAppOpenAd.a();
        } else {
            Intrinsics.r("appOpenAd");
            throw null;
        }
    }
}
