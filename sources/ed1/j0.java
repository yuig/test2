package ed1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nt.a2;
import so.f5;

/* loaded from: classes5.dex */
public final class j0 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f58648d;

    /* renamed from: e, reason: collision with root package name */
    public final List f58649e;

    /* renamed from: f, reason: collision with root package name */
    public final yk1.j f58650f;

    /* renamed from: g, reason: collision with root package name */
    public final f5 f58651g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f58652h;

    public j0(Context context, List previewObjects, yk1.j mvpBinder, f5 shareBoardPreviewPresenterFactory, l0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(previewObjects, "previewObjects");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f58648d = context;
        this.f58649e = previewObjects;
        this.f58650f = mvpBinder;
        this.f58651g = shareBoardPreviewPresenterFactory;
        this.f58652h = listener;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f58649e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        i91.c0 c0Var = (i91.c0) CollectionsKt.U(i13, this.f58649e);
        if (c0Var instanceof i91.d) {
            return 1;
        }
        if (!(c0Var instanceof i91.a)) {
            if ((c0Var instanceof i91.w) || (c0Var instanceof i91.y)) {
                return 3;
            }
            if (!(c0Var instanceof i91.c)) {
                return c0Var instanceof i91.x ? 6 : 0;
            }
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        com.pinterest.feature.sharesheet.view.previewcarousel.i viewHolder = (com.pinterest.feature.sharesheet.view.previewcarousel.i) y2Var;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        i91.c0 c0Var = (i91.c0) CollectionsKt.U(i13, this.f58649e);
        if (c0Var != null) {
            viewHolder.k0(c0Var, this.f58650f, this.f58651g);
        }
        l0 l0Var = this.f58652h;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        i91.c0 c0Var2 = (i91.c0) CollectionsKt.U(1, l0Var.f58657b);
        if (i13 == 1 && (c0Var2 instanceof i91.a)) {
            viewHolder.f19717a.getViewTreeObserver().addOnGlobalLayoutListener(new a2(2, viewHolder, l0Var));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        com.pinterest.feature.sharesheet.view.previewcarousel.r.f48459a.getClass();
        com.pinterest.feature.sharesheet.view.previewcarousel.r rVar = (com.pinterest.feature.sharesheet.view.previewcarousel.r) com.pinterest.feature.sharesheet.view.previewcarousel.q.f48458b.getOrDefault(Integer.valueOf(i13), null);
        Context context = this.f58648d;
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.bumptech.glide.c.a1(layoutParams, bs1.c.W(frameLayout, b62.a.preview_carousel_horizontal_margin), 0, bs1.c.W(frameLayout, b62.a.preview_carousel_horizontal_margin), 0);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        if (rVar != null) {
            return rVar.a(context, frameLayout);
        }
        View itemView = new View(context);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new com.pinterest.feature.sharesheet.view.previewcarousel.i(itemView);
    }
}
