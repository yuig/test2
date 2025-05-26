package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj, int i13) {
        super(1, obj, uc0.j0.class, "update", "update(Ljava/lang/String;)V", 0);
        this.f117298a = i13;
        if (i13 == 1) {
            super(1, obj, uc0.k0.class, "updateText", "updateText(Ljava/lang/String;)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, obj, uc0.k0.class, "updateText", "updateText(Ljava/lang/String;)V", 0);
        } else if (i13 != 3) {
        } else {
            super(1, obj, uc0.k0.class, "updateText", "updateText(Ljava/lang/String;)V", 0);
        }
    }

    public final void h(String option) {
        switch (this.f117298a) {
            case 0:
                Intrinsics.checkNotNullParameter(option, "p0");
                uc0.j0 j0Var = (uc0.j0) this.receiver;
                j0Var.getClass();
                Intrinsics.checkNotNullParameter(option, "option");
                j0Var.f121800c.i(option);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(option, "p0");
                uc0.k0 k0Var = (uc0.k0) this.receiver;
                k0Var.getClass();
                Intrinsics.checkNotNullParameter(option, "value");
                k0Var.f121803b.i(option);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(option, "p0");
                uc0.k0 k0Var2 = (uc0.k0) this.receiver;
                k0Var2.getClass();
                Intrinsics.checkNotNullParameter(option, "value");
                k0Var2.f121803b.i(option);
                break;
            default:
                Intrinsics.checkNotNullParameter(option, "p0");
                uc0.k0 k0Var3 = (uc0.k0) this.receiver;
                k0Var3.getClass();
                Intrinsics.checkNotNullParameter(option, "value");
                k0Var3.f121803b.i(option);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f117298a) {
            case 0:
                h((String) obj);
                break;
            case 1:
                h((String) obj);
                break;
            case 2:
                h((String) obj);
                break;
            default:
                h((String) obj);
                break;
        }
        return Unit.f80348a;
    }
}
