package v;

import a.ig;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class t1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f123661a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f123662b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f123663c;

    /* renamed from: d, reason: collision with root package name */
    public v2 f123664d;

    /* renamed from: e, reason: collision with root package name */
    public v2 f123665e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.camera.core.impl.o2 f123666f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f123667g;

    /* renamed from: h, reason: collision with root package name */
    public List f123668h;

    /* renamed from: i, reason: collision with root package name */
    public r1 f123669i;

    /* renamed from: j, reason: collision with root package name */
    public r4.l f123670j;

    /* renamed from: k, reason: collision with root package name */
    public r4.i f123671k;

    /* renamed from: l, reason: collision with root package name */
    public Map f123672l;

    /* renamed from: m, reason: collision with root package name */
    public final q8.m0 f123673m;

    /* renamed from: n, reason: collision with root package name */
    public final q8.m0 f123674n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.appcompat.app.x0 f123675o;

    /* renamed from: p, reason: collision with root package name */
    public final gc.c f123676p;

    /* renamed from: q, reason: collision with root package name */
    public final n3.b f123677q;

    public t1(gc.c cVar) {
        this(cVar, new androidx.camera.core.impl.r(Collections.emptyList()));
    }

    public static i0 b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback i0Var;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.n nVar = (androidx.camera.core.impl.n) it.next();
            if (nVar == null) {
                i0Var = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                rl2.g0.j0(nVar, arrayList2);
                i0Var = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new i0(arrayList2);
            }
            arrayList.add(i0Var);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new i0(arrayList);
    }

    public static ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x.h hVar = (x.h) it.next();
            if (!arrayList2.contains(hVar.f131248a.e())) {
                arrayList2.add(hVar.f131248a.e());
                arrayList3.add(hVar);
            }
        }
        return arrayList3;
    }

    public final void a() {
        synchronized (this.f123661a) {
            try {
                int ordinal = this.f123669i.ordinal();
                if (ordinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f123669i);
                }
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        com.bumptech.glide.d.s(this.f123664d, "The Opener shouldn't null in state:" + this.f123669i);
                        this.f123664d.p();
                    } else if (ordinal == 3 || ordinal == 4) {
                        com.bumptech.glide.d.s(this.f123664d, "The Opener shouldn't null in state:" + this.f123669i);
                        this.f123664d.p();
                        this.f123669i = r1.CLOSED;
                        this.f123675o.i();
                        this.f123666f = null;
                    }
                }
                this.f123669i = r1.RELEASED;
            } finally {
            }
        }
    }

    public final void c() {
        r1 r1Var = this.f123669i;
        r1 r1Var2 = r1.RELEASED;
        if (r1Var == r1Var2) {
            kh2.m0.p("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f123669i = r1Var2;
        this.f123665e = null;
        r4.i iVar = this.f123671k;
        if (iVar != null) {
            iVar.b(null);
            this.f123671k = null;
        }
    }

    public final x.h d(androidx.camera.core.impl.h hVar, HashMap hashMap, String str) {
        long j13;
        Surface surface = (Surface) hashMap.get(hVar.f16844a);
        com.bumptech.glide.d.s(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        x.h hVar2 = new x.h(hVar.f16848e, surface);
        x.o oVar = hVar2.f131248a;
        if (str != null) {
            oVar.h(str);
        } else {
            oVar.h(hVar.f16846c);
        }
        int i13 = hVar.f16847d;
        if (i13 == 0) {
            oVar.g(1);
        } else if (i13 == 1) {
            oVar.g(2);
        }
        List list = hVar.f16845b;
        if (!list.isEmpty()) {
            oVar.b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) hashMap.get((androidx.camera.core.impl.z0) it.next());
                com.bumptech.glide.d.s(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                oVar.a(surface2);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            gc.c cVar = this.f123676p;
            cVar.getClass();
            com.bumptech.glide.d.v("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i14 >= 33);
            DynamicRangeProfiles b13 = ((x.b) cVar.f64764b).b();
            if (b13 != null) {
                c0.z zVar = hVar.f16849f;
                Long a13 = x.a.a(zVar, b13);
                if (a13 != null) {
                    j13 = a13.longValue();
                    oVar.f(j13);
                    return hVar2;
                }
                kh2.m0.s("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + zVar);
            }
        }
        j13 = 1;
        oVar.f(j13);
        return hVar2;
    }

    public final boolean f() {
        boolean z13;
        synchronized (this.f123661a) {
            try {
                r1 r1Var = this.f123669i;
                z13 = r1Var == r1.OPENED || r1Var == r1.OPENING;
            } finally {
            }
        }
        return z13;
    }

    public final void g(ArrayList arrayList) {
        androidx.camera.core.impl.z zVar;
        synchronized (this.f123661a) {
            try {
                if (this.f123669i != r1.OPENED) {
                    kh2.m0.p("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    i1 i1Var = new i1();
                    ArrayList arrayList2 = new ArrayList();
                    kh2.m0.p("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    boolean z13 = false;
                    while (true) {
                        int i13 = 2;
                        if (it.hasNext()) {
                            androidx.camera.core.impl.s0 s0Var = (androidx.camera.core.impl.s0) it.next();
                            if (Collections.unmodifiableList(s0Var.f16967a).isEmpty()) {
                                kh2.m0.p("CaptureSession", "Skipping issuing empty capture request.");
                            } else {
                                Iterator it2 = Collections.unmodifiableList(s0Var.f16967a).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        androidx.camera.core.impl.z0 z0Var = (androidx.camera.core.impl.z0) it2.next();
                                        if (!this.f123667g.containsKey(z0Var)) {
                                            kh2.m0.p("CaptureSession", "Skipping capture request with invalid surface: " + z0Var);
                                            break;
                                        }
                                    } else {
                                        if (s0Var.f16969c == 2) {
                                            z13 = true;
                                        }
                                        c1 c1Var = new c1(s0Var);
                                        if (s0Var.f16969c == 5 && (zVar = s0Var.f16974h) != null) {
                                            c1Var.f123391h = zVar;
                                        }
                                        androidx.camera.core.impl.o2 o2Var = this.f123666f;
                                        if (o2Var != null) {
                                            c1Var.c(o2Var.f16937g.f16968b);
                                        }
                                        c1Var.c(s0Var.f16968b);
                                        androidx.camera.core.impl.s0 e13 = c1Var.e();
                                        v2 v2Var = this.f123665e;
                                        v2Var.f123703g.getClass();
                                        CaptureRequest A = kh2.u2.A(e13, v2Var.f123703g.a().getDevice(), this.f123667g, false, this.f123677q);
                                        if (A == null) {
                                            kh2.m0.p("CaptureSession", "Skipping issuing request without surface.");
                                            return;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it3 = s0Var.f16971e.iterator();
                                        while (it3.hasNext()) {
                                            rl2.g0.j0((androidx.camera.core.impl.n) it3.next(), arrayList3);
                                        }
                                        i1Var.a(A, arrayList3);
                                        arrayList2.add(A);
                                    }
                                }
                            }
                        } else {
                            if (!arrayList2.isEmpty()) {
                                if (this.f123673m.c(arrayList2, z13)) {
                                    v2 v2Var2 = this.f123665e;
                                    com.bumptech.glide.d.s(v2Var2.f123703g, "Need to call openCaptureSession before using this API.");
                                    v2Var2.f123703g.a().stopRepeating();
                                    i1Var.f123511c = new o1(this);
                                }
                                if (this.f123674n.b(arrayList2, z13)) {
                                    i1Var.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new i0(this, i13)));
                                }
                                this.f123665e.i(arrayList2, i1Var);
                                return;
                            }
                            kh2.m0.p("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        }
                    }
                } catch (CameraAccessException e14) {
                    kh2.m0.s("CaptureSession", "Unable to access camera: " + e14.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h(List list) {
        synchronized (this.f123661a) {
            try {
                switch (this.f123669i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f123669i);
                    case 1:
                    case 2:
                    case 3:
                        this.f123662b.addAll(list);
                        break;
                    case 4:
                        this.f123662b.addAll(list);
                        this.f123675o.g().d(new ig(this, 10), l3.c.s());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final void i(androidx.camera.core.impl.o2 o2Var) {
        synchronized (this.f123661a) {
            try {
            } catch (Throwable th3) {
                throw th3;
            }
            if (o2Var == null) {
                kh2.m0.p("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.f123669i != r1.OPENED) {
                kh2.m0.p("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            androidx.camera.core.impl.s0 s0Var = o2Var.f16937g;
            if (Collections.unmodifiableList(s0Var.f16967a).isEmpty()) {
                kh2.m0.p("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    v2 v2Var = this.f123665e;
                    com.bumptech.glide.d.s(v2Var.f123703g, "Need to call openCaptureSession before using this API.");
                    v2Var.f123703g.a().stopRepeating();
                } catch (CameraAccessException e13) {
                    kh2.m0.s("CaptureSession", "Unable to access camera: " + e13.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                kh2.m0.p("CaptureSession", "Issuing request for session.");
                v2 v2Var2 = this.f123665e;
                v2Var2.f123703g.getClass();
                CaptureRequest A = kh2.u2.A(s0Var, v2Var2.f123703g.a().getDevice(), this.f123667g, true, this.f123677q);
                if (A == null) {
                    kh2.m0.p("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                } else {
                    this.f123665e.n(A, this.f123675o.a(b(s0Var.f16971e, new CameraCaptureSession.CaptureCallback[0])));
                    return;
                }
            } catch (CameraAccessException e14) {
                kh2.m0.s("CaptureSession", "Unable to access camera: " + e14.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th3;
        }
    }

    public final com.google.common.util.concurrent.c0 j(final androidx.camera.core.impl.o2 o2Var, final CameraDevice cameraDevice, v2 v2Var) {
        synchronized (this.f123661a) {
            try {
                if (this.f123669i.ordinal() != 1) {
                    kh2.m0.s("CaptureSession", "Open not allowed in state: " + this.f123669i);
                    return new g0.n(new IllegalStateException("open() should not allow the state: " + this.f123669i));
                }
                this.f123669i = r1.GET_SURFACE;
                ArrayList arrayList = new ArrayList(o2Var.b());
                this.f123668h = arrayList;
                this.f123664d = v2Var;
                g0.d a13 = g0.d.a(v2Var.o(arrayList));
                g0.a aVar = new g0.a() { // from class: v.p1
                    @Override // g0.a
                    public final com.google.common.util.concurrent.c0 apply(Object obj) {
                        com.google.common.util.concurrent.c0 nVar;
                        InputConfiguration inputConfiguration;
                        t1 t1Var = t1.this;
                        androidx.camera.core.impl.o2 o2Var2 = o2Var;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        synchronized (t1Var.f123661a) {
                            try {
                                int ordinal = t1Var.f123669i.ordinal();
                                if (ordinal != 0 && ordinal != 1) {
                                    if (ordinal == 2) {
                                        t1Var.f123667g.clear();
                                        for (int i13 = 0; i13 < list.size(); i13++) {
                                            t1Var.f123667g.put((androidx.camera.core.impl.z0) t1Var.f123668h.get(i13), (Surface) list.get(i13));
                                        }
                                        t1Var.f123669i = r1.OPENING;
                                        kh2.m0.p("CaptureSession", "Opening capture session.");
                                        s1 s1Var = new s1(Arrays.asList(t1Var.f123663c, new s1(o2Var2.f16934d, 1)), 2);
                                        androidx.camera.core.impl.s0 s0Var = o2Var2.f16937g;
                                        u.b bVar = new u.b(s0Var.f16968b);
                                        c1 c1Var = new c1(s0Var);
                                        ArrayList arrayList2 = new ArrayList();
                                        String str = (String) ((androidx.camera.core.impl.v0) bVar.f64764b).j(u.b.f119723h, null);
                                        for (androidx.camera.core.impl.h hVar : o2Var2.f16931a) {
                                            x.h d2 = t1Var.d(hVar, t1Var.f123667g, str);
                                            if (t1Var.f123672l.containsKey(hVar.f16844a)) {
                                                d2.f131248a.i(((Long) t1Var.f123672l.get(hVar.f16844a)).longValue());
                                            }
                                            arrayList2.add(d2);
                                        }
                                        ArrayList e13 = t1.e(arrayList2);
                                        v2 v2Var2 = t1Var.f123664d;
                                        int i14 = o2Var2.f16938h;
                                        v2Var2.f123702f = s1Var;
                                        x.s sVar = new x.s(i14, e13, v2Var2.f123700d, new j1(v2Var2, 1));
                                        if (o2Var2.f16937g.f16969c == 5 && (inputConfiguration = o2Var2.f16939i) != null) {
                                            sVar.f131262a.b(x.g.a(inputConfiguration));
                                        }
                                        CaptureRequest K = kh2.u2.K(c1Var.e(), cameraDevice2, t1Var.f123677q);
                                        if (K != null) {
                                            sVar.f131262a.h(K);
                                        }
                                        nVar = t1Var.f123664d.m(cameraDevice2, sVar, t1Var.f123668h);
                                    } else if (ordinal != 4) {
                                        nVar = new g0.n(new CancellationException("openCaptureSession() not execute in state: " + t1Var.f123669i));
                                    }
                                }
                                nVar = new g0.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + t1Var.f123669i));
                            } catch (CameraAccessException e14) {
                                nVar = new g0.n(e14);
                            } finally {
                            }
                        }
                        return nVar;
                    }
                };
                Executor executor = this.f123664d.f123700d;
                a13.getClass();
                g0.b j13 = g0.m.j(a13, aVar, executor);
                g0.m.a(j13, new q1(this, 0), this.f123664d.f123700d);
                return g0.m.f(j13);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:7:0x0074, B:11:0x0013, B:13:0x0017, B:14:0x001d, B:16:0x0041, B:17:0x0045, B:19:0x0049, B:20:0x0054, B:21:0x0056, B:23:0x0058, B:24:0x0070, B:25:0x007b, B:26:0x008e), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:7:0x0074, B:11:0x0013, B:13:0x0017, B:14:0x001d, B:16:0x0041, B:17:0x0045, B:19:0x0049, B:20:0x0054, B:21:0x0056, B:23:0x0058, B:24:0x0070, B:25:0x007b, B:26:0x008e), top: B:3:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.c0 k() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f123661a
            monitor-enter(r3)
            v.r1 r4 = r5.f123669i     // Catch: java.lang.Throwable -> L1b
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L1b
            switch(r4) {
                case 0: goto L7b;
                case 1: goto L70;
                case 2: goto L58;
                case 3: goto L1d;
                case 4: goto L13;
                case 5: goto L13;
                case 6: goto L45;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L1b
        L12:
            goto L74
        L13:
            v.v2 r0 = r5.f123665e     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0.j()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L8f
        L1d:
            v.r1 r0 = v.r1.RELEASING     // Catch: java.lang.Throwable -> L1b
            r5.f123669i = r0     // Catch: java.lang.Throwable -> L1b
            androidx.appcompat.app.x0 r0 = r5.f123675o     // Catch: java.lang.Throwable -> L1b
            r0.i()     // Catch: java.lang.Throwable -> L1b
            v.v2 r0 = r5.f123664d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            v.r1 r2 = r5.f123669i     // Catch: java.lang.Throwable -> L1b
            r1.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.d.s(r0, r1)     // Catch: java.lang.Throwable -> L1b
            v.v2 r0 = r5.f123664d     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L45
            r5.c()     // Catch: java.lang.Throwable -> L1b
            goto L74
        L45:
            r4.l r0 = r5.f123670j     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L54
            v.o1 r0 = new v.o1     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            r4.l r0 = com.bumptech.glide.d.L(r0)     // Catch: java.lang.Throwable -> L1b
            r5.f123670j = r0     // Catch: java.lang.Throwable -> L1b
        L54:
            r4.l r0 = r5.f123670j     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return r0
        L58:
            v.v2 r0 = r5.f123664d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            v.r1 r1 = r5.f123669i     // Catch: java.lang.Throwable -> L1b
            r2.append(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.d.s(r0, r1)     // Catch: java.lang.Throwable -> L1b
            v.v2 r0 = r5.f123664d     // Catch: java.lang.Throwable -> L1b
            r0.p()     // Catch: java.lang.Throwable -> L1b
        L70:
            v.r1 r0 = v.r1.RELEASED     // Catch: java.lang.Throwable -> L1b
            r5.f123669i = r0     // Catch: java.lang.Throwable -> L1b
        L74:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            g0.p r0 = g0.m.e(r0)
            return r0
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            v.r1 r0 = r5.f123669i     // Catch: java.lang.Throwable -> L1b
            r2.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L8f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.t1.k():com.google.common.util.concurrent.c0");
    }

    public final void l(androidx.camera.core.impl.o2 o2Var) {
        synchronized (this.f123661a) {
            try {
                switch (this.f123669i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f123669i);
                    case 1:
                    case 2:
                    case 3:
                        this.f123666f = o2Var;
                        break;
                    case 4:
                        this.f123666f = o2Var;
                        if (o2Var != null) {
                            if (!this.f123667g.keySet().containsAll(o2Var.b())) {
                                kh2.m0.s("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                kh2.m0.p("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                i(this.f123666f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public t1(gc.c cVar, androidx.camera.core.impl.r rVar) {
        this.f123661a = new Object();
        this.f123662b = new ArrayList();
        this.f123667g = new HashMap();
        this.f123668h = Collections.emptyList();
        this.f123669i = r1.UNINITIALIZED;
        this.f123672l = new HashMap();
        this.f123673m = new q8.m0(1);
        this.f123674n = new q8.m0(2);
        this.f123669i = r1.INITIALIZED;
        this.f123676p = cVar;
        this.f123663c = new s1(this);
        this.f123675o = new androidx.appcompat.app.x0(rVar.a(CaptureNoResponseQuirk.class));
        this.f123677q = new n3.b(2, rVar);
    }
}
