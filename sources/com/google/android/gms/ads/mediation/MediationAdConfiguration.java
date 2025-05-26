package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001:\u00011R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001c\u0010-\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u00100\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\f¨\u00062"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationAdConfiguration;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "getBidResponse", "()Ljava/lang/String;", "bidResponse", "Landroid/os/Bundle;", "c", "Landroid/os/Bundle;", "getServerParameters", "()Landroid/os/Bundle;", "serverParameters", "d", "getMediationExtras", "mediationExtras", "", "e", "Z", "isTesting", "()Z", "Landroid/location/Location;", "f", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "location", "", "g", "I", "getTaggedForChildDirectedTreatment", "()I", "taggedForChildDirectedTreatment", "h", "getTaggedForUnderAgeTreatment", "taggedForUnderAgeTreatment", "i", "getMaxAdContentRating", "maxAdContentRating", "j", "getWatermark", "watermark", "TagForChildDirectedTreatment", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class MediationAdConfiguration {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String bidResponse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bundle serverParameters;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Bundle mediationExtras;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isTesting;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Location location;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int taggedForChildDirectedTreatment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int taggedForUnderAgeTreatment;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String maxAdContentRating;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String watermark;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationAdConfiguration$TagForChildDirectedTreatment;", "", "Companion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f30424a;
        public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
        public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
        public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationAdConfiguration$TagForChildDirectedTreatment$Companion;", "", "", "TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE", "I", "TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE", "TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
        public static final class Companion {
            public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
            public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
            public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f30424a = new Companion();
        }
    }

    public MediationAdConfiguration(Context context, String bidResponse, Bundle serverParameters, Bundle mediationExtras, boolean z13, int i13, int i14, String str) {
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
