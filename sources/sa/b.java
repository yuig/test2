package sa;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import mj.m;

/* loaded from: classes3.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112114a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f112115b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f112116c;

    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        this.f112114a = i13;
        this.f112116c = obj;
        this.f112115b = obj2;
    }

    public static b a(View... viewArr) {
        return new b(new m(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i13 = this.f112114a;
        Object obj = this.f112116c;
        Object obj2 = this.f112115b;
        switch (i13) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = (e) obj;
                d dVar = (d) obj2;
                eVar.getClass();
                e.b(floatValue, dVar);
                eVar.a(floatValue, dVar, false);
                eVar.invalidateSelf();
                break;
            case 1:
                for (View view : (View[]) obj) {
                    switch (((m) ((com.google.android.material.internal.h) obj2)).f87265a) {
                        case 1:
                            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 2:
                            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 3:
                            Float f13 = (Float) valueAnimator.getAnimatedValue();
                            view.setScaleX(f13.floatValue());
                            view.setScaleY(f13.floatValue());
                            break;
                        default:
                            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                    }
                }
                break;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj2;
                textView.setScaleX(floatValue2);
                textView.setScaleY(floatValue2);
                break;
            default:
                ((View) obj2).invalidate();
                break;
        }
    }

    public b(m mVar, View[] viewArr) {
        this.f112114a = 1;
        this.f112115b = mVar;
        this.f112116c = viewArr;
    }
}
