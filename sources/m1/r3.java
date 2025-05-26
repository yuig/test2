package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class r3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85552i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f85553j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f85554k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f85555l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(float f13, b3.f0 f0Var, b3.p pVar) {
        super(1);
        this.f85553j = f13;
        this.f85554k = f0Var;
        this.f85555l = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long d2;
        int i13 = this.f85552i;
        Object obj2 = this.f85555l;
        Object obj3 = this.f85554k;
        float f13 = this.f85553j;
        switch (i13) {
            case 0:
                long longValue = ((Number) obj).longValue();
                s3 s3Var = (s3) obj3;
                if (s3Var.f85573b == Long.MIN_VALUE) {
                    s3Var.f85573b = longValue;
                }
                float f14 = s3Var.f85576e;
                j1.p pVar = new j1.p(f14);
                j1.p pVar2 = s3.f85571f;
                if (f13 == 0.0f) {
                    d2 = s3Var.f85572a.b(new j1.p(f14), pVar2, s3Var.f85574c);
                } else {
                    d2 = ml2.c.d((longValue - s3Var.f85573b) / f13);
                }
                float f15 = ((j1.p) s3Var.f85572a.o(d2, pVar, pVar2, s3Var.f85574c)).f74189a;
                s3Var.f85574c = (j1.p) s3Var.f85572a.g(d2, pVar, pVar2, s3Var.f85574c);
                s3Var.f85573b = longValue;
                float f16 = s3Var.f85576e - f15;
                s3Var.f85576e = f15;
                ((Function1) obj2).invoke(Float.valueOf(f16));
                return Unit.f80348a;
            default:
                s3.m0 m0Var = (s3.m0) ((d3.e) obj);
                m0Var.a();
                b3.f0 f0Var = (b3.f0) obj3;
                b3.p pVar3 = (b3.p) obj2;
                d3.b bVar = m0Var.f110840a.f53652b;
                long e13 = bVar.e();
                bVar.a().j();
                try {
                    d3.d dVar = bVar.f53648a;
                    dVar.d(f13, 0.0f);
                    b3.u a13 = dVar.f53655a.a();
                    a13.f(a3.c.d(0L), a3.c.e(0L));
                    a13.n();
                    a13.f(-a3.c.d(0L), -a3.c.e(0L));
                    d3.h.C(m0Var, f0Var, pVar3);
                    ep.b.z(bVar, e13);
                    return Unit.f80348a;
                } catch (Throwable th3) {
                    ep.b.z(bVar, e13);
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(s3 s3Var, float f13, Function1 function1) {
        super(1);
        this.f85554k = s3Var;
        this.f85553j = f13;
        this.f85555l = function1;
    }
}
