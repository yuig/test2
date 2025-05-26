package e3;

import android.graphics.Outline;
import b3.o0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f57104a = new l();

    public final void a(@NotNull Outline outline, @NotNull o0 o0Var) {
        if (!(o0Var instanceof b3.k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((b3.k) o0Var).f21334a);
    }
}
