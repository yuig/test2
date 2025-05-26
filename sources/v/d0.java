package v;

import a.ig;
import a.jg;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import com.google.android.gms.internal.measurement.q4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d0 implements androidx.camera.core.impl.j0 {
    public final HashSet A;
    public androidx.camera.core.impl.a0 B;
    public final Object C;
    public boolean D;
    public final x1 E;
    public final gc.c F;
    public final r2 G;
    public final q4 H;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.x2 f123396a;

    /* renamed from: b, reason: collision with root package name */
    public final w.t f123397b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.j f123398c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.g f123399d;

    /* renamed from: e, reason: collision with root package name */
    public volatile z f123400e = z.INITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    public final q4 f123401f;

    /* renamed from: g, reason: collision with root package name */
    public final q4 f123402g;

    /* renamed from: h, reason: collision with root package name */
    public final n f123403h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f123404i;

    /* renamed from: j, reason: collision with root package name */
    public final h0 f123405j;

    /* renamed from: k, reason: collision with root package name */
    public CameraDevice f123406k;

    /* renamed from: l, reason: collision with root package name */
    public int f123407l;

    /* renamed from: m, reason: collision with root package name */
    public t1 f123408m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f123409n;

    /* renamed from: o, reason: collision with root package name */
    public int f123410o;

    /* renamed from: p, reason: collision with root package name */
    public final w f123411p;

    /* renamed from: q, reason: collision with root package name */
    public final a0.a f123412q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.camera.core.impl.p0 f123413r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f123414s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f123415t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f123416u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f123417v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f123418w;

    /* renamed from: x, reason: collision with root package name */
    public m2 f123419x;

    /* renamed from: y, reason: collision with root package name */
    public final w1 f123420y;

    /* renamed from: z, reason: collision with root package name */
    public final w1 f123421z;

    public d0(Context context, w.t tVar, String str, h0 h0Var, a0.a aVar, androidx.camera.core.impl.p0 p0Var, Executor executor, Handler handler, x1 x1Var, long j13) {
        q4 q4Var = new q4(7);
        this.f123401f = q4Var;
        this.f123407l = 0;
        new AtomicInteger(0);
        this.f123409n = new LinkedHashMap();
        this.f123410o = 0;
        this.f123416u = false;
        this.f123417v = false;
        this.f123418w = true;
        this.A = new HashSet();
        this.B = androidx.camera.core.impl.d0.f16820a;
        this.C = new Object();
        this.D = false;
        this.H = new q4(this, 0);
        this.f123397b = tVar;
        this.f123412q = aVar;
        this.f123413r = p0Var;
        f0.g gVar = new f0.g(handler);
        this.f123399d = gVar;
        f0.j jVar = new f0.j(executor);
        this.f123398c = jVar;
        this.f123404i = new c0(this, jVar, gVar, j13);
        this.f123396a = new androidx.camera.core.impl.x2(str, 0);
        ((androidx.lifecycle.l0) q4Var.f31594b).i(new androidx.camera.core.impl.o1(androidx.camera.core.impl.i0.CLOSED));
        q4 q4Var2 = new q4(p0Var);
        this.f123402g = q4Var2;
        w1 w1Var = new w1(jVar);
        this.f123420y = w1Var;
        this.E = x1Var;
        try {
            w.l b13 = tVar.b(str);
            n nVar = new n(b13, gVar, jVar, new x(this), h0Var.f123497i);
            this.f123403h = nVar;
            this.f123405j = h0Var;
            h0Var.r(nVar);
            h0Var.f123495g.m((androidx.lifecycle.l0) q4Var2.f31595c);
            this.F = gc.c.I(b13);
            this.f123408m = z();
            this.f123421z = new w1(handler, w1Var, h0Var.f123497i, y.b.f136245a, jVar, gVar);
            this.f123414s = h0Var.f123497i.a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f123415t = h0Var.f123497i.a(LegacyCameraSurfaceCleanupQuirk.class);
            w wVar = new w(this, str);
            this.f123411p = wVar;
            x xVar = new x(this);
            synchronized (p0Var.f16941b) {
                com.bumptech.glide.d.v("Camera is already registered: " + this, !p0Var.f16944e.containsKey(this));
                p0Var.f16944e.put(this, new androidx.camera.core.impl.n0(jVar, xVar, wVar));
            }
            tVar.f126943a.x(jVar, wVar);
            this.G = new r2(context, str, tVar, new t());
        } catch (CameraAccessExceptionCompat e13) {
            throw new CameraUnavailableException(e13);
        }
    }

    public static String v(int i13) {
        return i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String w(m2 m2Var) {
        StringBuilder sb3 = new StringBuilder("MeteringRepeating");
        m2Var.getClass();
        sb3.append(m2Var.hashCode());
        return sb3.toString();
    }

    public static String x(c0.s1 s1Var) {
        return s1Var.g() + s1Var.hashCode();
    }

    public final void A(boolean z13) {
        if (!z13) {
            this.f123404i.f123382e.f123342b = -1L;
        }
        this.f123404i.a();
        this.H.o();
        t("Opening camera.", null);
        E(z.OPENING);
        try {
            this.f123397b.f126943a.v(this.f123405j.f123489a, this.f123398c, s());
        } catch (CameraAccessExceptionCompat e13) {
            t("Unable to open camera due to " + e13.getMessage(), null);
            if (e13.f16755a == 10001) {
                F(z.INITIALIZED, new c0.f(7, e13), true);
                return;
            }
            q4 q4Var = this.H;
            if (((d0) q4Var.f31595c).f123400e != z.OPENING) {
                ((d0) q4Var.f31595c).t("Don't need the onError timeout handler.", null);
                return;
            }
            ((d0) q4Var.f31595c).t("Camera waiting for onError.", null);
            q4Var.o();
            q4Var.f31594b = new androidx.appcompat.app.d(q4Var);
        } catch (SecurityException e14) {
            t("Unable to open camera due to " + e14.getMessage(), null);
            E(z.REOPENING);
            this.f123404i.b();
        }
    }

    public final void B() {
        int i13 = 1;
        com.bumptech.glide.d.v(null, this.f123400e == z.OPENED);
        androidx.camera.core.impl.n2 b13 = this.f123396a.b();
        if (!b13.f16926l || !b13.f16925k) {
            t("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.f123413r.e(this.f123406k.getId(), this.f123412q.b(this.f123406k.getId()))) {
            t("Unable to create capture session in camera operating mode = " + this.f123412q.f202a, null);
            return;
        }
        HashMap hashMap = new HashMap();
        Collection<androidx.camera.core.impl.o2> c13 = this.f123396a.c();
        Collection d2 = this.f123396a.d();
        androidx.camera.core.impl.c cVar = q2.f123609a;
        ArrayList arrayList = new ArrayList(d2);
        Iterator it = c13.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.core.impl.o2 o2Var = (androidx.camera.core.impl.o2) it.next();
            androidx.camera.core.impl.v0 v0Var = o2Var.f16937g.f16968b;
            androidx.camera.core.impl.c cVar2 = q2.f123609a;
            if (v0Var.d(cVar2) && o2Var.b().size() != 1) {
                kh2.m0.s("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(o2Var.b().size())));
                break;
            }
            if (o2Var.f16937g.f16968b.d(cVar2)) {
                int i14 = 0;
                for (androidx.camera.core.impl.o2 o2Var2 : c13) {
                    if (((androidx.camera.core.impl.z2) arrayList.get(i14)).A() == androidx.camera.core.impl.b3.METERING_REPEATING) {
                        com.bumptech.glide.d.v("MeteringRepeating should contain a surface", !o2Var2.b().isEmpty());
                        hashMap.put((androidx.camera.core.impl.z0) o2Var2.b().get(0), 1L);
                    } else if (o2Var2.f16937g.f16968b.d(cVar2) && !o2Var2.b().isEmpty()) {
                        hashMap.put((androidx.camera.core.impl.z0) o2Var2.b().get(0), (Long) o2Var2.f16937g.f16968b.f(cVar2));
                    }
                    i14++;
                }
            }
        }
        t1 t1Var = this.f123408m;
        synchronized (t1Var.f123661a) {
            t1Var.f123672l = hashMap;
        }
        t1 t1Var2 = this.f123408m;
        androidx.camera.core.impl.o2 b14 = b13.b();
        CameraDevice cameraDevice = this.f123406k;
        cameraDevice.getClass();
        w1 w1Var = this.f123421z;
        g0.m.a(t1Var2.j(b14, cameraDevice, new w2((Handler) w1Var.f123718c, (w1) w1Var.f123719d, (androidx.camera.core.impl.r) w1Var.f123720e, (androidx.camera.core.impl.r) w1Var.f123721f, w1Var.f123716a, (ScheduledExecutorService) w1Var.f123717b)), new v(this, t1Var2, i13), this.f123398c);
    }

    public final void C() {
        if (this.f123419x != null) {
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.f123419x.getClass();
            sb3.append(this.f123419x.hashCode());
            String sb4 = sb3.toString();
            androidx.camera.core.impl.x2 x2Var = this.f123396a;
            if (x2Var.f16995b.containsKey(sb4)) {
                androidx.camera.core.impl.w2 w2Var = (androidx.camera.core.impl.w2) x2Var.f16995b.get(sb4);
                w2Var.f16988e = false;
                if (!w2Var.f16989f) {
                    x2Var.f16995b.remove(sb4);
                }
            }
            StringBuilder sb5 = new StringBuilder("MeteringRepeating");
            this.f123419x.getClass();
            sb5.append(this.f123419x.hashCode());
            x2Var.f(sb5.toString());
            m2 m2Var = this.f123419x;
            m2Var.getClass();
            kh2.m0.p("MeteringRepeating", "MeteringRepeating clear!");
            c0.k1 k1Var = m2Var.f123540a;
            if (k1Var != null) {
                k1Var.a();
            }
            m2Var.f123540a = null;
            this.f123419x = null;
        }
    }

    public final void D() {
        androidx.camera.core.impl.o2 o2Var;
        List unmodifiableList;
        int i13 = 0;
        com.bumptech.glide.d.v(null, this.f123408m != null);
        t("Resetting Capture Session", null);
        t1 t1Var = this.f123408m;
        synchronized (t1Var.f123661a) {
            o2Var = t1Var.f123666f;
        }
        synchronized (t1Var.f123661a) {
            unmodifiableList = Collections.unmodifiableList(t1Var.f123662b);
        }
        t1 z13 = z();
        this.f123408m = z13;
        z13.l(o2Var);
        this.f123408m.h(unmodifiableList);
        if (this.f123400e.ordinal() != 8) {
            t("Skipping Capture Session state check due to current camera state: " + this.f123400e + " and previous session status: " + t1Var.f(), null);
        } else if (this.f123414s && t1Var.f()) {
            t("Close camera before creating new session", null);
            E(z.REOPENING_QUIRK);
        }
        if (this.f123415t && t1Var.f()) {
            t("ConfigAndClose is required when close the camera.", null);
            this.f123416u = true;
        }
        t1Var.a();
        com.google.common.util.concurrent.c0 k13 = t1Var.k();
        t("Releasing session in state " + this.f123400e.name(), null);
        this.f123409n.put(t1Var, k13);
        g0.m.a(k13, new v(this, t1Var, i13), l3.c.s());
    }

    public final void E(z zVar) {
        F(zVar, null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00d2, code lost:
    
        if (r7 == r6) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(v.z r10, c0.f r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.d0.F(v.z, c0.f, boolean):void");
    }

    public final ArrayList G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0.s1 s1Var = (c0.s1) it.next();
            boolean z13 = this.f123418w;
            String x13 = x(s1Var);
            Class<?> cls = s1Var.getClass();
            androidx.camera.core.impl.o2 o2Var = z13 ? s1Var.f24346m : s1Var.f24347n;
            androidx.camera.core.impl.z2 z2Var = s1Var.f24339f;
            androidx.camera.core.impl.k kVar = s1Var.f24340g;
            arrayList2.add(new b(x13, cls, o2Var, z2Var, kVar != null ? kVar.f16893a : null, kVar, s1Var.c() == null ? null : p0.d.F(s1Var)));
        }
        return arrayList2;
    }

    public final void H(List list) {
        Size size;
        boolean isEmpty = this.f123396a.c().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b bVar = (b) it.next();
            if (!this.f123396a.e(bVar.f123351a)) {
                androidx.camera.core.impl.x2 x2Var = this.f123396a;
                String str = bVar.f123351a;
                androidx.camera.core.impl.o2 o2Var = bVar.f123353c;
                androidx.camera.core.impl.z2 z2Var = bVar.f123354d;
                androidx.camera.core.impl.k kVar = bVar.f123356f;
                List list2 = bVar.f123357g;
                androidx.camera.core.impl.w2 w2Var = (androidx.camera.core.impl.w2) x2Var.f16995b.get(str);
                if (w2Var == null) {
                    w2Var = new androidx.camera.core.impl.w2(o2Var, z2Var, kVar, list2);
                    x2Var.f16995b.put(str, w2Var);
                }
                w2Var.f16988e = true;
                x2Var.g(str, o2Var, z2Var, kVar, list2);
                arrayList.add(bVar.f123351a);
                if (bVar.f123352b == c0.w0.class && (size = bVar.f123355e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED", null);
        if (isEmpty) {
            this.f123403h.w(true);
            n nVar = this.f123403h;
            synchronized (nVar.f123548d) {
                nVar.f123560p++;
            }
        }
        p();
        L();
        K();
        D();
        z zVar = this.f123400e;
        z zVar2 = z.OPENED;
        if (zVar == zVar2) {
            B();
        } else {
            int ordinal = this.f123400e.ordinal();
            if (ordinal == 2 || ordinal == 3) {
                I(false);
            } else if (ordinal != 4) {
                t("open() ignored due to being in state: " + this.f123400e, null);
            } else {
                E(z.REOPENING);
                if (!this.f123409n.isEmpty() && !this.f123417v && this.f123407l == 0) {
                    com.bumptech.glide.d.v("Camera Device should be open if session close is not complete", this.f123406k != null);
                    E(zVar2);
                    B();
                }
            }
        }
        if (rational != null) {
            this.f123403h.f123552h.getClass();
        }
    }

    public final void I(boolean z13) {
        t("Attempting to force open the camera.", null);
        if (this.f123413r.d(this)) {
            A(z13);
        } else {
            t("No cameras available. Waiting for available camera before opening camera.", null);
            E(z.PENDING_OPEN);
        }
    }

    public final void J(boolean z13) {
        t("Attempting to open the camera.", null);
        if (this.f123411p.f123712b && this.f123413r.d(this)) {
            A(z13);
        } else {
            t("No cameras available. Waiting for available camera before opening camera.", null);
            E(z.PENDING_OPEN);
        }
    }

    public final void K() {
        androidx.camera.core.impl.x2 x2Var = this.f123396a;
        x2Var.getClass();
        androidx.camera.core.impl.n2 n2Var = new androidx.camera.core.impl.n2();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : x2Var.f16995b.entrySet()) {
            androidx.camera.core.impl.w2 w2Var = (androidx.camera.core.impl.w2) entry.getValue();
            if (w2Var.f16989f && w2Var.f16988e) {
                String str = (String) entry.getKey();
                n2Var.a(w2Var.f16984a);
                arrayList.add(str);
            }
        }
        kh2.m0.p("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + x2Var.f16994a);
        boolean z13 = n2Var.f16926l && n2Var.f16925k;
        n nVar = this.f123403h;
        if (!z13) {
            nVar.f123568x = 1;
            nVar.f123552h.f123470d = 1;
            nVar.f123558n.f123384a = 1;
            this.f123408m.l(nVar.q());
            return;
        }
        int i13 = n2Var.b().f16937g.f16969c;
        nVar.f123568x = i13;
        nVar.f123552h.f123470d = i13;
        nVar.f123558n.f123384a = i13;
        n2Var.a(nVar.q());
        this.f123408m.l(n2Var.b());
    }

    public final void L() {
        Iterator it = this.f123396a.d().iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            z13 |= ((Boolean) ((androidx.camera.core.impl.z2) it.next()).j(androidx.camera.core.impl.z2.f17022tn, Boolean.FALSE)).booleanValue();
        }
        this.f123403h.f123556l.f123480c = z13;
    }

    @Override // c0.r1
    public final void b(c0.s1 s1Var) {
        s1Var.getClass();
        this.f123398c.execute(new r(this, x(s1Var), this.f123418w ? s1Var.f24346m : s1Var.f24347n, s1Var.f24339f, s1Var.f24340g, s1Var.c() == null ? null : p0.d.F(s1Var), 1));
    }

    @Override // c0.r1
    public final void c(c0.s1 s1Var) {
        this.f123398c.execute(new r(this, x(s1Var), this.f123418w ? s1Var.f24346m : s1Var.f24347n, s1Var.f24339f, s1Var.f24340g, s1Var.c() == null ? null : p0.d.F(s1Var), 0));
    }

    @Override // androidx.camera.core.impl.j0
    public final androidx.camera.core.impl.g0 d() {
        return this.f123403h;
    }

    @Override // androidx.camera.core.impl.j0
    public final androidx.camera.core.impl.a0 e() {
        return this.B;
    }

    @Override // androidx.camera.core.impl.j0
    public final void f(boolean z13) {
        this.f123398c.execute(new s(this, z13, 0));
    }

    @Override // androidx.camera.core.impl.j0
    public final androidx.camera.core.impl.h0 g() {
        return this.f123405j;
    }

    @Override // c0.r1
    public final void h(c0.s1 s1Var) {
        s1Var.getClass();
        this.f123398c.execute(new r(this, x(s1Var), this.f123418w ? s1Var.f24346m : s1Var.f24347n, s1Var.f24339f, s1Var.f24340g, s1Var.c() == null ? null : p0.d.F(s1Var), 2));
    }

    @Override // androidx.camera.core.impl.j0
    public final void i(androidx.camera.core.impl.a0 a0Var) {
        if (a0Var == null) {
            a0Var = androidx.camera.core.impl.d0.f16820a;
        }
        a0Var.p();
        this.B = a0Var;
        synchronized (this.C) {
        }
    }

    @Override // androidx.camera.core.impl.j0
    public final androidx.camera.core.impl.u1 j() {
        return this.f123401f;
    }

    @Override // androidx.camera.core.impl.j0
    public final void k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(G(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            c0.s1 s1Var = (c0.s1) it.next();
            String x13 = x(s1Var);
            HashSet hashSet = this.A;
            if (hashSet.contains(x13)) {
                s1Var.u();
                hashSet.remove(x13);
            }
        }
        this.f123398c.execute(new q(this, arrayList3, 1));
    }

    @Override // androidx.camera.core.impl.j0
    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        n nVar = this.f123403h;
        synchronized (nVar.f123548d) {
            nVar.f123560p++;
        }
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            c0.s1 s1Var = (c0.s1) it.next();
            String x13 = x(s1Var);
            HashSet hashSet = this.A;
            if (!hashSet.contains(x13)) {
                hashSet.add(x13);
                s1Var.t();
                s1Var.r();
            }
        }
        try {
            this.f123398c.execute(new q(this, new ArrayList(G(arrayList2)), 0));
        } catch (RejectedExecutionException e13) {
            t("Unable to attach use cases.", e13);
            nVar.o();
        }
    }

    @Override // androidx.camera.core.impl.j0
    public final void n(boolean z13) {
        this.f123418w = z13;
    }

    @Override // c0.r1
    public final void o(c0.s1 s1Var) {
        s1Var.getClass();
        this.f123398c.execute(new jg(7, this, x(s1Var)));
    }

    public final void p() {
        androidx.camera.core.impl.x2 x2Var = this.f123396a;
        androidx.camera.core.impl.o2 b13 = x2Var.b().b();
        androidx.camera.core.impl.s0 s0Var = b13.f16937g;
        int size = Collections.unmodifiableList(s0Var.f16967a).size();
        int size2 = b13.b().size();
        if (b13.b().isEmpty()) {
            return;
        }
        int i13 = 2;
        if (!Collections.unmodifiableList(s0Var.f16967a).isEmpty()) {
            if (size2 == 1 && size == 1) {
                C();
                return;
            }
            if (size >= 2) {
                C();
                return;
            }
            if (this.f123419x != null && !y()) {
                C();
                return;
            }
            kh2.m0.p("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            return;
        }
        if (this.f123419x == null) {
            this.f123419x = new m2(this.f123405j.f123490b, this.E, new p(this, i13));
        }
        if (!y()) {
            kh2.m0.s("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        m2 m2Var = this.f123419x;
        if (m2Var != null) {
            String w13 = w(m2Var);
            m2 m2Var2 = this.f123419x;
            androidx.camera.core.impl.o2 o2Var = m2Var2.f123541b;
            androidx.camera.core.impl.b3 b3Var = androidx.camera.core.impl.b3.METERING_REPEATING;
            List singletonList = Collections.singletonList(b3Var);
            androidx.camera.core.impl.w2 w2Var = (androidx.camera.core.impl.w2) x2Var.f16995b.get(w13);
            l2 l2Var = m2Var2.f123542c;
            if (w2Var == null) {
                w2Var = new androidx.camera.core.impl.w2(o2Var, l2Var, null, singletonList);
                x2Var.f16995b.put(w13, w2Var);
            }
            w2Var.f16988e = true;
            x2Var.g(w13, o2Var, l2Var, null, singletonList);
            m2 m2Var3 = this.f123419x;
            androidx.camera.core.impl.o2 o2Var2 = m2Var3.f123541b;
            List singletonList2 = Collections.singletonList(b3Var);
            androidx.camera.core.impl.w2 w2Var2 = (androidx.camera.core.impl.w2) x2Var.f16995b.get(w13);
            if (w2Var2 == null) {
                w2Var2 = new androidx.camera.core.impl.w2(o2Var2, m2Var3.f123542c, null, singletonList2);
                x2Var.f16995b.put(w13, w2Var2);
            }
            w2Var2.f16989f = true;
        }
    }

    public final void q() {
        ArrayList<androidx.camera.core.impl.s0> arrayList;
        com.bumptech.glide.d.v("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f123400e + " (error: " + v(this.f123407l) + ")", this.f123400e == z.CLOSING || this.f123400e == z.RELEASING || (this.f123400e == z.REOPENING && this.f123407l != 0));
        D();
        t1 t1Var = this.f123408m;
        synchronized (t1Var.f123661a) {
            try {
                if (t1Var.f123662b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(t1Var.f123662b);
                    t1Var.f123662b.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.s0 s0Var : arrayList) {
                Iterator it = s0Var.f16971e.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.impl.n) it.next()).a(s0Var.a());
                }
            }
        }
    }

    public final void r() {
        int i13 = 1;
        com.bumptech.glide.d.v(null, this.f123400e == z.RELEASING || this.f123400e == z.CLOSING);
        com.bumptech.glide.d.v(null, this.f123409n.isEmpty());
        if (!this.f123416u) {
            u();
            return;
        }
        if (this.f123417v) {
            t("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.f123411p.f123712b) {
            this.f123416u = false;
            u();
            t("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            t("Open camera to configAndClose", null);
            r4.l L = com.bumptech.glide.d.L(new p(this, i13));
            this.f123417v = true;
            L.f106128b.d(new ig(this, 5), this.f123398c);
        }
    }

    public final CameraDevice.StateCallback s() {
        ArrayList arrayList = new ArrayList(this.f123396a.b().b().f16933c);
        arrayList.add((CameraDevice.StateCallback) this.f123420y.f123721f);
        arrayList.add(this.f123404i);
        return kh2.g3.K(arrayList);
    }

    public final void t(String str, Throwable th3) {
        String c13 = t3.s1.c("{", toString(), "} ", str);
        if (kh2.m0.G0(3, "Camera2CameraImpl")) {
            Log.d("Camera2CameraImpl", c13, th3);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f123405j.f123489a);
    }

    public final void u() {
        com.bumptech.glide.d.v(null, this.f123400e == z.RELEASING || this.f123400e == z.CLOSING);
        com.bumptech.glide.d.v(null, this.f123409n.isEmpty());
        this.f123406k = null;
        if (this.f123400e == z.CLOSING) {
            E(z.INITIALIZED);
            return;
        }
        this.f123397b.f126943a.B(this.f123411p);
        E(z.RELEASED);
    }

    public final boolean y() {
        int i13;
        ArrayList arrayList = new ArrayList();
        synchronized (this.C) {
            try {
                i13 = this.f123412q.f202a == 2 ? 1 : 0;
            } finally {
            }
        }
        androidx.camera.core.impl.x2 x2Var = this.f123396a;
        x2Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : x2Var.f16995b.entrySet()) {
            if (((androidx.camera.core.impl.w2) entry.getValue()).f16988e) {
                arrayList2.add((androidx.camera.core.impl.w2) entry.getValue());
            }
        }
        for (androidx.camera.core.impl.w2 w2Var : Collections.unmodifiableCollection(arrayList2)) {
            List list = w2Var.f16987d;
            if (list == null || list.get(0) != androidx.camera.core.impl.b3.METERING_REPEATING) {
                if (w2Var.f16986c == null || w2Var.f16987d == null) {
                    kh2.m0.X0("Camera2CameraImpl", "Invalid stream spec or capture types in " + w2Var);
                    return false;
                }
                androidx.camera.core.impl.o2 o2Var = w2Var.f16984a;
                androidx.camera.core.impl.z2 z2Var = w2Var.f16985b;
                for (androidx.camera.core.impl.z0 z0Var : o2Var.b()) {
                    r2 r2Var = this.G;
                    int l13 = z2Var.l();
                    androidx.camera.core.impl.l c13 = androidx.camera.core.impl.l.c(i13, l13, z0Var.f17012h, r2Var.i(l13));
                    int l14 = z2Var.l();
                    Size size = z0Var.f17012h;
                    androidx.camera.core.impl.k kVar = w2Var.f16986c;
                    arrayList.add(new androidx.camera.core.impl.a(c13, l14, size, kVar.f16894b, w2Var.f16987d, kVar.f16896d, (Range) z2Var.j(androidx.camera.core.impl.z2.f17021sn, null)));
                }
            }
        }
        this.f123419x.getClass();
        HashMap hashMap = new HashMap();
        m2 m2Var = this.f123419x;
        hashMap.put(m2Var.f123542c, Collections.singletonList(m2Var.f123543d));
        try {
            this.G.g(i13, arrayList, hashMap, false, false);
            t("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e13) {
            t("Surface combination with metering repeating  not supported!", e13);
            return false;
        }
    }

    public final t1 z() {
        t1 t1Var;
        synchronized (this.C) {
            t1Var = new t1(this.F, this.f123405j.f123497i);
        }
        return t1Var;
    }
}
