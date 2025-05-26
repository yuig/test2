package pw0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f101512a;

    public /* synthetic */ d() {
        this(false);
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.b() == 0) {
            return;
        }
        int W = bs1.c.W(view, eo1.c.space_200);
        parent.getClass();
        int r13 = RecyclerView.r1(view);
        boolean z13 = this.f101512a;
        if (r13 == 0) {
            if (z13) {
                outRect.right = W;
            } else {
                outRect.left = W;
            }
        }
        if (z13) {
            outRect.left = W;
        } else {
            outRect.right = W;
        }
    }

    public d(boolean z13) {
        this.f101512a = z13;
    }
}
