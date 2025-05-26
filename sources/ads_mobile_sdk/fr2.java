package ads_mobile_sdk;

import a.zb;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class fr2 implements a.n6 {

    /* renamed from: i, reason: collision with root package name */
    public final zb f5261i;

    /* renamed from: a, reason: collision with root package name */
    public long f5253a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f5254b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f5255c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f5256d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f5257e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f5258f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f5259g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f5260h = -1;

    /* renamed from: j, reason: collision with root package name */
    public final long f5262j = a();

    public fr2(zb zbVar) {
        this.f5261i = zbVar;
    }

    @Override // a.n6
    public final synchronized void a(HashMap hashMap) {
        this.f5254b = this.f5253a;
        this.f5253a = a();
        c(hashMap);
    }

    @Override // a.n6
    public final synchronized void b(HashMap hashMap) {
        this.f5260h = this.f5259g;
        this.f5259g = a();
        c(hashMap);
    }

    public final void c(HashMap hashMap) {
        hashMap.put("tcq", Long.valueOf(this.f5253a));
        hashMap.put("tpq", Long.valueOf(this.f5254b));
        hashMap.put("tcc", Long.valueOf(this.f5259g));
        hashMap.put("tpc", Long.valueOf(this.f5260h));
        hashMap.put("tpv", Long.valueOf(this.f5256d));
        hashMap.put("tcv", Long.valueOf(this.f5255c));
        hashMap.put("tchv", Long.valueOf(this.f5257e));
        hashMap.put("tphv", Long.valueOf(this.f5258f));
        hashMap.put("tst", Long.valueOf(this.f5262j));
    }

    public static View b(View view) {
        return view.getClass().getName().contains("DebugGestureViewWrapper") ? ((ViewGroup) view).getChildAt(0) : view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (a(r8) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0018, B:8:0x001e, B:14:0x0075, B:15:0x0077, B:20:0x0046, B:23:0x004e, B:26:0x0070, B:28:0x006a, B:30:0x0025, B:32:0x0032, B:34:0x003b, B:37:0x003f), top: B:2:0x0001, inners: #1 }] */
    @Override // a.n6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.util.HashMap r6, android.content.Context r7, android.view.View r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f5255c     // Catch: java.lang.Throwable -> L16
            r5.f5256d = r0     // Catch: java.lang.Throwable -> L16
            long r0 = r5.a()     // Catch: java.lang.Throwable -> L16
            r5.f5255c = r0     // Catch: java.lang.Throwable -> L16
            long r0 = r5.f5257e     // Catch: java.lang.Throwable -> L16
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            r5.f5258f = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r6 = move-exception
            goto L7c
        L18:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16
            r1 = 33
            if (r0 < r1) goto L25
            boolean r0 = a.i3.B(r7)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L25
            goto L30
        L25:
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: java.lang.Throwable -> L16
            android.view.WindowManager r7 = (android.view.WindowManager) r7     // Catch: java.lang.Throwable -> L16
            if (r7 != 0) goto L32
        L30:
            r7 = 0
            goto L43
        L32:
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Throwable -> L16
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L16
            r0.<init>()     // Catch: java.lang.Throwable -> L16
            r7.getRealMetrics(r0)     // Catch: java.lang.Throwable -> L16 java.lang.NoSuchMethodError -> L3f
            goto L42
        L3f:
            r7.getMetrics(r0)     // Catch: java.lang.Throwable -> L16
        L42:
            r7 = r0
        L43:
            if (r7 != 0) goto L46
            goto L75
        L46:
            int r0 = r7.widthPixels     // Catch: java.lang.Throwable -> L16
            int r1 = r7.heightPixels     // Catch: java.lang.Throwable -> L16
            int r0 = r0 * r1
            if (r8 != 0) goto L4e
            goto L75
        L4e:
            int r1 = r8.getWidth()     // Catch: java.lang.Throwable -> L16
            int r4 = r7.widthPixels     // Catch: java.lang.Throwable -> L16
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L16
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L16
            int r7 = r7.heightPixels     // Catch: java.lang.Throwable -> L16
            int r7 = java.lang.Math.min(r4, r7)     // Catch: java.lang.Throwable -> L16
            int r7 = r7 * r1
            int r1 = r7 * 2
            if (r1 < r0) goto L68
            goto L70
        L68:
            if (r7 != 0) goto L75
            boolean r7 = a(r8)     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L75
        L70:
            long r7 = r5.f5255c     // Catch: java.lang.Throwable -> L16
            r5.f5257e = r7     // Catch: java.lang.Throwable -> L16
            goto L77
        L75:
            r5.f5257e = r2     // Catch: java.lang.Throwable -> L16
        L77:
            r5.c(r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r5)
            return
        L7c:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fr2.a(java.util.HashMap, android.content.Context, android.view.View):void");
    }

    public final long a() {
        this.f5261i.getClass();
        return SystemClock.uptimeMillis();
    }

    public static boolean a(View view) {
        try {
            View b13 = b(view);
            Object invoke = b13.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(b13, new Object[0]);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.getClass();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }
}
