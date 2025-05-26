package e90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import wt1.e0;

/* loaded from: classes5.dex */
public final class a extends e0 implements j {
    @Override // nr0.g
    public final boolean f(int i13) {
        if (i13 == 845239) {
            return true;
        }
        return this instanceof ah1.a;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 845239;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }

    public final void u(String pinUd, String str, f30 f30Var) {
        Intrinsics.checkNotNullParameter(pinUd, "pinUd");
        k(kotlin.collections.e0.b(new c(pinUd, str, f30Var)));
    }
}
