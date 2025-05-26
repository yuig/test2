package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class AFb1iSDK {
    private static String getRevenue;

    public static synchronized String getMediationNetwork(AFd1oSDK aFd1oSDK, AFd1pSDK aFd1pSDK) {
        synchronized (AFb1iSDK.class) {
            if (aFd1oSDK.getMonetizationNetwork == null) {
                return getRevenue;
            }
            if (getRevenue == null) {
                String currencyIso4217Code = aFd1pSDK.getCurrencyIso4217Code("AF_INSTALLATION", null);
                if (currencyIso4217Code != null) {
                    getRevenue = currencyIso4217Code;
                } else {
                    try {
                        File file = new File(aFd1oSDK.getMonetizationNetwork.getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            getRevenue = getMonetizationNetwork(file);
                            file.delete();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(currentTimeMillis);
                            sb3.append("-");
                            sb3.append(Math.abs(new SecureRandom().nextLong()));
                            getRevenue = sb3.toString();
                        }
                        aFd1pSDK.getMonetizationNetwork("AF_INSTALLATION", getRevenue);
                    } catch (Exception e13) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e13);
                    }
                }
                if (getRevenue != null) {
                    AppsFlyerProperties.getInstance().set("uid", getRevenue);
                }
            }
            return getRevenue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getMonetizationNetwork(java.io.File r6) {
        /*
            java.lang.String r0 = "Exception while trying to close the InstallationFile"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            java.lang.String r3 = "r"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            int r6 = (int) r3     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            byte[] r1 = new byte[r6]     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r2.readFully(r1)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r2.close()     // Catch: java.io.IOException -> L1b
            goto L3c
        L1b:
            r6 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
            goto L3c
        L20:
            r6 = move-exception
            r1 = r2
            goto L4c
        L23:
            r6 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L2c
        L28:
            r6 = move-exception
            goto L4c
        L2a:
            r6 = move-exception
            r2 = r1
        L2c:
            java.lang.String r3 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.afErrorLog(r3, r6)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L3b
            r1.close()     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r6 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
        L3b:
            r1 = r2
        L3c:
            java.lang.String r6 = new java.lang.String
            if (r1 == 0) goto L41
            goto L44
        L41:
            r0 = 0
            byte[] r1 = new byte[r0]
        L44:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r6.<init>(r1, r0)
            return r6
        L4c:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
        L56:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1iSDK.getMonetizationNetwork(java.io.File):java.lang.String");
    }
}
