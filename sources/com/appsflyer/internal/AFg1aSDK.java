package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\fj\u0002\b\u000b"}, d2 = {"Lcom/appsflyer/internal/AFg1aSDK;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "AFAdRevenueData", "Z", "getMediationNetwork", "()Z", "getCurrencyIso4217Code", "getMonetizationNetwork", "Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum AFg1aSDK {
    IS_INAPP_TRIGGER_ENABLED;


    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final String AFAdRevenueData;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final boolean getCurrencyIso4217Code = false;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final boolean getMediationNetwork = false;

    AFg1aSDK() {
        this.AFAdRevenueData = r3;
    }

    /* renamed from: getCurrencyIso4217Code, reason: from getter */
    public final boolean getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    /* renamed from: getMediationNetwork, reason: from getter */
    public final boolean getGetCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }
}
