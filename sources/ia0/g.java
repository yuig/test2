package ia0;

import j1.o1;
import java.util.List;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1.y0;
import s1.o0;
import s80.z3;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f71958i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f71959j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f71960k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f71961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f71962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f13, o0 o0Var, float f14, List list, Function1 function1) {
        super(3);
        this.f71958i = f13;
        this.f71959j = o0Var;
        this.f71960k = f14;
        this.f71961l = list;
        this.f71962m = function1;
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
        float f13 = 2;
        float d2 = BoxWithConstraints.d() / f13;
        float f14 = this.f71958i;
        y0 b13 = androidx.compose.foundation.layout.b.b(d2 - (f14 / f13), 2);
        s1.o oVar2 = new s1.o(f14);
        o1 q13 = j1.e.q(0.5f, 50.0f, null, 4);
        o0 o0Var = this.f71959j;
        a1.f(this.f71959j, null, b13, oVar2, 2, this.f71960k, null, kg.o.k(o0Var, q13, oVar, 3072, 22), false, false, null, null, null, q2.i.c(1219036957, new z3(this.f71961l, o0Var, this.f71962m), oVar), oVar, 24576, 3072, 8002);
        return Unit.f80348a;
    }
}
