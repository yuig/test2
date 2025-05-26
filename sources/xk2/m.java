package xk2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class m {
    public static k a(n mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i13 = l.f135223a[mode.ordinal()];
        if (i13 == 1) {
            return new v(initializer, null, 2, null);
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            u uVar = new u();
            uVar.f135229a = initializer;
            uVar.f135230b = g0.f135210a;
            return uVar;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        k0 k0Var = new k0();
        k0Var.f135221a = initializer;
        k0Var.f135222b = g0.f135210a;
        return k0Var;
    }

    public static v b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new v(initializer, null, 2, null);
    }
}
