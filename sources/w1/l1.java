package w1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.functions.Function1;
import t3.s3;

/* loaded from: classes2.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public x1 f127355a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.e2 f127356b;

    /* renamed from: c, reason: collision with root package name */
    public final s3 f127357c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.k f127358d;

    /* renamed from: e, reason: collision with root package name */
    public h4.m0 f127359e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127360f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127361g;

    /* renamed from: h, reason: collision with root package name */
    public q3.x f127362h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127363i;

    /* renamed from: j, reason: collision with root package name */
    public b4.g f127364j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127365k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127366l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127367m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127368n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127369o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f127370p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127371q;

    /* renamed from: r, reason: collision with root package name */
    public final h1 f127372r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f127373s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f127374t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f127375u;

    /* renamed from: v, reason: collision with root package name */
    public final b3.i f127376v;

    /* renamed from: w, reason: collision with root package name */
    public long f127377w;

    /* renamed from: x, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127378x;

    /* renamed from: y, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127379y;

    public l1(x1 x1Var, i2.f2 f2Var, s3 s3Var) {
        this.f127355a = x1Var;
        this.f127356b = f2Var;
        this.f127357c = s3Var;
        h4.k kVar = new h4.k();
        b4.g gVar = b4.h.f21591a;
        long j13 = b4.p0.f21639b;
        h4.f0 f0Var = new h4.f0(gVar, j13, (b4.p0) null);
        kVar.f67570a = f0Var;
        kVar.f67571b = new h4.l(gVar, f0Var.f67560b);
        this.f127358d = kVar;
        Boolean bool = Boolean.FALSE;
        y3 y3Var = y3.f71400a;
        this.f127360f = bs1.c.u1(bool, y3Var);
        this.f127361g = bs1.c.u1(new n4.e(0), y3Var);
        this.f127363i = bs1.c.u1(null, y3Var);
        this.f127365k = bs1.c.u1(w0.None, y3Var);
        this.f127366l = bs1.c.u1(bool, y3Var);
        this.f127367m = bs1.c.u1(bool, y3Var);
        this.f127368n = bs1.c.u1(bool, y3Var);
        this.f127369o = bs1.c.u1(bool, y3Var);
        this.f127370p = true;
        this.f127371q = bs1.c.u1(Boolean.TRUE, y3Var);
        this.f127372r = new h1(s3Var);
        this.f127373s = t.f127501l;
        this.f127374t = new e0(this, 4);
        this.f127375u = new e0(this, 3);
        this.f127376v = androidx.compose.ui.graphics.a.g();
        this.f127377w = b3.w.f21390n;
        this.f127378x = bs1.c.u1(new b4.p0(j13), y3Var);
        this.f127379y = bs1.c.u1(new b4.p0(j13), y3Var);
    }

    public final w0 a() {
        return (w0) this.f127365k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f127360f.getValue()).booleanValue();
    }

    public final q3.x c() {
        q3.x xVar = this.f127362h;
        if (xVar == null || !xVar.h()) {
            return null;
        }
        return xVar;
    }

    public final r2 d() {
        return (r2) this.f127363i.getValue();
    }

    public final boolean e() {
        return (b4.p0.b(((b4.p0) this.f127378x.getValue()).f21641a) && b4.p0.b(((b4.p0) this.f127379y.getValue()).f21641a)) ? false : true;
    }

    public final void f(long j13) {
        this.f127379y.setValue(new b4.p0(j13));
    }

    public final void g(long j13) {
        this.f127378x.setValue(new b4.p0(j13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r1.f127574h != r18) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(b4.g r13, b4.g r14, b4.q0 r15, boolean r16, n4.b r17, g4.d r18, kotlin.jvm.functions.Function1 r19, w1.j1 r20, z2.j r21, long r22) {
        /*
            r12 = this;
            r0 = r12
            r1 = r19
            r0.f127373s = r1
            r1 = r22
            r0.f127377w = r1
            w1.h1 r1 = r0.f127372r
            r2 = r20
            r1.f127281b = r2
            r2 = r21
            r1.f127282c = r2
            r1 = r13
            r0.f127364j = r1
            w1.x1 r1 = r0.f127355a
            kotlin.collections.q0 r11 = kotlin.collections.q0.f80391a
            b4.g r2 = r1.f127567a
            r3 = r14
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r14)
            r8 = 1
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 1
            if (r2 == 0) goto L69
            b4.q0 r2 = r1.f127568b
            r4 = r15
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r15)
            if (r2 == 0) goto L66
            boolean r2 = r1.f127571e
            r7 = r16
            if (r2 != r7) goto L63
            int r2 = r1.f127572f
            boolean r2 = kh2.s0.B(r2, r8)
            if (r2 == 0) goto L63
            int r2 = r1.f127569c
            if (r2 != r5) goto L63
            int r2 = r1.f127570d
            if (r2 != r6) goto L63
            n4.b r2 = r1.f127573g
            r9 = r17
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r9)
            if (r2 == 0) goto L60
            java.util.List r2 = r1.f127575i
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r11)
            if (r2 == 0) goto L60
            g4.d r2 = r1.f127574h
            r10 = r18
            if (r2 == r10) goto L79
            goto L6b
        L60:
            r10 = r18
            goto L6b
        L63:
            r9 = r17
            goto L60
        L66:
            r7 = r16
            goto L63
        L69:
            r4 = r15
            goto L66
        L6b:
            w1.x1 r1 = new w1.x1
            r2 = r1
            r3 = r14
            r4 = r15
            r7 = r16
            r9 = r17
            r10 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L79:
            w1.x1 r2 = r0.f127355a
            if (r2 == r1) goto L80
            r2 = 1
            r0.f127370p = r2
        L80:
            r0.f127355a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.l1.h(b4.g, b4.g, b4.q0, boolean, n4.b, g4.d, kotlin.jvm.functions.Function1, w1.j1, z2.j, long):void");
    }
}
