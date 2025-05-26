package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFe1xSDK;", "Lcom/appsflyer/internal/AFd1hSDK;", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "getRevenue", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1lSDK;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1lSDK;", "()Lcom/appsflyer/internal/AFe1lSDK;", "getMediationNetwork", "getMonetizationNetwork", "()Ljava/lang/String;", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFe1xSDK extends AFd1hSDK {

    @NotNull
    public static String getMediationNetwork = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final AFe1lSDK getMediationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1xSDK(@NotNull byte[] bArr, Map<String, String> map, int i13) {
        super(bArr, map, i13);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = AFe1lSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    /* renamed from: AFAdRevenueData, reason: from getter */
    public final AFe1lSDK getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    public final String getMonetizationNetwork() {
        String format = String.format(getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    public final String getRevenue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFe1uSDK.AFAdRevenueData(str);
    }
}
