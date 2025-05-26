package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f25100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f25101j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f25102k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f25103l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k1.y f25104m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f25105n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function2 f25106o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(u2.q qVar, b3.x0 x0Var, long j13, float f13, k1.y yVar, float f14, Function2 function2) {
        super(2);
        this.f25100i = qVar;
        this.f25101j = x0Var;
        this.f25102k = j13;
        this.f25103l = f13;
        this.f25104m = yVar;
        this.f25105n = f14;
        this.f25106o = function2;
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
        i2.s sVar2 = (i2.s) oVar;
        u2.q a13 = n3.f0.a(z3.l.a(j1.l(this.f25100i, this.f25101j, j1.m(this.f25102k, (l2) sVar2.m(m2.f24958a), this.f25103l, sVar2), this.f25104m, this.f25105n), false, j.f24850m), Unit.f80348a, new p4(2, null));
        q3.p0 e13 = p1.q.e(u2.b.f120013a, true);
        int i13 = sVar2.P;
        i2.z1 o13 = sVar2.o();
        u2.q X = ao2.m0.X(sVar2, a13);
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
        tb.f.f0(sVar2, e13, s3.j.f110801e);
        tb.f.f0(sVar2, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i13))) {
            ep.b.y(i13, sVar2, i13, hVar);
        }
        tb.f.f0(sVar2, X, s3.j.f110799c);
        this.f25106o.invoke(sVar2, 0);
        sVar2.r(true);
        return Unit.f80348a;
    }
}
