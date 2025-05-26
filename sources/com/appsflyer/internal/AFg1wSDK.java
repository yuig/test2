package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class AFg1wSDK extends AFe1aSDK<AFg1sSDK> {
    public final AFg1tSDK areAllFieldsValid;
    public AFi1sSDK component1;
    private final AFd1nSDK component2;
    public AFg1sSDK component3;
    private final AFg1uSDK component4;
    private final AFg1pSDK copy;
    private final String copydefault;
    private final AFg1qSDK equals;
    private final AFg1rSDK hashCode;
    private final AFe1sSDK toString;

    public AFg1wSDK(@NonNull AFg1uSDK aFg1uSDK, @NonNull AFd1nSDK aFd1nSDK, @NonNull AFg1qSDK aFg1qSDK, @NonNull AFg1rSDK aFg1rSDK, @NonNull AFe1sSDK aFe1sSDK, @NonNull AFg1pSDK aFg1pSDK, @NonNull String str, AFg1tSDK aFg1tSDK) {
        super(AFf1rSDK.RC_CDN, new AFf1rSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.component4 = aFg1uSDK;
        this.component2 = aFd1nSDK;
        this.equals = aFg1qSDK;
        this.hashCode = aFg1rSDK;
        this.toString = aFe1sSDK;
        this.copy = aFg1pSDK;
        this.copydefault = str;
        this.areAllFieldsValid = aFg1tSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.appsflyer.internal.AFg1sSDK component2() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1wSDK.component2():com.appsflyer.internal.AFg1sSDK");
    }

    private void getMediationNetwork(String str, long j13, AFe1jSDK<?> aFe1jSDK, AFi1qSDK aFi1qSDK, AFi1pSDK aFi1pSDK, String str2, Throwable th3) {
        long j14;
        int i13;
        Throwable th4;
        long j15;
        if (aFe1jSDK != null) {
            j14 = aFe1jSDK.getMediationNetwork.getMediationNetwork;
            i13 = aFe1jSDK.getStatusCode();
        } else {
            j14 = 0;
            i13 = 0;
        }
        int i14 = i13;
        if (th3 instanceof HttpException) {
            th4 = th3.getCause();
            j15 = ((HttpException) th3).getMetrics().getMediationNetwork;
        } else {
            th4 = th3;
            j15 = j14;
        }
        this.component1 = new AFi1sSDK(aFi1qSDK != null ? aFi1qSDK.getCurrencyIso4217Code : null, str, j15, System.currentTimeMillis() - j13, i14, aFi1pSDK, str2, th4);
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    @NonNull
    public final AFf1wSDK getCurrencyIso4217Code() {
        try {
            AFg1sSDK component2 = component2();
            this.component3 = component2;
            return component2 == AFg1sSDK.FAILURE ? AFf1wSDK.FAILURE : AFf1wSDK.SUCCESS;
        } catch (InterruptedException e13) {
            e = e13;
            AFLogger.INSTANCE.e(AFh1sSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFg1sSDK.FAILURE;
            return AFf1wSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFg1sSDK.FAILURE;
            return AFf1wSDK.TIMEOUT;
        } catch (InterruptedIOException e14) {
            e = e14;
            AFLogger.INSTANCE.e(AFh1sSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFg1sSDK.FAILURE;
            return AFf1wSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return BaseRecyclerCellView.AUTOSCROLL_DELAY;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }

    private void getRevenue(String str, long j13, AFi1pSDK aFi1pSDK, String str2, AFe1jSDK<AFi1qSDK> aFe1jSDK) {
        getMediationNetwork(str, j13, aFe1jSDK, aFe1jSDK != null ? aFe1jSDK.getBody() : null, aFi1pSDK, str2 != null ? str2 : null, null);
    }
}
