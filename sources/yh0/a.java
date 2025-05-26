package yh0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import bs1.c;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139049a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f139050b;

    public a(Context context) {
        this.f139049a = 0;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f139050b = context;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        int i13 = this.f139049a;
        Object obj = this.f139050b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                int dimension = (int) ((Context) obj).getResources().getDimension(rh0.a.express_survey_rating_item_offset);
                outRect.left = dimension;
                outRect.right = dimension;
                outRect.top = dimension;
                outRect.bottom = dimension;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(outRect, "out");
                Intrinsics.checkNotNullParameter(view, "v");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                PinterestRecyclerView this_apply = (PinterestRecyclerView) obj;
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                outRect.bottom = c.W(this_apply, eo1.c.margin);
                break;
            default:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.bottom = ((AnimatedPinVerticalCarouselView) obj).f46873a;
                break;
        }
    }

    public a(ViewGroup viewGroup, int i13) {
        this.f139049a = i13;
        this.f139050b = viewGroup;
    }
}
