package com.google.android.gms.ads.mediation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xk2.d;

@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationAdapter;", "Lcom/google/android/gms/ads/mediation/MediationExtrasReceiver;", "Companion", "AdapterInfoBuilder", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface MediationAdapter extends MediationExtrasReceiver {
    public static final int CAPABILITIES_DELAYED_IMPRESSIONS = 1;
    public static final int CAPABILITIES_FLOOR_CPM = 2;
    public static final int CAPABILITIES_RETURNS_CPM = 4;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f30430a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationAdapter$AdapterInfoBuilder;", "", "Companion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class AdapterInfoBuilder {

        /* renamed from: a, reason: collision with root package name */
        private int f30429a;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/google/android/gms/ads/mediation/MediationAdapter$Companion;", "", "", "CAPABILITIES_DELAYED_IMPRESSIONS", "I", "CAPABILITIES_FLOOR_CPM", "CAPABILITIES_RETURNS_CPM", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public static final int CAPABILITIES_DELAYED_IMPRESSIONS = 1;
        public static final int CAPABILITIES_FLOOR_CPM = 2;
        public static final int CAPABILITIES_RETURNS_CPM = 4;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f30430a = new Companion();
    }
}
