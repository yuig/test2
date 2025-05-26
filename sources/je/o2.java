package je;

import android.graphics.Path;

/* loaded from: classes3.dex */
public final class o2 extends p2 {

    /* renamed from: e, reason: collision with root package name */
    public final Path f75726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t2 f75727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(float f13, Path path, t2 t2Var) {
        super(t2Var, f13, 0.0f);
        this.f75727f = t2Var;
        this.f75726e = path;
    }

    @Override // je.p2, c0.s0
    public final void k(String str) {
        t2 t2Var = this.f75727f;
        if (t2Var.W()) {
            r2 r2Var = t2Var.f75777c;
            if (r2Var.f75760b) {
                t2Var.f75775a.drawTextOnPath(str, this.f75726e, this.f75739b, this.f75740c, r2Var.f75762d);
            }
            r2 r2Var2 = t2Var.f75777c;
            if (r2Var2.f75761c) {
                t2Var.f75775a.drawTextOnPath(str, this.f75726e, this.f75739b, this.f75740c, r2Var2.f75763e);
            }
        }
        this.f75739b = t2Var.f75777c.f75762d.measureText(str) + this.f75739b;
    }
}
