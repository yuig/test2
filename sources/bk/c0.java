package bk;

import android.view.View;

/* loaded from: classes3.dex */
public final class c0 extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f23027f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f23028g = 0.0f;

    public c0(View view) {
        d(view);
    }

    private void d(View view) {
        view.setOutlineProvider(new nj.c(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
    @Override // bk.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.c0.a(android.view.View):void");
    }

    @Override // bk.b0
    public final boolean b() {
        return !this.f23027f || this.f23021a;
    }
}
