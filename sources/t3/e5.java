package t3;

import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public static final e5 f115973a = new e5();

    public final void a(@NotNull c0 c0Var) {
        ViewParent parent = c0Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c0Var, c0Var);
        }
    }
}
