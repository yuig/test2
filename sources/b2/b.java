package b2;

import i2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p1.c1;
import p1.e1;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f21107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f21108j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f21109k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f21110l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j13, boolean z13, u2.q qVar, l lVar) {
        super(2);
        this.f21107i = j13;
        this.f21108j = z13;
        this.f21109k = qVar;
        this.f21110l = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        long j13 = this.f21107i;
        am.d dVar = i2.n.f71185a;
        l lVar = this.f21110l;
        boolean z13 = this.f21108j;
        if (j13 != y2.h.f136670b) {
            i2.s sVar2 = (i2.s) oVar;
            sVar2.W(-837727128);
            p1.c cVar = z13 ? p1.d.f98493b : p1.d.f98492a;
            u2.q h10 = androidx.compose.foundation.layout.e.h(this.f21109k, n4.g.b(j13), n4.g.a(j13), 0.0f, 0.0f, 12);
            e1 a13 = c1.a(cVar, u2.b.f120022j, sVar2, 0);
            int i13 = sVar2.P;
            z1 o13 = sVar2.o();
            u2.q X = ao2.m0.X(sVar2, h10);
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
            tb.f.f0(sVar2, a13, s3.j.f110801e);
            tb.f.f0(sVar2, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i13))) {
                ep.b.y(i13, sVar2, i13, hVar);
            }
            tb.f.f0(sVar2, X, s3.j.f110799c);
            u2.n nVar = u2.n.f120041b;
            boolean j14 = sVar2.j(lVar);
            Object J2 = sVar2.J();
            if (j14 || J2 == dVar) {
                J2 = new a(lVar, 0);
                sVar2.g0(J2);
            }
            c0.d.d(nVar, (Function0) J2, z13, sVar2, 6);
            sVar2.r(true);
            sVar2.r(false);
        } else {
            i2.s sVar3 = (i2.s) oVar;
            sVar3.W(-836867312);
            boolean j15 = sVar3.j(lVar);
            Object J3 = sVar3.J();
            if (j15 || J3 == dVar) {
                J3 = new a(lVar, 1);
                sVar3.g0(J3);
            }
            c0.d.d(this.f21109k, (Function0) J3, z13, sVar3, 0);
            sVar3.r(false);
        }
        return Unit.f80348a;
    }
}
