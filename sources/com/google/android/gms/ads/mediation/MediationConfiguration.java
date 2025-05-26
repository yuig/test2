package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "", "Lcom/google/android/gms/ads/AdFormat;", "a", "Lcom/google/android/gms/ads/AdFormat;", "getFormat", "()Lcom/google/android/gms/ads/AdFormat;", "format", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "getServerParameters", "()Landroid/os/Bundle;", "serverParameters", "Companion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MediationConfiguration {

    @NotNull
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AdFormat format;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bundle serverParameters;

    public MediationConfiguration(AdFormat format, Bundle serverParameters) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(serverParameters, "serverParameters");
        this.format = format;
        this.serverParameters = serverParameters;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MediationConfiguration) {
            MediationConfiguration mediationConfiguration = (MediationConfiguration) obj;
            if (this.format == mediationConfiguration.format && Intrinsics.d(this.serverParameters, mediationConfiguration.serverParameters)) {
                return true;
            }
        }
        return false;
    }
}
