package ads_mobile_sdk;

import a.m7;
import a.w0;
import android.content.Context;
import android.os.Bundle;
import bj.n;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class mi1 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f8239a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8240b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f8241c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8242d;

    /* renamed from: e, reason: collision with root package name */
    public final x f8243e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f8244f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f8245g;

    public mi1(wi.k baseRequest, n nativeRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 nativeAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(nativeAdComponentProvider, "nativeAdComponentProvider");
        this.f8239a = baseRequest;
        this.f8240b = nativeRequest;
        this.f8241c = requestConfigurationWrapper;
        this.f8242d = context;
        this.f8243e = activityTracker;
        this.f8244f = delegatingThirdPartyEventEmitter;
        this.f8245g = nativeAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        Context context;
        String str;
        h80 h80Var;
        nm.u uVar;
        wi.a0 a0Var;
        n nVar;
        wi.k kVar;
        Adapter adapter;
        Bundle a13;
        Bundle b13;
        boolean a14;
        Context context2;
        u91 adapter2 = (u91) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter2, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context3 = this.f8243e.c();
        if (context3 == null) {
            context3 = this.f8242d;
        }
        wi.k baseRequest = this.f8239a;
        n nativeRequest = this.f8240b;
        wi.a0 requestConfiguration = this.f8241c.a();
        nm.u adapterData = config.f10359c;
        h80 delegatingThirdPartyEventEmitter = this.f8244f;
        adapter2.getClass();
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        try {
            adapter = adapter2.f4426a;
            a13 = m7.a(adapterData);
            b13 = m7.b(baseRequest, adapter2.f4426a);
            a14 = requestConfiguration.a(context3);
            context2 = context3;
            context = context3;
            str = "delegatingThirdPartyEventEmitter";
            h80Var = delegatingThirdPartyEventEmitter;
            uVar = adapterData;
            a0Var = requestConfiguration;
            nVar = nativeRequest;
            kVar = baseRequest;
        } catch (IllegalStateException e13) {
            e = e13;
            context = context3;
            str = "delegatingThirdPartyEventEmitter";
            h80Var = delegatingThirdPartyEventEmitter;
            uVar = adapterData;
            a0Var = requestConfiguration;
            nVar = nativeRequest;
            kVar = baseRequest;
        }
        try {
            MediationNativeAdConfiguration mediationNativeAdConfiguration = new MediationNativeAdConfiguration(context2, "", a13, b13, a14, requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(adapterData, requestConfiguration), m7.c(nativeRequest));
            q91 setNativeAdMapper = new q91(adapter2);
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(h80Var, str);
            Intrinsics.checkNotNullParameter(setNativeAdMapper, "setNativeAdMapper");
            adapter.loadNativeAdMapper(mediationNativeAdConfiguration, new ga1(h80Var, listener, setNativeAdMapper));
        } catch (IllegalStateException e14) {
            e = e14;
            if (!z.i(e.getMessage(), Adapter.ERROR_MESSAGE_METHOD_NOT_FOUND, false)) {
                throw e;
            }
            Adapter adapter3 = adapter2.f4426a;
            Bundle a15 = m7.a(uVar);
            Bundle b14 = m7.b(kVar, adapter2.f4426a);
            Context context4 = context;
            wi.a0 a0Var2 = a0Var;
            MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration(context4, "", a15, b14, a0Var2.a(context4), a0Var2.f129925a.getValue(), a0Var2.f129926b.getValue(), m7.d(uVar, a0Var2), m7.c(nVar));
            r91 setUnifiedNativeAdMapper = new r91(adapter2);
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(h80Var, str);
            Intrinsics.checkNotNullParameter(setUnifiedNativeAdMapper, "setUnifiedNativeAdMapper");
            adapter3.loadNativeAd(mediationNativeAdConfiguration2, new ka1(h80Var, listener, setUnifiedNativeAdMapper));
        }
    }

    @Override // a.w6
    public final a.n3 a(cf2 transaction, r0 config, Object obj) {
        u91 adapter = (u91) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        j50 j50Var = (j50) this.f8245g.get();
        a.p1 p1Var = adapter.f11892c;
        if (p1Var != null) {
            j50Var.getClass();
            j50Var.f6694n = p1Var;
            a.p1 p1Var2 = adapter.f11892c;
            if (p1Var2 != null) {
                j50Var.f6695o = c3.c(p1Var2);
                return j50Var;
            }
            Intrinsics.r("nativeAdMapper");
            throw null;
        }
        Intrinsics.r("nativeAdMapper");
        throw null;
    }
}
