package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFi1eSDK;", "", "Lcom/appsflyer/internal/AFi1cSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFi1cSDK;", "", "getMonetizationNetwork", "()Z", "Lcom/appsflyer/internal/AFj1ySDK;", "p0", "", "(Lcom/appsflyer/internal/AFj1ySDK;)V", "getMediationNetwork", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AFi1eSDK {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFAdRevenueData;

    /* renamed from: com.appsflyer.internal.AFi1eSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AFAdRevenueData = new Companion();
        private static long getCurrencyIso4217Code = 10000;

        private Companion() {
        }

        public static long getMediationNetwork() {
            return getCurrencyIso4217Code;
        }
    }

    boolean getMediationNetwork();

    void getMonetizationNetwork(@NotNull AFj1ySDK p03);

    boolean getMonetizationNetwork();

    AFi1cSDK getRevenue();
}
