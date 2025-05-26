package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f121270a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f121271b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f121272c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121273d;

    /* renamed from: e, reason: collision with root package name */
    public final View f121274e;

    /* renamed from: f, reason: collision with root package name */
    public final m f121275f;

    /* renamed from: g, reason: collision with root package name */
    public final l f121276g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f121277h;

    public k(View view, m mVar, l lVar, Matrix matrix, boolean z13, boolean z14) {
        this.f121272c = z13;
        this.f121273d = z14;
        this.f121274e = view;
        this.f121275f = mVar;
        this.f121276g = lVar;
        this.f121277h = matrix;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f121270a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z13 = this.f121270a;
        m mVar = this.f121275f;
        View view = this.f121274e;
        if (!z13) {
            if (this.f121272c && this.f121273d) {
                Matrix matrix = this.f121271b;
                matrix.set(this.f121277h);
                view.setTag(e0.transition_transform, matrix);
                mVar.getClass();
                String[] strArr = ChangeTransform.K;
                view.setTranslationX(mVar.f121306a);
                view.setTranslationY(mVar.f121307b);
                WeakHashMap weakHashMap = q5.v0.f102521a;
                q5.m0.p(view, mVar.f121308c);
                view.setScaleX(mVar.f121309d);
                view.setScaleY(mVar.f121310e);
                view.setRotationX(mVar.f121311f);
                view.setRotationY(mVar.f121312g);
                view.setRotation(mVar.f121313h);
            } else {
                view.setTag(e0.transition_transform, null);
                view.setTag(e0.parent_matrix, null);
            }
        }
        b1.f121223a.k(view, null);
        mVar.getClass();
        String[] strArr2 = ChangeTransform.K;
        view.setTranslationX(mVar.f121306a);
        view.setTranslationY(mVar.f121307b);
        WeakHashMap weakHashMap2 = q5.v0.f102521a;
        q5.m0.p(view, mVar.f121308c);
        view.setScaleX(mVar.f121309d);
        view.setScaleY(mVar.f121310e);
        view.setRotationX(mVar.f121311f);
        view.setRotationY(mVar.f121312g);
        view.setRotation(mVar.f121313h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f121276g.f121295a;
        Matrix matrix2 = this.f121271b;
        matrix2.set(matrix);
        int i13 = e0.transition_transform;
        View view = this.f121274e;
        view.setTag(i13, matrix2);
        m mVar = this.f121275f;
        mVar.getClass();
        String[] strArr = ChangeTransform.K;
        view.setTranslationX(mVar.f121306a);
        view.setTranslationY(mVar.f121307b);
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.m0.p(view, mVar.f121308c);
        view.setScaleX(mVar.f121309d);
        view.setScaleY(mVar.f121310e);
        view.setRotationX(mVar.f121311f);
        view.setRotationY(mVar.f121312g);
        view.setRotation(mVar.f121313h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        String[] strArr = ChangeTransform.K;
        View view = this.f121274e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.m0.p(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
