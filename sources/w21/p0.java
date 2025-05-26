package w21;

import a.cb;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import i2.v3;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f127764i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1 f127765j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f127766k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127767l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127768m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j13, y1 y1Var, v3 v3Var, i2.q1 q1Var, i2.q1 q1Var2) {
        super(3);
        this.f127764i = j13;
        this.f127765j = y1Var;
        this.f127766k = v3Var;
        this.f127767l = q1Var;
        this.f127768m = q1Var2;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.foundation.layout.d BoxWithConstraints = (androidx.compose.foundation.layout.d) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
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
        FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, oVar, 0);
        i2.s sVar2 = (i2.s) oVar;
        int i13 = sVar2.P;
        i2.z1 o13 = sVar2.o();
        u2.q X = ao2.m0.X(oVar, fillElement);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar2.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar2.a0();
        if (sVar2.O) {
            sVar2.n(iVar);
        } else {
            sVar2.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(oVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(oVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i13))) {
            ep.b.y(i13, sVar2, i13, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(oVar, X, hVar4);
        float f13 = 1;
        u2.q I0 = d7.b.I0(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.b(nVar, 1.0f), BoxWithConstraints.c() - f13), 0.5f);
        p1.e1 a14 = p1.c1.a(p1.l.f98547e, u2.b.f120023k, oVar, 54);
        int i14 = sVar2.P;
        i2.z1 o14 = sVar2.o();
        u2.q X2 = ao2.m0.X(oVar, I0);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar2.a0();
        if (sVar2.O) {
            sVar2.n(iVar);
        } else {
            sVar2.j0();
        }
        tb.f.f0(oVar, a14, hVar);
        tb.f.f0(oVar, o14, hVar2);
        if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i14))) {
            ep.b.y(i14, sVar2, i14, hVar3);
        }
        tb.f.f0(oVar, X2, hVar4);
        rm1.q qVar = rm1.q.CANCEL;
        om1.e eVar = om1.e.MD;
        om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
        om1.c cVar = new om1.c(qVar, eVar, fVar, null, null, false, 0, 1016);
        u2.q p13 = androidx.compose.foundation.layout.b.p(nVar, com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, oVar), 0.0f, 2);
        y1 y1Var = this.f127765j;
        ig1.b.b(cVar, p13, new o0(y1Var, 0), oVar, 8, 0);
        FillElement fillElement2 = androidx.compose.foundation.layout.e.f17183b;
        if (1.0f <= 0.0d) {
            throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        u2.q j13 = fillElement2.j(new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true));
        int i15 = db0.f.user_signal_steps_progress;
        TreeMap treeMap = e1.f127681a;
        v3 v3Var = this.f127766k;
        String E0 = kh2.a1.E0(i15, new Object[]{Integer.valueOf(((m) v3Var.getValue()).f127741b + 1)}, oVar);
        dl2.b.c(new rn1.a(ep.b.x(E0, "string", E0), null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.HEADING_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), j13, null, null, oVar, 8, 12);
        ig1.b.b(new om1.c(rm1.q.ARROW_COUNTER_CLOCKWISE, eVar, fVar, null, null, false, 0, 1016), androidx.compose.foundation.layout.b.p(nVar, com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, oVar), 0.0f, 2), new aw0.j(y1Var, this.f127767l, this.f127768m, v3Var, 8), oVar, 8, 0);
        sVar2.r(true);
        p1.q.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.b(nVar, 1.0f), f13), this.f127764i, b3.s0.f21349a), oVar, 0);
        sVar2.r(true);
        return Unit.f80348a;
    }
}
