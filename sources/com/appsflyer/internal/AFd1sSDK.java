package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1sSDK implements AFd1pSDK {

    @NotNull
    private final xk2.k getMediationNetwork;

    @NotNull
    private final AFd1jSDK<SharedPreferences> getMonetizationNetwork;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "t_", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1sSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function0<SharedPreferences> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: t_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFd1sSDK.this.getMonetizationNetwork.getRevenue.invoke();
        }
    }

    public AFd1sSDK(@NotNull AFd1jSDK<SharedPreferences> aFd1jSDK) {
        Intrinsics.checkNotNullParameter(aFd1jSDK, "");
        this.getMonetizationNetwork = aFd1jSDK;
        this.getMediationNetwork = xk2.m.b(new AnonymousClass1());
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final int AFAdRevenueData(String str, int i13) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i13);
        } catch (ClassCastException e13) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.PREFERENCES, a.a.j("Unexpected data type found for key ", str), e13, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
            return i13;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final String getCurrencyIso4217Code(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e13) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.PREFERENCES, a.a.j("Unexpected data type found for key ", str), e13, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean getMediationNetwork(String str, boolean z13) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z13);
        } catch (ClassCastException e13) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.PREFERENCES, a.a.j("Unexpected data type found for key ", str), e13, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
            return z13;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getRevenue(String str, boolean z13) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z13).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, String str2) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, long j13) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j13).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, int i13) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i13).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code(String str) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final long getMediationNetwork(String str, long j13) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j13);
        } catch (ClassCastException e13) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.PREFERENCES, a.a.j("Unexpected data type found for key ", str), e13, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
            return j13;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean getMediationNetwork(String str) {
        return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
    }
}
