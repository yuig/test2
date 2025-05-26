package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import bk.i;
import bk.o;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import lb.l0;

/* loaded from: classes3.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar.Behavior f32282a;

    public d(BottomAppBar.Behavior behavior) {
        this.f32282a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        BottomAppBar.Behavior behavior = this.f32282a;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.f32269n.get();
        if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
            view.removeOnLayoutChangeListener(this);
            return;
        }
        int height = view.getHeight();
        if (view instanceof FloatingActionButton) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int measuredWidth = floatingActionButton.getMeasuredWidth();
            int measuredHeight = floatingActionButton.getMeasuredHeight();
            Rect rect = behavior.f32268m;
            rect.set(0, 0, measuredWidth, measuredHeight);
            floatingActionButton.g(rect);
            int height2 = rect.height();
            float f13 = height2;
            float f14 = bottomAppBar.K().f32285c;
            i iVar = bottomAppBar.V;
            if (f13 != f14) {
                bottomAppBar.K().f32285c = f13;
                iVar.invalidateSelf();
            }
            o oVar = floatingActionButton.d().f117824a;
            oVar.getClass();
            float a13 = oVar.f23095e.a(new RectF(rect));
            if (a13 != bottomAppBar.K().f32288f) {
                bottomAppBar.K().f32288f = a13;
                iVar.invalidateSelf();
            }
            height = height2;
        }
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) view.getLayoutParams();
        if (behavior.f32270o == 0) {
            if (bottomAppBar.f32251b0 == 1) {
                ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = bottomAppBar.f32263n0 + (bottomAppBar.getResources().getDimensionPixelOffset(fj.e.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
            }
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = bottomAppBar.f32265p0;
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = bottomAppBar.f32264o0;
            boolean H0 = l0.H0(view);
            int i24 = bottomAppBar.f32252c0;
            if (H0) {
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin += i24;
            } else {
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin += i24;
            }
        }
        int i25 = BottomAppBar.f32248s0;
        bottomAppBar.N();
    }
}
