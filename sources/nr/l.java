package nr;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.a0;

/* loaded from: classes3.dex */
public final class l extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f91856j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f91857k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f91858l = new l(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91859i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f91859i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91859i) {
            case 0:
                uj2.h it = (uj2.h) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                a0 a0Var = tk2.e.f118017c;
                it.getClass();
                ck2.i.b(timeUnit, "unit is null");
                ck2.i.b(a0Var, "scheduler is null");
                break;
            case 1:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
