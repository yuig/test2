package c2;

import androidx.compose.material.MinimumInteractiveModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f25147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f25148j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f25149k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f25150l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k1.y f25151m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f25152n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o1.l f25153o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f25154p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function0 f25155q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f25156r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(u2.q qVar, b3.x0 x0Var, long j13, float f13, k1.y yVar, float f14, o1.l lVar, boolean z13, Function0 function0, Function2 function2) {
        super(2);
        this.f25147i = qVar;
        this.f25148j = x0Var;
        this.f25149k = j13;
        this.f25150l = f13;
        this.f25151m = yVar;
        this.f25152n = f14;
        this.f25153o = lVar;
        this.f25154p = z13;
        this.f25155q = function0;
        this.f25156r = function2;
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
        i2.w3 w3Var = w2.f25351a;
        i2.s sVar2 = (i2.s) oVar;
        u2.q d2 = androidx.compose.foundation.a.d(j1.l(this.f25147i.j(MinimumInteractiveModifier.f17381b), this.f25148j, j1.m(this.f25149k, (l2) sVar2.m(m2.f24958a), this.f25150l, sVar2), this.f25151m, this.f25152n), this.f25153o, p3.c(0.0f, 0L, sVar2, 0, 7), this.f25154p, null, this.f25155q, 24);
        q3.p0 e13 = p1.q.e(u2.b.f120013a, true);
        int i13 = sVar2.P;
        i2.z1 o13 = sVar2.o();
        u2.q X = ao2.m0.X(sVar2, d2);
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
        this.f25156r.invoke(sVar2, 0);
        sVar2.r(true);
        return Unit.f80348a;
    }
}
