package rj;

import android.content.Context;
import android.graphics.Color;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f108418f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f108419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f108421c;

    /* renamed from: d, reason: collision with root package name */
    public final int f108422d;

    /* renamed from: e, reason: collision with root package name */
    public final float f108423e;

    public a(Context context) {
        boolean X0 = c.X0(fj.c.elevationOverlayEnabled, context, false);
        int t13 = b7.c.t(context, fj.c.elevationOverlayColor, 0);
        int t14 = b7.c.t(context, fj.c.elevationOverlayAccentColor, 0);
        int t15 = b7.c.t(context, fj.c.colorSurface, 0);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f108419a = X0;
        this.f108420b = t13;
        this.f108421c = t14;
        this.f108422d = t15;
        this.f108423e = f13;
    }

    public final int a(int i13, float f13) {
        int i14;
        float min = (this.f108423e <= 0.0f || f13 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f13 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i13);
        int F = b7.c.F(f5.c.j(i13, 255), min, this.f108420b);
        if (min > 0.0f && (i14 = this.f108421c) != 0) {
            F = f5.c.g(f5.c.j(i14, f108418f), F);
        }
        return f5.c.j(F, alpha);
    }

    public final int b(int i13, float f13) {
        return (this.f108419a && f5.c.j(i13, 255) == this.f108422d) ? a(i13, f13) : i13;
    }
}
