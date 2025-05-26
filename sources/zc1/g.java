package zc1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.k;
import rm1.l;
import va1.f1;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141603i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f1 f141604j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(f1 f1Var, int i13) {
        super(1);
        this.f141603i = i13;
        this.f141604j = f1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f141603i;
        f1 f1Var = this.f141604j;
        switch (i13) {
            case 0:
                l standard = (l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(f1Var.f125175e);
                break;
            default:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new g(f1Var, 0));
                bind.c(fm1.c.VISIBLE);
                break;
        }
        return Unit.f80348a;
    }
}
