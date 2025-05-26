package r0;

import a.ig;
import a.o3;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.appcompat.widget.c2;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.u1;
import androidx.camera.core.impl.v2;
import androidx.camera.core.impl.y2;
import androidx.camera.core.impl.z2;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import c0.p1;
import c0.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class v0 extends s1 {
    public static final t0 C = new t0();
    public j2 A;
    public final a0 B;

    /* renamed from: o, reason: collision with root package name */
    public androidx.camera.core.impl.z0 f105658o;

    /* renamed from: p, reason: collision with root package name */
    public l0.s f105659p;

    /* renamed from: q, reason: collision with root package name */
    public k f105660q;

    /* renamed from: r, reason: collision with root package name */
    public i2 f105661r;

    /* renamed from: s, reason: collision with root package name */
    public r4.l f105662s;

    /* renamed from: t, reason: collision with root package name */
    public p1 f105663t;

    /* renamed from: u, reason: collision with root package name */
    public b1 f105664u;

    /* renamed from: v, reason: collision with root package name */
    public m.h f105665v;

    /* renamed from: w, reason: collision with root package name */
    public Rect f105666w;

    /* renamed from: x, reason: collision with root package name */
    public int f105667x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f105668y;

    /* renamed from: z, reason: collision with root package name */
    public u0 f105669z;

    public v0(s0.a aVar) {
        super(aVar);
        this.f105660q = k.f105586d;
        this.f105661r = new i2();
        this.f105662s = null;
        this.f105664u = b1.INACTIVE;
        this.f105668y = false;
        this.B = new a0(this, 1);
    }

    public static void B(HashSet hashSet, int i13, int i14, Size size, y0.f0 f0Var) {
        if (i13 > size.getWidth() || i14 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i13, ((Integer) f0Var.h(i13).clamp(Integer.valueOf(i14))).intValue()));
        } catch (IllegalArgumentException e13) {
            kh2.m0.Y0("VideoCapture", "No supportedHeights for width: " + i13, e13);
        }
        try {
            hashSet.add(new Size(((Integer) f0Var.b(i14).clamp(Integer.valueOf(i13))).intValue(), i14));
        } catch (IllegalArgumentException e14) {
            kh2.m0.Y0("VideoCapture", "No supportedWidths for height: " + i14, e14);
        }
    }

    public static int C(boolean z13, int i13, int i14, Range range) {
        int i15 = i13 % i14;
        if (i15 != 0) {
            i13 = z13 ? i13 - i15 : i13 + (i14 - i15);
        }
        return ((Integer) range.clamp(Integer.valueOf(i13))).intValue();
    }

    public static y0.f0 K(Range range, Size size, q.a aVar, c0.z zVar, e eVar, t0.a aVar2) {
        y0.f0 f0Var = (y0.f0) aVar.apply(x0.b.b(x0.b.c(eVar, zVar, aVar2), v2.UPTIME, eVar.f105509a, size, zVar, range));
        Size size2 = null;
        if (f0Var == null) {
            kh2.m0.X0("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        if (aVar2 != null) {
            androidx.camera.core.impl.f fVar = aVar2.f115661f;
            size2 = new Size(fVar.f16832e, fVar.f16833f);
        }
        return a1.b.k(size2, f0Var);
    }

    public final void D(i2 i2Var, k kVar, androidx.camera.core.impl.k kVar2) {
        androidx.camera.core.impl.z0 z0Var;
        boolean z13 = kVar.f105589a == -1;
        boolean z14 = kVar.f105590b == m0.ACTIVE;
        if (z13 && z14) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        i2Var.f16862a.clear();
        ((Set) i2Var.f16863b.f123387d).clear();
        c0.z zVar = kVar2.f16894b;
        if (!z13 && (z0Var = this.f105658o) != null) {
            if (z14) {
                i2Var.b(z0Var, zVar, -1);
            } else {
                c2 a13 = androidx.camera.core.impl.h.a(z0Var);
                if (zVar == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                a13.f16536g = zVar;
                i2Var.f16862a.add(a13.b());
            }
        }
        r4.l lVar = this.f105662s;
        if (lVar != null && lVar.cancel(false)) {
            kh2.m0.p("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        r4.l L = com.bumptech.glide.d.L(new o3(12, this, i2Var));
        this.f105662s = L;
        g0.m.a(L, new r0(this, L, z14), l3.c.H0());
    }

    public final void E() {
        f0.h.s();
        j2 j2Var = this.A;
        if (j2Var != null) {
            j2Var.b();
            this.A = null;
        }
        androidx.camera.core.impl.z0 z0Var = this.f105658o;
        if (z0Var != null) {
            z0Var.a();
            this.f105658o = null;
        }
        m.h hVar = this.f105665v;
        if (hVar != null) {
            hVar.H();
            this.f105665v = null;
        }
        l0.s sVar = this.f105659p;
        if (sVar != null) {
            sVar.c();
            this.f105659p = null;
        }
        this.f105666w = null;
        this.f105663t = null;
        this.f105660q = k.f105586d;
        this.f105667x = 0;
        this.f105668y = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i2 F(s0.a aVar, androidx.camera.core.impl.k kVar) {
        Object obj;
        ig igVar;
        Range range;
        int i13;
        Rect rect;
        Size size;
        m.h hVar;
        f0.h.s();
        androidx.camera.core.impl.j0 c13 = c();
        c13.getClass();
        Size size2 = kVar.f16893a;
        ig igVar2 = new ig(this, 27);
        Range range2 = kVar.f16895c;
        if (Objects.equals(range2, androidx.camera.core.impl.k.f16892f)) {
            range2 = t0.f105647b;
        }
        Range range3 = range2;
        com.google.common.util.concurrent.c0 c14 = H().b().c();
        if (c14.isDone()) {
            try {
                obj = c14.get();
            } catch (InterruptedException | ExecutionException e13) {
                throw new IllegalStateException(e13);
            }
        } else {
            obj = null;
        }
        e eVar = (e) obj;
        Objects.requireNonNull(eVar);
        o0 e14 = H().e(c13.g());
        c0.z zVar = kVar.f16894b;
        t0.a b13 = e14.b(size2, zVar);
        q.a aVar2 = (q.a) aVar.f(s0.a.f110290c);
        Objects.requireNonNull(aVar2);
        y0.f0 K = K(range3, size2, aVar2, zVar, eVar, b13);
        this.f105667x = G(c13);
        Rect rect2 = this.f24342i;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        if (K == null || K.e(rect2.width(), rect2.height())) {
            igVar = igVar2;
            range = range3;
        } else {
            kh2.m0.p("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", e0.u.f(rect2), Integer.valueOf(K.f()), Integer.valueOf(K.c()), K.i(), K.j()));
            y0.f0 e0Var = (!(K.i().contains((Range) Integer.valueOf(rect2.width())) && K.j().contains((Range) Integer.valueOf(rect2.height()))) && K.a() && K.j().contains((Range) Integer.valueOf(rect2.width())) && K.i().contains((Range) Integer.valueOf(rect2.height()))) ? new y0.e0(K) : K;
            int f13 = e0Var.f();
            int c15 = e0Var.c();
            Range i14 = e0Var.i();
            Range j13 = e0Var.j();
            igVar = igVar2;
            int C2 = C(true, rect2.width(), f13, i14);
            range = range3;
            int C3 = C(false, rect2.width(), f13, i14);
            int C4 = C(true, rect2.height(), c15, j13);
            int C5 = C(false, rect2.height(), c15, j13);
            HashSet hashSet = new HashSet();
            B(hashSet, C2, C4, size2, e0Var);
            B(hashSet, C2, C5, size2, e0Var);
            B(hashSet, C3, C4, size2, e0Var);
            B(hashSet, C3, C5, size2, e0Var);
            if (hashSet.isEmpty()) {
                kh2.m0.X0("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                kh2.m0.p("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new j0.a(rect2, 1));
                kh2.m0.p("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size3 = (Size) arrayList.get(0);
                int width = size3.getWidth();
                int height = size3.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    kh2.m0.p("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    com.bumptech.glide.d.v(null, width % 2 == 0 && height % 2 == 0 && width <= size2.getWidth() && height <= size2.getHeight());
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        int max = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.left = max;
                        int i15 = max + width;
                        rect3.right = i15;
                        if (i15 > size2.getWidth()) {
                            int width2 = size2.getWidth();
                            rect3.right = width2;
                            rect3.left = width2 - width;
                        }
                    }
                    if (height != rect2.height()) {
                        int max2 = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.top = max2;
                        int i16 = max2 + height;
                        rect3.bottom = i16;
                        if (i16 > size2.getHeight()) {
                            int height2 = size2.getHeight();
                            rect3.bottom = height2;
                            rect3.top = height2 - height;
                        }
                    }
                    kh2.m0.p("VideoCapture", "Adjust cropRect from " + e0.u.f(rect2) + " to " + e0.u.f(rect3));
                    rect2 = rect3;
                }
            }
        }
        int i17 = this.f105667x;
        c0.k kVar2 = this.f105660q.f105591c;
        if (kVar2 != null) {
            kVar2.getClass();
            Size g13 = e0.u.g(i17, e0.u.e(kVar2.f24271a));
            i13 = 0;
            rect = new Rect(0, 0, g13.getWidth(), g13.getHeight());
        } else {
            i13 = 0;
            rect = rect2;
        }
        this.f105666w = rect;
        if (this.f105660q.f105591c == null || rect.equals(rect2)) {
            size = size2;
        } else {
            float height3 = rect.height() / rect2.height();
            size = new Size((int) Math.ceil(size2.getWidth() * height3), (int) Math.ceil(size2.getHeight() * height3));
        }
        if (this.f105660q.f105591c != null) {
            this.f105668y = true;
        }
        Rect rect4 = this.f105666w;
        int i18 = this.f105667x;
        boolean I = I(c13, aVar, rect4, size2);
        if (((SizeCannotEncodeVideoQuirk) w0.a.f126951a.b(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!I) {
                i18 = i13;
            }
            Size g14 = e0.u.g(i18, e0.u.e(rect4));
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.emptySet()).contains(g14)) {
                int c16 = K != null ? K.c() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == g14.getHeight()) {
                    rect5.left += c16;
                    rect5.right -= c16;
                } else {
                    rect5.top += c16;
                    rect5.bottom -= c16;
                }
                rect4 = rect5;
            }
        }
        this.f105666w = rect4;
        if (I(c13, aVar, rect4, size2)) {
            kh2.m0.p("VideoCapture", "Surface processing is enabled.");
            androidx.camera.core.impl.j0 c17 = c();
            Objects.requireNonNull(c17);
            hVar = new m.h(c17, new l0.i(zVar));
        } else {
            hVar = null;
        }
        this.f105665v = hVar;
        v2 m13 = (hVar == null && c13.m()) ? v2.UPTIME : c13.g().m();
        kh2.m0.p("VideoCapture", "camera timebase = " + c13.g().m() + ", processing timebase = " + m13);
        androidx.camera.core.impl.j a13 = kVar.a();
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        a13.f16875b = size;
        if (range == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        a13.f16877d = range;
        androidx.camera.core.impl.k b14 = a13.b();
        com.bumptech.glide.d.v(null, this.f105659p == null ? 1 : i13);
        l0.s sVar = new l0.s(2, 34, b14, this.f24343j, c13.m(), this.f105666w, this.f105667x, b(), (c13.m() && l(c13)) ? 1 : i13);
        this.f105659p = sVar;
        sVar.a(igVar);
        if (this.f105665v != null) {
            l0.s sVar2 = this.f105659p;
            int i19 = sVar2.f81272f;
            int i23 = sVar2.f81275i;
            Rect rect6 = sVar2.f81270d;
            n0.c cVar = new n0.c(UUID.randomUUID(), i19, sVar2.f81267a, rect6, e0.u.g(i23, e0.u.e(rect6)), sVar2.f81275i, sVar2.f81271e);
            l0.s sVar3 = (l0.s) this.f105665v.M(new l0.c(this.f105659p, Collections.singletonList(cVar))).get(cVar);
            Objects.requireNonNull(sVar3);
            sVar3.a(new p0(this, sVar3, c13, aVar, m13, 0));
            this.f105663t = sVar3.d(c13, true);
            l0.s sVar4 = this.f105659p;
            sVar4.getClass();
            f0.h.s();
            sVar4.b();
            com.bumptech.glide.d.v("Consumer can only be linked once.", !sVar4.f81276j);
            sVar4.f81276j = true;
            l0.r rVar = sVar4.f81278l;
            this.f105658o = rVar;
            g0.m.f(rVar.f17009e).d(new l0.e(9, this, rVar), l3.c.H0());
        } else {
            p1 d2 = this.f105659p.d(c13, true);
            this.f105663t = d2;
            this.f105658o = d2.f24310l;
        }
        c1 c1Var = (c1) aVar.f(s0.a.f110289b);
        Objects.requireNonNull(c1Var);
        c1Var.a(this.f105663t, m13);
        L();
        this.f105658o.f17014j = MediaCodec.class;
        i2 d13 = i2.d(kVar.f16893a, aVar);
        Range range4 = kVar.f16895c;
        v.c1 c1Var2 = d13.f16863b;
        c1Var2.getClass();
        ((q1) ((androidx.camera.core.impl.p1) c1Var2.f123388e)).s(androidx.camera.core.impl.s0.f16966k, range4);
        int o13 = aVar.o();
        if (o13 != 0) {
            v.c1 c1Var3 = d13.f16863b;
            c1Var3.getClass();
            if (o13 != 0) {
                ((q1) ((androidx.camera.core.impl.p1) c1Var3.f123388e)).s(z2.f17026xn, Integer.valueOf(o13));
            }
        }
        j2 j2Var = this.A;
        if (j2Var != null) {
            j2Var.b();
        }
        j2 j2Var2 = new j2(new v.i2(this, 4));
        this.A = j2Var2;
        d13.f16867f = j2Var2;
        androidx.camera.core.impl.v0 v0Var = kVar.f16896d;
        if (v0Var != null) {
            d13.f16863b.c(v0Var);
        }
        return d13;
    }

    public final int G(androidx.camera.core.impl.j0 j0Var) {
        boolean l13 = l(j0Var);
        int h10 = h(j0Var, l13);
        c0.k kVar = this.f105660q.f105591c;
        if (kVar == null) {
            return h10;
        }
        Objects.requireNonNull(kVar);
        boolean z13 = kVar.f24276f;
        int i13 = kVar.f24272b;
        if (l13 != z13) {
            i13 = -i13;
        }
        return e0.u.h(h10 - i13);
    }

    public final c1 H() {
        c1 c1Var = (c1) ((s0.a) this.f24339f).f(s0.a.f110289b);
        Objects.requireNonNull(c1Var);
        return c1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4.booleanValue() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(androidx.camera.core.impl.j0 r3, s0.a r4, android.graphics.Rect r5, android.util.Size r6) {
        /*
            r2 = this;
            boolean r0 = r3.m()
            if (r0 == 0) goto L1a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.c r1 = s0.a.f110291d
            java.lang.Object r4 = r4.j(r1, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1a
            goto L62
        L1a:
            boolean r4 = r3.m()
            if (r4 == 0) goto L37
            androidx.camera.core.impl.r r4 = w0.a.f126951a
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.c(r4)
            if (r4 != 0) goto L62
            androidx.camera.core.impl.h0 r4 = r3.g()
            androidx.camera.core.impl.r r4 = r4.g()
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.c(r4)
            if (r4 == 0) goto L37
            goto L62
        L37:
            int r4 = r6.getWidth()
            int r0 = r5.width()
            if (r4 != r0) goto L62
            int r4 = r6.getHeight()
            int r5 = r5.height()
            if (r4 == r5) goto L4c
            goto L62
        L4c:
            boolean r4 = r3.m()
            if (r4 == 0) goto L59
            boolean r3 = r2.l(r3)
            if (r3 == 0) goto L59
            goto L62
        L59:
            r0.k r3 = r2.f105660q
            c0.k r3 = r3.f105591c
            if (r3 == 0) goto L60
            goto L62
        L60:
            r3 = 0
            goto L63
        L62:
            r3 = 1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.v0.I(androidx.camera.core.impl.j0, s0.a, android.graphics.Rect, android.util.Size):boolean");
    }

    public final void J() {
        if (c() == null) {
            return;
        }
        E();
        s0.a aVar = (s0.a) this.f24339f;
        androidx.camera.core.impl.k kVar = this.f24340g;
        kVar.getClass();
        i2 F = F(aVar, kVar);
        this.f105661r = F;
        D(F, this.f105660q, this.f24340g);
        Object[] objArr = {this.f105661r.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        o();
    }

    public final void L() {
        androidx.camera.core.impl.j0 c13 = c();
        l0.s sVar = this.f105659p;
        if (c13 == null || sVar == null) {
            return;
        }
        int G = G(c13);
        this.f105667x = G;
        f0.h.m0(new l0.p(sVar, G, b(), 0));
    }

    @Override // c0.s1
    public final z2 f(boolean z13, c3 c3Var) {
        C.getClass();
        s0.a aVar = t0.f105646a;
        androidx.camera.core.impl.v0 a13 = c3Var.a(aVar.A(), 1);
        if (z13) {
            a13 = androidx.camera.core.impl.v0.B(a13, aVar);
        }
        if (a13 == null) {
            return null;
        }
        return k(a13).e();
    }

    @Override // c0.s1
    public final HashSet j() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // c0.s1
    public final u.a k(androidx.camera.core.impl.v0 v0Var) {
        return new u.a(q1.k(v0Var), 6);
    }

    @Override // c0.s1
    public final z2 s(androidx.camera.core.impl.h0 h0Var, y2 y2Var) {
        Object obj;
        e eVar;
        m mVar;
        ArrayList arrayList;
        t0.a b13;
        y0.f0 f0Var;
        int i13;
        t0.a aVar;
        com.google.common.util.concurrent.c0 c13 = H().b().c();
        if (c13.isDone()) {
            try {
                obj = c13.get();
            } catch (InterruptedException | ExecutionException e13) {
                throw new IllegalStateException(e13);
            }
        } else {
            obj = null;
        }
        e eVar2 = (e) obj;
        com.bumptech.glide.d.g("Unable to update target resolution by null MediaSpec.", eVar2 != null);
        c0.z u13 = this.f24339f.d(androidx.camera.core.impl.i1.f16873bn) ? this.f24339f.u() : t0.f105648c;
        o0 e14 = H().e(h0Var);
        ArrayList c14 = e14.c(u13);
        if (c14.isEmpty()) {
            kh2.m0.X0("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            m mVar2 = eVar2.f105509a;
            sp2.i iVar = mVar2.f105607a;
            iVar.getClass();
            if (c14.isEmpty()) {
                kh2.m0.X0("QualitySelector", "No supported quality on the device.");
                arrayList = new ArrayList();
                eVar = eVar2;
                mVar = mVar2;
            } else {
                kh2.m0.p("QualitySelector", "supportedQualities = " + c14);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = ((List) iVar.f114928b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r rVar = (r) it.next();
                    if (rVar == r.f105634f) {
                        linkedHashSet.addAll(c14);
                        break;
                    }
                    if (rVar == r.f105633e) {
                        ArrayList arrayList2 = new ArrayList(c14);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                        break;
                    }
                    if (c14.contains(rVar)) {
                        linkedHashSet.add(rVar);
                    } else {
                        kh2.m0.X0("QualitySelector", "quality is not supported and will be ignored: " + rVar);
                    }
                }
                if (!c14.isEmpty() && !linkedHashSet.containsAll(c14)) {
                    kh2.m0.p("QualitySelector", "Select quality by fallbackStrategy = " + ((o) iVar.f114929c));
                    o oVar = (o) iVar.f114929c;
                    if (oVar != o.f105615a) {
                        com.bumptech.glide.d.v("Currently only support type RuleStrategy", oVar instanceof o);
                        o oVar2 = (o) iVar.f114929c;
                        ArrayList arrayList3 = new ArrayList(r.f105637i);
                        c cVar = (c) oVar2;
                        r rVar2 = cVar.f105494b;
                        if (rVar2 == r.f105634f) {
                            rVar2 = (r) arrayList3.get(0);
                        } else if (rVar2 == r.f105633e) {
                            rVar2 = (r) ep.b.h(arrayList3, 1);
                        }
                        int indexOf = arrayList3.indexOf(rVar2);
                        eVar = eVar2;
                        com.bumptech.glide.d.v(null, indexOf != -1);
                        ArrayList arrayList4 = new ArrayList();
                        int i14 = indexOf - 1;
                        while (i14 >= 0) {
                            m mVar3 = mVar2;
                            r rVar3 = (r) arrayList3.get(i14);
                            if (c14.contains(rVar3)) {
                                arrayList4.add(rVar3);
                            }
                            i14--;
                            mVar2 = mVar3;
                        }
                        mVar = mVar2;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i15 = indexOf + 1; i15 < arrayList3.size(); i15++) {
                            r rVar4 = (r) arrayList3.get(i15);
                            if (c14.contains(rVar4)) {
                                arrayList5.add(rVar4);
                            }
                        }
                        kh2.m0.p("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + rVar2 + ", largerQualities = " + arrayList4 + ", smallerQualities = " + arrayList5);
                        int i16 = cVar.f105495c;
                        if (i16 != 0) {
                            if (i16 != 1) {
                                throw new AssertionError("Unhandled fallback strategy: " + ((o) iVar.f114929c));
                            }
                            linkedHashSet.addAll(arrayList4);
                            linkedHashSet.addAll(arrayList5);
                        }
                        arrayList = new ArrayList(linkedHashSet);
                    }
                }
                eVar = eVar2;
                mVar = mVar2;
                arrayList = new ArrayList(linkedHashSet);
            }
            kh2.m0.p("VideoCapture", "Found selectedQualities " + arrayList + " by " + iVar);
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
            }
            HashMap hashMap = new HashMap();
            for (r rVar5 : e14.c(u13)) {
                t0.a a13 = e14.a(rVar5, u13);
                Objects.requireNonNull(a13);
                androidx.camera.core.impl.f fVar = a13.f115661f;
                hashMap.put(rVar5, new Size(fVar.f16832e, fVar.f16833f));
            }
            t tVar = new t(h0Var.h(this.f24339f.l()), hashMap);
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m mVar4 = mVar;
                List list = (List) tVar.f105645a.get(new g((r) it2.next(), mVar4.f105610d));
                arrayList6.addAll(list != null ? new ArrayList(list) : new ArrayList(0));
                mVar = mVar4;
            }
            u.a aVar2 = (u.a) y2Var;
            s0.a aVar3 = (s0.a) aVar2.e();
            if (!arrayList6.isEmpty()) {
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    Size size = (Size) it3.next();
                    if (!hashMap.containsValue(size) && (b13 = e14.b(size, u13)) != null) {
                        q.a aVar4 = (q.a) aVar3.f(s0.a.f110290c);
                        Objects.requireNonNull(aVar4);
                        Range range = (Range) aVar3.j(z2.f17021sn, t0.f105647b);
                        Objects.requireNonNull(range);
                        if (u13.b()) {
                            f0Var = K(range, size, aVar4, u13, eVar, b13);
                        } else {
                            int i17 = Integer.MIN_VALUE;
                            y0.f0 f0Var2 = null;
                            for (androidx.camera.core.impl.f fVar2 : b13.f115659d) {
                                if (z0.b.a(fVar2, u13)) {
                                    HashMap hashMap2 = z0.b.f140511d;
                                    int i18 = fVar2.f16837j;
                                    com.bumptech.glide.d.h(hashMap2.containsKey(Integer.valueOf(i18)));
                                    Integer num = (Integer) hashMap2.get(Integer.valueOf(i18));
                                    Objects.requireNonNull(num);
                                    int intValue = num.intValue();
                                    HashMap hashMap3 = z0.b.f140510c;
                                    int i19 = fVar2.f16835h;
                                    com.bumptech.glide.d.h(hashMap3.containsKey(Integer.valueOf(i19)));
                                    Integer num2 = (Integer) hashMap3.get(Integer.valueOf(i19));
                                    Objects.requireNonNull(num2);
                                    c0.z zVar = new c0.z(intValue, num2.intValue());
                                    i13 = i17;
                                    aVar = b13;
                                    y0.f0 K = K(range, size, aVar4, zVar, eVar, b13);
                                    if (K == null) {
                                        i17 = i13;
                                        b13 = aVar;
                                    } else {
                                        int intValue2 = ((Integer) K.i().getUpper()).intValue();
                                        int intValue3 = ((Integer) K.j().getUpper()).intValue();
                                        Size size2 = k0.c.f77781a;
                                        int i23 = intValue2 * intValue3;
                                        if (i23 > i13) {
                                            f0Var2 = K;
                                            i17 = i23;
                                            b13 = aVar;
                                        }
                                    }
                                } else {
                                    i13 = i17;
                                    aVar = b13;
                                }
                                i17 = i13;
                                b13 = aVar;
                            }
                            f0Var = f0Var2;
                        }
                        if (f0Var != null && !f0Var.e(size.getWidth(), size.getHeight())) {
                            it3.remove();
                        }
                    }
                }
            }
            kh2.m0.p("VideoCapture", "Set custom ordered resolutions = " + arrayList6);
            aVar2.f119717b.s(j1.f16889mn, arrayList6);
        }
        return ((u.a) y2Var).e();
    }

    @Override // c0.s1
    public final void t() {
        kh2.m0.p("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + e());
        androidx.camera.core.impl.k kVar = this.f24340g;
        if (kVar == null || this.f105663t != null) {
            return;
        }
        u1 d2 = H().d();
        Object obj = k.f105586d;
        com.google.common.util.concurrent.c0 c13 = d2.c();
        if (c13.isDone()) {
            try {
                obj = c13.get();
            } catch (InterruptedException | ExecutionException e13) {
                throw new IllegalStateException(e13);
            }
        }
        this.f105660q = (k) obj;
        i2 F = F((s0.a) this.f24339f, kVar);
        this.f105661r = F;
        D(F, this.f105660q, kVar);
        Object[] objArr = {this.f105661r.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        A(Collections.unmodifiableList(arrayList));
        n();
        H().d().a(this.B, l3.c.H0());
        u0 u0Var = this.f105669z;
        if (u0Var != null) {
            u0Var.b();
        }
        androidx.camera.core.impl.g0 d13 = d();
        u0 u0Var2 = new u0();
        u0Var2.f105652b = false;
        u0Var2.f105651a = d13;
        this.f105669z = u0Var2;
        H().f().a(this.f105669z, l3.c.H0());
        b1 b1Var = b1.ACTIVE_NON_STREAMING;
        if (b1Var != this.f105664u) {
            this.f105664u = b1Var;
            H().g(b1Var);
        }
    }

    public final String toString() {
        return "VideoCapture:".concat(g());
    }

    @Override // c0.s1
    public final void u() {
        kh2.m0.p("VideoCapture", "VideoCapture#onStateDetached");
        com.bumptech.glide.d.v("VideoCapture can only be detached on the main thread.", f0.h.b0());
        if (this.f105669z != null) {
            H().f().f(this.f105669z);
            this.f105669z.b();
            this.f105669z = null;
        }
        b1 b1Var = b1.INACTIVE;
        if (b1Var != this.f105664u) {
            this.f105664u = b1Var;
            H().g(b1Var);
        }
        H().d().f(this.B);
        r4.l lVar = this.f105662s;
        if (lVar != null && lVar.cancel(false)) {
            kh2.m0.p("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        E();
    }

    @Override // c0.s1
    public final androidx.camera.core.impl.k v(androidx.camera.core.impl.v0 v0Var) {
        this.f105661r.f16863b.c(v0Var);
        Object[] objArr = {this.f105661r.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        androidx.camera.core.impl.k kVar = this.f24340g;
        Objects.requireNonNull(kVar);
        androidx.camera.core.impl.j a13 = kVar.a();
        a13.f16878e = v0Var;
        return a13.b();
    }

    @Override // c0.s1
    public final androidx.camera.core.impl.k w(androidx.camera.core.impl.k kVar, androidx.camera.core.impl.k kVar2) {
        kh2.m0.p("VideoCapture", "onSuggestedStreamSpecUpdated: " + kVar);
        List list = (List) ((s0.a) this.f24339f).j(j1.f16889mn, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(kVar.f16893a)) {
            kh2.m0.X0("VideoCapture", "suggested resolution " + kVar.f16893a + " is not in custom ordered resolutions " + arrayList);
        }
        return kVar;
    }

    @Override // c0.s1
    public final void y(Rect rect) {
        this.f24342i = rect;
        L();
    }
}
