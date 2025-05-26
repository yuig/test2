package com.appsflyer.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import t3.s1;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1sSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "AFAdRevenueData", "(Ljava/lang/String;Lcom/appsflyer/internal/AFh1sSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFh1rSDK {
    public static long getMonetizationNetwork = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static /* synthetic */ void d$default(AFh1rSDK aFh1rSDK, AFh1sSDK aFh1sSDK, String str, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        aFh1rSDK.d(aFh1sSDK, str, z13);
    }

    public static /* synthetic */ void e$default(AFh1rSDK aFh1rSDK, AFh1sSDK aFh1sSDK, String str, Throwable th3, boolean z13, boolean z14, boolean z15, boolean z16, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        aFh1rSDK.e(aFh1sSDK, str, th3, (i13 & 8) != 0 ? true : z13, (i13 & 16) != 0 ? true : z14, (i13 & 32) != 0 ? true : z15, (i13 & 64) != 0 ? true : z16);
    }

    public static /* synthetic */ void i$default(AFh1rSDK aFh1rSDK, AFh1sSDK aFh1sSDK, String str, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        aFh1rSDK.i(aFh1sSDK, str, z13);
    }

    public static /* synthetic */ void v$default(AFh1rSDK aFh1rSDK, AFh1sSDK aFh1sSDK, String str, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        aFh1rSDK.v(aFh1sSDK, str, z13);
    }

    public static /* synthetic */ void w$default(AFh1rSDK aFh1rSDK, AFh1sSDK aFh1sSDK, String str, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        aFh1rSDK.w(aFh1sSDK, str, z13);
    }

    @NotNull
    public final String AFAdRevenueData(String str, @NotNull AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        if (str == null || z.j(str)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFh1sSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        long currentTimeMillis = System.currentTimeMillis() - getMonetizationNetwork;
        String name = Thread.currentThread().getName();
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(currentTimeMillis);
        sb3.append(") [");
        sb3.append(name);
        return a.a.p(sb3, "] ", withTag$SDK_prodRelease);
    }

    public void d(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void e(@NotNull AFh1sSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }

    public void force(@NotNull AFh1sSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public void i(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void v(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void w(@NotNull AFh1sSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        return s1.c("[", aFh1sSDK.getMediationNetwork, "] ", str);
    }

    public final void d(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFh1sSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, @NotNull Throwable th3) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th3, "");
        e$default(this, aFh1sSDK, str, th3, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
    }

    public final void i(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFh1sSDK, str, false, 4, null);
    }

    public final void v(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFh1sSDK, str, false, 4, null);
    }

    public final void w(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFh1sSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, @NotNull Throwable th3, boolean z13) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th3, "");
        e$default(this, aFh1sSDK, str, th3, z13, false, false, false, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, null);
    }

    public final void e(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, @NotNull Throwable th3, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th3, "");
        e$default(this, aFh1sSDK, str, th3, z13, z14, false, false, 96, null);
    }

    public final void e(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, @NotNull Throwable th3, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th3, "");
        e$default(this, aFh1sSDK, str, th3, z13, z14, z15, false, 64, null);
    }
}
