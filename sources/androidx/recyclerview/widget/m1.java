package androidx.recyclerview.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m1 extends c1 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f19512q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f19513r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i13, Context context, Object obj) {
        super(context);
        this.f19512q = i13;
        this.f19513r = obj;
    }

    @Override // androidx.recyclerview.widget.v2
    public final PointF a(int i13) {
        switch (this.f19512q) {
            case 3:
                return ((CarouselLayoutManager) this.f19513r).a(i13);
            default:
                return super.a(i13);
        }
    }

    @Override // androidx.recyclerview.widget.c1, androidx.recyclerview.widget.v2
    public final void g(View targetView, w2 state, t2 action) {
        DecelerateInterpolator decelerateInterpolator = this.f19343j;
        int i13 = this.f19512q;
        Object obj = this.f19513r;
        switch (i13) {
            case 0:
                n1 n1Var = (n1) obj;
                int[] c13 = n1Var.c(((RecyclerView) n1Var.f19350a).f19242n, targetView);
                int i14 = c13[0];
                int i15 = c13[1];
                int o13 = o(Math.max(Math.abs(i14), Math.abs(i15)));
                if (o13 > 0) {
                    action.b(i14, i15, o13, decelerateInterpolator);
                    break;
                }
                break;
            case 2:
                c3 c3Var = (c3) obj;
                RecyclerView recyclerView = (RecyclerView) c3Var.f19350a;
                if (recyclerView != null) {
                    int[] c14 = c3Var.c(recyclerView.f19242n, targetView);
                    int i16 = c14[0];
                    int i17 = c14[1];
                    int o14 = o(Math.max(Math.abs(i16), Math.abs(i17)));
                    if (o14 > 0) {
                        action.b(i16, i17, o14, decelerateInterpolator);
                        break;
                    }
                }
                break;
            case 9:
                Intrinsics.checkNotNullParameter(targetView, "targetView");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(action, "action");
                eb2.m mVar = (eb2.m) obj;
                l2 l2Var = mVar.f58269e.f19242n;
                if (l2Var != null) {
                    int[] c15 = mVar.c(l2Var, targetView);
                    int i18 = c15[0];
                    int i19 = c15[1];
                    int o15 = o(Math.max(Math.abs(i18), Math.abs(i19)));
                    if (o15 > 0) {
                        action.b(i18, i19, o15, null);
                        break;
                    }
                }
                break;
            default:
                super.g(targetView, state, action);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final int k(int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19512q) {
            case 7:
                return (i15 - i13) + ((q01.b) this.f19513r).f101776d;
            default:
                return super.k(i13, i14, i15, i16, i17);
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final int l(View view, int i13) {
        switch (this.f19512q) {
            case 3:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f19513r;
                if (carouselLayoutManager.f32405u == null || !carouselLayoutManager.m1()) {
                    return 0;
                }
                int Z = l2.Z(view);
                return (int) (carouselLayoutManager.f32400p - carouselLayoutManager.j1(Z, carouselLayoutManager.h1(Z)));
            default:
                return super.l(view, i13);
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final int m(View view, int i13) {
        switch (this.f19512q) {
            case 3:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f19513r;
                if (carouselLayoutManager.f32405u == null || carouselLayoutManager.m1()) {
                    return 0;
                }
                int Z = l2.Z(view);
                return (int) (carouselLayoutManager.f32400p - carouselLayoutManager.j1(Z, carouselLayoutManager.h1(Z)));
            default:
                return super.m(view, i13);
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final float n(DisplayMetrics displayMetrics) {
        int i13 = this.f19512q;
        Object obj = this.f19513r;
        switch (i13) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            case 1:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return ((PinterestStaggeredGridLayoutManagerImpl) obj).T / displayMetrics.densityDpi;
            case 2:
                return 100.0f / displayMetrics.densityDpi;
            case 3:
            case 7:
            default:
                return super.n(displayMetrics);
            case 4:
                return 100.0f / displayMetrics.densityDpi;
            case 5:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return ((CloseupCarouselView) obj).f35418e / displayMetrics.densityDpi;
            case 6:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return ((AnimatedPinVerticalCarouselView) obj).f46876d / displayMetrics.densityDpi;
            case 8:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return ((BaseRecyclerCellView) obj).getSmoothScrollSpeedPerPixel() / displayMetrics.densityDpi;
            case 9:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return 100.0f / displayMetrics.densityDpi;
            case 10:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return ((SnappableCarouselLayoutManager) obj).H / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final int p(int i13) {
        switch (this.f19512q) {
            case 0:
                return Math.min(100, super.p(i13));
            case 7:
                return super.p(i13) * ((q01.b) this.f19513r).f101778f;
            default:
                return super.p(i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(q01.b bVar, Activity activity) {
        super(activity);
        this.f19512q = 7;
        this.f19513r = bVar;
    }
}
