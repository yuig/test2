package w1;

import c2.b5;
import c2.d6;
import c2.z4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n2 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127413i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f127414j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f127415k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127416l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, boolean z13, Object obj2, int i13) {
        super(3);
        this.f127413i = i13;
        this.f127415k = obj;
        this.f127414j = z13;
        this.f127416l = obj2;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = i2.n.f71185a;
        int i13 = this.f127413i;
        boolean z13 = this.f127414j;
        Object obj5 = this.f127416l;
        Object obj6 = this.f127415k;
        switch (i13) {
            case 0:
                ((Number) obj3).intValue();
                i2.s sVar = (i2.s) ((i2.o) obj2);
                sVar.W(805428266);
                int i14 = 1;
                p2 p2Var = (p2) obj6;
                boolean z14 = ((m1.f1) p2Var.f127447e.getValue()) == m1.f1.Vertical || !(sVar.m(t3.f2.f115989l) == n4.k.Rtl);
                boolean h10 = sVar.h(p2Var);
                Object J2 = sVar.J();
                if (h10 || J2 == obj4) {
                    J2 = new q0.e(p2Var, 19);
                    sVar.g0(J2);
                }
                i2.q1 K1 = bs1.c.K1((Function1) J2, sVar);
                Object J3 = sVar.J();
                if (J3 == obj4) {
                    Object uVar = new m1.u(new i1.u0(K1, i14));
                    sVar.g0(uVar);
                    J3 = uVar;
                }
                m1.h2 h2Var = (m1.h2) J3;
                boolean h13 = sVar.h(h2Var) | sVar.h(p2Var);
                Object J4 = sVar.J();
                if (h13 || J4 == obj4) {
                    J4 = new m2(h2Var, p2Var);
                    sVar.g0(J4);
                }
                u2.q b13 = androidx.compose.foundation.gestures.a.b(u2.n.f120041b, (m2) J4, (m1.f1) p2Var.f127447e.getValue(), null, z13 && p2Var.f127444b.h() != 0.0f, z14, null, (o1.l) obj5, null);
                sVar.r(false);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                i2.o oVar = (i2.o) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((i2.s) oVar).e(floatValue) ? 4 : 2;
                }
                if ((19 & intValue) == 18) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                if (z13) {
                    floatValue = 1.0f;
                }
                c2.o0.e((Function2) obj6, (Function2) obj5, floatValue, oVar, 0);
            case 2:
                p1.f1 TopAppBar = (p1.f1) obj;
                i2.o oVar2 = (i2.o) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                if ((intValue2 & 81) == 16) {
                    i2.s sVar3 = (i2.s) oVar2;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                d6.b(kh2.a1.D0(((uc0.k1) obj6).f121805a, oVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar2, 0, 0, 131070);
                c2.l1 q13 = c2.j1.q(kh2.g0.h(eo1.b.color_background_default, oVar2), kh2.g0.h(eo1.b.color_background_selected_base, oVar2), kh2.g0.h(eo1.b.color_background_default, oVar2), kh2.g0.h(eo1.b.color_background_tertiary_base, oVar2), oVar2, 996);
                i2.s sVar4 = (i2.s) oVar2;
                sVar4.W(-1682528113);
                Function1 function1 = (Function1) obj5;
                boolean h14 = sVar4.h(function1) | sVar4.i(z13);
                Object J5 = sVar4.J();
                if (h14 || J5 == obj4) {
                    J5 = new r1.f(function1, z13, 9);
                    sVar4.g0(J5);
                }
                sVar4.r(false);
                z4.a(this.f127414j, (Function1) J5, null, false, null, q13, sVar4, 0, 28);
            default:
                q1.c item = (q1.c) obj;
                i2.o oVar3 = (i2.o) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((intValue3 & 81) == 16) {
                    i2.s sVar5 = (i2.s) oVar3;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                b5.f24567a.a(null, com.bumptech.glide.d.A(oc0.o.divider, oVar3), kh2.g0.h(eo1.b.color_background_secondary_weak, oVar3), oVar3, 0, 1);
                int i15 = ((uc0.v2) obj6).f121873a;
                i2.s sVar6 = (i2.s) oVar3;
                sVar6.W(-52178635);
                Function0 function0 = (Function0) obj5;
                boolean h15 = sVar6.h(function0);
                Object J6 = sVar6.J();
                if (h15 || J6 == obj4) {
                    J6 = new ca0.b0(5, function0);
                    sVar6.g0(J6);
                }
                sVar6.r(false);
                kh2.j1.y(i15, 0, sVar6, (Function0) J6, z13);
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(boolean z13, Function2 function2, q2.h hVar) {
        super(3);
        this.f127413i = 1;
        this.f127414j = z13;
        this.f127415k = function2;
        this.f127416l = hVar;
    }
}
