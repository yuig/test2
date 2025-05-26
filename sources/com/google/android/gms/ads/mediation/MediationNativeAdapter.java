package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xk2.d;

@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;", "Lcom/google/android/gms/ads/mediation/MediationAdapter;", "requestNativeAd", "", "context", "Landroid/content/Context;", "listener", "Lcom/google/android/gms/ads/mediation/MediationNativeListener;", "serverParameters", "Landroid/os/Bundle;", "mediationAdRequest", "Lcom/google/android/gms/ads/mediation/NativeMediationAdRequest;", "mediationExtras", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MediationNativeAdapter extends MediationAdapter {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NotNull Context context, @NotNull MediationNativeListener listener, @NotNull Bundle serverParameters, @NotNull NativeMediationAdRequest mediationAdRequest, Bundle mediationExtras);
}
