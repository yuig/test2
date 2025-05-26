package w1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1 f127162j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f127163k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f127164l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f127165m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h4.f0 f127166n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h4.y f127167o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n4.b f127168p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f127169q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b2.t0 t0Var, l1 l1Var, boolean z13, boolean z14, Function1 function1, h4.f0 f0Var, h4.y yVar, n4.b bVar, int i13) {
        super(2);
        this.f127161i = t0Var;
        this.f127162j = l1Var;
        this.f127163k = z13;
        this.f127164l = z14;
        this.f127165m = function1;
        this.f127166n = f0Var;
        this.f127167o = yVar;
        this.f127168p = bVar;
        this.f127169q = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r4 != false) goto L28;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            i2.o r9 = (i2.o) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r10 = r10 & 3
            r0 = 2
            if (r10 != r0) goto L1c
            r10 = r9
            i2.s r10 = (i2.s) r10
            boolean r0 = r10.z()
            if (r0 != 0) goto L17
            goto L1c
        L17:
            r10.Q()
            goto Lcf
        L1c:
            w1.a0 r10 = new w1.a0
            n4.b r6 = r8.f127168p
            int r7 = r8.f127169q
            w1.l1 r2 = r8.f127162j
            kotlin.jvm.functions.Function1 r3 = r8.f127165m
            h4.f0 r4 = r8.f127166n
            h4.y r5 = r8.f127167o
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            u2.n r0 = u2.n.f120041b
            r1 = r9
            i2.s r1 = (i2.s) r1
            int r2 = r1.P
            i2.z1 r3 = r1.o()
            u2.q r0 = ao2.m0.X(r9, r0)
            s3.j r4 = s3.k.Qo
            r4.getClass()
            s3.i r4 = s3.j.f110798b
            i2.f r5 = r1.f71265a
            boolean r5 = r5 instanceof i2.f
            if (r5 == 0) goto Ld2
            r1.a0()
            boolean r5 = r1.O
            if (r5 == 0) goto L55
            r1.n(r4)
            goto L58
        L55:
            r1.j0()
        L58:
            s3.h r4 = s3.j.f110801e
            tb.f.f0(r9, r10, r4)
            s3.h r10 = s3.j.f110800d
            tb.f.f0(r9, r3, r10)
            s3.h r10 = s3.j.f110802f
            boolean r3 = r1.O
            if (r3 != 0) goto L76
            java.lang.Object r3 = r1.J()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r3 != 0) goto L79
        L76:
            ep.b.y(r2, r1, r2, r10)
        L79:
            s3.h r10 = s3.j.f110799c
            tb.f.f0(r9, r0, r10)
            r10 = 1
            r1.r(r10)
            w1.l1 r0 = r8.f127162j
            w1.w0 r2 = r0.a()
            w1.w0 r3 = w1.w0.None
            boolean r4 = r8.f127163k
            r5 = 0
            if (r2 == r3) goto La5
            q3.x r2 = r0.c()
            if (r2 == 0) goto La5
            q3.x r2 = r0.c()
            kotlin.jvm.internal.Intrinsics.f(r2)
            boolean r2 = r2.h()
            if (r2 == 0) goto La5
            if (r4 == 0) goto La5
            goto La6
        La5:
            r10 = r5
        La6:
            b2.t0 r2 = r8.f127161i
            w1.g1.h(r2, r10, r9, r5)
            w1.w0 r10 = r0.a()
            w1.w0 r0 = w1.w0.Cursor
            if (r10 != r0) goto Lc6
            boolean r10 = r8.f127164l
            if (r10 != 0) goto Lc6
            if (r4 == 0) goto Lc6
            r10 = -2032274(0xffffffffffe0fd6e, float:NaN)
            r1.W(r10)
            w1.g1.g(r2, r9, r5)
            r1.r(r5)
            goto Lcf
        Lc6:
            r9 = -1955394(0xffffffffffe229be, float:NaN)
            r1.W(r9)
            r1.r(r5)
        Lcf:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        Ld2:
            com.bumptech.glide.c.j0()
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.b0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
