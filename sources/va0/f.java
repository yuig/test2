package va0;

import f2.e0;
import i2.q1;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o1.l f125111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f125112j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f125113k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f125114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q1 f125115m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o1.l lVar, float f13, Function1 function1, Function1 function12, q1 q1Var) {
        super(3);
        this.f125111i = lVar;
        this.f125112j = f13;
        this.f125113k = function1;
        this.f125114l = function12;
        this.f125115m = q1Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e0 it = (e0) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((intValue & 81) == 16) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        i2.s sVar2 = (i2.s) oVar;
        sVar2.W(-2009335051);
        Function1 function1 = this.f125113k;
        boolean h10 = sVar2.h(function1);
        Object J2 = sVar2.J();
        Object obj4 = i2.n.f71185a;
        q1 q1Var = this.f125115m;
        if (h10 || J2 == obj4) {
            J2 = new e(function1, q1Var, 0);
            sVar2.g0(J2);
        }
        Function0 function0 = (Function0) J2;
        sVar2.r(false);
        sVar2.W(-2009332428);
        Function1 function12 = this.f125114l;
        boolean h13 = sVar2.h(function12);
        Object J3 = sVar2.J();
        if (h13 || J3 == obj4) {
            J3 = new e(function12, q1Var, 1);
            sVar2.g0(J3);
        }
        sVar2.r(false);
        k3.q(null, this.f125111i, this.f125112j, 0.0f, function0, (Function0) J3, sVar2, 48, 9);
        return Unit.f80348a;
    }
}
