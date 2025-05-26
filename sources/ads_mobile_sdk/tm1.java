package ads_mobile_sdk;

import a.m7;
import a.w0;
import android.content.Context;
import android.os.Bundle;
import bj.n;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class tm1 implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f11596a;

    /* renamed from: b, reason: collision with root package name */
    public final n f11597b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f11598c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f11599d;

    /* renamed from: e, reason: collision with root package name */
    public final x f11600e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f11601f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f11602g;

    public tm1(wi.k baseRequest, n nativeRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 nativeAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(nativeAdComponentProvider, "nativeAdComponentProvider");
        this.f11596a = baseRequest;
        this.f11597b = nativeRequest;
        this.f11598c = requestConfigurationWrapper;
        this.f11599d = context;
        this.f11600e = activityTracker;
        this.f11601f = delegatingThirdPartyEventEmitter;
        this.f11602g = nativeAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        Context context;
        String str;
        h80 h80Var;
        wi.a0 a0Var;
        n nVar;
        wi.k kVar;
        RtbAdapter rtbAdapter;
        String str2;
        Bundle a13;
        Bundle b13;
        boolean a14;
        Context context2;
        ic2 adapter = (ic2) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context3 = this.f11600e.c();
        if (context3 == null) {
            context3 = this.f11599d;
        }
        wi.k baseRequest = this.f11596a;
        n nativeRequest = this.f11597b;
        wi.a0 requestConfiguration = this.f11598c.a();
        h80 delegatingThirdPartyEventEmitter = this.f11601f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        try {
            rtbAdapter = adapter.f6316b;
            str2 = config.f10389r;
            a13 = m7.a(config.f10359c);
            b13 = m7.b(baseRequest, adapter.f4426a);
            a14 = requestConfiguration.a(context3);
            context2 = context3;
            context = context3;
            str = "delegatingThirdPartyEventEmitter";
            h80Var = delegatingThirdPartyEventEmitter;
            a0Var = requestConfiguration;
            nVar = nativeRequest;
            kVar = baseRequest;
        } catch (IllegalStateException e13) {
            e = e13;
            context = context3;
            str = "delegatingThirdPartyEventEmitter";
            h80Var = delegatingThirdPartyEventEmitter;
            a0Var = requestConfiguration;
            nVar = nativeRequest;
            kVar = baseRequest;
        }
        try {
            MediationNativeAdConfiguration mediationNativeAdConfiguration = new MediationNativeAdConfiguration(context2, str2, a13, b13, a14, requestConfiguration.f129925a.getValue(), requestConfiguration.f129926b.getValue(), m7.d(config.f10359c, requestConfiguration), m7.c(nativeRequest));
            ec2 setNativeAdMapper = new ec2(adapter);
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(h80Var, str);
            Intrinsics.checkNotNullParameter(setNativeAdMapper, "setNativeAdMapper");
            rtbAdapter.loadRtbNativeAdMapper(mediationNativeAdConfiguration, new ga1(h80Var, listener, setNativeAdMapper));
        } catch (IllegalStateException e14) {
            e = e14;
            if (!z.i(e.getMessage(), Adapter.ERROR_MESSAGE_METHOD_NOT_FOUND, false)) {
                throw e;
            }
            RtbAdapter rtbAdapter2 = adapter.f6316b;
            h80 h80Var2 = h80Var;
            String str3 = config.f10389r;
            Bundle a15 = m7.a(config.f10359c);
            Bundle b14 = m7.b(kVar, adapter.f4426a);
            Context context4 = context;
            wi.a0 a0Var2 = a0Var;
            MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration(context4, str3, a15, b14, a0Var2.a(context4), a0Var2.f129925a.getValue(), a0Var2.f129926b.getValue(), m7.d(config.f10359c, a0Var2), m7.c(nVar));
            fc2 setUnifiedNativeAdMapper = new fc2(adapter);
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(h80Var2, str);
            Intrinsics.checkNotNullParameter(setUnifiedNativeAdMapper, "setUnifiedNativeAdMapper");
            rtbAdapter2.loadRtbNativeAd(mediationNativeAdConfiguration2, new ka1(h80Var2, listener, setUnifiedNativeAdMapper));
        }
    }

    @Override // a.w6
    public final a.n3 a(cf2 transaction, r0 config, Object obj) {
        ic2 adapter = (ic2) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        j50 j50Var = (j50) this.f11602g.get();
        a.p1 p1Var = adapter.f6318d;
        if (p1Var != null) {
            j50Var.getClass();
            j50Var.f6694n = p1Var;
            a.p1 p1Var2 = adapter.f6318d;
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
