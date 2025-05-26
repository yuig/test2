package q5;

import android.view.Window;

/* loaded from: classes3.dex */
public abstract class c2 extends b2 {
    @Override // e3.b
    public final boolean e() {
        return (this.f102408b.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // e3.b
    public final void j(boolean z13) {
        if (!z13) {
            p(8192);
            return;
        }
        Window window = this.f102408b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        o(8192);
    }
}
