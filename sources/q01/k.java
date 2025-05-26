package q01;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import kotlin.jvm.internal.Intrinsics;
import v.c1;

/* loaded from: classes5.dex */
public final class k implements ar0.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101794a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f101795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f101796c;

    public /* synthetic */ k(Object obj, int i13) {
        this.f101794a = i13;
        this.f101796c = obj;
    }

    @Override // ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator withEndAction;
        ViewPropertyAnimator duration;
        ViewTreeObserver viewTreeObserver;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationY2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator withEndAction2;
        ViewPropertyAnimator duration2;
        ViewTreeObserver viewTreeObserver2;
        int i15 = this.f101794a;
        Object obj = this.f101796c;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                l lVar = (l) obj;
                boolean x93 = ((PinCloseupFragment) lVar.f101797a).x9();
                if (this.f101795b) {
                    View view = lVar.f101798b;
                    if (!x93) {
                        if (lVar.f101821y) {
                            lVar.f101821y = false;
                            c1 c1Var = lVar.f101813q;
                            if (c1Var != null) {
                                c1Var.d(0.0f, view.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height) * (-1.0f));
                            }
                            OneBarContainer oneBarContainer = lVar.f101820x;
                            if (oneBarContainer != null && (animate = oneBarContainer.animate()) != null && (translationY = animate.translationY(lVar.b() * (-1.0f))) != null && (interpolator = translationY.setInterpolator(new PathInterpolator(0.45f, 0.0f, 0.55f, 1.0f))) != null && (withEndAction = interpolator.withEndAction(new vs0.b(lVar, 14))) != null && (duration = withEndAction.setDuration(400L)) != null) {
                                duration.start();
                                break;
                            }
                        }
                    } else if (!lVar.f101821y) {
                        lVar.f101821y = true;
                        OneBarContainer oneBarContainer2 = lVar.f101820x;
                        if (oneBarContainer2 != null) {
                            bs1.c.U1(oneBarContainer2);
                        }
                        ov1.k kVar = lVar.f101815s;
                        if (kVar != null) {
                            kVar.m();
                        }
                        OneBarContainer oneBarContainer3 = lVar.f101820x;
                        if (oneBarContainer3 != null) {
                            oneBarContainer3.setTranslationY(lVar.b() * (-1.0f));
                        }
                        View view2 = (View) lVar.f101814r.getValue();
                        Intrinsics.checkNotNullExpressionValue(view2, "<get-fragmentLevelFiltersWrapper>(...)");
                        view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), view2.getPaddingEnd(), bs1.c.W(view, n80.a.pin_closeup_filters_container_elevation));
                        if (lVar.f101812p.a()) {
                            if (!pk.a0.q0(lVar.f101803g)) {
                                Window window = lVar.f101802f.getWindow();
                                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                                pk.a0.i1(window);
                            }
                            OneBarContainer oneBarContainer4 = lVar.f101820x;
                            if (oneBarContainer4 != null) {
                                oneBarContainer4.setPaddingRelative(oneBarContainer4.getPaddingStart(), ((Number) lVar.f101822z.getValue()).intValue(), oneBarContainer4.getPaddingEnd(), oneBarContainer4.getPaddingBottom());
                            }
                            c1 c1Var2 = lVar.f101813q;
                            if (c1Var2 != null) {
                                c1Var2.k(false);
                            }
                        }
                        OneBarContainer oneBarContainer5 = lVar.f101820x;
                        if (oneBarContainer5 != null && (viewTreeObserver = oneBarContainer5.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnPreDrawListener(new a5.b(lVar, 3));
                            break;
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                y yVar = (y) obj;
                boolean x94 = ((PinCloseupFragment) yVar.f101842b).x9();
                if (this.f101795b) {
                    View view3 = yVar.f101841a;
                    if (!x94) {
                        if (yVar.f101854n) {
                            yVar.f101854n = false;
                            c1 c1Var3 = yVar.f101850j;
                            if (c1Var3 != null) {
                                c1Var3.d(0.0f, view3.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height) * (-1.0f));
                            }
                            RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = yVar.f101852l;
                            if (relatedPinsFiltersCarouselView != null && (animate2 = relatedPinsFiltersCarouselView.animate()) != null && (translationY2 = animate2.translationY(yVar.a() * (-1.0f))) != null && (interpolator2 = translationY2.setInterpolator(new PathInterpolator(0.45f, 0.0f, 0.55f, 1.0f))) != null && (withEndAction2 = interpolator2.withEndAction(new vs0.b(yVar, 15))) != null && (duration2 = withEndAction2.setDuration(400L)) != null) {
                                duration2.start();
                                break;
                            }
                        }
                    } else if (!yVar.f101854n) {
                        yVar.f101854n = true;
                        RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView2 = yVar.f101852l;
                        if (relatedPinsFiltersCarouselView2 != null) {
                            bs1.c.U1(relatedPinsFiltersCarouselView2);
                        }
                        RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView3 = yVar.f101852l;
                        if (relatedPinsFiltersCarouselView3 != null) {
                            relatedPinsFiltersCarouselView3.setTranslationY(yVar.a() * (-1.0f));
                        }
                        View view4 = (View) yVar.f101851k.getValue();
                        Intrinsics.checkNotNullExpressionValue(view4, "<get-fragmentLevelFiltersWrapper>(...)");
                        view4.setPaddingRelative(view4.getPaddingStart(), view4.getPaddingTop(), view4.getPaddingEnd(), bs1.c.W(view3, n80.a.pin_closeup_filters_container_elevation));
                        if (yVar.f101848h.a()) {
                            Window window2 = yVar.f101849i.getWindow();
                            Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                            pk.a0.i1(window2);
                            RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView4 = yVar.f101852l;
                            if (relatedPinsFiltersCarouselView4 != null) {
                                relatedPinsFiltersCarouselView4.setPaddingRelative(relatedPinsFiltersCarouselView4.getPaddingStart(), ((Number) yVar.f101857q.getValue()).intValue(), relatedPinsFiltersCarouselView4.getPaddingEnd(), relatedPinsFiltersCarouselView4.getPaddingBottom());
                            }
                            c1 c1Var4 = yVar.f101850j;
                            if (c1Var4 != null) {
                                c1Var4.k(false);
                            }
                        }
                        RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView5 = yVar.f101852l;
                        if (relatedPinsFiltersCarouselView5 != null && (viewTreeObserver2 = relatedPinsFiltersCarouselView5.getViewTreeObserver()) != null) {
                            viewTreeObserver2.addOnPreDrawListener(new a5.b(yVar, 4));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        switch (this.f101794a) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                this.f101795b = i13 != 0;
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                this.f101795b = i13 != 0;
                break;
        }
    }

    @Override // ar0.y
    public final void g(RecyclerView recyclerView) {
        switch (this.f101794a) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
        }
    }
}
