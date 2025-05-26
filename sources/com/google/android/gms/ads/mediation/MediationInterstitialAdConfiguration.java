package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001c\u0010-\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u00100\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\f¨\u00061"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationAdConfiguration;", "Landroid/content/Context;", "k", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "l", "Ljava/lang/String;", "getBidResponse", "()Ljava/lang/String;", "bidResponse", "Landroid/os/Bundle;", "m", "Landroid/os/Bundle;", "getServerParameters", "()Landroid/os/Bundle;", "serverParameters", "n", "getMediationExtras", "mediationExtras", "", "o", "Z", "isTesting", "()Z", "Landroid/location/Location;", "p", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "location", "", "q", "I", "getTaggedForChildDirectedTreatment", "()I", "taggedForChildDirectedTreatment", "r", "getTaggedForUnderAgeTreatment", "taggedForUnderAgeTreatment", "s", "getMaxAdContentRating", "maxAdContentRating", "t", "getWatermark", "watermark", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MediationInterstitialAdConfiguration extends MediationAdConfiguration {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String bidResponse;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Bundle serverParameters;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Bundle mediationExtras;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isTesting;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Location location;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int taggedForChildDirectedTreatment;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int taggedForUnderAgeTreatment;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String maxAdContentRating;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String watermark;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationInterstitialAdConfiguration(Context context, String bidResponse, Bundle serverParameters, Bundle mediationExtras, boolean z13, int i13, int i14, String str) {
        super(context, bidResponse, serverParameters, mediationExtras, z13, i13, i14, str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(serverParameters, "serverParameters");
        Intrinsics.checkNotNullParameter(mediationExtras, "mediationExtras");
        Intrinsics.checkNotNullParameter("", "watermark");
        this.context = context;
        this.bidResponse = bidResponse;
        this.serverParameters = serverParameters;
        this.mediationExtras = mediationExtras;
        this.isTesting = z13;
        this.location = null;
        this.taggedForChildDirectedTreatment = i13;
        this.taggedForUnderAgeTreatment = i14;
        this.maxAdContentRating = str;
        this.watermark = "";
    }
}
