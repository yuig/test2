package tj0;

import android.content.Context;
import ao2.j0;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinVideoGridCell;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final lh0.t f117861a;

    public b0(lh0.t experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f117861a = experiments;
    }

    public final OneTapSavePinVideoGridCell a(Context context, nx.d0 pinalytics, wa2.m pinFeatureConfig, j0 scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return new OneTapSavePinVideoGridCell(context, pinalytics, scope, pinFeatureConfig, this.f117861a);
    }
}
