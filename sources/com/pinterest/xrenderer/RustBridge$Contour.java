package com.pinterest.xrenderer;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/pinterest/xrenderer/RustBridge$Contour", "", "Landroid/graphics/Bitmap;", "bmp", "", "bgColor", "", "enableBorder", "useGrayThreshold", "", "traceAll", "(Landroid/graphics/Bitmap;IZZ)[I", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Contour {

    /* renamed from: a, reason: collision with root package name */
    public static final RustBridge$Contour f52858a = new RustBridge$Contour();

    static {
        System.loadLibrary("xr_imgproc");
    }

    @NotNull
    public final native int[] traceAll(@NotNull Bitmap bmp, int bgColor, boolean enableBorder, boolean useGrayThreshold);
}
