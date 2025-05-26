package n5;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class r {
    public static final void a(@NotNull Resources.Theme theme, @NotNull View decor) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(decor, "decor");
        b(theme, decor, new TypedValue());
    }

    public static final void b(@NotNull Resources.Theme theme, @NotNull View decor, @NotNull TypedValue tv2) {
        WindowInsetsController windowInsetsController;
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(decor, "decor");
        Intrinsics.checkNotNullParameter(tv2, "tv");
        int i13 = (!theme.resolveAttribute(R.attr.windowLightStatusBar, tv2, true) || tv2.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, tv2, true) && tv2.data != 0) {
            i13 |= 16;
        }
        windowInsetsController = decor.getWindowInsetsController();
        Intrinsics.f(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i13, 24);
    }
}
