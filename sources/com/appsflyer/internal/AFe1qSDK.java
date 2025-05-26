package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00168\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/appsflyer/internal/AFe1qSDK;", "Lcom/appsflyer/internal/AFd1hSDK;", "Lcom/appsflyer/internal/AFd1nSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFd1nSDK;[BLjava/util/Map;I)V", "getRevenue", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1lSDK;", "component1", "Lcom/appsflyer/internal/AFe1lSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFe1lSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFd1nSDK;", "", "Z", "()Z", "getMonetizationNetwork", "()Ljava/lang/String;", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFe1qSDK extends AFd1hSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final boolean getMediationNetwork;

    /* renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AFe1lSDK AFAdRevenueData;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public AFd1nSDK getRevenue;

    public /* synthetic */ AFe1qSDK(AFd1nSDK aFd1nSDK, byte[] bArr, Map map, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1nSDK, bArr, (i14 & 4) != 0 ? null : map, (i14 & 8) != 0 ? 2000 : i13);
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    /* renamed from: AFAdRevenueData, reason: from getter */
    public final AFe1lSDK getGetMediationNetwork() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    public final String getMonetizationNetwork() {
        AFj1bSDK aFj1bSDK = new AFj1bSDK(this.getRevenue, null, 2, 0 == true ? 1 : 0);
        return aFj1bSDK.getMediationNetwork(aFj1bSDK.AFAdRevenueData.getMonetizationNetwork(AFj1bSDK.component2));
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    /* renamed from: getRevenue, reason: from getter */
    public final boolean getGetRevenue() {
        return this.getMediationNetwork;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1qSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull byte[] bArr, Map<String, String> map, int i13) {
        super(bArr, map, i13);
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getRevenue = aFd1nSDK;
        this.AFAdRevenueData = AFe1lSDK.OCTET_STREAM;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    public final String getRevenue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1qSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull byte[] bArr) {
        this(aFd1nSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
