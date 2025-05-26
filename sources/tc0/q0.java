package tc0;

import c2.d6;
import i2.q1;
import i2.z1;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1 f117300j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i13, q1 q1Var) {
        super(3);
        this.f117299i = i13;
        this.f117300j = q1Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2.o oVar;
        i2.s sVar;
        boolean z13;
        Function2 innerTextField = (Function2) obj;
        i2.o oVar2 = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((intValue & 14) == 0) {
            intValue |= ((i2.s) oVar2).j(innerTextField) ? 4 : 2;
        }
        int i13 = intValue;
        if ((i13 & 91) == 18) {
            i2.s sVar2 = (i2.s) oVar2;
            if (sVar2.z()) {
                sVar2.Q();
                return Unit.f80348a;
            }
        }
        u2.q o13 = androidx.compose.foundation.layout.b.o(u2.n.f120041b, com.bumptech.glide.d.A(eo1.c.space_200, oVar2), com.bumptech.glide.d.A(oc0.o.top_bottom_inner_padding_search_bar, oVar2));
        q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
        i2.s sVar3 = (i2.s) oVar2;
        int i14 = sVar3.P;
        z1 o14 = sVar3.o();
        u2.q X = ao2.m0.X(oVar2, o13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar3.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar3.a0();
        if (sVar3.O) {
            sVar3.n(iVar);
        } else {
            sVar3.j0();
        }
        tb.f.f0(oVar2, e13, s3.j.f110801e);
        tb.f.f0(oVar2, o14, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar3.O || !Intrinsics.d(sVar3.J(), Integer.valueOf(i14))) {
            ep.b.y(i14, sVar3, i14, hVar);
        }
        tb.f.f0(oVar2, X, s3.j.f110799c);
        sVar3.W(97431550);
        if (((String) this.f117300j.getValue()).length() == 0) {
            oVar = oVar2;
            d6.b(a1.D0(this.f117299i, oVar2), null, kh2.g0.h(eo1.b.color_gray_roboflow_550, oVar2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fc0.c.f61689f, oVar, 0, 0, 65530);
            sVar = sVar3;
            z13 = false;
        } else {
            oVar = oVar2;
            sVar = sVar3;
            z13 = false;
        }
        sVar.r(z13);
        innerTextField.invoke(oVar, Integer.valueOf(i13 & 14));
        sVar.r(true);
        return Unit.f80348a;
    }
}
