package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class p0 implements e6 {
    public static p4 a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                g1.o0 o0Var = new g1.o0();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        p4 p4Var = new p4(o0Var);
                        bufferedReader.close();
                        return p4Var;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String str = new String(split[0]);
                        String decode = Uri.decode(new String(split[1]));
                        String str2 = (String) hashMap.get(split[2]);
                        if (str2 == null) {
                            String str3 = new String(split[2]);
                            str2 = Uri.decode(str3);
                            if (str2.length() < 1024 || str2 == str3) {
                                hashMap.put(str3, str2);
                            }
                        }
                        if (!o0Var.containsKey(str)) {
                            o0Var.put(str, new g1.o0());
                        }
                        ((g1.o0) o0Var.get(str)).put(decode, str2);
                    }
                }
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    } catch (Exception unused) {
                    }
                }
                throw th3;
            }
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:3:0x0004, B:6:0x0009, B:7:0x0017, B:9:0x001d, B:10:0x002e, B:12:0x0034, B:20:0x0026), top: B:2:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ok.v b(android.content.Context r5) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L44
            ok.a r1 = ok.a.f95409a
            java.io.File r2 = new java.io.File     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            java.lang.String r3 = "phenotype_hermetic"
            r4 = 0
            java.io.File r3 = r5.getDir(r3, r4)     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            java.lang.String r4 = "overrides.txt"
            r2.<init>(r3, r4)     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L23
            ok.y r3 = new ok.y     // Catch: java.lang.Throwable -> L44
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L44
            goto L2e
        L23:
            r3 = r1
            goto L2e
        L25:
            r2 = move-exception
            java.lang.String r3 = "HermeticFileOverrides"
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L44
            goto L23
        L2e:
            boolean r2 = r3.c()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            java.lang.Object r1 = r3.b()     // Catch: java.lang.Throwable -> L44
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.measurement.p4 r5 = a(r5, r1)     // Catch: java.lang.Throwable -> L44
            ok.y r1 = new ok.y     // Catch: java.lang.Throwable -> L44
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r5 = move-exception
            goto L4a
        L46:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L4a:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.b(android.content.Context):ok.v");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(byte[] r6, int r7, int r8) {
        /*
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Lc
            goto L59
        Lc:
            if (r7 < r8) goto Lf
            goto L59
        Lf:
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Lc
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = com.google.android.gms.internal.measurement.y7.c(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Lc
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5b
            int r1 = com.google.android.gms.internal.measurement.y7.c(r6, r0, r8)
        L57:
            if (r1 != 0) goto L76
        L59:
            r6 = 1
            goto L77
        L5b:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 <= r3) goto Lc
        L76:
            r6 = 0
        L77:
            return r6
        L78:
            r7 = r0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.c(byte[], int, int):boolean");
    }
}
