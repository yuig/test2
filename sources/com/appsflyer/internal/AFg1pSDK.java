package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\r\u0010\u0007R\u001b\u0010\u000b\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFg1pSDK;", "", "", "getMediationNetwork", "()J", "", "getCurrencyIso4217Code", "()Z", "Lcom/appsflyer/internal/AFd1nSDK;", "Lcom/appsflyer/internal/AFd1nSDK;", "Lcom/appsflyer/internal/AFg1rSDK;", "getRevenue", "Lcom/appsflyer/internal/AFg1rSDK;", "getMonetizationNetwork", "Lxk2/k;", "AFAdRevenueData", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFg1rSDK;)V", "AFa1vSDK"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AFg1pSDK {
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final xk2.k getRevenue;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final AFd1nSDK getMediationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final xk2.k AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFg1rSDK getMonetizationNetwork;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFAdRevenueData", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1pSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends s implements Function0<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1pSDK.this.getMediationNetwork.getRevenue("com.appsflyer.rc.staging")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getRevenue", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1pSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends s implements Function0<Boolean> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1pSDK.this.getMediationNetwork.getRevenue("com.appsflyer.rc.sandbox")));
        }
    }

    public AFg1pSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull AFg1rSDK aFg1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        this.getMediationNetwork = aFd1nSDK;
        this.getMonetizationNetwork = aFg1rSDK;
        this.AFAdRevenueData = xk2.m.b(new AnonymousClass5());
        this.getRevenue = xk2.m.b(new AnonymousClass3());
    }

    public final boolean getCurrencyIso4217Code() {
        AFi1rSDK aFi1rSDK;
        AFi1qSDK aFi1qSDK = this.getMonetizationNetwork.getMonetizationNetwork;
        if (aFi1qSDK == null) {
            AFh1rSDK.i$default(AFLogger.INSTANCE, AFh1sSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1xSDK aFi1xSDK = aFi1qSDK.getMediationNetwork;
        boolean monetizationNetwork = (aFi1xSDK == null || (aFi1rSDK = aFi1xSDK.getMediationNetwork) == null) ? false : aFi1rSDK.getMonetizationNetwork();
        long currentTimeMillis = System.currentTimeMillis();
        AFg1rSDK aFg1rSDK = this.getMonetizationNetwork;
        return monetizationNetwork || currentTimeMillis - aFg1rSDK.getMediationNetwork > TimeUnit.SECONDS.toMillis(aFg1rSDK.getRevenue);
    }

    public final long getMediationNetwork() {
        Object m13;
        String revenue = this.getMediationNetwork.getRevenue("com.appsflyer.rc.cache.max-age-fallback");
        if (revenue == null) {
            return getMonetizationNetwork;
        }
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = Long.valueOf(Long.parseLong(revenue));
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Throwable a13 = xk2.s.a(m13);
        if (a13 != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + a13.getMessage(), a13);
            m13 = Long.valueOf(getMonetizationNetwork);
        }
        return ((Number) m13).longValue();
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final boolean getRevenue() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }
}
