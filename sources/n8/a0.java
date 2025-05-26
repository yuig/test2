package n8;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import d7.n0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f89729a;

    /* renamed from: b, reason: collision with root package name */
    public final y f89730b;

    /* renamed from: c, reason: collision with root package name */
    public final z f89731c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f89732d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f89733e;

    /* renamed from: f, reason: collision with root package name */
    public float f89734f;

    /* renamed from: g, reason: collision with root package name */
    public float f89735g;

    /* renamed from: h, reason: collision with root package name */
    public float f89736h;

    /* renamed from: i, reason: collision with root package name */
    public float f89737i;

    /* renamed from: j, reason: collision with root package name */
    public int f89738j;

    /* renamed from: k, reason: collision with root package name */
    public long f89739k;

    /* renamed from: l, reason: collision with root package name */
    public long f89740l;

    /* renamed from: m, reason: collision with root package name */
    public long f89741m;

    /* renamed from: n, reason: collision with root package name */
    public long f89742n;

    /* renamed from: o, reason: collision with root package name */
    public long f89743o;

    /* renamed from: p, reason: collision with root package name */
    public long f89744p;

    /* renamed from: q, reason: collision with root package name */
    public long f89745q;

    public a0(Context context) {
        DisplayManager displayManager;
        e eVar = new e();
        eVar.f89782a = new d();
        eVar.f89783b = new d();
        eVar.f89785d = -9223372036854775807L;
        this.f89729a = eVar;
        y yVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new y(this, displayManager);
        this.f89730b = yVar;
        this.f89731c = yVar != null ? z.f89920f : null;
        this.f89739k = -9223372036854775807L;
        this.f89740l = -9223372036854775807L;
        this.f89734f = -1.0f;
        this.f89737i = 1.0f;
        this.f89738j = 0;
    }

    public static void a(a0 a0Var, Display display) {
        a0Var.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            a0Var.f89739k = refreshRate;
            a0Var.f89740l = (refreshRate * 80) / 100;
        } else {
            d7.u.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            a0Var.f89739k = -9223372036854775807L;
            a0Var.f89740l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (n0.f53866a < 30 || (surface = this.f89733e) == null || this.f89738j == Integer.MIN_VALUE || this.f89736h == 0.0f) {
            return;
        }
        this.f89736h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e13) {
            d7.u.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = d7.n0.f53866a
            r1 = 30
            if (r0 < r1) goto L8f
            android.view.Surface r0 = r9.f89733e
            if (r0 != 0) goto Lc
            goto L8f
        Lc:
            n8.e r0 = r9.f89729a
            n8.d r2 = r0.f89782a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            n8.d r2 = r0.f89782a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            n8.d r2 = r0.f89782a
            long r4 = r2.f89774e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f89775f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f89734f
        L3b:
            float r4 = r9.f89735g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            n8.d r1 = r0.f89782a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            n8.d r1 = r0.f89782a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            n8.d r0 = r0.f89782a
            long r0 = r0.f89775f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f89735g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8f
            goto L89
        L80:
            if (r5 == 0) goto L83
            goto L89
        L83:
            int r0 = r0.a()
            if (r0 < r1) goto L8f
        L89:
            r9.f89735g = r2
            r0 = 0
            r9.d(r0)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.a0.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = d7.n0.f53866a
            r1 = 30
            if (r0 < r1) goto L41
            android.view.Surface r0 = r4.f89733e
            if (r0 == 0) goto L41
            int r1 = r4.f89738j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L41
        L11:
            boolean r1 = r4.f89732d
            r2 = 0
            if (r1 == 0) goto L22
            float r1 = r4.f89735g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r3 = r4.f89737i
            float r1 = r1 * r3
            goto L23
        L22:
            r1 = r2
        L23:
            if (r5 != 0) goto L2c
            float r5 = r4.f89736h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2c
            return
        L2c:
            r4.f89736h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L34
            r5 = 0
            goto L35
        L34:
            r5 = 1
        L35:
            as.d.m(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L39
            goto L41
        L39:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            d7.u.d(r0, r1, r5)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.a0.d(boolean):void");
    }
}
