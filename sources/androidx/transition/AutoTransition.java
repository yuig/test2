package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        Y();
    }

    public final void Y() {
        X(1);
        U(new Fade(2));
        U(new ChangeBounds());
        U(new Fade(1));
    }

    public AutoTransition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Y();
    }
}
