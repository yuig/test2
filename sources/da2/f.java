package da2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.k;
import rm1.l;
import rm1.q;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54242i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f54243j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(q qVar, int i13) {
        super(1);
        this.f54242i = i13;
        this.f54243j = qVar;
    }

    public final void b(k bind) {
        int i13 = this.f54242i;
        q qVar = this.f54243j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new f(qVar, 0));
                bind.c(fm1.c.VISIBLE);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new f(qVar, 2));
                bind.c(fm1.c.VISIBLE);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q qVar = this.f54243j;
        int i13 = this.f54242i;
        switch (i13) {
            case 0:
                l standard = (l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.a(qVar);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.a(qVar);
                        break;
                }
                break;
            case 1:
                b((k) obj);
                break;
            case 2:
                l standard2 = (l) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.a(qVar);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.a(qVar);
                        break;
                }
                break;
            default:
                b((k) obj);
                break;
        }
        return Unit.f80348a;
    }
}
