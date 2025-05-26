package c2;

import androidx.compose.foundation.layout.FillElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kl2.l f24557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i13, kl2.l lVar) {
        super(2);
        this.f24556i = i13;
        this.f24557j = lVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f24556i;
        kl2.l lVar = this.f24557j;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                FillElement fillElement = androidx.compose.foundation.layout.e.f17183b;
                p1.e1 a13 = p1.c1.a(p1.l.f98544b, u2.b.f120023k, oVar, 54);
                i2.s sVar2 = (i2.s) oVar;
                int i15 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(oVar, fillElement);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                if (!(sVar2.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(oVar, a13, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar2, i15, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                lVar.invoke(p1.g1.f98514a, oVar, 6);
                sVar2.r(true);
                return;
            case 1:
                if ((i13 & 3) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                FillElement fillElement2 = androidx.compose.foundation.layout.e.f17184c;
                p1.y a14 = p1.x.a(p1.l.f98545c, u2.b.f120025m, oVar, 0);
                i2.s sVar4 = (i2.s) oVar;
                int i16 = sVar4.P;
                i2.z1 o14 = sVar4.o();
                u2.q X2 = ao2.m0.X(oVar, fillElement2);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar4.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar4.a0();
                if (sVar4.O) {
                    sVar4.n(iVar2);
                } else {
                    sVar4.j0();
                }
                tb.f.f0(oVar, a14, s3.j.f110801e);
                tb.f.f0(oVar, o14, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar4.O || !Intrinsics.d(sVar4.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar4, i16, hVar2);
                }
                tb.f.f0(oVar, X2, s3.j.f110799c);
                lVar.invoke(p1.a0.f98480a, oVar, 6);
                sVar4.r(true);
                return;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return;
                    }
                }
                lVar.invoke(u2.n.f120041b, oVar, 54);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24556i) {
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
}
