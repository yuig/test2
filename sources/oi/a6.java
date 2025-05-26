package oi;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a6 extends k2 {

    /* renamed from: c, reason: collision with root package name */
    public volatile b6 f94645c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b6 f94646d;

    /* renamed from: e, reason: collision with root package name */
    public b6 f94647e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f94648f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f94649g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f94650h;

    /* renamed from: i, reason: collision with root package name */
    public volatile b6 f94651i;

    /* renamed from: j, reason: collision with root package name */
    public b6 f94652j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f94653k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f94654l;

    public a6(u4 u4Var) {
        super(u4Var);
        this.f94654l = new Object();
        this.f94648f = new ConcurrentHashMap();
    }

    public final b6 A(boolean z13) {
        w();
        p();
        if (!z13) {
            return this.f94647e;
        }
        b6 b6Var = this.f94647e;
        return b6Var != null ? b6Var : this.f94652j;
    }

    public final void B(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!l().B() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f94648f.put(activity, new b6(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void C(Activity activity, b6 b6Var, boolean z13) {
        b6 b6Var2;
        b6 b6Var3 = this.f94645c == null ? this.f94646d : this.f94645c;
        if (b6Var.f94698b == null) {
            b6Var2 = new b6(b6Var.f94697a, activity != null ? z(activity.getClass()) : null, b6Var.f94699c, b6Var.f94701e, b6Var.f94702f);
        } else {
            b6Var2 = b6Var;
        }
        this.f94646d = this.f94645c;
        this.f94645c = b6Var2;
        ((oh.b) zzb()).getClass();
        zzl().y(new v5(this, b6Var2, b6Var3, SystemClock.elapsedRealtime(), z13));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(oi.b6 r10, oi.b6 r11, long r12, boolean r14, android.os.Bundle r15) {
        /*
            r9 = this;
            r9.p()
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L26
            long r2 = r10.f94699c
            long r4 = r11.f94699c
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L26
            java.lang.String r2 = r11.f94698b
            java.lang.String r3 = r10.f94698b
            boolean r2 = kh2.j1.N1(r2, r3)
            if (r2 == 0) goto L26
            java.lang.String r2 = r11.f94697a
            java.lang.String r3 = r10.f94697a
            boolean r2 = kh2.j1.N1(r2, r3)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r0
            goto L27
        L26:
            r2 = r1
        L27:
            if (r14 == 0) goto L2e
            oi.b6 r14 = r9.f94647e
            if (r14 == 0) goto L2e
            r0 = r1
        L2e:
            if (r2 == 0) goto Lb5
            android.os.Bundle r14 = new android.os.Bundle
            if (r15 == 0) goto L39
            r14.<init>(r15)
        L37:
            r5 = r14
            goto L3d
        L39:
            r14.<init>()
            goto L37
        L3d:
            oi.f7.R(r10, r5, r1)
            if (r11 == 0) goto L5b
            java.lang.String r14 = r11.f94697a
            if (r14 == 0) goto L4b
            java.lang.String r15 = "_pn"
            r5.putString(r15, r14)
        L4b:
            java.lang.String r14 = r11.f94698b
            if (r14 == 0) goto L54
            java.lang.String r15 = "_pc"
            r5.putString(r15, r14)
        L54:
            java.lang.String r14 = "_pi"
            long r2 = r11.f94699c
            r5.putLong(r14, r2)
        L5b:
            r14 = 0
            if (r0 == 0) goto L76
            oi.q6 r11 = r9.v()
            j9.c r11 = r11.f95074f
            long r2 = r11.f74962b
            long r2 = r12 - r2
            r11.f74962b = r12
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r11 <= 0) goto L76
            oi.f7 r11 = r9.o()
            r11.F(r5, r2)
        L76:
            oi.e r11 = r9.l()
            boolean r11 = r11.B()
            if (r11 != 0) goto L87
            java.lang.String r11 = "_mst"
            r2 = 1
            r5.putLong(r11, r2)
        L87:
            boolean r11 = r10.f94701e
            if (r11 == 0) goto L8f
            java.lang.String r11 = "app"
        L8d:
            r6 = r11
            goto L92
        L8f:
            java.lang.String r11 = "auto"
            goto L8d
        L92:
            oh.a r11 = r9.zzb()
            oh.b r11 = (oh.b) r11
            r11.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            boolean r11 = r10.f94701e
            if (r11 == 0) goto Lab
            long r7 = r10.f94702f
            int r11 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r11 == 0) goto Lab
            r3 = r7
            goto Lac
        Lab:
            r3 = r2
        Lac:
            oi.k5 r2 = r9.s()
            java.lang.String r7 = "_vs"
            r2.z(r3, r5, r6, r7)
        Lb5:
            if (r0 == 0) goto Lbc
            oi.b6 r11 = r9.f94647e
            r9.E(r11, r1, r12)
        Lbc:
            r9.f94647e = r10
            boolean r11 = r10.f94701e
            if (r11 == 0) goto Lc4
            r9.f94652j = r10
        Lc4:
            oi.d6 r11 = r9.u()
            r11.p()
            r11.w()
            androidx.appcompat.widget.j r12 = new androidx.appcompat.widget.j
            r13 = 28
            r12.<init>(r13, r11, r10)
            r11.A(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.a6.D(oi.b6, oi.b6, long, boolean, android.os.Bundle):void");
    }

    public final void E(b6 b6Var, boolean z13, long j13) {
        o i13 = ((u4) this.f24333a).i();
        ((oh.b) zzb()).getClass();
        i13.w(SystemClock.elapsedRealtime());
        if (!v().f95074f.a(j13, b6Var != null && b6Var.f94700d, z13) || b6Var == null) {
            return;
        }
        b6Var.f94700d = false;
    }

    public final b6 F(Activity activity) {
        com.bumptech.glide.d.t(activity);
        b6 b6Var = (b6) this.f94648f.get(activity);
        if (b6Var == null) {
            b6 b6Var2 = new b6(o().x0(), null, z(activity.getClass()));
            this.f94648f.put(activity, b6Var2);
            b6Var = b6Var2;
        }
        return this.f94651i != null ? this.f94651i : b6Var;
    }

    @Override // oi.k2
    public final boolean y() {
        return false;
    }

    public final String z(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        String str = split.length > 0 ? split[split.length - 1] : "";
        return str.length() > l().t(null) ? str.substring(0, l().t(null)) : str;
    }
}
