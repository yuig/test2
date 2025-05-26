package gj;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f65167a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final q6.b f65168b = new q6.b();

    /* renamed from: c, reason: collision with root package name */
    public static final q6.a f65169c = new q6.a();

    /* renamed from: d, reason: collision with root package name */
    public static final q6.c f65170d = new q6.c();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f65171e = new DecelerateInterpolator();

    public static float a(float f13, float f14, float f15) {
        return ep.b.a(f14, f13, f15, f13);
    }

    public static float b(float f13, float f14, float f15, float f16, float f17) {
        return f17 <= f15 ? f13 : f17 >= f16 ? f14 : a(f13, f14, (f17 - f15) / (f16 - f15));
    }

    public static int c(int i13, float f13, int i14) {
        return Math.round(f13 * (i14 - i13)) + i13;
    }
}
