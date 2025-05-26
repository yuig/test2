package gj;

import android.animation.TypeEvaluator;

/* loaded from: classes3.dex */
public final class b implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final b f65172a = new b();

    public static Integer a(float f13, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f14 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f15 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float a13 = ep.b.a(f15, f14, f13, f14);
        float a14 = ep.b.a(pow4, pow, f13, pow);
        float a15 = ep.b.a(pow5, pow2, f13, pow2);
        float a16 = ep.b.a(pow6, pow3, f13, pow3);
        float pow7 = ((float) Math.pow(a14, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(a15, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(a16, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(a13 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f13, Object obj, Object obj2) {
        return a(f13, (Integer) obj, (Integer) obj2);
    }
}
