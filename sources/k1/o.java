package k1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f77952a = new o();

    @NotNull
    public final EdgeEffect a(@NotNull Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(@NotNull EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(@NotNull EdgeEffect edgeEffect, float f13, float f14) {
        try {
            return edgeEffect.onPullDistance(f13, f14);
        } catch (Throwable unused) {
            edgeEffect.onPull(f13, f14);
            return 0.0f;
        }
    }
}
