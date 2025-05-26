package ads_mobile_sdk;

import a.c9;
import a.m4;
import a.m7;
import a.w0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vh implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f12503a;

    /* renamed from: b, reason: collision with root package name */
    public final vi.d f12504b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f12505c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f12506d;

    /* renamed from: e, reason: collision with root package name */
    public final x f12507e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f12508f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f12509g;

    public vh(wi.k baseRequest, vi.d bannerRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 bannerAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(bannerAdComponentProvider, "bannerAdComponentProvider");
        this.f12503a = baseRequest;
        this.f12504b = bannerRequest;
        this.f12505c = requestConfigurationWrapper;
        this.f12506d = context;
        this.f12507e = activityTracker;
        this.f12508f = delegatingThirdPartyEventEmitter;
        this.f12509g = bannerAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        u91 adapter = (u91) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        vi.a adSize = this.f12504b.k();
        if (adSize == null) {
            listener.a(new AdError(0, "No AdSize available for banner mediation. This may happen when a server-to-server ad response triggers mediation but no AdSize was provided in the signal request."));
            return;
        }
        Context c13 = this.f12507e.c();
        if (c13 == null) {
            c13 = this.f12506d;
        }
        Context context = c13;
        wi.k baseRequest = this.f12503a;
        wi.a0 requestConfiguration = this.f12505c.a();
        nm.u serverParameterData = config.f10359c;
        h80 delegatingThirdPartyEventEmitter = this.f12508f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Adapter adapter2 = adapter.f4426a;
        Bundle a13 = m7.a(serverParameterData);
        Bundle b13 = m7.b(baseRequest, adapter.f4426a);
        boolean a14 = requestConfiguration.a(context);
        int value = requestConfiguration.f129925a.getValue();
        int value2 = requestConfiguration.f129926b.getValue();
        String d2 = m7.d(serverParameterData, requestConfiguration);
        String formatString = adSize.f125861e;
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        boolean z13 = adSize.f125859c;
        boolean z14 = adSize.f125860d;
        int i13 = adSize.f125857a;
        int i14 = adSize.f125858b;
        MediationBannerAdConfiguration mediationBannerAdConfiguration = new MediationBannerAdConfiguration(context, "", a13, b13, a14, value, value2, d2, new AdSize(i13, i14, formatString, z13, z14, i14));
        o91 setAdView = new o91(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setAdView, "setAdView");
        adapter2.loadBannerAd(mediationBannerAdConfiguration, new ca1(delegatingThirdPartyEventEmitter, listener, setAdView));
    }

    @Override // a.w6
    public final void a(m4 m4Var) {
        g50 adComponent = (g50) m4Var;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        ((c9) adComponent.D.get()).getClass();
    }

    @Override // a.w6
    public final a.n3 a(cf2 transaction, r0 config, Object obj) {
        u91 adapter = (u91) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        f50 f50Var = (f50) this.f12509g.get();
        View view = adapter.f11891b;
        if (view != null) {
            f50Var.getClass();
            f50Var.f5061n = view;
            return f50Var;
        }
        Intrinsics.r("view");
        throw null;
    }
}
