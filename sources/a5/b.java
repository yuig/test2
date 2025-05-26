package a5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import q01.l;
import tj.q;
import ua.y;
import v.c1;

/* loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f710b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f709a = i13;
        this.f710b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewTreeObserver viewTreeObserver;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationY2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator duration2;
        ViewTreeObserver viewTreeObserver2;
        int i13 = this.f709a;
        Object obj = this.f710b;
        switch (i13) {
            case 0:
                ((CoordinatorLayout) obj).E(0);
                break;
            case 1:
                y yVar = (y) obj;
                yVar.postInvalidateOnAnimation();
                ViewGroup viewGroup = yVar.f121371a;
                if (viewGroup != null && (view = yVar.f121372b) != null) {
                    viewGroup.endViewTransition(view);
                    yVar.f121371a.postInvalidateOnAnimation();
                    yVar.f121371a = null;
                    yVar.f121372b = null;
                    break;
                }
                break;
            case 2:
                q qVar = (q) obj;
                float rotation = qVar.f117844u.getRotation();
                if (qVar.f117837n != rotation) {
                    qVar.f117837n = rotation;
                    qVar.o();
                    break;
                }
                break;
            case 3:
                l lVar = (l) obj;
                OneBarContainer oneBarContainer = lVar.f101820x;
                if (oneBarContainer != null && (viewTreeObserver = oneBarContainer.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                OneBarContainer oneBarContainer2 = lVar.f101820x;
                if (oneBarContainer2 != null && (animate = oneBarContainer2.animate()) != null && (translationY = animate.translationY(0.0f)) != null && (interpolator = translationY.setInterpolator(new PathInterpolator(0.45f, 0.0f, 0.55f, 1.0f))) != null && (duration = interpolator.setDuration(400L)) != null) {
                    duration.start();
                }
                c1 c1Var = lVar.f101813q;
                if (c1Var != null) {
                    c1Var.d(lVar.f101798b.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height) * (-1.0f), 0.0f);
                    break;
                }
                break;
            default:
                q01.y yVar2 = (q01.y) obj;
                RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = yVar2.f101852l;
                if (relatedPinsFiltersCarouselView != null && (viewTreeObserver2 = relatedPinsFiltersCarouselView.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnPreDrawListener(this);
                }
                RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView2 = yVar2.f101852l;
                if (relatedPinsFiltersCarouselView2 != null && (animate2 = relatedPinsFiltersCarouselView2.animate()) != null && (translationY2 = animate2.translationY(0.0f)) != null && (interpolator2 = translationY2.setInterpolator(new PathInterpolator(0.45f, 0.0f, 0.55f, 1.0f))) != null && (duration2 = interpolator2.setDuration(400L)) != null) {
                    duration2.start();
                }
                c1 c1Var2 = yVar2.f101850j;
                if (c1Var2 != null) {
                    c1Var2.d(yVar2.f101841a.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height) * (-1.0f), 0.0f);
                    break;
                }
                break;
        }
        return false;
    }
}
