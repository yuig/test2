package l7;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a0 extends u0 {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f81709w = {2, 3, 6, 7, 8, 9, 11, 14};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f81710x = {1920, 1088};

    /* renamed from: y, reason: collision with root package name */
    public static final long f81711y;

    /* renamed from: d, reason: collision with root package name */
    public final sp2.i f81712d;

    /* renamed from: e, reason: collision with root package name */
    public x f81713e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81714f;

    /* renamed from: g, reason: collision with root package name */
    public final Surface f81715g;

    /* renamed from: h, reason: collision with root package name */
    public final SurfaceTexture f81716h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f81717i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentLinkedQueue f81718j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f81719k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f81720l;

    /* renamed from: m, reason: collision with root package name */
    public int f81721m;

    /* renamed from: n, reason: collision with root package name */
    public int f81722n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f81723o;

    /* renamed from: p, reason: collision with root package name */
    public a7.s f81724p;

    /* renamed from: q, reason: collision with root package name */
    public a7.s f81725q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f81726r;

    /* renamed from: s, reason: collision with root package name */
    public ScheduledFuture f81727s;

    /* renamed from: t, reason: collision with root package name */
    public CountDownLatch f81728t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f81729u;

    /* renamed from: v, reason: collision with root package name */
    public volatile RuntimeException f81730v;

    static {
        int i13 = d7.n0.f53866a;
        String q13 = com.bumptech.glide.c.q1(Build.DEVICE);
        f81711y = (q13.contains("emulator") || q13.contains("emu64a") || q13.contains("emu64x") || q13.contains("generic")) ? 20000L : 500L;
    }

    public a0(sp2.i iVar, final z0 z0Var, boolean z13, boolean z14) {
        super(z0Var);
        this.f81712d = iVar;
        this.f81726r = z13;
        this.f81720l = z14;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            d7.n.d();
            int i13 = iArr[0];
            d7.n.b(36197, i13, 9729);
            this.f81714f = i13;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i13);
            this.f81716h = surfaceTexture;
            this.f81717i = new float[16];
            this.f81718j = new ConcurrentLinkedQueue();
            this.f81719k = d7.n0.Y("ExtTexMgr:Timer");
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l7.z
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    a0 a0Var = a0.this;
                    a0Var.getClass();
                    z0Var.e(new y(a0Var, 3), false);
                }
            });
            this.f81715g = new Surface(surfaceTexture);
        } catch (GlUtil$GlException e13) {
            throw new VideoFrameProcessingException((Throwable) e13);
        }
    }

    public static float k(int i13, float f13) {
        int i14 = i13;
        for (int i15 = 2; i15 <= 256; i15 *= 2) {
            int i16 = (((i13 + i15) - 1) / i15) * i15;
            if (o(i16, f13, i13) < o(i14, f13, i13)) {
                i14 = i16;
            }
        }
        int[] iArr = f81710x;
        for (int i17 = 0; i17 < 2; i17++) {
            int i18 = iArr[i17];
            if (i18 >= i13 && o(i18, f13, i13) < o(i14, f13, i13)) {
                i14 = i18;
            }
        }
        return o(i14, f13, i13) > 1.0E-9f ? f13 : i13 / i14;
    }

    public static float o(int i13, float f13, int i14) {
        float f14 = 1.0f;
        for (int i15 = 0; i15 <= 2; i15++) {
            float f15 = ((i14 - i15) / i13) - f13;
            if (Math.abs(f15) < f14) {
                f14 = Math.abs(f15);
            }
        }
        return f14;
    }

    @Override // l7.g0
    public final void D() {
        this.f81881a.e(new y(this, 4), true);
    }

    @Override // l7.u0
    public final void a() {
        this.f81729u = true;
    }

    @Override // l7.u0
    public final void b() {
        this.f81721m = 0;
        this.f81724p = null;
        this.f81718j.clear();
        this.f81725q = null;
        super.b();
    }

    @Override // l7.u0
    public final Surface c() {
        return this.f81715g;
    }

    @Override // l7.u0
    public final int d() {
        return this.f81718j.size();
    }

    @Override // l7.u0
    public final void e(a7.s sVar) {
        this.f81725q = sVar;
        if (!this.f81726r) {
            this.f81718j.add(sVar);
        }
        this.f81881a.e(new y(this, 0), true);
    }

    @Override // l7.u0
    public final void f() {
        this.f81716h.release();
        this.f81715g.release();
        this.f81719k.shutdownNow();
    }

    @Override // l7.u0
    public final void g() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f81728t = countDownLatch;
        this.f81881a.e(new y(this, 2), true);
        try {
            if (!countDownLatch.await(f81711y, TimeUnit.MILLISECONDS)) {
                d7.u.g("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            d7.u.g("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.f81728t = null;
        if (this.f81730v != null) {
            throw this.f81730v;
        }
    }

    @Override // l7.u0
    public final void h(a7.s sVar, boolean z13) {
        this.f81726r = z13;
        if (z13) {
            this.f81725q = sVar;
            SurfaceTexture surfaceTexture = this.f81716h;
            androidx.media3.common.b bVar = sVar.f1198a;
            surfaceTexture.setDefaultBufferSize(bVar.f18772v, bVar.f18773w);
        }
    }

    @Override // l7.u0
    public final void i(m mVar) {
        this.f81881a.e(new d(1, this, mVar), true);
    }

    @Override // l7.u0
    public final void j() {
        this.f81881a.e(new y(this, 1), true);
    }

    public final void l() {
        if (this.f81721m == 0 || this.f81722n == 0 || this.f81724p != null) {
            return;
        }
        this.f81716h.updateTexImage();
        this.f81722n--;
        a7.s sVar = (a7.s) this.f81718j.element();
        this.f81724p = sVar;
        this.f81721m--;
        this.f81716h.getTransformMatrix(this.f81717i);
        long timestamp = (this.f81716h.getTimestamp() / 1000) + sVar.f1199b;
        if (this.f81720l) {
            float[] fArr = this.f81717i;
            androidx.media3.common.b bVar = sVar.f1198a;
            int i13 = bVar.f18772v;
            int i14 = bVar.f18773w;
            int i15 = fArr.length != 16 ? 1 : 0;
            int[] iArr = f81709w;
            for (int i16 = 0; i16 < 8; i16++) {
                i15 |= Math.abs(fArr[iArr[i16]]) > 1.0E-9f ? 1 : 0;
            }
            int i17 = i15 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f ? 1 : 0);
            char c13 = '\r';
            char c14 = '\f';
            char c15 = 4;
            if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                r2 = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i17 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
                c15 = 5;
                c14 = '\r';
                c13 = '\f';
            } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                r11 = -1;
                c13 = 65535;
                c14 = 65535;
                c15 = 65535;
            } else {
                r11 = 1;
                r2 = i17 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? 1 : 0);
            }
            if (r2 != 0) {
                int i18 = g.f81778a;
                synchronized (g.class) {
                }
            } else {
                float f13 = fArr[r11];
                float f14 = fArr[c13];
                if (Math.abs(f13) + 1.0E-9f < 1.0f) {
                    float copySign = Math.copySign(k(i13, Math.abs(f13)), f13);
                    float a13 = ep.b.a(f13, copySign, 0.5f, f14);
                    int i19 = g.f81778a;
                    synchronized (g.class) {
                    }
                    fArr[r11] = copySign;
                    fArr[c13] = a13;
                }
                float f15 = fArr[c15];
                float f16 = fArr[c14];
                if (Math.abs(f15) + 1.0E-9f < 1.0f) {
                    float copySign2 = Math.copySign(k(i14, Math.abs(f15)), f15);
                    float a14 = ep.b.a(f15, copySign2, 0.5f, f16);
                    int i23 = g.f81778a;
                    synchronized (g.class) {
                    }
                    fArr[c15] = copySign2;
                    fArr[c14] = a14;
                }
            }
        }
        x xVar = this.f81713e;
        xVar.getClass();
        ((m) xVar).f81820h.l("uTexTransformationMatrix", this.f81717i);
        i0 i0Var = this.f81713e;
        i0Var.getClass();
        sp2.i iVar = this.f81712d;
        int i24 = this.f81714f;
        androidx.media3.common.b bVar2 = sVar.f1198a;
        ((a) i0Var).b(iVar, new a7.t(i24, -1, bVar2.f18772v, bVar2.f18773w), timestamp);
        bf.b.w((a7.s) this.f81718j.remove());
        g.a();
    }

    public final void m() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i13 = this.f81722n;
            concurrentLinkedQueue = this.f81718j;
            if (i13 <= 0) {
                break;
            }
            this.f81722n = i13 - 1;
            this.f81716h.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (this.f81728t == null || !concurrentLinkedQueue.isEmpty()) {
            return;
        }
        this.f81728t.countDown();
    }

    @Override // l7.g0
    public final void z(a7.t tVar) {
        this.f81881a.e(new y(this, 5), true);
    }
}
