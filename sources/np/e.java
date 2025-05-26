package np;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91683a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f91686d;

    public e(ImageButton imageButton, Drawable drawable, Animation animation) {
        this.f91684b = imageButton;
        this.f91685c = drawable;
        this.f91686d = animation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i13 = this.f91683a;
        Object obj = this.f91686d;
        Object obj2 = this.f91685c;
        Object obj3 = this.f91684b;
        switch (i13) {
            case 0:
                ImageView imageView = (ImageView) obj3;
                imageView.setImageDrawable((Drawable) obj2);
                imageView.startAnimation((Animation) obj);
                break;
            default:
                l81.l lVar = (l81.l) obj3;
                ca2.e eVar = lVar.f82176o2;
                l81.o oVar = eVar instanceof l81.o ? (l81.o) eVar : null;
                if (oVar != null) {
                    BottomSheetBehavior bottomSheetBehavior = oVar.f27255n;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.T(true);
                    }
                    oVar.f82199s = true;
                }
                ((ca2.e) obj2).a();
                i81.c cVar = lVar.f82177p1;
                if (cVar != null) {
                    k81.l lVar2 = (k81.l) cVar;
                    if (lVar2.f78621h) {
                        lVar2.f78644s0 = false;
                        i81.d dVar = (i81.d) lVar2.getViewIfBound();
                        if (dVar != null) {
                            f91.b bVar = ((l81.l) dVar).E1;
                            o80.j A = bVar != null ? bVar.A() : null;
                            if (A != null) {
                                A.o(false);
                            }
                        }
                        lVar2.S = k81.b.NONE;
                    }
                }
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        switch (this.f91683a) {
            case 0:
                break;
            default:
                l81.l lVar = (l81.l) this.f91684b;
                da2.g gVar = lVar.S1;
                if (gVar != null) {
                    Integer num = lVar.f82194x2;
                    gVar.k(num != null ? num.intValue() : bs1.c.C(lVar, eo1.b.color_themed_icon_subtle));
                }
                lVar.p9();
                View view = lVar.X1;
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                PinterestLoadingLayout pinterestLoadingLayout = lVar.f139735i0;
                if (pinterestLoadingLayout != null && (animate = pinterestLoadingLayout.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(100L)) != null) {
                    duration.start();
                }
                lVar.K9();
                break;
        }
    }

    public e(l81.l lVar, ca2.e eVar, Function0 function0) {
        this.f91684b = lVar;
        this.f91685c = eVar;
        this.f91686d = function0;
    }
}
