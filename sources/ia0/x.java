package ia0;

import java.util.List;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s1.o0;
import s80.z3;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f71993i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f71994j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f71995k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f71996l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f71997m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f71998n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(float f13, o0 o0Var, float f14, List list, Function1 function1, Function1 function12) {
        super(3);
        this.f71993i = f13;
        this.f71994j = o0Var;
        this.f71995k = f14;
        this.f71996l = list;
        this.f71997m = function1;
        this.f71998n = function12;
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
        float f13 = 2;
        float d2 = BoxWithConstraints.d() / f13;
        float f14 = this.f71993i;
        a1.f(this.f71994j, null, androidx.compose.foundation.layout.b.b(d2 - (f14 / f13), 2), new s1.o(f14), 2, this.f71995k, u2.b.f120022j, kg.o.k(this.f71994j, j1.e.q(0.5f, 50.0f, null, 4), oVar, 3072, 22), false, false, null, null, null, q2.i.c(1445882154, new z3(this.f71996l, this.f71997m, this.f71998n, i13), oVar), oVar, 1597440, 3072, 7938);
        return Unit.f80348a;
    }
}
