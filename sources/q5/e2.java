package q5;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class e2 extends e3.b {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f102427b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f102428c;

    /* renamed from: d, reason: collision with root package name */
    public final Window f102429d;

    public e2(WindowInsetsController windowInsetsController, h1.b bVar) {
        super(20);
        this.f102427b = windowInsetsController;
        this.f102428c = bVar;
    }

    @Override // e3.b
    public boolean e() {
        int systemBarsAppearance;
        WindowInsetsController windowInsetsController = this.f102427b;
        windowInsetsController.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = windowInsetsController.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // e3.b
    public final void i(boolean z13) {
        Window window = this.f102429d;
        WindowInsetsController windowInsetsController = this.f102427b;
        if (z13) {
            if (window != null) {
                o(16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // e3.b
    public final void j(boolean z13) {
        Window window = this.f102429d;
        WindowInsetsController windowInsetsController = this.f102427b;
        if (z13) {
            if (window != null) {
                o(8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // e3.b
    public final void l() {
        ((e3.e) this.f102428c.f66449b).c();
        this.f102427b.show(0);
    }

    public final void o(int i13) {
        View decorView = this.f102429d.getDecorView();
        decorView.setSystemUiVisibility(i13 | decorView.getSystemUiVisibility());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e2(android.view.Window r2, h1.b r3) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = as.d.h(r2)
            r1.<init>(r0, r3)
            r1.f102429d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e2.<init>(android.view.Window, h1.b):void");
    }
}
