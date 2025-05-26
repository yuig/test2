package w41;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kh2.n {

    /* renamed from: b, reason: collision with root package name */
    public static final d f127991b = new d();

    @Override // kh2.n
    public final int V(b22.l viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        int i13 = c.f127988a[viewMode.ordinal()];
        if (i13 == 1) {
            return 5;
        }
        if (i13 == 2) {
            return 4;
        }
        if (i13 == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
