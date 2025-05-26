package t3;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f115831a = new a1();

    public final void a(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(@NotNull View view) {
        ViewTranslationCallback unused;
        z0 z0Var = z0.f116286a;
        unused = z0.f116286a;
        view.setViewTranslationCallback(z0.f116286a);
    }
}
