package tc0;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117301i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v3 f117302j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f117303k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v3 v3Var, v3 v3Var2, int i13) {
        super(3);
        this.f117301i = i13;
        this.f117302j = v3Var;
        this.f117303k = v3Var2;
    }

    public final void b(q1.c item, i2.o oVar, int i13) {
        int i14 = this.f117301i;
        v3 v3Var = this.f117303k;
        v3 v3Var2 = this.f117302j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                kh2.j.h(((uc0.l0) v3Var2.getValue()).f121816c.f121798a, ((uc0.l0) v3Var2.getValue()).f121816c.f121799b, (String) v3Var.getValue(), null, new q(((uc0.l0) v3Var2.getValue()).f121816c, 0), oVar, 64, 8);
                break;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                kh2.j.e((String) v3Var2.getValue(), new q(((uc0.l0) v3Var.getValue()).f121817d, 1), androidx.compose.foundation.layout.e.b(androidx.compose.foundation.layout.e.c(u2.n.f120041b, com.bumptech.glide.d.A(oc0.o.height_feedback, oVar)), 1.0f), false, q2.i.c(1380674364, new q4.d(v3Var, 3), oVar), oVar, 27648, 0);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f117301i) {
            case 0:
                b((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            default:
                b((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
