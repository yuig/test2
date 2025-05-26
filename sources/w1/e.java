package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: j, reason: collision with root package name */
    public static final e f127227j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f127228k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f127229l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f127230m = new e(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127231i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(3);
        this.f127231i = i13;
    }

    public final void b(Function2 function2, i2.o oVar, int i13) {
        switch (this.f127231i) {
            case 1:
                if ((i13 & 6) == 0) {
                    i13 |= ((i2.s) oVar).j(function2) ? 4 : 2;
                }
                if ((i13 & 19) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                function2.invoke(oVar, Integer.valueOf(i13 & 14));
                break;
            case 2:
                if ((i13 & 6) == 0) {
                    i13 |= ((i2.s) oVar).j(function2) ? 4 : 2;
                }
                if ((i13 & 19) == 18) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                function2.invoke(oVar, Integer.valueOf(i13 & 14));
                break;
            case 3:
                if ((i13 & 6) == 0) {
                    i13 |= ((i2.s) oVar).j(function2) ? 4 : 2;
                }
                if ((i13 & 19) == 18) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                function2.invoke(oVar, Integer.valueOf(i13 & 14));
                break;
            case 4:
                if ((i13 & 6) == 0) {
                    i13 |= ((i2.s) oVar).j(function2) ? 4 : 2;
                }
                if ((i13 & 19) == 18) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                function2.invoke(oVar, Integer.valueOf(i13 & 14));
                break;
            default:
                if ((i13 & 6) == 0) {
                    i13 |= ((i2.s) oVar).j(function2) ? 4 : 2;
                }
                if ((i13 & 19) == 18) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                function2.invoke(oVar, Integer.valueOf(i13 & 14));
                break;
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f127231i) {
            case 0:
                u2.q qVar = (u2.q) obj;
                ((Number) obj3).intValue();
                i2.s sVar = (i2.s) ((i2.o) obj2);
                sVar.W(-2126899193);
                long j13 = ((b2.a1) sVar.m(b2.b1.f21111a)).f21105a;
                u2.n nVar = u2.n.f120041b;
                boolean g13 = sVar.g(j13);
                Object J2 = sVar.J();
                int i13 = 0;
                if (g13 || J2 == i2.n.f71185a) {
                    J2 = new d(j13, i13);
                    sVar.g0(J2);
                }
                u2.q j14 = qVar.j(androidx.compose.ui.draw.a.e(nVar, (Function1) J2));
                sVar.r(false);
                break;
            case 1:
                b((Function2) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 2:
                b((Function2) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 3:
                b((Function2) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 4:
                b((Function2) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            default:
                b((Function2) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
