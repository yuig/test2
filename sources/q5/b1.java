package q5;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.sw0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102407c;

    public /* synthetic */ b1(int i13, Object obj, Object obj2) {
        this.f102405a = i13;
        this.f102406b = obj;
        this.f102407c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator anim) {
        float animatedFraction;
        int i13 = this.f102405a;
        Object obj = this.f102407c;
        Object obj2 = this.f102406b;
        switch (i13) {
            case 0:
                ((f1) obj2).s((View) obj);
                return;
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i14 = AppBarLayout.f32098y;
                appBarLayout.getClass();
                float floatValue = ((Float) anim.getAnimatedValue()).floatValue();
                ((bk.i) obj).s(floatValue);
                Drawable drawable = appBarLayout.f32119u;
                if (drawable instanceof bk.i) {
                    ((bk.i) drawable).s(floatValue);
                }
                Iterator it = appBarLayout.f32115q.iterator();
                if (it.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    throw null;
                }
                return;
            case 2:
                pu0.r data = (pu0.r) obj2;
                su0.r this$0 = (su0.r) obj;
                int i15 = su0.r.f115216f;
                Intrinsics.checkNotNullParameter(data, "$data");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(anim, "anim");
                Iterator it2 = data.f101419d.iterator();
                while (it2.hasNext()) {
                    int i16 = su0.q.f115215a[((sw0) it2.next()).ordinal()];
                    if (i16 == 1) {
                        this$0.f115217a.setAlpha(((Float) pk2.f.d(ViewGroup.ALPHA, anim, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                    } else if (i16 == 2) {
                        this$0.f115217a.setTranslationX(((Float) pk2.f.d(ViewGroup.TRANSLATION_X, anim, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                    } else if (i16 == 3) {
                        this$0.f115217a.setTranslationY(((Float) pk2.f.d(ViewGroup.TRANSLATION_Y, anim, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                    } else if (i16 == 4) {
                        this$0.f115217a.setScaleX(((Float) pk2.f.d(ViewGroup.SCALE_X, anim, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                    } else if (i16 == 5) {
                        this$0.f115217a.setScaleY(((Float) pk2.f.d(ViewGroup.SCALE_Y, anim, "null cannot be cast to non-null type kotlin.Float")).floatValue());
                    }
                }
                return;
            case 3:
                BottomSheetBehavior this_apply = (BottomSheetBehavior) obj;
                Intrinsics.checkNotNullParameter((l81.o) obj2, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(anim, "animation");
                Object animatedValue = anim.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue).floatValue();
                this_apply.W((int) ((r8.f27259r * floatValue2) + ((1 - floatValue2) * r8.f27245d)));
                this_apply.X(4);
                return;
            case 4:
                View it3 = (View) obj;
                j91.d this$02 = (j91.d) obj2;
                Intrinsics.checkNotNullParameter(it3, "$it");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(anim, "value");
                it3.setAlpha(Math.min(1.0f, anim.getAnimatedFraction()) * 255);
                this$02.invalidate();
                return;
            case 5:
                y62.e drawable2 = (y62.e) obj2;
                MaskedImageView this$03 = (MaskedImageView) obj;
                int i17 = MaskedImageView.f51978g;
                Intrinsics.checkNotNullParameter(drawable2, "$drawable");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(anim, "it");
                Object animatedValue2 = anim.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                drawable2.setAlpha(((Integer) animatedValue2).intValue());
                this$03.invalidate();
                return;
            default:
                hb2.t this$04 = (hb2.t) obj2;
                kotlin.jvm.internal.f0 textHasBeenChanged = (kotlin.jvm.internal.f0) obj;
                int i18 = hb2.t.f68606m;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(textHasBeenChanged, "$textHasBeenChanged");
                Intrinsics.checkNotNullParameter(anim, "listener");
                GestaltText gestaltText = this$04.f68609c;
                if (anim.getAnimatedFraction() <= 0.5d) {
                    animatedFraction = 1.0f - (anim.getAnimatedFraction() * 2.0f);
                } else {
                    if (!textHasBeenChanged.f80424a) {
                        pk.a0.q(this$04.f68609c, bs1.c.j2(new String[0], m60.x0.back_online_indicator));
                        this$04.f68610d.setImageResource(m60.s0.ic_online_indicator_nonpds);
                        textHasBeenChanged.f80424a = true;
                    }
                    animatedFraction = (anim.getAnimatedFraction() - 0.5f) * 2.0f;
                }
                gestaltText.setAlpha(animatedFraction);
                Object animatedValue3 = anim.getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                this$04.f68608b.setBackgroundColor(((Integer) animatedValue3).intValue());
                return;
        }
    }

    public /* synthetic */ b1(View view, j91.d dVar) {
        this.f102405a = 4;
        this.f102407c = view;
        this.f102406b = dVar;
    }
}
