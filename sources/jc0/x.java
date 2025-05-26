package jc0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.feature.search.visual.cropper.FlashlightCropperView;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;

/* loaded from: classes5.dex */
public final class x extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f75447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f75448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f75449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f75450e;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f75446a = i13;
        this.f75447b = obj;
        this.f75448c = obj2;
        this.f75449d = obj3;
        this.f75450e = obj4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f75446a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                onAnimationEnd(animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f75446a;
        Object obj = this.f75450e;
        Object obj2 = this.f75449d;
        Object obj3 = this.f75448c;
        Object obj4 = this.f75447b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                p pVar = ModalContainer.f44758l;
                ((ModalContainer) obj4).l((ViewGroup) obj3, (View) obj2, (View) obj);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animation");
                com.pinterest.feature.search.visual.cropper.c cVar = (com.pinterest.feature.search.visual.cropper.c) obj4;
                FlashlightCropperView flashlightCropperView = cVar.f47997h;
                flashlightCropperView.f47970r = false;
                ViewGroup.LayoutParams layoutParams = flashlightCropperView.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                RectF rectF = (RectF) obj3;
                marginLayoutParams.width = (cVar.f47997h.getPaddingEnd() * 2) + ((int) rectF.width());
                int height = (int) rectF.height();
                FlashlightCropperView flashlightCropperView2 = cVar.f47997h;
                marginLayoutParams.height = (flashlightCropperView2.getPaddingBottom() * 2) + height;
                marginLayoutParams.leftMargin = ((int) ((g0) obj2).f80425a) - flashlightCropperView2.getPaddingStart();
                marginLayoutParams.topMargin = ((int) ((g0) obj).f80425a) - flashlightCropperView2.getPaddingTop();
                cVar.f47997h.setLayoutParams(marginLayoutParams);
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animation");
                l81.o oVar = (l81.o) obj4;
                oVar.f27256o = true;
                ((BottomSheetBehavior) obj3).X(4);
                String str = (String) obj2;
                oVar.k(f1.BOTTOM_SHEET_SNAP_MINIMIZED, str);
                ca2.c cVar2 = (ca2.c) obj;
                if (cVar2 != null) {
                    cVar2.x();
                }
                ca2.b bVar = oVar.f27252k;
                if (bVar != null) {
                    bVar.M0(str);
                }
                oVar.f82200t = false;
                break;
        }
    }
}
