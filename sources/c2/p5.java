package c2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p5 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25075i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f25076j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f25077k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f25078l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(long j13, Float f13, Object obj, int i13) {
        super(2);
        this.f25075i = i13;
        this.f25076j = j13;
        this.f25077k = f13;
        this.f25078l = obj;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f25075i;
        long j13 = this.f25076j;
        Object obj = this.f25078l;
        Object obj2 = this.f25077k;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                Float f13 = (Float) obj2;
                if (f13 == null) {
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(-1178050310);
                    com.bumptech.glide.d.a(b1.f24558a.c(Float.valueOf(b3.w.d(j13))), (Function2) obj, sVar2, 8);
                    sVar2.r(false);
                    break;
                } else {
                    i2.s sVar3 = (i2.s) oVar;
                    sVar3.W(-1178229056);
                    com.bumptech.glide.d.a(b1.f24558a.c(f13), (Function2) obj, sVar3, 8);
                    sVar3.r(false);
                    break;
                }
            case 1:
                if ((i13 & 3) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                com.bumptech.glide.d.a(c1.f24577a.c(new b3.w(j13)), q2.i.c(-1132188434, new p5((Float) obj2, (Function2) obj, j13), oVar), oVar, 56);
                break;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                p1.y0 y0Var = p0.f25056a;
                long j14 = b3.w.f21389m;
                i2.w3 w3Var = u0.f25271a;
                i2.s sVar6 = (i2.s) oVar;
                long c13 = ((s0) sVar6.m(w3Var)).c();
                long j15 = ((b3.w) sVar6.m(c1.f24577a)).f21392a;
                if (((s0) sVar6.m(w3Var)).f()) {
                    androidx.compose.ui.graphics.a.q(j15);
                } else {
                    androidx.compose.ui.graphics.a.q(j15);
                }
                d1 d1Var = new d1(j14, this.f25076j, j14, b3.w.b(c13, 0.38f));
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                boolean j16 = sVar6.j(null);
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                Object J2 = sVar6.J();
                if (j16 || J2 == i2.n.f71185a) {
                    J2 = new d4(1);
                    sVar6.g0(J2);
                }
                j1.a((Function0) J2, u2.n.f120041b, true, null, null, ((b4) sVar6.m(c4.f24581a)).f24564a, null, d1Var, p0.f25059d, q2.i.c(-929149933, new l4((String) obj), sVar6), sVar6, 805306368, 0);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25075i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(Float f13, Function2 function2, long j13) {
        super(2);
        this.f25075i = 0;
        this.f25077k = f13;
        this.f25078l = function2;
        this.f25076j = j13;
    }
}
