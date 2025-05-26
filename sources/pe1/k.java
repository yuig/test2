package pe1;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f99963c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f99964d;

    public /* synthetic */ k(Object obj, int i13, int i14, int i15) {
        this.f99961a = i15;
        this.f99962b = obj;
        this.f99963c = i13;
        this.f99964d = i14;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int i13 = this.f99961a;
        int i14 = this.f99964d;
        int i15 = this.f99963c;
        Object obj = this.f99962b;
        switch (i13) {
            case 0:
                p this$0 = (p) obj;
                int i16 = p.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                this$0.getClass();
                this$0.requireActivity().getWindow().setStatusBarColor(p.C9(i15, floatValue, i14));
                return;
            case 1:
                p this$02 = (p) obj;
                int i17 = p.H1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue2 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue2).floatValue();
                this$02.getClass();
                int C9 = p.C9(i15, floatValue2, i14);
                fo1.a i73 = this$02.i7();
                if (i73 != null) {
                    ((GestaltToolbarImpl) i73).setBackgroundColor(C9);
                    return;
                }
                return;
            default:
                mf.i this$03 = (mf.i) obj;
                int i18 = mf.i.f87075f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(animation, "updatedAnimation");
                Object animatedValue3 = animation.getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float floatValue3 = ((Float) animatedValue3).floatValue();
                RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) this$03.f87079d;
                ViewGroup.LayoutParams layoutParams = roundedCornersLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = ml2.c.c(floatValue3);
                roundedCornersLayout.setLayoutParams(layoutParams);
                float f13 = (i15 - floatValue3) / 2;
                GestaltText gestaltText = (GestaltText) this$03.f87077b;
                ViewGroup.LayoutParams layoutParams2 = gestaltText.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = (int) (i14 + f13);
                gestaltText.setLayoutParams(layoutParams2);
                return;
        }
    }
}
