package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFg1rSDK {
    public final AFd1pSDK getCurrencyIso4217Code;
    public long getMediationNetwork;
    public long getRevenue;
    public AFi1qSDK AFAdRevenueData = null;
    public AFi1qSDK getMonetizationNetwork = getCurrencyIso4217Code();

    public AFg1rSDK(AFd1pSDK aFd1pSDK) {
        this.getCurrencyIso4217Code = aFd1pSDK;
        this.getMediationNetwork = aFd1pSDK.getMediationNetwork("af_rc_timestamp", 0L);
        this.getRevenue = aFd1pSDK.getMediationNetwork("af_rc_max_age", 0L);
    }

    private AFi1qSDK getCurrencyIso4217Code() {
        String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code("af_remote_config", null);
        if (currencyIso4217Code == null) {
            AFLogger.INSTANCE.d(AFh1sSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFi1qSDK(new String(Base64.decode(currencyIso4217Code, 2), Charset.defaultCharset()));
        } catch (Exception e13) {
            AFLogger.INSTANCE.e(AFh1sSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e13, true);
            return null;
        }
    }
}
