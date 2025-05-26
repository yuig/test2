package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/appsflyer/internal/AFe1bSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMediationNetwork", "Ljava/lang/String;", "getMonetizationNetwork", "AFAdRevenueData", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum AFe1bSDK {
    API("api"),
    RC("rc"),
    DEFAULT("");


    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public final String getMonetizationNetwork;

    AFe1bSDK(String str) {
        this.getMonetizationNetwork = str;
    }
}
