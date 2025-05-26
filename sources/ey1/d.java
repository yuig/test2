package ey1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;
import uw1.e;

/* loaded from: classes4.dex */
public final class d extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public final e f60664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, PinterestLinearLayoutManager layoutManager, e eVar) {
        super(context, layoutManager.f19157p);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        this.f60664e = eVar;
    }

    @Override // androidx.recyclerview.widget.b0, androidx.recyclerview.widget.h2
    public final void g(Canvas c13, RecyclerView parent, w2 state) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        e eVar = this.f60664e;
        if (eVar != null) {
            int paddingStart = parent.getPaddingStart();
            int width = parent.getWidth() - parent.getPaddingEnd();
            int size = eVar.f123230e.size() - 1;
            for (int i13 = 0; i13 < size; i13++) {
                View childAt = parent.getChildAt(i13);
                if (RecyclerView.r1(childAt) < size) {
                    ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
                    if (layoutParams != null) {
                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                        Drawable drawable = this.f19328a;
                        Integer valueOf = drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null;
                        Intrinsics.f(valueOf);
                        int intValue = valueOf.intValue() + bottom;
                        Drawable drawable2 = this.f19328a;
                        if (drawable2 != null) {
                            drawable2.setBounds(paddingStart, bottom, width, intValue);
                        }
                        Drawable drawable3 = this.f19328a;
                        if (drawable3 != null) {
                            drawable3.draw(c13);
                        }
                    }
                }
            }
        }
    }
}
