package an2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.g1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15813i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f15814j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(y yVar, int i13) {
        super(1);
        this.f15813i = i13;
        this.f15814j = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15813i;
        y yVar = this.f15814j;
        switch (i13) {
            case 0:
                g1 it = (g1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.b()) {
                    return "*";
                }
                pn2.b0 type = it.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                String d03 = yVar.d0(type);
                if (it.c() == w1.INVARIANT) {
                    return d03;
                }
                return it.c() + ' ' + d03;
            default:
                pn2.b0 b0Var = (pn2.b0) obj;
                Intrinsics.f(b0Var);
                return yVar.d0(b0Var);
        }
    }
}
