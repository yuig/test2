package j41;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f74661a = eo1.b.color_themed_light_gray;

    /* renamed from: b, reason: collision with root package name */
    public View f74662b;

    @Override // j41.b
    public final void a(c92.n content, a dimensions) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        View view = this.f74662b;
        if (view != null) {
            view.requestLayout();
        } else {
            Intrinsics.r("placeholderView");
            throw null;
        }
    }

    @Override // j41.b
    public final View b(a dimensions, Context context, d0 pinalyics) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalyics, "pinalyics");
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Object obj = d5.a.f53679a;
        view.setBackgroundColor(context.getColor(this.f74661a));
        this.f74662b = view;
        return kg.p.g(view);
    }
}
