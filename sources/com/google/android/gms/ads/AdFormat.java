package com.google.android.gms.ads;

import kotlin.Metadata;
import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/android/gms/ads/AdFormat;", "", "BANNER", "INTERSTITIAL", "REWARDED", "REWARDED_INTERSTITIAL", "NATIVE", "UNKNOWN", "APP_OPEN_AD", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdFormat {
    public static final AdFormat APP_OPEN_AD;
    public static final AdFormat BANNER;
    public static final AdFormat INTERSTITIAL;
    public static final AdFormat NATIVE;
    public static final AdFormat REWARDED;
    public static final AdFormat REWARDED_INTERSTITIAL;
    public static final AdFormat UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AdFormat[] f30378a;

    static {
        AdFormat adFormat = new AdFormat("BANNER", 0);
        BANNER = adFormat;
        AdFormat adFormat2 = new AdFormat("INTERSTITIAL", 1);
        INTERSTITIAL = adFormat2;
        AdFormat adFormat3 = new AdFormat("REWARDED", 2);
        REWARDED = adFormat3;
        AdFormat adFormat4 = new AdFormat("REWARDED_INTERSTITIAL", 3);
        REWARDED_INTERSTITIAL = adFormat4;
        AdFormat adFormat5 = new AdFormat("NATIVE", 4);
        NATIVE = adFormat5;
        AdFormat adFormat6 = new AdFormat("UNKNOWN", 5);
        UNKNOWN = adFormat6;
        AdFormat adFormat7 = new AdFormat("APP_OPEN_AD", 6);
        APP_OPEN_AD = adFormat7;
        AdFormat[] adFormatArr = {adFormat, adFormat2, adFormat3, adFormat4, adFormat5, adFormat6, adFormat7};
        f30378a = adFormatArr;
        l0.b0(adFormatArr);
    }

    private AdFormat(String str, int i13) {
    }

    public static AdFormat[] values() {
        return (AdFormat[]) f30378a.clone();
    }
}
