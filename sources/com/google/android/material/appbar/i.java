package com.google.android.material.appbar;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.WeakHashMap;
import q5.a2;
import q5.v0;

/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f32193a;

    public i(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f32193a = collapsingToolbarLayout;
    }

    @Override // com.google.android.material.appbar.f
    public final void a(AppBarLayout appBarLayout, int i13) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f32193a;
        collapsingToolbarLayout.f32160x = i13;
        a2 a2Var = collapsingToolbarLayout.f32162z;
        int e13 = a2Var != null ? a2Var.e() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = collapsingToolbarLayout.getChildAt(i14);
            CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
            k c13 = CollapsingToolbarLayout.c(childAt);
            int i15 = layoutParams.f32163a;
            if (i15 == 1) {
                c13.b(com.bumptech.glide.c.q(-i13, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.c(childAt).f32198b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin));
            } else if (i15 == 2) {
                c13.b(Math.round((-i13) * layoutParams.f32164b));
            }
        }
        collapsingToolbarLayout.e();
        if (collapsingToolbarLayout.f32151o != null && e13 > 0) {
            WeakHashMap weakHashMap = v0.f102521a;
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        WeakHashMap weakHashMap2 = v0.f102521a;
        int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - e13;
        float b13 = height - collapsingToolbarLayout.b();
        float f13 = minimumHeight;
        float min = Math.min(1.0f, b13 / f13);
        com.google.android.material.internal.c cVar = collapsingToolbarLayout.f32147k;
        cVar.f32713d = min;
        cVar.f32715e = ep.b.a(1.0f, min, 0.5f, min);
        cVar.f32717f = collapsingToolbarLayout.f32160x + minimumHeight;
        cVar.w(Math.abs(i13) / f13);
    }
}
