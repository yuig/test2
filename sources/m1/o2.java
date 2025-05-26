package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public h2 f85493a;

    /* renamed from: b, reason: collision with root package name */
    public k1.e2 f85494b;

    /* renamed from: c, reason: collision with root package name */
    public c1 f85495c;

    /* renamed from: d, reason: collision with root package name */
    public f1 f85496d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f85497e;

    /* renamed from: f, reason: collision with root package name */
    public m3.d f85498f;

    /* renamed from: g, reason: collision with root package name */
    public int f85499g = 1;

    /* renamed from: h, reason: collision with root package name */
    public m1 f85500h = androidx.compose.foundation.gestures.a.f17142a;

    /* renamed from: i, reason: collision with root package name */
    public final l2 f85501i = new l2(this);

    /* renamed from: j, reason: collision with root package name */
    public final k1.s2 f85502j = new k1.s2(this, 3);

    public o2(k1.e2 e2Var, c1 c1Var, f1 f1Var, h2 h2Var, m3.d dVar, boolean z13) {
        this.f85493a = h2Var;
        this.f85494b = e2Var;
        this.f85495c = c1Var;
        this.f85496d = f1Var;
        this.f85497e = z13;
        this.f85498f = dVar;
    }

    public static final long a(o2 o2Var, m1 m1Var, long j13, int i13) {
        long j14;
        m3.g gVar = o2Var.f85498f.f85726a;
        m3.g gVar2 = null;
        m3.g gVar3 = (gVar == null || !gVar.f120054m) ? null : (m3.g) kh2.b0.g0(gVar);
        long j15 = 0;
        long B = gVar3 != null ? gVar3.B(i13, j13) : 0L;
        long g13 = a3.c.g(j13, B);
        long d2 = o2Var.d(o2Var.g(m1Var.a(o2Var.f(o2Var.d(a3.c.a(g13, 0.0f, o2Var.f85496d == f1.Horizontal ? 1 : 2))))));
        long g14 = a3.c.g(g13, d2);
        m3.g gVar4 = o2Var.f85498f.f85726a;
        if (gVar4 != null && gVar4.f120054m) {
            gVar2 = (m3.g) kh2.b0.g0(gVar4);
        }
        m3.g gVar5 = gVar2;
        if (gVar5 != null) {
            j14 = d2;
            j15 = gVar5.Q(i13, d2, g14);
        } else {
            j14 = d2;
        }
        return a3.c.h(a3.c.h(B, j14), j15);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r12, bl2.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof m1.i2
            if (r0 == 0) goto L13
            r0 = r14
            m1.i2 r0 = (m1.i2) r0
            int r1 = r0.f85380u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85380u = r1
            goto L18
        L13:
            m1.i2 r0 = new m1.i2
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f85378s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85380u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.i0 r12 = r0.f85377r
            ue.c.H(r14)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            ue.c.H(r14)
            kotlin.jvm.internal.i0 r14 = new kotlin.jvm.internal.i0
            r14.<init>()
            r14.f80432a = r12
            k1.v1 r2 = k1.v1.Default
            m1.k2 r10 = new m1.k2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f85377r = r14
            r0.f85380u = r3
            java.lang.Object r12 = r11.e(r2, r10, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            r12 = r14
        L53:
            long r12 = r12.f80432a
            n4.o r12 = n4.o.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.o2.b(long, bl2.c):java.lang.Object");
    }

    public final float c(float f13) {
        return this.f85497e ? f13 * (-1) : f13;
    }

    public final long d(long j13) {
        return this.f85497e ? a3.c.i(j13, -1.0f) : j13;
    }

    public final Object e(k1.v1 v1Var, Function2 function2, bl2.c cVar) {
        Object b13 = this.f85493a.b(v1Var, new n2(this, null, function2), cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }

    public final float f(long j13) {
        return this.f85496d == f1.Horizontal ? a3.c.d(j13) : a3.c.e(j13);
    }

    public final long g(float f13) {
        if (f13 == 0.0f) {
            return 0L;
        }
        return this.f85496d == f1.Horizontal ? com.bumptech.glide.c.d(f13, 0.0f) : com.bumptech.glide.c.d(0.0f, f13);
    }
}
