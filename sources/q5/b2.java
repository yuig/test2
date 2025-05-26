package q5;

import android.view.View;
import android.view.Window;

/* loaded from: classes3.dex */
public abstract class b2 extends e3.b {

    /* renamed from: b, reason: collision with root package name */
    public final Window f102408b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f102409c;

    public b2(Window window, h1.b bVar) {
        super(20);
        this.f102408b = window;
        this.f102409c = bVar;
    }

    @Override // e3.b
    public final void l() {
        for (int i13 = 1; i13 <= 256; i13 <<= 1) {
            if ((8 & i13) != 0) {
                if (i13 == 1) {
                    p(4);
                    this.f102408b.clearFlags(1024);
                } else if (i13 == 2) {
                    p(2);
                } else if (i13 == 8) {
                    ((e3.e) this.f102409c.f66449b).c();
                }
            }
        }
    }

    public final void o(int i13) {
        View decorView = this.f102408b.getDecorView();
        decorView.setSystemUiVisibility(i13 | decorView.getSystemUiVisibility());
    }

    public final void p(int i13) {
        View decorView = this.f102408b.getDecorView();
        decorView.setSystemUiVisibility((~i13) & decorView.getSystemUiVisibility());
    }
}
