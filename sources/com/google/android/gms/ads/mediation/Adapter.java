package com.google.android.gms.ads.mediation;

import ads_mobile_sdk.y0;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 02\u00020\u0001:\u00010J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00182\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0004H\u0016¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f0\u0004H\u0016¢\u0006\u0004\b#\u0010!J-\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H&¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020,H&¢\u0006\u0004\b/\u0010.¨\u00061"}, d2 = {"Lcom/google/android/gms/ads/mediation/Adapter;", "Lcom/google/android/gms/ads/mediation/MediationExtrasReceiver;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "adConfiguration", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "callback", "", "loadBannerAd", "(Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationInterscrollerAd;", "loadInterscrollerAd", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "loadInterstitialAd", "(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "loadRewardedAd", "(Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "loadRewardedInterstitialAd", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "loadAppOpenAd", "(Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "loadNativeAd", "(Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "loadNativeAdMapper", "Landroid/content/Context;", "context", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "configurations", "initialize", "(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;Ljava/util/List;)V", "Lcom/google/android/gms/ads/VersionInfo;", "getVersionInfo", "()Lcom/google/android/gms/ads/VersionInfo;", "getSDKVersionInfo", "Companion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class Adapter implements MediationExtrasReceiver {

    @NotNull
    public static final String ERROR_MESSAGE_METHOD_NOT_FOUND = "Method is not found";

    @NotNull
    public abstract com.google.android.gms.ads.VersionInfo getSDKVersionInfo();

    @NotNull
    public abstract com.google.android.gms.ads.VersionInfo getVersionInfo();

    public abstract void initialize(@NotNull Context context, @NotNull InitializationCompleteCallback callback, @NotNull List<MediationConfiguration> configurations);

    public void loadAppOpenAd(@NotNull MediationAppOpenAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFailure(new AdError(y0.f13908a.a(), getClass().getSimpleName().concat(" does not support app open ads.")));
    }

    public void loadBannerAd(@NotNull MediationBannerAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFailure(new AdError(y0.f13908a.a(), getClass().getSimpleName().concat(" does not support banner ads.")));
    }

    public void loadInterscrollerAd(@NotNull MediationBannerAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFailure(new AdError(y0.f13908a.a(), getClass().getSimpleName().concat(" does not support interscroller ads.")));
    }

    public void loadInterstitialAd(@NotNull MediationInterstitialAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFailure(new AdError(y0.f13908a.a(), getClass().getSimpleName().concat(" does not support interstitial ads.")));
    }

    public void loadNativeAd(@NotNull MediationNativeAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFailure(new AdError(y0.f13908a.a(), getClass().getSimpleName().concat(" does not support native ads.")));
    }

    public void loadNativeAdMapper(@NotNull MediationNativeAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        throw new IllegalStateException(ERROR_MESSAGE_METHOD_NOT_FOUND);
    }

    public void loadRewardedAd(@NotNull MediationRewardedAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFailure(new AdError(y0.f13908a.a(), getClass().getSimpleName().concat(" does not support rewarded ads.")));
    }

    public void loadRewardedInterstitialAd(@NotNull MediationRewardedAdConfiguration adConfiguration, @NotNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFailure(new AdError(y0.f13908a.a(), getClass().getSimpleName().concat(" does not support rewarded interstitial ads.")));
    }
}
