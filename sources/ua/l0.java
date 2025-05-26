package ua;

import android.graphics.Path;
import androidx.transition.PathMotion;

/* loaded from: classes.dex */
public final class l0 extends PathMotion {
    @Override // androidx.transition.PathMotion
    public final Path a(float f13, float f14, float f15, float f16) {
        Path path = new Path();
        path.moveTo(f13, f14);
        path.lineTo(f15, f16);
        return path;
    }
}
