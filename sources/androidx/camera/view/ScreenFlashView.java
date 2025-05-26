package androidx.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ScreenFlashView extends View {
    public ScreenFlashView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 0);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
