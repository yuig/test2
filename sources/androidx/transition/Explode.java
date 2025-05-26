package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import kh2.j;
import ua.e0;
import ua.k0;
import ua.n;
import ua.y0;

/* loaded from: classes3.dex */
public class Explode extends Visibility {
    public static final DecelerateInterpolator K = new DecelerateInterpolator();
    public static final AccelerateInterpolator L = new AccelerateInterpolator();

    /* renamed from: J, reason: collision with root package name */
    public final int[] f19829J;

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19829J = new int[2];
        this.A = new n();
    }

    @Override // androidx.transition.Visibility
    public final Animator W(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        if (y0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) y0Var2.f121377a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Z(viewGroup, rect, this.f19829J);
        return j.v(view, y0Var2, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, K, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator X(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        float f13;
        float f14;
        if (y0Var == null) {
            return null;
        }
        Rect rect = (Rect) y0Var.f121377a.get("android:explode:screenBounds");
        int i13 = rect.left;
        int i14 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) y0Var.f121378b.getTag(e0.transition_position);
        if (iArr != null) {
            f13 = (r7 - rect.left) + translationX;
            f14 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f13 = translationX;
            f14 = translationY;
        }
        Z(viewGroup, rect, this.f19829J);
        return j.v(view, y0Var, i13, i14, translationX, translationY, f13 + r0[0], f14 + r0[1], L, this);
    }

    public final void Z(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        int[] iArr2 = this.f19829J;
        view.getLocationOnScreen(iArr2);
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        k0 k0Var = this.B;
        Rect g13 = k0Var == null ? null : k0Var.g();
        if (g13 == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i13;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i14;
        } else {
            centerX = g13.centerX();
            centerY = g13.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2));
        int i15 = centerX - i13;
        int i16 = centerY - i14;
        float max = Math.max(i15, view.getWidth() - i15);
        float max2 = Math.max(i16, view.getHeight() - i16);
        float sqrt2 = (float) Math.sqrt((max2 * max2) + (max * max));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY2 / sqrt));
    }

    public final void a0(y0 y0Var) {
        View view = y0Var.f121378b;
        int[] iArr = this.f19829J;
        view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        y0Var.f121377a.put("android:explode:screenBounds", new Rect(i13, i14, view.getWidth() + i13, view.getHeight() + i14));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void j(y0 y0Var) {
        Visibility.U(y0Var);
        a0(y0Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void m(y0 y0Var) {
        Visibility.U(y0Var);
        a0(y0Var);
    }
}
