package lx1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public final b2 f85093e;

    /* renamed from: f, reason: collision with root package name */
    public final km1.b f85094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, PinterestLinearLayoutManager layoutManager, h hVar) {
        super(context, layoutManager.f19157p);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        this.f85093e = hVar;
        this.f85094f = new km1.b(context);
    }

    @Override // androidx.recyclerview.widget.b0, androidx.recyclerview.widget.h2
    public final void g(Canvas c13, RecyclerView parent, w2 state) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        b2 b2Var = this.f85093e;
        if (b2Var != null) {
            int paddingStart = parent.getPaddingStart();
            int width = parent.getWidth() - parent.getPaddingEnd();
            int e13 = b2Var.e() - 1;
            for (int i13 = 1; i13 < e13; i13++) {
                View childAt = parent.getChildAt(i13);
                if (RecyclerView.r1(childAt) < e13) {
                    ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
                    if (layoutParams != null) {
                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                        km1.b bVar = this.f85094f;
                        bVar.setBounds(paddingStart, bottom, width, bVar.f80204a + bottom);
                        bVar.draw(c13);
                    }
                }
            }
        }
    }
}
