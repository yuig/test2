package dy0;

import i1.n1;
import i2.q1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1 f56565i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1 f56566j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f56567k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q1 f56568l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xk2.w f56569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q1 f56570n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q1 f56571o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(n1 n1Var, q1 q1Var, int i13, q1 q1Var2, xk2.w wVar, q1 q1Var3, q1 q1Var4) {
        super(3);
        this.f56565i = n1Var;
        this.f56566j = q1Var;
        this.f56567k = i13;
        this.f56568l = q1Var2;
        this.f56569m = wVar;
        this.f56570n = q1Var3;
        this.f56571o = q1Var4;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.foundation.layout.d BoxWithConstraints = (androidx.compose.foundation.layout.d) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        int i13 = 2;
        if ((intValue & 14) == 0) {
            intValue |= ((i2.s) oVar).h(BoxWithConstraints) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        u2.n nVar = u2.n.f120041b;
        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.e(nVar, (BoxWithConstraints.d() * 0.64f) / 0.8f), oVar);
        boolean booleanValue = ((Boolean) this.f56566j.getValue()).booleanValue();
        z zVar = z.f56633q;
        int i14 = this.f56567k;
        q1 q1Var = this.f56568l;
        u2.q I0 = d7.b.I0(kh2.g0.m0(androidx.compose.foundation.layout.e.b(nVar, i0.f(i14, q1Var, zVar, oVar)), i0.f(i14, q1Var, z.f56634r, oVar)), i0.f(i14, q1Var, z.f56635s, oVar));
        u2.f fVar = new u2.f(i0.f(i14, q1Var, z.f56636t, oVar), 0.0f);
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        u2.q d2 = androidx.compose.foundation.layout.b.d(cVar.a(I0, fVar), 0.8f);
        xk2.w wVar = this.f56569m;
        b7.c.c(booleanValue, d2, this.f56565i, null, null, q2.i.c(583822081, new e0(wVar, i13), oVar), oVar, 196608, 24);
        b7.c.c(((Boolean) this.f56570n.getValue()).booleanValue(), androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.l(cVar.a(d7.b.I0(kh2.g0.m0(androidx.compose.foundation.layout.e.b(nVar, i0.f(i14, q1Var, z.f56637u, oVar)), i0.f(i14, q1Var, z.f56638v, oVar)), i0.f(i14, q1Var, z.f56639w, oVar)), new u2.f(i0.f(i14, q1Var, z.f56640x, oVar), 0.0f)), 0.0f, i0.f(i14, q1Var, z.f56628l, oVar) * (-BoxWithConstraints.d()), 1), 0.8f), this.f56565i, null, null, q2.i.c(-830878422, new e0(wVar, 0), oVar), oVar, 196608, 24);
        b7.c.c(((Boolean) this.f56571o.getValue()).booleanValue(), androidx.compose.foundation.layout.b.d(cVar.a(d7.b.I0(kh2.g0.m0(androidx.compose.foundation.layout.e.b(nVar, i0.f(i14, q1Var, z.f56629m, oVar)), i0.f(i14, q1Var, z.f56630n, oVar)), i0.f(i14, q1Var, z.f56631o, oVar)), new u2.f(i0.f(i14, q1Var, z.f56632p, oVar), 0.0f)), 0.8f), this.f56565i, null, null, q2.i.c(-1515108727, new e0(wVar, 1), oVar), oVar, 196608, 24);
        return Unit.f80348a;
    }
}
