package q5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class r0 {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i13, int i14) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i13, i14);
    }
}
