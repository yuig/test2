package nn2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(on2.u storageManager, Function0 compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // nn2.a, bm2.i
    public final boolean isEmpty() {
        return false;
    }
}
