package b01;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import qa2.h0;
import qa2.j0;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(0);
        this.f20742i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l lVar = this.f20742i;
        if (lVar.W0 == null) {
            Intrinsics.r("layoutParamsFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams = new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-1, -2);
        int X = bs1.c.X(lVar, eo1.c.space_100);
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        com.bumptech.glide.c.a1(layoutParams, X, X, X, X);
        j0 j0Var = lVar.f114986u0;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        Context context = lVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        d0 pinalytics = lVar.s7();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        h0 a13 = ((qa2.d) j0Var).a(context, true);
        a13.setPinalytics(pinalytics);
        ((View) a13).setLayoutParams(layoutParams);
        return a13;
    }
}
