package c2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24570i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24571j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24572k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        super(2);
        this.f24570i = i13;
        this.f24571j = obj;
        this.f24572k = obj2;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f24570i;
        Object obj = this.f24572k;
        Object obj2 = this.f24571j;
        int i15 = 2;
        int i16 = 3;
        switch (i14) {
            case 1:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                u2.q b13 = androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f);
                r3.i iVar = p1.o1.f98564a;
                u2.q a13 = z3.l.a(androidx.compose.foundation.layout.e.a(ao2.m0.p(b13, t3.p.f116119m, new i1.h((p1.m1) obj2, i16)), Float.NaN, o0.f25033b), false, u1.a.f119978i);
                kl2.l lVar = (kl2.l) obj;
                p1.e1 a14 = p1.c1.a(p1.l.f98548f, u2.b.f120022j, oVar, 6);
                i2.s sVar2 = (i2.s) oVar;
                int i17 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(oVar, a13);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar2.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar2);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(oVar, a14, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i17))) {
                    ep.b.y(i17, sVar2, i17, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                lVar.invoke(p1.g1.f98514a, oVar, 6);
                sVar2.r(true);
                return;
            case 2:
                if ((i13 & 3) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                j1.o2 o2Var = o0.f25032a;
                ((kl2.l) obj2).invoke(Float.valueOf(((Number) ((i2.v3) obj).getValue()).floatValue()), oVar, 0);
                return;
            case 3:
                if ((i13 & 3) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        return;
                    }
                }
                d6.a(((e6) obj2).f24710i, q2.i.c(181426554, new a0((Function2) obj, i15), oVar), oVar, 48);
                return;
            case 4:
                if ((i13 & 3) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return;
                    }
                }
                ((kl2.l) obj2).invoke(((a4) obj).f24527b, oVar, 0);
                return;
            case 5:
                if ((i13 & 3) == 2) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        return;
                    }
                }
                com.bumptech.glide.d.a(y3.f25423a.c((n2) obj2), (Function2) obj, oVar, 8);
                return;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar7 = (i2.s) oVar;
                    if (sVar7.z()) {
                        sVar7.Q();
                        return;
                    }
                }
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.f(null);
                ((kl2.l) obj2).invoke(null, oVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24570i) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                w wVar = ((q) this.f24571j).f25079a;
                wVar.f25334j.i(floatValue);
                wVar.f25335k.i(floatValue2);
                ((kotlin.jvm.internal.g0) this.f24572k).f80425a = floatValue;
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
