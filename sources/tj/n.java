package tj;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes3.dex */
public final class n implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public FloatEvaluator f117816a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f13, Object obj, Object obj2) {
        float floatValue = this.f117816a.evaluate(f13, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
