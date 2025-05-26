package tj;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class s extends q {
    public StateListAnimator M;

    @Override // tj.q
    public final float e() {
        return this.f117844u.getElevation();
    }

    @Override // tj.q
    public final void f(Rect rect) {
        if (((FloatingActionButton) this.f117845v.f95225b).f32634h) {
            super.f(rect);
            return;
        }
        if (this.f117829f) {
            FloatingActionButton floatingActionButton = this.f117844u;
            int e13 = floatingActionButton.e(floatingActionButton.f32630d);
            int i13 = this.f117833j;
            if (e13 < i13) {
                int e14 = (i13 - floatingActionButton.e(floatingActionButton.f32630d)) / 2;
                rect.set(e14, e14, e14, e14);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // tj.q
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i13) {
        Drawable drawable;
        bk.i r13 = r();
        this.f117825b = r13;
        r13.setTintList(colorStateList);
        if (mode != null) {
            this.f117825b.setTintMode(mode);
        }
        bk.i iVar = this.f117825b;
        FloatingActionButton floatingActionButton = this.f117844u;
        iVar.o(floatingActionButton.getContext());
        if (i13 > 0) {
            Context context = floatingActionButton.getContext();
            bk.o oVar = this.f117824a;
            oVar.getClass();
            b bVar = new b(oVar);
            int i14 = fj.d.design_fab_stroke_top_outer_color;
            Object obj = d5.a.f53679a;
            int color = context.getColor(i14);
            int color2 = context.getColor(fj.d.design_fab_stroke_top_inner_color);
            int color3 = context.getColor(fj.d.design_fab_stroke_end_inner_color);
            int color4 = context.getColor(fj.d.design_fab_stroke_end_outer_color);
            bVar.f117777i = color;
            bVar.f117778j = color2;
            bVar.f117779k = color3;
            bVar.f117780l = color4;
            float f13 = i13;
            if (bVar.f117776h != f13) {
                bVar.f117776h = f13;
                bVar.f117770b.setStrokeWidth(f13 * 1.3333f);
                bVar.f117782n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList != null) {
                bVar.f117781m = colorStateList.getColorForState(bVar.getState(), bVar.f117781m);
            }
            bVar.f117784p = colorStateList;
            bVar.f117782n = true;
            bVar.invalidateSelf();
            this.f117827d = bVar;
            b bVar2 = this.f117827d;
            bVar2.getClass();
            bk.i iVar2 = this.f117825b;
            iVar2.getClass();
            drawable = new LayerDrawable(new Drawable[]{bVar2, iVar2});
        } else {
            this.f117827d = null;
            drawable = this.f117825b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(zj.a.c(colorStateList2), drawable, null);
        this.f117826c = rippleDrawable;
        this.f117828e = rippleDrawable;
    }

    @Override // tj.q
    public final void h() {
    }

    @Override // tj.q
    public final void i(int[] iArr) {
    }

    @Override // tj.q
    public final void j(float f13, float f14, float f15) {
        FloatingActionButton floatingActionButton = this.f117844u;
        if (floatingActionButton.getStateListAnimator() == this.M) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(q.G, q(f13, f15));
            stateListAnimator.addState(q.H, q(f13, f14));
            stateListAnimator.addState(q.I, q(f13, f14));
            stateListAnimator.addState(q.f117823J, q(f13, f14));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f13).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(q.B);
            stateListAnimator.addState(q.K, animatorSet);
            stateListAnimator.addState(q.L, q(0.0f, 0.0f));
            this.M = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (n()) {
            p();
        }
    }

    @Override // tj.q
    public final boolean n() {
        if (!((FloatingActionButton) this.f117845v.f95225b).f32634h) {
            if (this.f117829f) {
                FloatingActionButton floatingActionButton = this.f117844u;
                if (floatingActionButton.e(floatingActionButton.f32630d) >= this.f117833j) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // tj.q
    public final void o() {
    }

    public final AnimatorSet q(float f13, float f14) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f13};
        FloatingActionButton floatingActionButton = this.f117844u;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f14).setDuration(100L));
        animatorSet.setInterpolator(q.B);
        return animatorSet;
    }

    public final bk.i r() {
        bk.o oVar = this.f117824a;
        oVar.getClass();
        return new r(oVar);
    }
}
