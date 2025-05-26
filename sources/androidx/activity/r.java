package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5.d2;
import q5.e2;
import q5.f2;

/* loaded from: classes2.dex */
public final class r implements u {
    @Override // androidx.activity.u
    public void a(@NotNull n0 statusBarStyle, @NotNull n0 navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        lb.l0.j1(window, false);
        window.setStatusBarColor(z13 ? statusBarStyle.f15924b : statusBarStyle.f15923a);
        window.setNavigationBarColor(z14 ? navigationBarStyle.f15924b : navigationBarStyle.f15923a);
        h1.b bVar = new h1.b(view);
        int i13 = Build.VERSION.SDK_INT;
        e3.b f2Var = i13 >= 35 ? new f2(window, bVar) : i13 >= 30 ? new e2(window, bVar) : new d2(window, bVar);
        f2Var.j(!z13);
        f2Var.i(!z14);
    }
}
