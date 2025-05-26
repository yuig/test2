package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ty0 {

    /* renamed from: a, reason: collision with root package name */
    public final if1 f11732a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.d0 f11733b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11734c;

    public ty0(if1 nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f11732a = nativeAdAssets;
        wi.d0 d0Var = nativeAdAssets.f6380m;
        this.f11733b = d0Var;
        this.f11734c = d0Var != null;
    }

    public final float a() {
        Float f13;
        Drawable drawable;
        int i13;
        float f14;
        if1 if1Var = this.f11732a;
        float f15 = if1Var.f6386s;
        if (f15 != 0.0f) {
            return f15;
        }
        sn0 sn0Var = if1Var.f6379l;
        if (sn0Var != null) {
            synchronized (sn0Var.f11173e) {
                f14 = sn0Var.f11175g;
            }
            return f14;
        }
        rz0 rz0Var = if1Var.f6373f;
        if (rz0Var != null) {
            int i14 = rz0Var.f10870d;
            f13 = Float.valueOf((i14 == -1 || (i13 = rz0Var.f10871e) == -1) ? 0.0f : i14 / i13);
        } else {
            f13 = null;
        }
        if (f13 != null && !Intrinsics.c(f13, 0.0f)) {
            return f13.floatValue();
        }
        rz0 rz0Var2 = this.f11732a.f6373f;
        if (rz0Var2 == null || (drawable = rz0Var2.f10867a) == null) {
            return 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    public final float b() {
        float f13;
        sn0 sn0Var = this.f11732a.f6379l;
        if (sn0Var == null) {
            return 0.0f;
        }
        synchronized (sn0Var.f11173e) {
            f13 = sn0Var.f11174f;
        }
        return f13;
    }

    public final float c() {
        float f13;
        sn0 sn0Var = this.f11732a.f6379l;
        if (sn0Var == null) {
            return 0.0f;
        }
        synchronized (sn0Var.f11173e) {
            f13 = sn0Var.f11171c;
        }
        return f13;
    }

    public final boolean d() {
        return this.f11734c;
    }

    public final Drawable e() {
        rz0 rz0Var = this.f11732a.f6373f;
        if (rz0Var != null) {
            return rz0Var.f10867a;
        }
        return null;
    }

    public final wi.d0 f() {
        return this.f11733b;
    }
}
