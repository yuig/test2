package androidx.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class PathMotion {
    public PathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
    }

    public abstract Path a(float f13, float f14, float f15, float f16);
}
