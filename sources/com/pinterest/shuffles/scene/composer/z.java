package com.pinterest.shuffles.scene.composer;

import android.graphics.PointF;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final int f52181a = r72.z0.Large.getWidth();

    public static SizeF a(float f13, float f14, int i13, int i14) {
        float max = Math.max(f13 / i13, f14 / i14);
        return max > 1.0f ? new SizeF(f13 / max, f14 / max) : new SizeF(f13, f14);
    }

    public static PointF b(Size canvasSize, float f13, float f14) {
        Intrinsics.checkNotNullParameter(canvasSize, "canvasSize");
        PointF pointF = new PointF(canvasSize.getWidth() / 2.0f, canvasSize.getHeight() / 2.0f);
        float width = canvasSize.getWidth() / 375.0f;
        return new PointF((f13 - pointF.x) / width, (f14 - pointF.y) / width);
    }

    public static Size c(int i13, int i14, int i15, int i16, int i17) {
        int i18 = f52181a;
        if (i14 <= i15) {
            i14 = i18;
        }
        float f13 = i14 / i18;
        SizeF a13 = a(i16 / f13, i17 / f13, 320, 320);
        float f14 = i13 / 375.0f;
        return new Size((int) (a13.getWidth() * f14 * 1.0d), (int) (a13.getHeight() * f14 * 1.0d));
    }

    public static PointF d(Size canvasSize, double d2, double d13) {
        Intrinsics.checkNotNullParameter(canvasSize, "canvasSize");
        PointF pointF = new PointF(canvasSize.getWidth() / 2.0f, canvasSize.getHeight() / 2.0f);
        double width = canvasSize.getWidth() / 375.0f;
        return new PointF(pointF.x + ((float) (d2 * width)), pointF.y + ((float) (d13 * width)));
    }
}
