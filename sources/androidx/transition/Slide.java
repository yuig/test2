package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import ao2.m0;
import kh2.j;
import org.xmlpull.v1.XmlPullParser;
import ua.g0;
import ua.h0;
import ua.i0;
import ua.j0;
import ua.k0;
import ua.y0;

/* loaded from: classes3.dex */
public class Slide extends Visibility {
    public static final DecelerateInterpolator K = new DecelerateInterpolator();
    public static final AccelerateInterpolator L = new AccelerateInterpolator();
    public static final h0 M = new h0(0);
    public static final h0 N = new h0(1);
    public static final i0 O = new i0(0);
    public static final h0 P = new h0(2);
    public static final h0 Q = new h0(3);
    public static final i0 R = new i0(1);

    /* renamed from: J, reason: collision with root package name */
    public j0 f19832J;

    public Slide(int i13) {
        this.f19832J = R;
        Z(i13);
    }

    @Override // androidx.transition.Visibility
    public final Animator W(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        if (y0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) y0Var2.f121377a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return j.v(view, y0Var2, iArr[0], iArr[1], this.f19832J.a(view, viewGroup), this.f19832J.b(view, viewGroup), translationX, translationY, K, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator X(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        if (y0Var == null) {
            return null;
        }
        int[] iArr = (int[]) y0Var.f121377a.get("android:slide:screenPosition");
        return j.v(view, y0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f19832J.a(view, viewGroup), this.f19832J.b(view, viewGroup), L, this);
    }

    public final void Z(int i13) {
        if (i13 == 3) {
            this.f19832J = M;
        } else if (i13 == 5) {
            this.f19832J = P;
        } else if (i13 == 48) {
            this.f19832J = O;
        } else if (i13 == 80) {
            this.f19832J = R;
        } else if (i13 == 8388611) {
            this.f19832J = N;
        } else {
            if (i13 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f19832J = Q;
        }
        g0 g0Var = new g0();
        g0Var.f121257s = i13;
        this.A = g0Var;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void j(y0 y0Var) {
        Visibility.U(y0Var);
        int[] iArr = new int[2];
        y0Var.f121378b.getLocationOnScreen(iArr);
        y0Var.f121377a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void m(y0 y0Var) {
        Visibility.U(y0Var);
        int[] iArr = new int[2];
        y0Var.f121378b.getLocationOnScreen(iArr);
        y0Var.f121377a.put("android:slide:screenPosition", iArr);
    }

    public Slide(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19832J = R;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121284g);
        int D = m0.D(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        Z(D);
    }
}
