package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import q5.y0;
import yn2.x;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFd1hSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "getCurrencyIso4217Code", "()Z", "Ljava/net/HttpURLConnection;", "getMediationNetwork", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "getRevenue", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/net/HttpURLConnection;J)Z", "[B", "Lcom/appsflyer/internal/AFe1lSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFe1lSDK;", "getMonetizationNetwork", "Ljava/util/Map;", "Z", "I", "()Ljava/lang/String;", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AFd1hSDK {
    public Map<String, String> getCurrencyIso4217Code;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final boolean getRevenue;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public int AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public byte[] getMediationNetwork;

    public AFd1hSDK(@NotNull byte[] bArr, Map<String, String> map, int i13) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = bArr;
        this.getCurrencyIso4217Code = map;
        this.AFAdRevenueData = i13;
        this.getRevenue = true;
    }

    private final boolean getMediationNetwork(HttpURLConnection httpURLConnection, long j13) {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb3 = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb3.append("\n length: ");
        sb3.append(new String(this.getMediationNetwork, Charsets.UTF_8).length());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
        }
        String revenue = getRevenue("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb3));
        if (getGetMediationNetwork()) {
            AFLogger.afRDLog(revenue);
        } else {
            AFLogger.afVerboseLog(revenue);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getGetMediationNetwork().getMonetizationNetwork);
        Map<String, String> map2 = this.getCurrencyIso4217Code;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getMediationNetwork.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getMediationNetwork);
        bufferedOutputStream.close();
        String mediationNetwork = getMediationNetwork(httpURLConnection);
        long currentTimeMillis = System.currentTimeMillis() - j13;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + mediationNetwork + "\n\ttook " + currentTimeMillis + "ms";
        String revenue2 = getRevenue("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getGetMediationNetwork()) {
            AFLogger.afRDLog(revenue2);
        } else {
            AFLogger.afVerboseLog(revenue2);
        }
        return AFe1wSDK.getRevenue(httpURLConnection);
    }

    @NotNull
    /* renamed from: AFAdRevenueData */
    public abstract AFe1lSDK getGetMediationNetwork();

    public final boolean getCurrencyIso4217Code() {
        HttpURLConnection httpURLConnection;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        try {
            String monetizationNetwork = getMonetizationNetwork();
            Intrinsics.checkNotNullParameter(monetizationNetwork, "");
            URLConnection openConnection = new URL(monetizationNetwork).openConnection();
            Intrinsics.g(openConnection, "");
            httpURLConnection = (HttpURLConnection) openConnection;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            boolean mediationNetwork = getMediationNetwork(httpURLConnection, currentTimeMillis);
            httpURLConnection.disconnect();
            return mediationNetwork;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection2 = httpURLConnection;
            try {
                String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - currentTimeMillis) + "ms\n\t" + th.getMessage();
                String revenue = getRevenue("HTTP: [" + (httpURLConnection2 != null ? httpURLConnection2.hashCode() : 0) + "] " + str);
                if (getGetMediationNetwork()) {
                    AFLogger.afRDLog(revenue);
                } else {
                    AFLogger.afVerboseLog(revenue);
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return false;
            } catch (Throwable th5) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th5;
            }
        }
    }

    @NotNull
    public abstract String getMonetizationNetwork();

    @NotNull
    public abstract String getRevenue(@NotNull String str);

    /* renamed from: getRevenue, reason: from getter */
    public boolean getGetMediationNetwork() {
        return this.getRevenue;
    }

    private static String getMediationNetwork(HttpURLConnection p03) {
        InputStream errorStream;
        try {
            errorStream = p03.getInputStream();
        } catch (Throwable th3) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1sSDK aFh1sSDK = AFh1sSDK.HTTP_CLIENT;
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1rSDK.e$default(aFLogger, aFh1sSDK, message, th3, false, false, false, false, 96, null);
            errorStream = p03.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        ArrayList arrayList = new ArrayList();
        il2.o action = new il2.o(arrayList);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            Iterator it = x.d(new y0(bufferedReader)).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f80348a;
            dl2.b.J(bufferedReader, null);
            String Z = CollectionsKt.Z(arrayList, null, null, null, 0, null, null, 63);
            bufferedReader.close();
            return Z == null ? "" : Z;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                dl2.b.J(bufferedReader, th4);
                throw th5;
            }
        }
    }
}
