package w41;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kh2.n {

    /* renamed from: b, reason: collision with root package name */
    public static final b f127980b = new b();

    @Override // kh2.n
    public final int V(b22.l viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        int i13 = a.f127979a[viewMode.ordinal()];
        if (i13 == 1) {
            return 3;
        }
        if (i13 == 2) {
            return 2;
        }
        if (i13 == 3) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
