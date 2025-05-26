package f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f60887i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f60888j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f60889k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f60890l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f60891m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f60892n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f60893o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function2 f60894p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kl2.l f60895q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e0 e0Var, long j13, long j14, long j15, long j16, float f13, float f14, Function2 function2, kl2.l lVar) {
        super(1);
        this.f60887i = e0Var;
        this.f60888j = j13;
        this.f60889k = j14;
        this.f60890l = j15;
        this.f60891m = j16;
        this.f60892n = f13;
        this.f60893o = f14;
        this.f60894p = function2;
        this.f60895q = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f13;
        Function2 function2;
        float f14;
        long j13;
        d3.h hVar = (d3.h) obj;
        s sVar = s.f60907a;
        e0 e0Var = this.f60887i;
        float[] fArr = e0Var.f60839f;
        float c13 = e0Var.c();
        float g03 = hVar.g0(e0Var.f60842i.h());
        float f03 = hVar.f0(0);
        float g04 = hVar.g0(e0Var.f60843j.h());
        long d2 = com.bumptech.glide.c.d(0.0f, a3.c.e(hVar.t0()));
        long d13 = com.bumptech.glide.c.d(a3.f.d(hVar.g()), a3.c.e(hVar.t0()));
        float l03 = hVar.l0(g03);
        long d14 = com.bumptech.glide.c.d(((a3.c.d(d13) - a3.c.d(d2)) * c13) + a3.c.d(d2), a3.c.e(hVar.t0()));
        long d15 = com.bumptech.glide.c.d(((a3.c.d(d13) - a3.c.d(d2)) * 0.0f) + a3.c.d(d2), a3.c.e(hVar.t0()));
        float f15 = 2;
        float f16 = l03 / f15;
        float l04 = hVar.l0(this.f60893o);
        float f17 = this.f60892n;
        if (Float.compare(f17, 0) > 0) {
            hVar.l0(f03);
            hVar.l0(f17);
            f13 = hVar.l0(f17) + (hVar.l0(g04) / f15);
        } else {
            f13 = 0.0f;
        }
        float d16 = a3.c.d(d14);
        float d17 = (a3.c.d(d13) - f13) - f16;
        Function2 function22 = this.f60894p;
        if (d16 < d17) {
            float d18 = a3.c.d(d14) + f13;
            float d19 = a3.c.d(d13);
            function2 = function22;
            f14 = l03;
            s.d(hVar, com.bumptech.glide.c.d(d18, 0.0f), bs1.c.c(d19 - d18, l03), this.f60888j, l04, f16);
            if (function2 != null) {
                function2.invoke(hVar, new a3.c(com.bumptech.glide.c.d(d19 - f16, a3.c.e(hVar.t0()))));
            }
        } else {
            function2 = function22;
            f14 = l03;
        }
        float d23 = (a3.c.d(d14) - f13) - 0.0f;
        if (d23 > f16) {
            s.d(hVar, com.bumptech.glide.c.d(0.0f, 0.0f), bs1.c.c(d23, f14), this.f60889k, f16, l04);
        }
        long d24 = com.bumptech.glide.c.d(a3.c.d(d2) + f16, a3.c.e(d2));
        long d25 = com.bumptech.glide.c.d(a3.c.d(d13) - f16, a3.c.e(d13));
        a3.c.d(d15);
        a3.c.d(d15);
        float d26 = a3.c.d(d14) - f13;
        float d27 = a3.c.d(d14) + f13;
        int length = fArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            float f18 = fArr[i13];
            int i15 = i14 + 1;
            boolean z13 = true;
            if (function2 == null || i14 != fArr.length - 1) {
                if (f18 <= c13 && f18 >= 0.0f) {
                    z13 = false;
                }
                long d28 = com.bumptech.glide.c.d(a3.c.d(com.bumptech.glide.c.H0(d24, d25, f18)), a3.c.e(hVar.t0()));
                float d29 = a3.c.d(d28);
                if (d29 < d26 || d29 > d27) {
                    j13 = d24;
                    this.f60895q.invoke(hVar, new a3.c(d28), new b3.w(z13 ? this.f60890l : this.f60891m));
                    i13++;
                    i14 = i15;
                    d24 = j13;
                }
            }
            j13 = d24;
            i13++;
            i14 = i15;
            d24 = j13;
        }
        return Unit.f80348a;
    }
}
