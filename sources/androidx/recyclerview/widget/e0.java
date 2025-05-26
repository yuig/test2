package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19367b;

    public /* synthetic */ e0(Object obj, int i13) {
        this.f19366a = i13;
        this.f19367b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        ViewGroup viewGroup;
        int i13 = this.f19366a;
        Object obj = this.f19367b;
        switch (i13) {
            case 0:
                int floatValue = (int) (((Float) it.getAnimatedValue()).floatValue() * 255.0f);
                f0 f0Var = (f0) obj;
                f0Var.f19379c.setAlpha(floatValue);
                f0Var.f19380d.setAlpha(floatValue);
                f0Var.f19395s.invalidate();
                break;
            case 1:
                ((l0) obj).f19486m = it.getAnimatedFraction();
                break;
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue).floatValue();
                BasePlaceholderLoadingLayout basePlaceholderLoadingLayout = (BasePlaceholderLoadingLayout) obj;
                basePlaceholderLoadingLayout.f52293e.reset();
                Matrix matrix = basePlaceholderLoadingLayout.f52293e;
                matrix.preTranslate(floatValue2, 0.0f);
                basePlaceholderLoadingLayout.f52291c.getShader().setLocalMatrix(matrix);
                int i14 = (int) floatValue2;
                Rect rect = basePlaceholderLoadingLayout.f52292d;
                rect.set(i14, rect.top, ((int) basePlaceholderLoadingLayout.f52290b) + i14, rect.bottom);
                basePlaceholderLoadingLayout.postInvalidateOnAnimation();
                break;
            case 3:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
                int intValue = ((Integer) it.getAnimatedValue()).intValue();
                if (intValue != collapsingToolbarLayout.f32152p) {
                    if (collapsingToolbarLayout.f32150n != null && (viewGroup = collapsingToolbarLayout.f32139c) != null) {
                        WeakHashMap weakHashMap = q5.v0.f102521a;
                        viewGroup.postInvalidateOnAnimation();
                    }
                    collapsingToolbarLayout.f32152p = intValue;
                    WeakHashMap weakHashMap2 = q5.v0.f102521a;
                    collapsingToolbarLayout.postInvalidateOnAnimation();
                    break;
                }
                break;
            case 4:
                float floatValue3 = ((Float) it.getAnimatedValue()).floatValue();
                bk.i iVar = ((BottomSheetBehavior) obj).f32305i;
                if (iVar != null) {
                    iVar.u(floatValue3);
                    break;
                }
                break;
            case 5:
                ((TabLayout) obj).scrollTo(((Integer) it.getAnimatedValue()).intValue(), 0);
                break;
            case 6:
                ((TextInputLayout) obj).f33202u0.w(((Float) it.getAnimatedValue()).floatValue());
                break;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                Object animatedValue2 = it.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue4 = ((Float) animatedValue2).floatValue();
                qv1.f fVar = (qv1.f) obj;
                fVar.f105260j.reset();
                Matrix matrix2 = fVar.f105260j;
                matrix2.preTranslate(floatValue4, 0.0f);
                fVar.f105258h.getShader().setLocalMatrix(matrix2);
                int i15 = (int) floatValue4;
                Rect rect2 = fVar.f105259i;
                rect2.set(i15, rect2.top, ((int) fVar.f105257g) + i15, rect2.bottom);
                fVar.postInvalidateOnAnimation();
                break;
        }
    }
}
