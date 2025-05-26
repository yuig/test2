package ab2;

import android.content.Context;
import ao2.j0;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.d0;

/* loaded from: classes2.dex */
public final class d {
    public static PinVideoGridCell a(Context context, d0 pinalytics, j0 scope, boolean z13, boolean z14, qa2.j0 j0Var, wa2.i pinFeatureConfig, ni1.d0 d0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return new PinVideoGridCell(context, pinalytics, f0.i0(pinFeatureConfig), scope, j0Var, d0Var, z13, z14);
    }

    public static /* synthetic */ PinVideoGridCell b(d dVar, Context context, d0 d0Var, j0 j0Var, boolean z13, boolean z14, qa2.j0 j0Var2, wa2.i iVar, int i13) {
        boolean z15 = (i13 & 8) != 0 ? false : z13;
        boolean z16 = (i13 & 16) != 0 ? false : z14;
        qa2.j0 j0Var3 = (i13 & 32) != 0 ? null : j0Var2;
        dVar.getClass();
        return a(context, d0Var, j0Var, z15, z16, j0Var3, iVar, null);
    }
}
