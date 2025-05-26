package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: n, reason: collision with root package name */
    public static final long f29219n = SystemClock.elapsedRealtime();

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f29220a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.h f29221b;

    /* renamed from: c, reason: collision with root package name */
    public final n2 f29222c;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f29223d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f29224e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29225f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f29226g;

    /* renamed from: h, reason: collision with root package name */
    public String f29227h;

    /* renamed from: i, reason: collision with root package name */
    public final String f29228i;

    /* renamed from: j, reason: collision with root package name */
    public final String f29229j;

    /* renamed from: k, reason: collision with root package name */
    public final String f29230k;

    /* renamed from: l, reason: collision with root package name */
    public final String f29231l;

    /* renamed from: m, reason: collision with root package name */
    public final String f29232m;

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(2:5|(19:7|8|(1:51)(1:11)|12|13|14|(1:16)(2:43|(1:45)(2:46|47))|17|(1:19)|20|(1:22)(1:42)|23|24|25|26|(1:(1:32))(1:(1:39)(1:40))|33|34|35))|52|8|(0)|51|12|13|14|(0)(0)|17|(0)|20|(0)(0)|23|24|25|26|(0)(0)|33|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        r1 = r3.getInstallSourceInfo(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0046, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006a, code lost:
    
        r2 = xk2.s.f135225b;
        r1 = ue.c.m(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x003b, B:16:0x0041, B:43:0x0048, B:45:0x005f, B:46:0x0062, B:47:0x0069), top: B:13:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0048 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x003b, B:16:0x0041, B:43:0x0048, B:45:0x005f, B:46:0x0062, B:47:0x0069), top: B:13:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.content.Context r1, android.content.pm.PackageManager r2, hd.h r3, com.bugsnag.android.n2 r4, android.app.ActivityManager r5, com.bugsnag.android.s1 r6, com.bugsnag.android.w1 r7) {
        /*
            r0 = this;
            r0.<init>()
            r0.f29220a = r2
            r0.f29221b = r3
            r0.f29222c = r4
            r0.f29223d = r6
            r0.f29224e = r7
            java.lang.String r1 = r1.getPackageName()
            r0.f29225f = r1
            r1 = 28
            r4 = 0
            if (r5 == 0) goto L26
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r1) goto L1d
            goto L26
        L1d:
            boolean r5 = a.i0.u(r5)
            if (r5 == 0) goto L26
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L27
        L26:
            r5 = r4
        L27:
            r0.f29226g = r5
            android.content.pm.ApplicationInfo r3 = r3.C
            if (r2 == 0) goto L38
            if (r3 == 0) goto L38
            java.lang.CharSequence r2 = r2.getApplicationLabel(r3)
            java.lang.String r2 = r2.toString()
            goto L39
        L38:
            r2 = r4
        L39:
            r0.f29228i = r2
            xk2.q r2 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L46
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
            if (r2 < r1) goto L48
            java.lang.String r1 = a.i0.n()     // Catch: java.lang.Throwable -> L46
            goto L70
        L46:
            r1 = move-exception
            goto L6a
        L48:
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "currentProcessName"
            r3 = 0
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L62
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L46
            goto L70
        L62:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L46
            throw r1     // Catch: java.lang.Throwable -> L46
        L6a:
            xk2.q r2 = xk2.s.f135225b
            xk2.r r1 = ue.c.m(r1)
        L70:
            boolean r2 = r1 instanceof xk2.r
            if (r2 == 0) goto L75
            r1 = r4
        L75:
            java.lang.String r1 = (java.lang.String) r1
            r0.f29229j = r1
            hd.h r1 = r0.f29221b
            java.lang.String r2 = r1.f68818j
            r0.f29230k = r2
            android.content.pm.PackageInfo r1 = r1.B
            if (r1 != 0) goto L85
            r1 = r4
            goto L87
        L85:
            java.lang.String r1 = r1.versionName
        L87:
            r0.f29231l = r1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> La9
            java.lang.String r2 = r0.f29225f
            android.content.pm.PackageManager r3 = r0.f29220a
            r5 = 30
            if (r1 < r5) goto La2
            if (r3 != 0) goto L96
            goto La9
        L96:
            android.content.pm.InstallSourceInfo r1 = com.bugsnag.android.f.f(r3, r2)     // Catch: java.lang.Exception -> La9
            if (r1 != 0) goto L9d
            goto La9
        L9d:
            java.lang.String r4 = com.bugsnag.android.f.o(r1)     // Catch: java.lang.Exception -> La9
            goto La9
        La2:
            if (r3 != 0) goto La5
            goto La9
        La5:
            java.lang.String r4 = r3.getInstallerPackageName(r2)     // Catch: java.lang.Exception -> La9
        La9:
            r0.f29232m = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.g.<init>(android.content.Context, android.content.pm.PackageManager, hd.h, com.bugsnag.android.n2, android.app.ActivityManager, com.bugsnag.android.s1, com.bugsnag.android.w1):void");
    }

    public final h a() {
        this.f29222c.getClass();
        boolean z13 = hd.g.f68806j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f29222c.getClass();
        long j13 = hd.g.f68808l;
        long j14 = (!z13 || j13 == 0) ? 0L : elapsedRealtime - j13;
        Long valueOf = j14 > 0 ? Long.valueOf(j14) : 0L;
        hd.h hVar = this.f29221b;
        return new h(this.f29227h, this.f29225f, this.f29230k, this.f29231l, null, hVar.f68819k, hVar.f68821m, hVar.f68820l, Long.valueOf(SystemClock.elapsedRealtime() - f29219n), valueOf, Boolean.valueOf(z13), Boolean.valueOf(this.f29223d.f29634b.get()));
    }

    public final HashMap b() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f29228i);
        hashMap.put("activeScreen", this.f29222c.c());
        w1 w1Var = this.f29224e;
        hashMap.put("lowMemory", Boolean.valueOf(w1Var.f29676a));
        hashMap.put("memoryTrimLevel", w1Var.b());
        String str2 = null;
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.pid != 0) {
                int i13 = runningAppProcessInfo.importance;
                if (i13 == 1) {
                    str = "provider in use";
                } else if (i13 != 2) {
                    switch (i13) {
                        case 100:
                            str = "foreground";
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                            str = "foreground service";
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                        case RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE /* 230 */:
                            str2 = "perceptible";
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                        case 325:
                            str2 = "top sleeping";
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                        case 350:
                            str2 = "can't save state";
                            break;
                        case 200:
                            str = "visible";
                            break;
                        case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                            str = "service";
                            break;
                        case 400:
                            str = "cached/background";
                            break;
                        case 500:
                            str = "empty";
                            break;
                        case 1000:
                            str = "gone";
                            break;
                        default:
                            str = "unknown importance (" + runningAppProcessInfo.importance + ')';
                            break;
                    }
                } else {
                    str = "service in use";
                }
                str2 = str;
            }
        } catch (Exception unused) {
        }
        hashMap.put("processImportance", str2);
        Runtime runtime = Runtime.getRuntime();
        long j13 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        hashMap.put("memoryUsage", Long.valueOf(j13 - freeMemory));
        hashMap.put("totalMemory", Long.valueOf(j13));
        hashMap.put("freeMemory", Long.valueOf(freeMemory));
        hashMap.put("memoryLimit", Long.valueOf(runtime.maxMemory()));
        hashMap.put("installerPackage", this.f29232m);
        Boolean bool = this.f29226g;
        if (bool != null) {
            hashMap.put("backgroundWorkRestricted", bool);
        }
        String str3 = this.f29229j;
        if (str3 != null) {
            hashMap.put("processName", str3);
        }
        return hashMap;
    }
}
