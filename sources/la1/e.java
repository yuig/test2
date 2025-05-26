package la1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "p0");
        ka1.b bVar = (ka1.b) this.receiver;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        bVar.f78925b.e(throwable.getMessage());
        return Unit.f80348a;
    }
}
