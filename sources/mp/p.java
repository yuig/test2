package mp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87876i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ bq0.i f87877j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(bq0.i iVar, int i13) {
        super(1);
        this.f87876i = i13;
        this.f87877j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87876i;
        bq0.i iVar = this.f87877j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(((va1.e) iVar).g());
                break;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new p(iVar, 0));
                bind.c(fm1.c.VISIBLE);
                break;
        }
        return Unit.f80348a;
    }
}
