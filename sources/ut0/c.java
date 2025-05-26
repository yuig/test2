package ut0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.k;
import rm1.q;
import rq.o2;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123091i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f123092j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f123093k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i13, q qVar) {
        super(1);
        this.f123093k = i13;
        this.f123092j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f123091i;
        int i14 = this.f123093k;
        switch (i13) {
            case 0:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(this.f123092j, 8));
                if (i14 == 153) {
                    bind.a(rm1.c.DISABLED);
                } else {
                    bind.a(rm1.c.LIGHT);
                }
                return Unit.f80348a;
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, this.f123092j, null, om1.f.TRANSPARENT_ALWAYS_LIGHT, null, bs1.c.j2(new String[0], i14), false, 0, 1002);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, int i13) {
        super(1);
        this.f123092j = qVar;
        this.f123093k = i13;
    }
}
