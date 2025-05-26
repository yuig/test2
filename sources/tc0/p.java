package tc0;

import c2.d6;
import i2.v3;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117295i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v3 f117296j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(v3 v3Var, int i13) {
        super(3);
        this.f117295i = i13;
        this.f117296j = v3Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f117295i;
        v3 v3Var = this.f117296j;
        switch (i13) {
            case 0:
                q1.c item = (q1.c) obj;
                i2.o oVar = (i2.o) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((intValue & 81) == 16) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                d6.b(a1.D0(((uc0.l0) v3Var.getValue()).f121815b, oVar), u2.n.f120041b, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 48, 0, 131068);
            default:
                androidx.compose.foundation.layout.d BoxWithConstraints = (androidx.compose.foundation.layout.d) obj;
                i2.o oVar2 = (i2.o) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((intValue2 & 14) == 0) {
                    intValue2 |= ((i2.s) oVar2).h(BoxWithConstraints) ? 4 : 2;
                }
                if ((intValue2 & 91) == 18) {
                    i2.s sVar2 = (i2.s) oVar2;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                oe.f.j(((u21.b) v3Var.getValue()).f120072b, BoxWithConstraints.c(), null, oVar2, 8, 4);
        }
        return Unit.f80348a;
    }
}
