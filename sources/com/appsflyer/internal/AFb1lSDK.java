package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AFb1lSDK implements AFb1rSDK {
    private final AFd1oSDK getMonetizationNetwork;

    public AFb1lSDK(AFd1oSDK aFd1oSDK) {
        this.getMonetizationNetwork = aFd1oSDK;
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final boolean AFAdRevenueData(String str) {
        File file = new File(new File(this.getMonetizationNetwork.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.CACHE;
        StringBuilder sb3 = new StringBuilder("Deleting ");
        sb3.append(str);
        sb3.append(" from cache");
        aFLogger.i(aFh1sSDK, sb3.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e13) {
            StringBuilder sb4 = new StringBuilder("CACHE: Could not delete ");
            sb4.append(str);
            sb4.append(" from cache");
            AFLogger.afErrorLog(sb4.toString(), e13);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void getCurrencyIso4217Code() {
        try {
            if (new File(this.getMonetizationNetwork.getMonetizationNetwork.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.getMonetizationNetwork.getMonetizationNetwork.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e13) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getMonetizationNetwork(com.appsflyer.internal.AFb1jSDK r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1lSDK.getMonetizationNetwork(com.appsflyer.internal.AFb1jSDK):java.lang.String");
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void AFAdRevenueData() {
        try {
            File file = new File(this.getMonetizationNetwork.getMonetizationNetwork.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1sSDK aFh1sSDK = AFh1sSDK.CACHE;
                StringBuilder sb3 = new StringBuilder("Found cached request");
                sb3.append(file2.getName());
                aFLogger.i(aFh1sSDK, sb3.toString());
                StringBuilder sb4 = new StringBuilder("Deleting ");
                sb4.append(file2.getName());
                sb4.append(" from cache");
                aFLogger.i(aFh1sSDK, sb4.toString());
                file2.delete();
            }
        } catch (Exception e13) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e13);
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    @NonNull
    public final List<AFb1jSDK> getMonetizationNetwork() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.getMonetizationNetwork.getMonetizationNetwork.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e13) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e13);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1sSDK aFh1sSDK = AFh1sSDK.CACHE;
            StringBuilder sb3 = new StringBuilder("Found cached request");
            sb3.append(file2.getName());
            aFLogger.i(aFh1sSDK, sb3.toString());
            arrayList.add(getMonetizationNetwork(file2));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.appsflyer.internal.AFb1jSDK getMonetizationNetwork(java.io.File r5) {
        /*
            java.lang.String r0 = "could not close load reader"
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            long r3 = r5.length()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.read(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            com.appsflyer.internal.AFb1jSDK r4 = new com.appsflyer.internal.AFb1jSDK     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r4.getMediationNetwork = r5     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L2e:
            return r4
        L2f:
            r5 = move-exception
            r1 = r2
            goto L48
        L32:
            r5 = move-exception
            goto L38
        L34:
            r5 = move-exception
            goto L48
        L36:
            r5 = move-exception
            r2 = r1
        L38:
            java.lang.String r3 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.io.IOException -> L43
            goto L47
        L43:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L47:
            return r1
        L48:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L52:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1lSDK.getMonetizationNetwork(java.io.File):com.appsflyer.internal.AFb1jSDK");
    }
}
