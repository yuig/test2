package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1fSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1eSDK implements AFd1cSDK {

    @NotNull
    private final AFd1oSDK getMonetizationNetwork;

    public AFd1eSDK(@NotNull AFd1oSDK aFd1oSDK) {
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        this.getMonetizationNetwork = aFd1oSDK;
    }

    private final File getRevenue() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final String AFAdRevenueData(@NotNull Throwable th3, @NotNull String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th3, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.16.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFd1fSDK currencyIso4217Code = AFe1ySDK.getCurrencyIso4217Code(th3, str);
                    String str3 = currencyIso4217Code.AFAdRevenueData;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFd1fSDK.Companion companion = AFd1fSDK.INSTANCE;
                        AFd1fSDK currencyIso4217Code2 = AFd1fSDK.Companion.getCurrencyIso4217Code(il2.k.b(file2));
                        if (currencyIso4217Code2 != null) {
                            currencyIso4217Code2.getCurrencyIso4217Code++;
                            currencyIso4217Code = currencyIso4217Code2;
                        }
                    }
                    il2.k.d(file2, currencyIso4217Code.getMonetizationNetwork());
                    str2 = str3;
                } catch (Exception e13) {
                    AFh1rSDK.v$default(AFLogger.INSTANCE, AFh1sSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e13.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final boolean getMediationNetwork() {
        return getMonetizationNetwork(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x006c, B:25:0x0072, B:30:0x004a, B:32:0x0075, B:34:0x007b, B:11:0x001a, B:13:0x0020, B:15:0x002e, B:17:0x0041), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1cSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.appsflyer.internal.AFd1fSDK> getMonetizationNetwork() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.io.File r0 = r13.getRevenue()     // Catch: java.lang.Throwable -> L70
            r1 = 0
            if (r0 == 0) goto L79
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L79
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L70
            int r3 = r0.length     // Catch: java.lang.Throwable -> L70
            r4 = 0
            r5 = r4
        L16:
            if (r5 >= r3) goto L75
            r6 = r0[r5]     // Catch: java.lang.Throwable -> L70
            java.io.File[] r6 = r6.listFiles()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L69
            java.lang.String r7 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r7.<init>()     // Catch: java.lang.Throwable -> L45
            int r8 = r6.length     // Catch: java.lang.Throwable -> L45
            r9 = r4
        L2c:
            if (r9 >= r8) goto L6a
            r10 = r6[r9]     // Catch: java.lang.Throwable -> L45
            com.appsflyer.internal.AFd1fSDK$AFa1vSDK r11 = com.appsflyer.internal.AFd1fSDK.INSTANCE     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = il2.k.b(r10)     // Catch: java.lang.Throwable -> L45
            com.appsflyer.internal.AFd1fSDK r10 = com.appsflyer.internal.AFd1fSDK.Companion.getCurrencyIso4217Code(r10)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L47
            r7.add(r10)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r6 = move-exception
            goto L4a
        L47:
            int r9 = r9 + 1
            goto L2c
        L4a:
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L70
            com.appsflyer.internal.AFh1sSDK r8 = com.appsflyer.internal.AFh1sSDK.EXCEPTION_MANAGER     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r9.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r10 = "Could not get stored exceptions\n "
            r9.append(r10)     // Catch: java.lang.Throwable -> L70
            r9.append(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L70
            r12 = 0
            r10 = 0
            r11 = 4
            com.appsflyer.internal.AFh1rSDK.v$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L70
        L69:
            r7 = r1
        L6a:
            if (r7 == 0) goto L72
            r2.add(r7)     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r0 = move-exception
            goto L7f
        L72:
            int r5 = r5 + 1
            goto L16
        L75:
            java.util.ArrayList r1 = kotlin.collections.g0.r(r2)     // Catch: java.lang.Throwable -> L70
        L79:
            if (r1 != 0) goto L7d
            kotlin.collections.q0 r1 = kotlin.collections.q0.f80391a     // Catch: java.lang.Throwable -> L70
        L7d:
            monitor-exit(r13)
            return r1
        L7f:
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1eSDK.getMonetizationNetwork():java.util.List");
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final void getRevenue(int i13, int i14) {
        File[] listFiles;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFc1vSDK.getMediationNetwork(name);
                        if (i13 > mediationNetwork || mediationNetwork > i14) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(il2.m.f(file2)));
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final boolean getMonetizationNetwork(@NotNull String... strArr) {
        boolean z13;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File revenue = getRevenue();
                z13 = true;
                if (revenue != null) {
                    if (strArr.length == 0) {
                        AFh1rSDK.v$default(AFLogger.INSTANCE, AFh1sSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z13 = il2.m.f(revenue);
                    } else {
                        AFh1rSDK.v$default(AFLogger.INSTANCE, AFh1sSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + c0.M(strArr, ", ", null, null, 0, null, null, 62), false, 4, null);
                        File[] listFiles = revenue.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!c0.y(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(il2.m.f(file2)));
                            }
                            Set J0 = CollectionsKt.J0(arrayList2);
                            if (J0.isEmpty()) {
                                J0 = g1.b(Boolean.TRUE);
                            }
                            Set set = J0;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.R(set)).booleanValue()) {
                                z13 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z13;
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final int AFAdRevenueData() {
        Iterator<T> it = getMonetizationNetwork().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((AFd1fSDK) it.next()).getCurrencyIso4217Code;
        }
        return i13;
    }
}
