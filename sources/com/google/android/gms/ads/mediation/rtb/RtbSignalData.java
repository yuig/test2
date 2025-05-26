package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import gh0.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/gms/ads/mediation/rtb/RtbSignalData;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "b", "Ljava/util/List;", "getConfigurations", "()Ljava/util/List;", "configurations", "Landroid/os/Bundle;", "c", "Landroid/os/Bundle;", "getNetworkExtras", "()Landroid/os/Bundle;", "networkExtras", "Lcom/google/android/gms/ads/AdSize;", "d", "Lcom/google/android/gms/ads/AdSize;", "getAdSize", "()Lcom/google/android/gms/ads/AdSize;", "adSize", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class RtbSignalData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List configurations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bundle networkExtras;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AdSize adSize;

    public RtbSignalData(Context context, List configurations, Bundle networkExtras, AdSize adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(networkExtras, "networkExtras");
        this.context = context;
        this.configurations = configurations;
        this.networkExtras = networkExtras;
        this.adSize = adSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtbSignalData)) {
            return false;
        }
        RtbSignalData rtbSignalData = (RtbSignalData) obj;
        return Intrinsics.d(this.context, rtbSignalData.context) && Intrinsics.d(this.configurations, rtbSignalData.configurations) && Intrinsics.d(this.networkExtras, rtbSignalData.networkExtras) && Intrinsics.d(this.adSize, rtbSignalData.adSize);
    }

    public final int hashCode() {
        int hashCode = (this.networkExtras.hashCode() + b.p(this.context.hashCode() * 31, this.configurations)) * 31;
        AdSize adSize = this.adSize;
        return hashCode + (adSize == null ? 0 : adSize.hashCode());
    }

    public final String toString() {
        return "RtbSignalData(context=" + this.context + ", configurations=" + this.configurations + ", networkExtras=" + this.networkExtras + ", adSize=" + this.adSize + ")";
    }
}
