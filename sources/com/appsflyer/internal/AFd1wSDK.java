package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1wSDK;", "", "", "AFAdRevenueData", "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFd1wSDK$AFa1ySDK;", "p1", "", "getMonetizationNetwork", "(Landroid/content/Context;Lcom/appsflyer/internal/AFd1wSDK$AFa1ySDK;)V", "getCurrencyIso4217Code", "()V", "AFa1uSDK", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AFd1wSDK {

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFAdRevenueData;

    /* renamed from: com.appsflyer.internal.AFd1wSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AFAdRevenueData = new Companion();
        private static long getRevenue = 500;

        private Companion() {
        }

        public static long AFAdRevenueData() {
            return getRevenue;
        }
    }

    public interface AFa1ySDK {
        void getCurrencyIso4217Code(@NotNull AFh1iSDK aFh1iSDK);

        void getMediationNetwork();
    }

    boolean AFAdRevenueData();

    void getCurrencyIso4217Code();

    void getMonetizationNetwork(@NotNull Context p03, @NotNull AFa1ySDK p13);
}
