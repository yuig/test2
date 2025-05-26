package bk;

import android.view.View;

/* loaded from: classes3.dex */
public final class d0 extends b0 {
    public d0(View view) {
        d(view);
    }

    private void d(View view) {
        view.setOutlineProvider(new nj.c(this, 2));
    }

    @Override // bk.b0
    public final void a(View view) {
        view.setClipToOutline(!this.f23021a);
        if (this.f23021a) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // bk.b0
    public final boolean b() {
        return this.f23021a;
    }
}
