package androidx.fragment.app;

/* loaded from: classes.dex */
public final class m0 extends androidx.activity.x {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w0 f18381p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(w0 w0Var) {
        super(false);
        this.f18381p = w0Var;
    }

    @Override // androidx.activity.x
    public final void handleOnBackPressed() {
        w0 w0Var = this.f18381p;
        w0Var.A(true);
        if (w0Var.f18456h.isEnabled()) {
            w0Var.U();
        } else {
            w0Var.f18455g.b();
        }
    }
}
