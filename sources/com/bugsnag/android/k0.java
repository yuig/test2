package com.bugsnag.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f29300a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29301b;

    /* renamed from: c, reason: collision with root package name */
    public final id.c f29302c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f29303d;

    /* renamed from: e, reason: collision with root package name */
    public final File f29304e;

    /* renamed from: f, reason: collision with root package name */
    public final id.c f29305f;

    /* renamed from: g, reason: collision with root package name */
    public final hd.c f29306g;

    /* renamed from: h, reason: collision with root package name */
    public final u1 f29307h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29308i;

    /* renamed from: j, reason: collision with root package name */
    public final Float f29309j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f29310k;

    /* renamed from: l, reason: collision with root package name */
    public final String f29311l;

    /* renamed from: m, reason: collision with root package name */
    public final String f29312m;

    /* renamed from: n, reason: collision with root package name */
    public final String[] f29313n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f29314o;

    /* renamed from: p, reason: collision with root package name */
    public final hd.a f29315p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f29316q;

    public k0(s sVar, Context context, Resources resources, w wVar, i0 i0Var, File file, y yVar, hd.c cVar, u1 u1Var) {
        String str;
        this.f29300a = sVar;
        this.f29301b = context;
        this.f29302c = wVar;
        this.f29303d = i0Var;
        this.f29304e = file;
        this.f29305f = yVar;
        this.f29306g = cVar;
        this.f29307h = u1Var;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        String str2 = i0Var.f29267f;
        int i13 = 0;
        this.f29308i = str2 != null && (kotlin.text.z.p(str2, "unknown", false) || StringsKt.E(str2, "generic", false) || StringsKt.E(str2, "vbox", false));
        hd.a aVar = null;
        this.f29309j = displayMetrics == null ? null : Float.valueOf(displayMetrics.density);
        this.f29310k = displayMetrics == null ? null : Integer.valueOf(displayMetrics.densityDpi);
        if (displayMetrics != null) {
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(max);
            sb3.append('x');
            sb3.append(min);
            str = sb3.toString();
        } else {
            str = null;
        }
        this.f29311l = str;
        this.f29312m = Locale.getDefault().toString();
        String[] strArr = i0Var.f29270i;
        this.f29313n = strArr == null ? new String[0] : strArr;
        try {
            aVar = cVar.c(hd.n.DEFAULT, new j0(this, i13));
        } catch (RejectedExecutionException e13) {
            this.f29307h.a("Failed to lookup available device memory", e13);
        }
        this.f29315p = aVar;
        this.f29316q = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.f29303d.f29265d;
        if (num != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(num.intValue()));
        }
        String str3 = this.f29303d.f29266e;
        if (str3 != null) {
            linkedHashMap.put("osBuild", str3);
        }
        this.f29314o = linkedHashMap;
    }

    public final h0 a() {
        Object m13;
        boolean z13 = false;
        try {
            id.c cVar = this.f29305f;
            if (cVar != null) {
                if (((Boolean) cVar.get()).booleanValue()) {
                    z13 = true;
                }
            }
        } catch (Exception unused) {
        }
        Boolean valueOf = Boolean.valueOf(z13);
        q0 q0Var = (q0) this.f29302c.get();
        String str = q0Var == null ? null : q0Var.f29420a;
        try {
            xk2.q qVar = xk2.s.f135225b;
            hd.a aVar = this.f29315p;
            m13 = aVar == null ? null : (Long) aVar.get();
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Object obj = m13 instanceof xk2.r ? null : m13;
        LinkedHashMap r13 = kotlin.collections.z0.r(this.f29314o);
        return new h0(this.f29303d, this.f29313n, valueOf, str, this.f29312m, (Long) obj, r13);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(2:2|3)|(2:5|(19:7|8|(1:10)(1:48)|11|12|13|(1:15)(1:44)|16|(1:18)|19|20|21|22|(1:24)|25|26|27|(1:29)(1:39)|(3:31|32|33)(5:35|36|37|32|33)))|50|8|(0)(0)|11|12|13|(0)(0)|16|(0)|19|20|21|22|(0)|25|26|27|(0)(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|(19:7|8|(1:10)(1:48)|11|12|13|(1:15)(1:44)|16|(1:18)|19|20|21|22|(1:24)|25|26|27|(1:29)(1:39)|(3:31|32|33)(5:35|36|37|32|33)))|50|8|(0)(0)|11|12|13|(0)(0)|16|(0)|19|20|21|22|(0)|25|26|27|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0062, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0063, code lost:
    
        r2 = xk2.s.f135225b;
        r0 = ue.c.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x003a, code lost:
    
        r5 = xk2.s.f135225b;
        r0 = ue.c.m(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #3 {all -> 0x00ad, blocks: (B:27:0x007e, B:35:0x009a, B:39:0x0088), top: B:26:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[Catch: all -> 0x00ad, TryCatch #3 {all -> 0x00ad, blocks: (B:27:0x007e, B:35:0x009a, B:39:0x0088), top: B:26:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x002a, B:44:0x0032), top: B:11:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bugsnag.android.s0 b(long r16) {
        /*
            r15 = this;
            r1 = r15
            r2 = 1
            r3 = 0
            id.c r0 = r1.f29305f     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L15
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L15
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r3
        L16:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            id.c r0 = r1.f29302c
            java.lang.Object r0 = r0.get()
            com.bugsnag.android.q0 r0 = (com.bugsnag.android.q0) r0
            r4 = 0
            if (r0 != 0) goto L27
            r7 = r4
            goto L2a
        L27:
            java.lang.String r0 = r0.f29420a
            r7 = r0
        L2a:
            xk2.q r0 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L39
            hd.a r0 = r1.f29315p
            if (r0 != 0) goto L32
            r0 = r4
            goto L40
        L32:
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L39
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L39
            goto L40
        L39:
            r0 = move-exception
            xk2.q r5 = xk2.s.f135225b
            xk2.r r0 = ue.c.m(r0)
        L40:
            boolean r5 = r0 instanceof xk2.r
            if (r5 == 0) goto L45
            r0 = r4
        L45:
            r9 = r0
            java.lang.Long r9 = (java.lang.Long) r9
            java.util.LinkedHashMap r0 = r1.f29314o
            java.util.LinkedHashMap r10 = kotlin.collections.z0.r(r0)
            hd.c r0 = r1.f29306g     // Catch: java.lang.Throwable -> L62
            hd.n r5 = hd.n.IO     // Catch: java.lang.Throwable -> L62
            com.bugsnag.android.j0 r8 = new com.bugsnag.android.j0     // Catch: java.lang.Throwable -> L62
            r8.<init>(r15, r2)     // Catch: java.lang.Throwable -> L62
            hd.a r0 = r0.c(r5, r8)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L62
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L62
            goto L69
        L62:
            r0 = move-exception
            xk2.q r2 = xk2.s.f135225b
            xk2.r r0 = ue.c.m(r0)
        L69:
            r11 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            boolean r5 = r0 instanceof xk2.r
            if (r5 == 0) goto L74
            r0 = r2
        L74:
            java.lang.Number r0 = (java.lang.Number) r0
            long r11 = r0.longValue()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            android.content.Context r0 = r1.f29301b     // Catch: java.lang.Throwable -> Lad
            android.app.ActivityManager r0 = kh2.s0.D(r0)     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L88
            r0 = r4
            goto L96
        L88:
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> Lad
            r2.<init>()     // Catch: java.lang.Throwable -> Lad
            r0.getMemoryInfo(r2)     // Catch: java.lang.Throwable -> Lad
            long r12 = r2.availMem     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> Lad
        L96:
            if (r0 == 0) goto L9a
            r12 = r0
            goto Lae
        L9a:
            java.lang.Class<android.os.Process> r0 = android.os.Process.class
            java.lang.String r2 = "getFreeMemory"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lad
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r0.invoke(r4, r2)     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lad
            r4 = r0
        Lad:
            r12 = r4
        Lae:
            java.lang.String r13 = r15.d()
            java.util.Date r14 = new java.util.Date
            r2 = r16
            r14.<init>(r2)
            com.bugsnag.android.s0 r0 = new com.bugsnag.android.s0
            com.bugsnag.android.i0 r5 = r1.f29303d
            java.lang.String r8 = r1.f29312m
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.k0.b(long):com.bugsnag.android.s0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r0.length() > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap c() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f29301b
            com.bugsnag.android.u1 r1 = r9.f29307h
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 1
            r4 = 0
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L4f
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L4f
            android.content.Intent r5 = kh2.s0.Q0(r0, r4, r5, r1)     // Catch: java.lang.Exception -> L4f
            if (r5 == 0) goto L54
            java.lang.String r6 = "level"
            r7 = -1
            int r6 = r5.getIntExtra(r6, r7)     // Catch: java.lang.Exception -> L4f
            java.lang.String r8 = "scale"
            int r8 = r5.getIntExtra(r8, r7)     // Catch: java.lang.Exception -> L4f
            if (r6 != r7) goto L29
            if (r8 == r7) goto L35
        L29:
            float r6 = (float) r6     // Catch: java.lang.Exception -> L4f
            float r8 = (float) r8     // Catch: java.lang.Exception -> L4f
            float r6 = r6 / r8
            java.lang.String r8 = "batteryLevel"
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Exception -> L4f
            r2.put(r8, r6)     // Catch: java.lang.Exception -> L4f
        L35:
            java.lang.String r6 = "status"
            int r5 = r5.getIntExtra(r6, r7)     // Catch: java.lang.Exception -> L4f
            r6 = 2
            if (r5 == r6) goto L44
            r6 = 5
            if (r5 != r6) goto L42
            goto L44
        L42:
            r5 = 0
            goto L45
        L44:
            r5 = r3
        L45:
            java.lang.String r6 = "charging"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L4f
            r2.put(r6, r5)     // Catch: java.lang.Exception -> L4f
            goto L54
        L4f:
            java.lang.String r5 = "Could not get battery status"
            r1.f(r5)
        L54:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L8c
            r6 = 31
            if (r5 < r6) goto L73
            java.lang.String r5 = "location"
            java.lang.Object r0 = r0.getSystemService(r5)     // Catch: java.lang.RuntimeException -> L68 java.lang.Exception -> L8c
            boolean r5 = r0 instanceof android.location.LocationManager     // Catch: java.lang.RuntimeException -> L68 java.lang.Exception -> L8c
            if (r5 != 0) goto L65
            r0 = r4
        L65:
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch: java.lang.RuntimeException -> L68 java.lang.Exception -> L8c
            goto L69
        L68:
            r0 = r4
        L69:
            if (r0 != 0) goto L6c
            goto L89
        L6c:
            boolean r0 = a.i0.v(r0)     // Catch: java.lang.Exception -> L8c
            if (r0 != r3) goto L89
            goto L85
        L73:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L8c
            java.lang.String r3 = "location_providers_allowed"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r3)     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L89
            int r0 = r0.length()     // Catch: java.lang.Exception -> L8c
            if (r0 <= 0) goto L89
        L85:
            java.lang.String r0 = "allowed"
        L87:
            r4 = r0
            goto L91
        L89:
            java.lang.String r0 = "disallowed"
            goto L87
        L8c:
            java.lang.String r0 = "Could not get locationStatus"
            r1.f(r0)
        L91:
            java.lang.String r0 = "locationStatus"
            r2.put(r0, r4)
            com.bugsnag.android.s r0 = r9.f29300a
            java.lang.String r0 = r0.k()
            java.lang.String r1 = "networkAccess"
            r2.put(r1, r0)
            com.bugsnag.android.i0 r0 = r9.f29303d
            java.lang.String r0 = r0.f29269h
            java.lang.String r1 = "brand"
            r2.put(r1, r0)
            java.lang.String r0 = "screenDensity"
            java.lang.Float r1 = r9.f29309j
            r2.put(r0, r1)
            java.lang.String r0 = "dpi"
            java.lang.Integer r1 = r9.f29310k
            r2.put(r0, r1)
            boolean r0 = r9.f29308i
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "emulator"
            r2.put(r1, r0)
            java.lang.String r0 = "screenResolution"
            java.lang.String r1 = r9.f29311l
            r2.put(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.k0.c():java.util.HashMap");
    }

    public final String d() {
        int i13 = this.f29316q.get();
        if (i13 == 1) {
            return "portrait";
        }
        if (i13 != 2) {
            return null;
        }
        return "landscape";
    }
}
