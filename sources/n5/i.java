package n5;

import android.graphics.drawable.ColorStateListDrawable;
import android.media.MediaCodecInfo;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Object obj) {
        return (ColorStateListDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof ColorStateListDrawable;
    }
}
