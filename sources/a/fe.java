package a;

import ads_mobile_sdk.gq1;
import ads_mobile_sdk.h92;
import ads_mobile_sdk.ic2;
import ads_mobile_sdk.u91;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fe {
    public static w0 a(fe feVar, String adapterClassName, boolean z13, boolean z14, h92 requestType, int i13) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        if ((i13 & 8) != 0) {
            requestType = h92.f5898d;
        }
        feVar.getClass();
        Intrinsics.checkNotNullParameter(adapterClassName, "adapterClassName");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        try {
            Object newInstance = Class.forName(adapterClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!z13) {
                if (newInstance instanceof MediationAdapter) {
                    MediationAdapter mediationAdapter = (MediationAdapter) newInstance;
                    if (((requestType == h92.f5900f && (mediationAdapter instanceof MediationBannerAdapter)) || ((requestType == h92.f5902h && (mediationAdapter instanceof MediationInterstitialAdapter)) || (requestType == h92.f5903i && (mediationAdapter instanceof MediationNativeAdapter)))) && !z14) {
                        return new gq1((MediationAdapter) newInstance);
                    }
                }
                if (newInstance instanceof Adapter) {
                    return new u91((Adapter) newInstance);
                }
            } else if (newInstance instanceof RtbAdapter) {
                return new ic2((RtbAdapter) newInstance);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
