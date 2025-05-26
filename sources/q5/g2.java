package q5;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final e3.b f102441a;

    public g2(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f102441a = new f2(windowInsetsController, new h1.b(windowInsetsController));
        } else {
            this.f102441a = new e2(windowInsetsController, new h1.b(windowInsetsController));
        }
    }

    public final void a(boolean z13) {
        this.f102441a.j(z13);
    }

    public g2(Window window, View view) {
        h1.b bVar = new h1.b(view);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            this.f102441a = new f2(window, bVar);
        } else if (i13 >= 30) {
            this.f102441a = new e2(window, bVar);
        } else {
            this.f102441a = new d2(window, bVar);
        }
    }
}
