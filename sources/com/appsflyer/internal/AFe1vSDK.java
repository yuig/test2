package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFe1vSDK {
    public static boolean getCurrencyIso4217Code(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFc1vSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFc1vSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> revenue = AFe1uSDK.getRevenue(str2);
        Pair<Integer, Integer> mediationNetwork3 = AFe1uSDK.getMediationNetwork(str2);
        return (mediationNetwork2 == -1 || revenue != null) ? mediationNetwork3 != null ? ((Number) mediationNetwork3.f80346a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) mediationNetwork3.f80347b).intValue() : revenue != null && ((Number) revenue.f80346a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) revenue.f80347b).intValue() : mediationNetwork2 == mediationNetwork;
    }
}
