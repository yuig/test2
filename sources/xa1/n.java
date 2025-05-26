package xa1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import va1.e1;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134459i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f134460j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(e1 e1Var, int i13) {
        super(1);
        this.f134459i = i13;
        this.f134460j = e1Var;
    }

    public final void b(rm1.k bind) {
        int i13 = this.f134459i;
        e1 e1Var = this.f134460j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new n(e1Var, 0));
                bind.c(fm1.c.VISIBLE);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new n(e1Var, 2));
                bind.c(fm1.c.VISIBLE);
                break;
        }
    }

    public final void e(rm1.l standard) {
        int i13 = this.f134459i;
        e1 e1Var = this.f134460j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(((va1.e) e1Var).g());
                break;
            default:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(((va1.e) e1Var).g());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f134459i) {
            case 0:
                e((rm1.l) obj);
                break;
            case 1:
                b((rm1.k) obj);
                break;
            case 2:
                e((rm1.l) obj);
                break;
            default:
                b((rm1.k) obj);
                break;
        }
        return Unit.f80348a;
    }
}
