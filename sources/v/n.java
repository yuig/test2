package v;

import a.ig;
import a.o3;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class n implements androidx.camera.core.impl.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final i1 f123546b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f123547c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f123548d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final w.l f123549e;

    /* renamed from: f, reason: collision with root package name */
    public final x f123550f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.camera.core.impl.i2 f123551g;

    /* renamed from: h, reason: collision with root package name */
    public final g2 f123552h;

    /* renamed from: i, reason: collision with root package name */
    public final d3 f123553i;

    /* renamed from: j, reason: collision with root package name */
    public final z2 f123554j;

    /* renamed from: k, reason: collision with root package name */
    public final a2 f123555k;

    /* renamed from: l, reason: collision with root package name */
    public final g3 f123556l;

    /* renamed from: m, reason: collision with root package name */
    public final b0.c f123557m;

    /* renamed from: n, reason: collision with root package name */
    public final c1 f123558n;

    /* renamed from: o, reason: collision with root package name */
    public final sp2.i f123559o;

    /* renamed from: p, reason: collision with root package name */
    public int f123560p;

    /* renamed from: q, reason: collision with root package name */
    public c0.g0 f123561q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f123562r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f123563s;

    /* renamed from: t, reason: collision with root package name */
    public final gc.c f123564t;

    /* renamed from: u, reason: collision with root package name */
    public final n3.b f123565u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicLong f123566v;

    /* renamed from: w, reason: collision with root package name */
    public volatile com.google.common.util.concurrent.c0 f123567w;

    /* renamed from: x, reason: collision with root package name */
    public int f123568x;

    /* renamed from: y, reason: collision with root package name */
    public long f123569y;

    /* renamed from: z, reason: collision with root package name */
    public final l f123570z;

    public n(w.l lVar, f0.g gVar, f0.j jVar, x xVar, androidx.camera.core.impl.r rVar) {
        androidx.camera.core.impl.i2 i2Var = new androidx.camera.core.impl.i2();
        this.f123551g = i2Var;
        this.f123560p = 0;
        this.f123562r = false;
        this.f123563s = 2;
        this.f123566v = new AtomicLong(0L);
        this.f123567w = g0.m.e(null);
        this.f123568x = 1;
        this.f123569y = 0L;
        l lVar2 = new l();
        this.f123570z = lVar2;
        this.f123549e = lVar;
        this.f123550f = xVar;
        this.f123547c = jVar;
        this.f123559o = new sp2.i(jVar);
        i1 i1Var = new i1(jVar);
        this.f123546b = i1Var;
        i2Var.f16863b.f123384a = this.f123568x;
        i2Var.f16863b.b(new n1(i1Var));
        i2Var.f16863b.b(lVar2);
        this.f123555k = new a2(this, lVar, jVar);
        this.f123552h = new g2(this, jVar);
        this.f123553i = new d3(this, lVar, jVar);
        this.f123554j = new z2(this, lVar, jVar);
        this.f123556l = new g3(lVar);
        this.f123564t = new gc.c(6, rVar);
        this.f123565u = new n3.b(0, rVar);
        this.f123557m = new b0.c(this, jVar);
        this.f123558n = new c1(this, lVar, rVar, jVar, gVar);
    }

    public static int r(w.l lVar, int i13) {
        int[] iArr = (int[]) lVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return u(iArr, i13) ? i13 : u(iArr, 1) ? 1 : 0;
    }

    public static boolean u(int[] iArr, int i13) {
        for (int i14 : iArr) {
            if (i13 == i14) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(TotalCaptureResult totalCaptureResult, long j13) {
        Long l13;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof androidx.camera.core.impl.u2) && (l13 = (Long) ((androidx.camera.core.impl.u2) tag).f16977a.get("CameraControlSessionUpdateId")) != null && l13.longValue() >= j13;
    }

    @Override // androidx.camera.core.impl.g0
    public final void a() {
        sp2.i iVar = this.f123559o;
        ((Executor) iVar.f114928b).execute(new a3(iVar, 0));
    }

    @Override // c0.m
    public final com.google.common.util.concurrent.c0 b(float f13) {
        com.google.common.util.concurrent.c0 nVar;
        h0.b c13;
        if (!t()) {
            return new g0.n(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        d3 d3Var = this.f123553i;
        synchronized (((e3) d3Var.f123429e)) {
            try {
                ((e3) d3Var.f123429e).c(f13);
                c13 = h0.b.c((e3) d3Var.f123429e);
            } catch (IllegalArgumentException e13) {
                nVar = new g0.n(e13);
            }
        }
        d3Var.f(c13);
        nVar = com.bumptech.glide.d.L(new o3(5, d3Var, c13));
        return g0.m.f(nVar);
    }

    @Override // androidx.camera.core.impl.g0
    public final Rect c() {
        Rect rect = (Rect) this.f123549e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.g0
    public final void d(int i13) {
        if (!t()) {
            kh2.m0.X0("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f123563s = i13;
        kh2.m0.p("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f123563s);
        g3 g3Var = this.f123556l;
        boolean z13 = true;
        if (this.f123563s != 1 && this.f123563s != 0) {
            z13 = false;
        }
        g3Var.f123481d = z13;
        this.f123567w = g0.m.f(com.bumptech.glide.d.L(new a.z0(this, 3)));
    }

    @Override // c0.m
    public final com.google.common.util.concurrent.c0 e(boolean z13) {
        com.google.common.util.concurrent.c0 L;
        if (!t()) {
            return new g0.n(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        z2 z2Var = this.f123554j;
        if (z2Var.f123761c) {
            z2.b(z2Var.f123760b, Integer.valueOf(z13 ? 1 : 0));
            L = com.bumptech.glide.d.L(new b2(z2Var, z13, 1));
        } else {
            kh2.m0.p("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            L = new g0.n(new IllegalStateException("No flash unit"));
        }
        return g0.m.f(L);
    }

    @Override // androidx.camera.core.impl.g0
    public final androidx.camera.core.impl.v0 f() {
        u.b c13;
        b0.c cVar = this.f123557m;
        synchronized (cVar.f20716e) {
            c13 = ((u.a) cVar.f20717f).c();
        }
        return c13;
    }

    @Override // androidx.camera.core.impl.g0
    public final void g() {
        sp2.i iVar = this.f123559o;
        ((Executor) iVar.f114928b).execute(new a3(iVar, 1));
    }

    @Override // androidx.camera.core.impl.g0
    public final void h(androidx.camera.core.impl.v0 v0Var) {
        b0.c cVar = this.f123557m;
        gc.c b13 = u.a.d(v0Var).b();
        synchronized (cVar.f20716e) {
            u.a aVar = (u.a) cVar.f20717f;
            aVar.getClass();
            androidx.camera.core.impl.u0 u0Var = androidx.camera.core.impl.u0.OPTIONAL;
            for (androidx.camera.core.impl.c cVar2 : b13.a()) {
                aVar.f119717b.q(cVar2, u0Var, b13.f(cVar2));
            }
        }
        int i13 = 0;
        g0.m.f(com.bumptech.glide.d.L(new b0.b(cVar, i13))).d(new h(i13), l3.c.s());
    }

    @Override // androidx.camera.core.impl.g0
    public final void i(androidx.camera.core.impl.i2 i2Var) {
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        g3 g3Var = this.f123556l;
        w.l lVar = g3Var.f123478a;
        while (true) {
            k0.d dVar = g3Var.f123479b;
            if (dVar.h()) {
                break;
            } else {
                ((c0.n0) dVar.e()).close();
            }
        }
        c0.k1 k1Var = g3Var.f123486i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (k1Var != null) {
            c0.c1 c1Var = g3Var.f123484g;
            if (c1Var != null) {
                g0.m.f(k1Var.f17009e).d(new f3(c1Var, 1), l3.c.H0());
                g3Var.f123484g = null;
            }
            k1Var.a();
            g3Var.f123486i = null;
        }
        ImageWriter imageWriter = g3Var.f123487j;
        if (imageWriter != null) {
            imageWriter.close();
            g3Var.f123487j = null;
        }
        boolean z13 = g3Var.f123480c;
        c1 c1Var2 = i2Var.f16863b;
        if (z13) {
            c1Var2.f123384a = 1;
            return;
        }
        if (g3Var.f123483f) {
            c1Var2.f123384a = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) lVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e13) {
            kh2.m0.s("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e13.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap();
            for (int i13 : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i13);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new e0.f(true));
                    hashMap.put(Integer.valueOf(i13), inputSizes[0]);
                }
            }
        }
        if (g3Var.f123482e && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) lVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i14 : validOutputFormatsForInput) {
                if (i14 == 256) {
                    Size size = (Size) hashMap.get(34);
                    c0.r0 r0Var = new c0.r0(size.getWidth(), size.getHeight(), 34, 9);
                    g3Var.f123485h = r0Var.f24318b;
                    g3Var.f123484g = new c0.c1(r0Var);
                    r0Var.v(new a.z0(g3Var, 0), l3.c.D0());
                    c0.k1 k1Var2 = new c0.k1(g3Var.f123484g.z(), new Size(g3Var.f123484g.j(), g3Var.f123484g.i()), 34);
                    g3Var.f123486i = k1Var2;
                    c0.c1 c1Var3 = g3Var.f123484g;
                    com.google.common.util.concurrent.c0 f13 = g0.m.f(k1Var2.f17009e);
                    Objects.requireNonNull(c1Var3);
                    f13.d(new f3(c1Var3, 0), l3.c.H0());
                    i2Var.b(g3Var.f123486i, c0.z.f24401d, -1);
                    c0.q0 q0Var = g3Var.f123485h;
                    c1Var2.b(q0Var);
                    ArrayList arrayList = i2Var.f16866e;
                    if (!arrayList.contains(q0Var)) {
                        arrayList.add(q0Var);
                    }
                    j1 j1Var = new j1(g3Var, 2);
                    ArrayList arrayList2 = i2Var.f16865d;
                    if (!arrayList2.contains(j1Var)) {
                        arrayList2.add(j1Var);
                    }
                    i2Var.f16868g = new InputConfiguration(g3Var.f123484g.j(), g3Var.f123484g.i(), g3Var.f123484g.m());
                    return;
                }
            }
        }
        c1Var2.f123384a = 1;
    }

    @Override // androidx.camera.core.impl.g0
    public final com.google.common.util.concurrent.c0 j(final int i13, final int i14, final List list) {
        if (!t()) {
            kh2.m0.X0("Camera2CameraControlImp", "Camera is not active.");
            return new g0.n(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int i15 = this.f123563s;
        g0.d a13 = g0.d.a(g0.m.f(this.f123567w));
        g0.a aVar = new g0.a() { // from class: v.g
            @Override // g0.a
            public final com.google.common.util.concurrent.c0 apply(Object obj) {
                c1 c1Var = n.this.f123558n;
                int i16 = i14;
                int i17 = i13;
                final int i18 = i15;
                final s0 g13 = c1Var.g(i17, i18, i16);
                g0.d a14 = g0.d.a(g13.a(i18));
                final List list2 = list;
                g0.a aVar2 = new g0.a() { // from class: v.q0
                    @Override // g0.a
                    public final com.google.common.util.concurrent.c0 apply(Object obj2) {
                        c0.n0 n0Var;
                        s0 s0Var = s0.this;
                        s0Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list2.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            n nVar = s0Var.f123653d;
                            if (!hasNext) {
                                nVar.x(arrayList2);
                                return g0.m.b(arrayList);
                            }
                            androidx.camera.core.impl.s0 s0Var2 = (androidx.camera.core.impl.s0) it.next();
                            c1 c1Var2 = new c1(s0Var2);
                            androidx.camera.core.impl.z zVar = null;
                            int i19 = s0Var2.f16969c;
                            if (i19 == 5) {
                                g3 g3Var = nVar.f123556l;
                                if (!g3Var.f123481d && !g3Var.f123480c) {
                                    try {
                                        n0Var = (c0.n0) g3Var.f123479b.e();
                                    } catch (NoSuchElementException unused) {
                                        kh2.m0.s("ZslControlImpl", "dequeueImageFromBuffer no such element");
                                        n0Var = null;
                                    }
                                    if (n0Var != null) {
                                        g3 g3Var2 = nVar.f123556l;
                                        g3Var2.getClass();
                                        Image image = n0Var.getImage();
                                        ImageWriter imageWriter = g3Var2.f123487j;
                                        if (imageWriter != null && image != null) {
                                            try {
                                                imageWriter.queueInputImage(image);
                                                c0.j0 H1 = n0Var.H1();
                                                if (H1 instanceof h0.c) {
                                                    zVar = ((h0.c) H1).f66375a;
                                                }
                                            } catch (IllegalStateException e13) {
                                                kh2.m0.s("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e13.getMessage());
                                            }
                                        }
                                    }
                                }
                            }
                            if (zVar != null) {
                                c1Var2.f123391h = zVar;
                            } else {
                                int i23 = (s0Var.f123650a != 3 || s0Var.f123655f) ? (i19 == -1 || i19 == 5) ? 2 : -1 : 4;
                                if (i23 != -1) {
                                    c1Var2.f123384a = i23;
                                }
                            }
                            n3.b bVar = s0Var.f123654e;
                            if (bVar.f89034b && i18 == 0 && bVar.f89033a) {
                                u.a aVar3 = new u.a(0);
                                aVar3.f(CaptureRequest.CONTROL_AE_MODE, 3);
                                c1Var2.c(aVar3.c());
                            }
                            arrayList.add(com.bumptech.glide.d.L(new o3(3, s0Var, c1Var2)));
                            arrayList2.add(c1Var2.e());
                        }
                    }
                };
                a14.getClass();
                Executor executor = g13.f123651b;
                g0.b j13 = g0.m.j(a14, aVar2, executor);
                j13.d(new ig(g13, 8), executor);
                return g0.m.f(j13);
            }
        };
        Executor executor = this.f123547c;
        a13.getClass();
        return g0.m.j(a13, aVar, executor);
    }

    @Override // androidx.camera.core.impl.g0
    public final com.google.common.util.concurrent.c0 k(final int i13, final int i14) {
        if (!t()) {
            kh2.m0.X0("Camera2CameraControlImp", "Camera is not active.");
            return new g0.n(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int i15 = this.f123563s;
        g0.d a13 = g0.d.a(g0.m.f(this.f123567w));
        g0.a aVar = new g0.a() { // from class: v.i
            @Override // g0.a
            public final com.google.common.util.concurrent.c0 apply(Object obj) {
                c1 c1Var = n.this.f123558n;
                int i16 = i14;
                int i17 = i13;
                int i18 = i15;
                return g0.m.e(new o0(c1Var.g(i17, i18, i16), (Executor) c1Var.f123390g, i18));
            }
        };
        Executor executor = this.f123547c;
        a13.getClass();
        return g0.m.j(a13, aVar, executor);
    }

    @Override // androidx.camera.core.impl.g0
    public final void l(h0.h hVar) {
        this.f123561q = hVar;
    }

    @Override // androidx.camera.core.impl.g0
    public final void m() {
        b0.c cVar = this.f123557m;
        synchronized (cVar.f20716e) {
            cVar.f20717f = new u.a(0);
        }
        int i13 = 1;
        g0.m.f(com.bumptech.glide.d.L(new b0.b(cVar, i13))).d(new h(i13), l3.c.s());
    }

    public final void n(m mVar) {
        ((Set) this.f123546b.f123510b).add(mVar);
    }

    public final void o() {
        synchronized (this.f123548d) {
            try {
                int i13 = this.f123560p;
                if (i13 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f123560p = i13 - 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p(boolean z13) {
        this.f123562r = z13;
        if (!z13) {
            c1 c1Var = new c1();
            c1Var.f123384a = this.f123568x;
            c1Var.f123386c = true;
            u.a aVar = new u.a(0);
            aVar.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(r(this.f123549e, 1)));
            aVar.f(CaptureRequest.FLASH_MODE, 0);
            c1Var.c(aVar.c());
            x(Collections.singletonList(c1Var.e()));
        }
        y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0088, code lost:
    
        if (r5 != 2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.o2 q() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.q():androidx.camera.core.impl.o2");
    }

    public final int s(int i13) {
        int[] iArr = (int[]) this.f123549e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (u(iArr, i13)) {
            return i13;
        }
        if (u(iArr, 4)) {
            return 4;
        }
        return u(iArr, 1) ? 1 : 0;
    }

    public final boolean t() {
        int i13;
        synchronized (this.f123548d) {
            i13 = this.f123560p;
        }
        return i13 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [v.e2, v.m] */
    public final void w(boolean z13) {
        h0.b c13;
        kh2.m0.p("Camera2CameraControlImp", "setActive: isActive = " + z13);
        final g2 g2Var = this.f123552h;
        int i13 = 1;
        if (z13 != g2Var.f123469c) {
            g2Var.f123469c = z13;
            if (!g2Var.f123469c) {
                e2 e2Var = g2Var.f123471e;
                n nVar = g2Var.f123467a;
                ((Set) nVar.f123546b.f123510b).remove(e2Var);
                r4.i iVar = g2Var.f123475i;
                if (iVar != null) {
                    iVar.d(new CameraControl$OperationCanceledException("Cancelled by another cancelFocusAndMetering()"));
                    g2Var.f123475i = null;
                }
                ((Set) nVar.f123546b.f123510b).remove(null);
                g2Var.f123475i = null;
                if (g2Var.f123472f.length > 0) {
                    g2Var.a(true, false);
                }
                MeteringRectangle[] meteringRectangleArr = g2.f123466l;
                g2Var.f123472f = meteringRectangleArr;
                g2Var.f123473g = meteringRectangleArr;
                g2Var.f123474h = meteringRectangleArr;
                final long y13 = nVar.y();
                if (g2Var.f123475i != null) {
                    final int s13 = nVar.s(g2Var.f123470d != 3 ? 4 : 3);
                    ?? r83 = new m() { // from class: v.e2
                        @Override // v.m
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            g2 g2Var2 = g2.this;
                            g2Var2.getClass();
                            if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != s13 || !n.v(totalCaptureResult, y13)) {
                                return false;
                            }
                            r4.i iVar2 = g2Var2.f123475i;
                            if (iVar2 != null) {
                                iVar2.b(null);
                                g2Var2.f123475i = null;
                            }
                            return true;
                        }
                    };
                    g2Var.f123471e = r83;
                    nVar.n(r83);
                }
            }
        }
        d3 d3Var = this.f123553i;
        if (d3Var.f123426b != z13) {
            d3Var.f123426b = z13;
            if (!z13) {
                synchronized (((e3) d3Var.f123429e)) {
                    ((e3) d3Var.f123429e).d();
                    c13 = h0.b.c((e3) d3Var.f123429e);
                }
                d3Var.f(c13);
                ((c3) d3Var.f123431g).k();
                ((n) d3Var.f123427c).y();
            }
        }
        z2 z2Var = this.f123554j;
        if (z2Var.f123763e != z13) {
            z2Var.f123763e = z13;
            if (!z13) {
                if (z2Var.f123765g) {
                    z2Var.f123765g = false;
                    z2Var.f123759a.p(false);
                    z2.b(z2Var.f123760b, 0);
                }
                r4.i iVar2 = z2Var.f123764f;
                if (iVar2 != null) {
                    iVar2.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    z2Var.f123764f = null;
                }
            }
        }
        a2 a2Var = this.f123555k;
        if (z13 != a2Var.f123346a) {
            a2Var.f123346a = z13;
            if (!z13) {
                bn0.a aVar = (bn0.a) a2Var.f123348c;
                synchronized (aVar.f23560c) {
                    aVar.f23559b = 0;
                }
            }
        }
        b0.c cVar = this.f123557m;
        ((Executor) cVar.f20712a).execute(new s(cVar, z13, i13));
        if (z13) {
            return;
        }
        this.f123561q = null;
        ((AtomicInteger) this.f123559o.f114929c).set(0);
        kh2.m0.p("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    public final void x(List list) {
        int c13;
        int b13;
        androidx.camera.core.impl.z zVar;
        x xVar = this.f123550f;
        xVar.getClass();
        list.getClass();
        d0 d0Var = xVar.f123731a;
        d0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.s0 s0Var = (androidx.camera.core.impl.s0) it.next();
            c1 c1Var = new c1(s0Var);
            if (s0Var.f16969c == 5 && (zVar = s0Var.f16974h) != null) {
                c1Var.f123391h = zVar;
            }
            if (Collections.unmodifiableList(s0Var.f16967a).isEmpty() && s0Var.f16972f) {
                Object obj = c1Var.f123387d;
                Set set = (Set) obj;
                if (set.isEmpty()) {
                    androidx.camera.core.impl.x2 x2Var = d0Var.f123396a;
                    x2Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : x2Var.f16995b.entrySet()) {
                        androidx.camera.core.impl.w2 w2Var = (androidx.camera.core.impl.w2) entry.getValue();
                        if (w2Var.f16989f && w2Var.f16988e) {
                            arrayList2.add(((androidx.camera.core.impl.w2) entry.getValue()).f16984a);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList2).iterator();
                    while (it2.hasNext()) {
                        androidx.camera.core.impl.s0 s0Var2 = ((androidx.camera.core.impl.o2) it2.next()).f16937g;
                        List unmodifiableList = Collections.unmodifiableList(s0Var2.f16967a);
                        if (!unmodifiableList.isEmpty()) {
                            if (s0Var2.b() != 0 && (b13 = s0Var2.b()) != 0) {
                                ((androidx.camera.core.impl.q1) ((androidx.camera.core.impl.p1) c1Var.f123388e)).s(androidx.camera.core.impl.z2.f17025wn, Integer.valueOf(b13));
                            }
                            if (s0Var2.c() != 0 && (c13 = s0Var2.c()) != 0) {
                                ((androidx.camera.core.impl.q1) ((androidx.camera.core.impl.p1) c1Var.f123388e)).s(androidx.camera.core.impl.z2.f17026xn, Integer.valueOf(c13));
                            }
                            Iterator it3 = unmodifiableList.iterator();
                            while (it3.hasNext()) {
                                ((Set) obj).add((androidx.camera.core.impl.z0) it3.next());
                            }
                        }
                    }
                    if (set.isEmpty()) {
                        kh2.m0.X0("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                } else {
                    kh2.m0.X0("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            arrayList.add(c1Var.e());
        }
        d0Var.t("Issue capture request", null);
        d0Var.f123408m.h(arrayList);
    }

    public final long y() {
        this.f123569y = this.f123566v.getAndIncrement();
        this.f123550f.f123731a.K();
        return this.f123569y;
    }
}
