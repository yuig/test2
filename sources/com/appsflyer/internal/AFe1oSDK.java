package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFe1oSDK {
    private final int getMonetizationNetwork;

    public AFe1oSDK(int i13) {
        this.getMonetizationNetwork = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getCurrencyIso4217Code(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.lang.Throwable -> L8 java.lang.Exception -> Lb
            goto L25
        L8:
            r9 = move-exception
            r0 = r1
            goto L63
        Lb:
            r5 = move-exception
            java.io.InputStream r9 = r9.getErrorStream()     // Catch: java.lang.Throwable -> L8
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8
            com.appsflyer.internal.AFh1sSDK r3 = com.appsflyer.internal.AFh1sSDK.HTTP_CLIENT     // Catch: java.lang.Throwable -> L8
            java.lang.String r4 = r5.getMessage()     // Catch: java.lang.Throwable -> L8
            if (r4 == 0) goto L1f
            java.lang.String r4 = r5.getMessage()     // Catch: java.lang.Throwable -> L8
            goto L20
        L1f:
            r4 = r0
        L20:
            r6 = 0
            r7 = 0
            r2.e(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8
        L25:
            if (r9 != 0) goto L28
            return r0
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r0.<init>()     // Catch: java.lang.Throwable -> L8
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L8
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L8
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r1 = 1
        L3c:
            java.lang.String r3 = r9.readLine()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L55
            if (r1 != 0) goto L50
            r1 = 10
            r0.append(r1)     // Catch: java.lang.Throwable -> L4a
            goto L50
        L4a:
            r0 = move-exception
            r1 = r2
            r8 = r0
            r0 = r9
            r9 = r8
            goto L63
        L50:
            r0.append(r3)     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            goto L3c
        L55:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4a
            r2.close()
            r9.close()
            return r0
        L60:
            r9 = move-exception
            r0 = r1
            r1 = r2
        L63:
            if (r1 == 0) goto L68
            r1.close()
        L68:
            if (r0 == 0) goto L6d
            r0.close()
        L6d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1oSDK.getCurrencyIso4217Code(java.net.HttpURLConnection):java.lang.String");
    }

    private static void getMediationNetwork(AFe1kSDK aFe1kSDK, Throwable th3, AFe1mSDK aFe1mSDK, boolean z13) {
        StringBuilder sb3 = new StringBuilder("error: ");
        sb3.append(th3);
        sb3.append("\n took ");
        sb3.append(aFe1mSDK.getMediationNetwork);
        sb3.append("ms");
        String obj = sb3.toString();
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.HTTP_CLIENT;
        StringBuilder sb4 = new StringBuilder("[");
        sb4.append(aFe1kSDK.hashCode());
        sb4.append("] ");
        sb4.append(obj);
        aFLogger.e(aFh1sSDK, sb4.toString(), th3, false, false, z13);
    }

    public final AFe1jSDK<String> AFAdRevenueData(AFe1kSDK aFe1kSDK) {
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                byte[] monetizationNetwork = aFe1kSDK.getMonetizationNetwork();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(aFe1kSDK.getRevenue);
                sb3.append(":");
                sb3.append(aFe1kSDK.getMonetizationNetwork);
                StringBuilder sb4 = new StringBuilder(sb3.toString());
                byte[] monetizationNetwork2 = aFe1kSDK.getMonetizationNetwork();
                if (aFe1kSDK.getCurrencyIso4217Code() && monetizationNetwork2 != null) {
                    String str = aFe1kSDK.getMediationNetwork() ? "<encrypted>" : new String(monetizationNetwork2, Charset.defaultCharset());
                    sb4.append("\n payload: ");
                    sb4.append(str);
                }
                for (Map.Entry<String, String> entry : aFe1kSDK.AFAdRevenueData.entrySet()) {
                    sb4.append("\n ");
                    sb4.append(entry.getKey());
                    sb4.append(": ");
                    sb4.append(entry.getValue());
                }
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append(aFe1kSDK.hashCode());
                sb5.append("] ");
                sb5.append((Object) sb4);
                AFLogger.INSTANCE.d(AFh1sSDK.HTTP_CLIENT, sb5.toString());
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFe1kSDK.getMonetizationNetwork).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(aFe1kSDK.getRevenue);
                    if (aFe1kSDK.AFAdRevenueData()) {
                        httpURLConnection2.setUseCaches(false);
                    }
                    if (!aFe1kSDK.areAllFieldsValid()) {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                    }
                } catch (Exception e13) {
                    e = e13;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    int i13 = this.getMonetizationNetwork;
                    int i14 = aFe1kSDK.component1;
                    if (i14 != -1) {
                        i13 = i14;
                    }
                    httpURLConnection2.setConnectTimeout(i13);
                    httpURLConnection2.setReadTimeout(i13);
                    httpURLConnection2.addRequestProperty("Content-Type", aFe1kSDK.getMediationNetwork() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFe1kSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (monetizationNetwork != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(monetizationNetwork.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb6.toString());
                        try {
                            bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            bufferedOutputStream.write(monetizationNetwork);
                            bufferedOutputStream.close();
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                bufferedOutputStream2.close();
                            }
                            throw th;
                        }
                    }
                    boolean z13 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String currencyIso4217Code = aFe1kSDK.getRevenue() ? getCurrencyIso4217Code(httpURLConnection2) : "";
                    AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("response code:");
                    sb7.append(httpURLConnection2.getResponseCode());
                    sb7.append(" ");
                    sb7.append(httpURLConnection2.getResponseMessage());
                    sb7.append("\n body:");
                    sb7.append(currencyIso4217Code);
                    sb7.append("\n took ");
                    sb7.append(aFe1mSDK.getMediationNetwork);
                    sb7.append("ms");
                    String obj = sb7.toString();
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1sSDK aFh1sSDK = AFh1sSDK.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder("[");
                    sb8.append(aFe1kSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(obj);
                    aFLogger.d(aFh1sSDK, sb8.toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    AFe1jSDK<String> aFe1jSDK = new AFe1jSDK<>(currencyIso4217Code, httpURLConnection2.getResponseCode(), z13, hashMap, aFe1mSDK);
                    httpURLConnection2.disconnect();
                    return aFe1jSDK;
                } catch (Exception e14) {
                    e = e14;
                    AFe1mSDK aFe1mSDK2 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                    getMediationNetwork(aFe1kSDK, e, aFe1mSDK2, false);
                    throw new HttpException(e, aFe1mSDK2);
                } catch (Throwable th6) {
                    th = th6;
                    AFe1mSDK aFe1mSDK3 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                    getMediationNetwork(aFe1kSDK, th, aFe1mSDK3, true);
                    throw new HttpException(th, aFe1mSDK3);
                }
            } catch (Exception e15) {
                e = e15;
            } catch (Throwable th7) {
                th = th7;
            }
        } finally {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
        }
    }
}
