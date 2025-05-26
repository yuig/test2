package ma2;

import android.R;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.pinterest.ui.components.rangesliders.RangeProgressBar;
import kotlin.jvm.internal.Intrinsics;
import o80.j;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f86825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cloneable f86826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f86827d;

    public /* synthetic */ a(Object obj, Cloneable cloneable, Object obj2, int i13) {
        this.f86824a = i13;
        this.f86825b = obj;
        this.f86826c = cloneable;
        this.f86827d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        int i13 = this.f86824a;
        Object obj = this.f86827d;
        Object obj2 = this.f86826c;
        Object obj3 = this.f86825b;
        switch (i13) {
            case 0:
                RangeProgressBar this$0 = (RangeProgressBar) obj3;
                DecelerateInterpolator decelerateInterpolator = RangeProgressBar.B;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                Object animatedValue = ((ValueAnimator) obj2).getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                Object animatedValue2 = ((ValueAnimator) obj).getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                this$0.g(floatValue, ((Float) animatedValue2).floatValue(), R.id.progress);
                break;
            case 1:
                RangeProgressBar this$02 = (RangeProgressBar) obj3;
                DecelerateInterpolator decelerateInterpolator2 = RangeProgressBar.B;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "animation");
                Object animatedValue3 = ((ValueAnimator) obj2).getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue3).floatValue();
                Object animatedValue4 = ((ValueAnimator) obj).getAnimatedValue();
                Intrinsics.g(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                this$02.g(floatValue2, ((Float) animatedValue4).floatValue(), R.id.progress);
                break;
            default:
                float[] startValues = (float[]) obj3;
                float[] targetValues = (float[]) obj2;
                j this$03 = (j) obj;
                Intrinsics.checkNotNullParameter(startValues, "$startValues");
                Intrinsics.checkNotNullParameter(targetValues, "$targetValues");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "animation");
                Object animatedValue5 = it.getAnimatedValue();
                Intrinsics.g(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                float floatValue3 = ((Float) animatedValue5).floatValue();
                float[] fArr = new float[9];
                for (int i14 = 0; i14 < 9; i14++) {
                    float f13 = startValues[i14];
                    fArr[i14] = ep.b.a(targetValues[i14], f13, floatValue3, f13);
                }
                this$03.f93510q.setValues(fArr);
                this$03.l(this$03.g(), false);
                break;
        }
    }
}
