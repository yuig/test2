package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.pinterest.ads.feature.waista.view.GenAiDisclosureSkeletonLoadingView;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.pin.creation.view.UploadProgressTrackerView;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19029b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f19028a = i13;
        this.f19029b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup$LayoutParams] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13 = this.f19028a;
        Object obj = this.f19029b;
        switch (i13) {
            case 0:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i14 = DefaultTimeBar.P;
                defaultTimeBar.getClass();
                defaultTimeBar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f18880a);
                return;
            case 1:
                lj.b bVar = (lj.b) obj;
                ColorDrawable colorDrawable = lj.b.f83586z;
                bVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bVar.f83596j.setAlpha((int) (255.0f * floatValue));
                bVar.f83610x = floatValue;
                return;
            case 2:
                ((ClippableRoundedCornerLayout) obj).a(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                DrawerLayout drawerLayout = (DrawerLayout) obj;
                int i15 = com.google.android.material.navigation.a.f32846a;
                drawerLayout.f18180d = f5.c.j(-1728053248, gj.a.c(com.google.android.material.navigation.a.f32846a, valueAnimator.getAnimatedFraction(), 0));
                drawerLayout.invalidate();
                return;
            case 4:
                ((j.d) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ((com.google.android.material.internal.e) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) obj;
                kVar.getClass();
                kVar.f33274d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                wu.i this$0 = (wu.i) obj;
                float f13 = wu.i.K0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                FrameLayout frameLayout = this$0.f35324k0;
                if (frameLayout != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    frameLayout.setBackgroundColor(((Integer) animatedValue).intValue());
                    return;
                }
                return;
            case 8:
                xu.a this$02 = (xu.a) obj;
                int i16 = xu.a.f135920w;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Drawable background = this$02.f53200b.getBackground();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                d7.b.A0(background, ((Integer) animatedValue2).intValue());
                return;
            case 9:
                zu.f this$03 = (zu.f) obj;
                int i17 = zu.f.f142796k;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Drawable background2 = this$03.f142803g.getBackground();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                d7.b.A0(background2, ((Integer) animatedValue3).intValue());
                return;
            case 10:
                GenAiDisclosureSkeletonLoadingView this$04 = (GenAiDisclosureSkeletonLoadingView) obj;
                int i18 = GenAiDisclosureSkeletonLoadingView.f35408h;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "animator");
                ViewGroup.LayoutParams layoutParams = this$04.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 != null) {
                    float f14 = marginLayoutParams2.height;
                    Object animatedValue4 = valueAnimator.getAnimatedValue();
                    Intrinsics.g(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                    marginLayoutParams2.height = (int) (((Float) animatedValue4).floatValue() * f14);
                    float f15 = marginLayoutParams2.topMargin;
                    Object animatedValue5 = valueAnimator.getAnimatedValue();
                    Intrinsics.g(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                    marginLayoutParams2.topMargin = (int) (((Float) animatedValue5).floatValue() * f15);
                    float f16 = marginLayoutParams2.bottomMargin;
                    Object animatedValue6 = valueAnimator.getAnimatedValue();
                    Intrinsics.g(animatedValue6, "null cannot be cast to non-null type kotlin.Float");
                    marginLayoutParams2.bottomMargin = (int) (((Float) animatedValue6).floatValue() * f16);
                    marginLayoutParams = marginLayoutParams2;
                } else {
                    marginLayoutParams = this$04.getLayoutParams();
                }
                this$04.setLayoutParams(marginLayoutParams);
                return;
            case 11:
                su0.r this$05 = (su0.r) obj;
                int i19 = su0.r.f115216f;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "anim");
                this$05.f115217a.setAlpha(((Float) pk2.f.d(ViewGroup.ALPHA, valueAnimator, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                return;
            case 12:
                b11.d this$06 = (b11.d) obj;
                int i23 = b11.d.f20978e;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Object animatedValue7 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue7, "null cannot be cast to non-null type kotlin.Float");
                this$06.c(((Float) animatedValue7).floatValue());
                return;
            case 13:
                mf.i this$07 = (mf.i) obj;
                int i24 = mf.i.f87075f;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "updatedAnimation");
                RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) this$07.f87079d;
                ViewGroup.LayoutParams layoutParams2 = roundedCornersLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Object animatedValue8 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue8, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.width = ((Integer) animatedValue8).intValue();
                roundedCornersLayout.setLayoutParams(layoutParams2);
                return;
            case 14:
                UploadProgressTrackerView this$08 = (UploadProgressTrackerView) obj;
                int i25 = UploadProgressTrackerView.f47136h;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "it");
                Object animatedValue9 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue9, "null cannot be cast to non-null type kotlin.Float");
                this$08.f47137a = ((Float) animatedValue9).floatValue();
                this$08.invalidate();
                return;
            case 15:
                l81.l this$09 = (l81.l) obj;
                int i26 = l81.l.Q2;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "animator");
                FrameLayout frameLayout2 = this$09.F1;
                ViewGroup.LayoutParams layoutParams3 = frameLayout2 != null ? frameLayout2.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    Object animatedValue10 = valueAnimator.getAnimatedValue();
                    Intrinsics.g(animatedValue10, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams3.height = ((Integer) animatedValue10).intValue();
                }
                FrameLayout frameLayout3 = this$09.F1;
                if (frameLayout3 != null) {
                    frameLayout3.requestLayout();
                    return;
                }
                return;
            case 16:
                xi1.c this$010 = (xi1.c) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                xi1.i iVar = this$010.f135036h;
                Object animatedValue11 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue11, "null cannot be cast to non-null type kotlin.Int");
                iVar.f135059r = ((Integer) animatedValue11).intValue();
                xi1.i iVar2 = this$010.f135036h;
                this$010.f121492a.postInvalidate(iVar2.getBounds().left, iVar2.getBounds().top, iVar2.getBounds().right, iVar2.getBounds().bottom);
                return;
            case 17:
                sj1.a this$011 = (sj1.a) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "animation");
                Object animatedValue12 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue12, "null cannot be cast to non-null type kotlin.Float");
                this$011.f113018q = ((Float) animatedValue12).floatValue();
                if (this$011.f113019r) {
                    this$011.f100282f.f100303o.setAlpha((int) (((bs1.c.B(this$011.f121492a, eo1.b.color_themed_text_default) >> 24) & 255) * this$011.f113018q));
                }
                this$011.c();
                return;
            case 18:
                LegoFloatingBottomNavBar this$012 = (LegoFloatingBottomNavBar) obj;
                int i27 = LegoFloatingBottomNavBar.N;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "it");
                this$012.f49973u.f106358h.c(Integer.valueOf((int) this$012.getTranslationY()));
                return;
            case 19:
                OneBarContainer this_apply = (OneBarContainer) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(valueAnimator, "animation");
                ViewGroup.LayoutParams layoutParams4 = this_apply.getLayoutParams();
                Object animatedValue13 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue13, "null cannot be cast to non-null type kotlin.Int");
                layoutParams4.height = ((Integer) animatedValue13).intValue();
                this_apply.requestLayout();
                return;
            case 20:
                ov1.k this$013 = (ov1.k) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "animation");
                ViewGroup.LayoutParams layoutParams5 = this$013.f97742j.getLayoutParams();
                Object animatedValue14 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue14, "null cannot be cast to non-null type kotlin.Int");
                layoutParams5.height = ((Integer) animatedValue14).intValue();
                this$013.f97742j.requestLayout();
                return;
            case 21:
                ua2.n this$014 = (ua2.n) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                wa2.g gVar = this$014.f121572q;
                Object animatedValue15 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue15, "null cannot be cast to non-null type kotlin.Int");
                gVar.f128710r = ((Integer) animatedValue15).intValue();
                wa2.g gVar2 = this$014.f121572q;
                this$014.f121502f.postInvalidate(gVar2.getBounds().left, gVar2.getBounds().top, gVar2.getBounds().right, gVar2.getBounds().bottom);
                return;
            case 22:
                ua2.s this$015 = (ua2.s) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "animation");
                Object animatedValue16 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue16, "null cannot be cast to non-null type kotlin.Float");
                ((Float) animatedValue16).floatValue();
                this$015.getClass();
                this$015.f121502f.postInvalidate();
                return;
            default:
                cb2.o this$016 = (cb2.o) obj;
                int i28 = cb2.o.f27340m;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(valueAnimator, "anim");
                Object animatedValue17 = valueAnimator.getAnimatedValue();
                Intrinsics.g(animatedValue17, "null cannot be cast to non-null type kotlin.Float");
                this$016.a().setAlpha(((Float) animatedValue17).floatValue());
                return;
        }
    }
}
