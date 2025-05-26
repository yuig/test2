package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v1 {
    public static x1 a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? x1.INVISIBLE : b(view.getVisibility());
    }

    public static x1 b(int i13) {
        if (i13 == 0) {
            return x1.VISIBLE;
        }
        if (i13 == 4) {
            return x1.INVISIBLE;
        }
        if (i13 == 8) {
            return x1.GONE;
        }
        throw new IllegalArgumentException(a.a.d("Unknown visibility ", i13));
    }
}
