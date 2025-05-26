package ads_mobile_sdk;

import a.m7;
import a.w0;
import a.w2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import bj.n;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gq1 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdapter f5662a;

    /* renamed from: b, reason: collision with root package name */
    public View f5663b;

    /* renamed from: c, reason: collision with root package name */
    public a.p1 f5664c;

    /* renamed from: d, reason: collision with root package name */
    public MediationInterstitialAdapter f5665d;

    public gq1(MediationAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f5662a = adapter;
    }

    public final void a(Context context, vi.a adSize, wi.k baseRequest, wi.a0 requestConfiguration, nm.u serverParameterData, w2 mediationAdLoadListener, h80 delegatingThirdPartyEventEmitter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(mediationAdLoadListener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        MediationAdapter mediationAdapter = this.f5662a;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String canonicalName = mediationAdapter.getClass().getCanonicalName();
            String canonicalName2 = MediationBannerAdapter.class.getCanonicalName();
            ((mo2) mediationAdLoadListener).a(new AdError(0, a.a.q(a.a.w("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), this.f5662a.getClass().getCanonicalName(), " implement ", MediationBannerAdapter.class.getCanonicalName(), "?")));
            return;
        }
        l91 l91Var = new l91(baseRequest.f129959f, requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(serverParameterData, requestConfiguration));
        MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5662a;
        cq1 cq1Var = new cq1(delegatingThirdPartyEventEmitter, (mo2) mediationAdLoadListener, this);
        Bundle a13 = m7.a(serverParameterData);
        int i13 = adSize.f125857a;
        String formatString = adSize.f125861e;
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        boolean z13 = adSize.f125859c;
        boolean z14 = adSize.f125860d;
        int i14 = adSize.f125858b;
        mediationBannerAdapter.requestBannerAd(context, cq1Var, a13, new AdSize(i13, i14, formatString, z13, z14, i14), l91Var, m7.b(baseRequest, this.f5662a));
    }

    public final void a(Context context, wi.k baseRequest, wi.a0 requestConfiguration, nm.u serverParameterData, w2 mediationAdLoadListener, h80 delegatingThirdPartyEventEmitter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(mediationAdLoadListener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        MediationAdapter mediationAdapter = this.f5662a;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String canonicalName = mediationAdapter.getClass().getCanonicalName();
            String canonicalName2 = MediationInterstitialAdapter.class.getCanonicalName();
            mo2 mo2Var = (mo2) mediationAdLoadListener;
            mo2Var.a(new AdError(0, a.a.q(a.a.w("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), this.f5662a.getClass().getCanonicalName(), " implement ", MediationInterstitialAdapter.class.getCanonicalName(), "?")));
            return;
        }
        ((MediationInterstitialAdapter) this.f5662a).requestInterstitialAd(context, new dq1(delegatingThirdPartyEventEmitter, (mo2) mediationAdLoadListener, this), m7.a(serverParameterData), new l91(baseRequest.f129959f, requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(serverParameterData, requestConfiguration)), m7.b(baseRequest, this.f5662a));
    }

    public final void a(Context context, wi.k baseRequest, n nativeRequest, wi.a0 requestConfiguration, nm.u adapterData, w2 mediationAdLoadListener, h80 delegatingThirdPartyEventEmitter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        Intrinsics.checkNotNullParameter(mediationAdLoadListener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        MediationAdapter mediationAdapter = this.f5662a;
        if (!(mediationAdapter instanceof MediationNativeAdapter)) {
            String canonicalName = mediationAdapter.getClass().getCanonicalName();
            String canonicalName2 = MediationNativeAdapter.class.getCanonicalName();
            mo2 mo2Var = (mo2) mediationAdLoadListener;
            mo2Var.a(new AdError(0, a.a.q(a.a.w("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), this.f5662a.getClass().getCanonicalName(), " implement ", MediationNativeAdapter.class.getCanonicalName(), "?")));
            return;
        }
        ((MediationNativeAdapter) this.f5662a).requestNativeAd(context, new eq1(delegatingThirdPartyEventEmitter, (mo2) mediationAdLoadListener, new fq1(this)), m7.a(adapterData), new bl1(baseRequest.f129959f, requestConfiguration.a(context), requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(adapterData, requestConfiguration), m7.c(nativeRequest)), m7.b(baseRequest, this.f5662a));
    }

    @Override // a.w0
    public final Object a(Context context, n6 n6Var, bl2.c cVar) {
        return new nk0("Old mediation adapters do not implement initialize method.", yx0.f14443a);
    }
}
