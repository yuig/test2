package t3;

import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f115832a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f115833b;

    /* renamed from: c, reason: collision with root package name */
    public b3.m0 f115834c;

    /* renamed from: d, reason: collision with root package name */
    public b3.k f115835d;

    /* renamed from: e, reason: collision with root package name */
    public b3.o0 f115836e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f115837f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f115838g;

    /* renamed from: h, reason: collision with root package name */
    public b3.o0 f115839h;

    /* renamed from: i, reason: collision with root package name */
    public a3.e f115840i;

    /* renamed from: j, reason: collision with root package name */
    public float f115841j;

    /* renamed from: k, reason: collision with root package name */
    public long f115842k;

    /* renamed from: l, reason: collision with root package name */
    public long f115843l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f115844m;

    public a3() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f115833b = outline;
        this.f115842k = 0L;
        this.f115843l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (a3.a.b(r5.f492e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(b3.u r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.h()
            b3.o0 r2 = r0.f115836e
            r3 = 1
            if (r2 == 0) goto L11
            r1.d(r2, r3)
            goto Lf2
        L11:
            float r2 = r0.f115841j
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lc6
            b3.o0 r4 = r0.f115839h
            a3.e r5 = r0.f115840i
            if (r4 == 0) goto L68
            long r6 = r0.f115842k
            long r8 = r0.f115843l
            if (r5 == 0) goto L68
            boolean r10 = bf.b.V(r5)
            if (r10 != 0) goto L2b
            goto L68
        L2b:
            float r10 = a3.c.d(r6)
            float r11 = r5.f488a
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = a3.c.e(r6)
            float r11 = r5.f489b
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = a3.c.d(r6)
            float r11 = a3.f.d(r8)
            float r11 = r11 + r10
            float r10 = r5.f490c
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L68
            float r6 = a3.c.e(r6)
            float r7 = a3.f.b(r8)
            float r7 = r7 + r6
            float r6 = r5.f491d
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L68
            long r5 = r5.f492e
            float r5 = a3.a.b(r5)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lc2
        L68:
            long r5 = r0.f115842k
            float r8 = a3.c.d(r5)
            long r5 = r0.f115842k
            float r9 = a3.c.e(r5)
            long r5 = r0.f115842k
            float r2 = a3.c.d(r5)
            long r5 = r0.f115843l
            float r5 = a3.f.d(r5)
            float r10 = r5 + r2
            long r5 = r0.f115842k
            float r2 = a3.c.e(r5)
            long r5 = r0.f115843l
            float r5 = a3.f.b(r5)
            float r11 = r5 + r2
            float r2 = r0.f115841j
            long r5 = lb.l0.c(r2, r2)
            float r2 = a3.a.b(r5)
            float r5 = a3.a.c(r5)
            long r18 = lb.l0.c(r2, r5)
            a3.e r2 = new a3.e
            r7 = r2
            r12 = r18
            r14 = r18
            r16 = r18
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18)
            if (r4 != 0) goto Lb5
            b3.k r4 = androidx.compose.ui.graphics.a.h()
            goto Lbb
        Lb5:
            r5 = r4
            b3.k r5 = (b3.k) r5
            r5.h()
        Lbb:
            b3.o0.b(r4, r2)
            r0.f115840i = r2
            r0.f115839h = r4
        Lc2:
            r1.d(r4, r3)
            goto Lf2
        Lc6:
            long r2 = r0.f115842k
            float r2 = a3.c.d(r2)
            long r3 = r0.f115842k
            float r3 = a3.c.e(r3)
            long r4 = r0.f115842k
            float r4 = a3.c.d(r4)
            long r5 = r0.f115843l
            float r5 = a3.f.d(r5)
            float r4 = r4 + r5
            long r5 = r0.f115842k
            float r5 = a3.c.e(r5)
            long r6 = r0.f115843l
            float r6 = a3.f.b(r6)
            float r5 = r5 + r6
            r6 = 1
            r1 = r21
            r1.e(r2, r3, r4, r5, r6)
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.a3.a(b3.u):void");
    }

    public final Outline b() {
        h();
        if (this.f115844m && this.f115832a) {
            return this.f115833b;
        }
        return null;
    }

    public final boolean c() {
        return this.f115837f;
    }

    public final b3.o0 d() {
        h();
        return this.f115836e;
    }

    public final boolean e() {
        return !this.f115838g;
    }

    public final boolean f(long j13) {
        b3.m0 m0Var;
        if (this.f115844m && (m0Var = this.f115834c) != null) {
            return androidx.compose.ui.platform.a.e(m0Var, a3.c.d(j13), a3.c.e(j13), null, null);
        }
        return true;
    }

    public final boolean g(b3.m0 m0Var, float f13, boolean z13, float f14, long j13) {
        this.f115833b.setAlpha(f13);
        boolean z14 = !Intrinsics.d(this.f115834c, m0Var);
        if (z14) {
            this.f115834c = m0Var;
            this.f115837f = true;
        }
        this.f115843l = j13;
        boolean z15 = m0Var != null && (z13 || f14 > 0.0f);
        if (this.f115844m != z15) {
            this.f115844m = z15;
            this.f115837f = true;
        }
        return z14;
    }

    public final void h() {
        if (this.f115837f) {
            this.f115842k = 0L;
            this.f115841j = 0.0f;
            this.f115836e = null;
            this.f115837f = false;
            this.f115838g = false;
            b3.m0 m0Var = this.f115834c;
            Outline outline = this.f115833b;
            if (m0Var == null || !this.f115844m || a3.f.d(this.f115843l) <= 0.0f || a3.f.b(this.f115843l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f115832a = true;
            if (m0Var instanceof b3.k0) {
                a3.d dVar = ((b3.k0) m0Var).f21338a;
                float f13 = dVar.f484a;
                float f14 = dVar.f485b;
                this.f115842k = com.bumptech.glide.c.d(f13, f14);
                this.f115843l = bs1.c.c(dVar.d(), dVar.c());
                outline.setRect(Math.round(dVar.f484a), Math.round(f14), Math.round(dVar.f486c), Math.round(dVar.f487d));
                return;
            }
            if (!(m0Var instanceof b3.l0)) {
                if (m0Var instanceof b3.j0) {
                    i(((b3.j0) m0Var).f21333a);
                    return;
                }
                return;
            }
            a3.e eVar = ((b3.l0) m0Var).f21340a;
            float b13 = a3.a.b(eVar.f492e);
            float f15 = eVar.f488a;
            float f16 = eVar.f489b;
            this.f115842k = com.bumptech.glide.c.d(f15, f16);
            this.f115843l = bs1.c.c(eVar.b(), eVar.a());
            if (bf.b.V(eVar)) {
                this.f115833b.setRoundRect(Math.round(f15), Math.round(f16), Math.round(eVar.f490c), Math.round(eVar.f491d), b13);
                this.f115841j = b13;
                return;
            }
            b3.k kVar = this.f115835d;
            if (kVar == null) {
                kVar = androidx.compose.ui.graphics.a.h();
                this.f115835d = kVar;
            }
            kVar.h();
            b3.o0.b(kVar, eVar);
            i(kVar);
        }
    }

    public final void i(b3.o0 o0Var) {
        int i13 = Build.VERSION.SDK_INT;
        Outline outline = this.f115833b;
        if (i13 <= 28 && !((b3.k) o0Var).f21334a.isConvex()) {
            this.f115832a = false;
            outline.setEmpty();
            this.f115838g = true;
        } else {
            if (!(o0Var instanceof b3.k)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((b3.k) o0Var).f21334a);
            this.f115838g = !outline.canClip();
        }
        this.f115836e = o0Var;
    }
}
