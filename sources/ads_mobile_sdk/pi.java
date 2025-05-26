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
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pi implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f9688a;

    /* renamed from: b, reason: collision with root package name */
    public final vi.d f9689b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f9690c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f9691d;

    /* renamed from: e, reason: collision with root package name */
    public final x f9692e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f9693f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f9694g;

    public pi(wi.k baseRequest, vi.d bannerRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 bannerAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(bannerAdComponentProvider, "bannerAdComponentProvider");
        this.f9688a = baseRequest;
        this.f9689b = bannerRequest;
        this.f9690c = requestConfigurationWrapper;
        this.f9691d = context;
        this.f9692e = activityTracker;
        this.f9693f = delegatingThirdPartyEventEmitter;
        this.f9694g = bannerAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        ic2 adapter = (ic2) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        vi.a adSize = this.f9689b.k();
        if (adSize == null) {
            listener.a(new AdError(0, "No AdSize available for banner mediation. This may happen when a server-to-server ad response triggers mediation but no AdSize was provided in the signal request."));
            return;
        }
        Context c13 = this.f9692e.c();
        if (c13 == null) {
            c13 = this.f9691d;
        }
        Context context = c13;
        wi.k baseRequest = this.f9688a;
        wi.a0 requestConfiguration = this.f9690c.a();
        h80 delegatingThirdPartyEventEmitter = this.f9693f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        RtbAdapter rtbAdapter = adapter.f6316b;
        String str = config.f10389r;
        Bundle a13 = m7.a(config.f10359c);
        Bundle b13 = m7.b(baseRequest, adapter.f4426a);
        boolean a14 = requestConfiguration.a(context);
        int value = requestConfiguration.f129925a.getValue();
        int value2 = requestConfiguration.f129926b.getValue();
        String d2 = m7.d(config.f10359c, requestConfiguration);
        String formatString = adSize.f125861e;
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        boolean z13 = adSize.f125859c;
        boolean z14 = adSize.f125860d;
        int i13 = adSize.f125857a;
        int i14 = adSize.f125858b;
        MediationBannerAdConfiguration mediationBannerAdConfiguration = new MediationBannerAdConfiguration(context, str, a13, b13, a14, value, value2, d2, new AdSize(i13, i14, formatString, z13, z14, i14));
        cc2 setAdView = new cc2(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setAdView, "setAdView");
        rtbAdapter.loadRtbBannerAd(mediationBannerAdConfiguration, new ca1(delegatingThirdPartyEventEmitter, listener, setAdView));
    }

    @Override // a.w6
    public final void a(m4 m4Var) {
        g50 adComponent = (g50) m4Var;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        ((c9) adComponent.D.get()).getClass();
    }

    @Override // a.w6
    public final a.n3 a(cf2 transaction, r0 config, Object obj) {
        ic2 adapter = (ic2) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        f50 f50Var = (f50) this.f9694g.get();
        View view = adapter.f6317c;
        if (view != null) {
            f50Var.getClass();
            f50Var.f5061n = view;
            return f50Var;
        }
        Intrinsics.r("view");
        throw null;
    }
}
