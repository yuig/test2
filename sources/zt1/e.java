package zt1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import com.pinterest.feature.boardpreview.view.BaseBoardPreviewContainer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142776a;

    public e(int i13) {
        this.f142776a = i13;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        switch (this.f142776a) {
            case 0:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                parent.getClass();
                outRect.bottom = RecyclerView.r1(view) == state.b() + (-1) ? bs1.c.W(parent, eo1.c.space_400) : 0;
                break;
            default:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                BaseBoardPreviewContainer baseBoardPreviewContainer = (BaseBoardPreviewContainer) view;
                boolean w03 = com.bumptech.glide.c.w0((ViewGroup) view);
                parent.getClass();
                int r13 = RecyclerView.r1(view);
                int width = (parent.getWidth() - baseBoardPreviewContainer.f45340n.getWidth()) / 2;
                if (r13 != 0) {
                    if (r13 == state.b() - 1) {
                        outRect.left = w03 ? width : 0;
                        outRect.right = w03 ? 0 : width;
                        break;
                    }
                } else {
                    outRect.left = w03 ? 0 : width;
                    outRect.right = w03 ? width : 0;
                    break;
                }
                break;
        }
    }
}
