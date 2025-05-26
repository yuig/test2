package ko0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80294b;

    public b(int i13, int i14) {
        this.f80293a = i14;
        this.f80294b = i13;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        int i13 = this.f80293a;
        int i14 = this.f80294b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                if (state.b() != 0) {
                    outRect.set(i14, 0, i14, 0);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                outRect.top = i14;
                outRect.left = i14;
                outRect.right = i14;
                outRect.bottom = i14;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                outRect.left = i14;
                outRect.top = i14;
                outRect.right = i14;
                outRect.bottom = i14;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                if (state.b() != 0) {
                    outRect.set(0, 0, i14, 0);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                parent.getClass();
                int r13 = RecyclerView.r1(view);
                outRect.left = r13 == 0 ? 0 : i14 / 2;
                outRect.right = r13 != state.b() + (-1) ? i14 / 2 : 0;
                break;
        }
    }

    public b(int i13, Resources resources) {
        this.f80293a = i13;
        if (i13 != 2) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.f80294b = bs1.c.U(eo1.c.lego_brick_quarter, resources);
        } else {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.f80294b = resources.getDimensionPixelSize(eo1.c.lego_image_spacing);
        }
    }
}
