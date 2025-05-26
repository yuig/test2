package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.v2;
import java.util.HashMap;
import ua.a0;
import ua.b0;
import ua.e0;
import ua.g;
import ua.h;
import ua.i;
import ua.w0;
import ua.y0;

/* loaded from: classes3.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] H = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final g I = new g();

    /* renamed from: J, reason: collision with root package name */
    public static final v2 f19827J = new v2(6, Matrix.class, "animatedTransform");

    public ChangeImageTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void U(y0 y0Var, boolean z13) {
        Matrix matrix;
        View view = y0Var.f121378b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap hashMap = y0Var.f121377a;
            hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z13 ? (Matrix) imageView.getTag(e0.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i13 = h.f121259a[imageView.getScaleType().ordinal()];
                    if (i13 == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i13 != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f13 = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f14 = intrinsicHeight;
                        float max = Math.max(width / f13, height / f14);
                        int round = Math.round((width - (f13 * max)) / 2.0f);
                        int round2 = Math.round((height - (f14 * max)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(max, max);
                        matrix.postTranslate(round, round2);
                    }
                    matrix2 = matrix;
                }
            }
            hashMap.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return H;
    }

    @Override // androidx.transition.Transition
    public final void j(y0 y0Var) {
        U(y0Var, false);
    }

    @Override // androidx.transition.Transition
    public final void m(y0 y0Var) {
        U(y0Var, true);
    }

    @Override // androidx.transition.Transition
    public final Animator q(ViewGroup viewGroup, y0 y0Var, y0 y0Var2) {
        if (y0Var != null && y0Var2 != null) {
            HashMap hashMap = y0Var.f121377a;
            Rect rect = (Rect) hashMap.get("android:changeImageTransform:bounds");
            HashMap hashMap2 = y0Var2.f121377a;
            Rect rect2 = (Rect) hashMap2.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) hashMap.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) hashMap2.get("android:changeImageTransform:matrix");
                boolean z13 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z13) {
                    return null;
                }
                ImageView imageView = (ImageView) y0Var2.f121378b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                v2 v2Var = f19827J;
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    g gVar = I;
                    a0 a0Var = b0.f121222a;
                    return ObjectAnimator.ofObject(imageView, v2Var, gVar, a0Var, a0Var);
                }
                if (matrix == null) {
                    matrix = b0.f121222a;
                }
                if (matrix2 == null) {
                    matrix2 = b0.f121222a;
                }
                v2Var.set(imageView, matrix);
                ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, v2Var, new w0(), matrix, matrix2);
                i iVar = new i(imageView, matrix, matrix2);
                ofObject.addListener(iVar);
                ofObject.addPauseListener(iVar);
                a(iVar);
                return ofObject;
            }
        }
        return null;
    }
}
