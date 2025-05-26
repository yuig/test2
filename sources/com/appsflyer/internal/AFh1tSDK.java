package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010\u0018\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFh1tSDK;", "Lcom/appsflyer/internal/AFh1rSDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFh1sSDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "AFAdRevenueData", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "getRevenue", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFh1tSDK extends AFh1rSDK {

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getMediationNetwork = iArr;
        }
    }

    private final void AFAdRevenueData(AFLogger.LogLevel p03, AFh1sSDK p13, String p23, Throwable p33) {
        if (getRevenue(p03)) {
            String AFAdRevenueData = AFAdRevenueData(p23, p13);
            int i13 = AFa1uSDK.getMediationNetwork[p03.ordinal()];
            if (i13 == 1) {
                Log.d("AppsFlyer_6.16.0", AFAdRevenueData);
                return;
            }
            if (i13 == 2) {
                Log.i("AppsFlyer_6.16.0", AFAdRevenueData);
                return;
            }
            if (i13 == 3) {
                Log.w("AppsFlyer_6.16.0", AFAdRevenueData);
            } else if (i13 == 4) {
                Log.v("AppsFlyer_6.16.0", AFAdRevenueData);
            } else {
                if (i13 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.16.0", AFAdRevenueData, p33);
            }
        }
    }

    private static boolean getRevenue(AFLogger.LogLevel p03) {
        return p03.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void d(@NotNull AFh1sSDK p03, @NotNull String p13, boolean p23) {
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        AFAdRevenueData(AFLogger.LogLevel.DEBUG, p03, p13, null);
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void e(@NotNull AFh1sSDK p03, @NotNull String p13, @NotNull Throwable p23, boolean p33, boolean p43, boolean p53, boolean p63) {
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p23, "");
        if (p43) {
            AFAdRevenueData(AFLogger.LogLevel.ERROR, p03, p13, p23);
        } else if (p33) {
            AFAdRevenueData(AFLogger.LogLevel.DEBUG, p03, p13, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void force(@NotNull AFh1sSDK p03, @NotNull String p13) {
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.16.0", withTag$SDK_prodRelease(p13, p03));
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void i(@NotNull AFh1sSDK p03, @NotNull String p13, boolean p23) {
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        AFAdRevenueData(AFLogger.LogLevel.INFO, p03, p13, null);
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void v(@NotNull AFh1sSDK p03, @NotNull String p13, boolean p23) {
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        AFAdRevenueData(AFLogger.LogLevel.VERBOSE, p03, p13, null);
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void w(@NotNull AFh1sSDK p03, @NotNull String p13, boolean p23) {
        Intrinsics.checkNotNullParameter(p03, "");
        Intrinsics.checkNotNullParameter(p13, "");
        AFAdRevenueData(AFLogger.LogLevel.WARNING, p03, p13, null);
    }
}
