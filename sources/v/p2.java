package v;

/* loaded from: classes2.dex */
public final /* synthetic */ class p2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.z0 f123600b;

    public /* synthetic */ p2(androidx.camera.core.impl.z0 z0Var, int i13) {
        this.f123599a = i13;
        this.f123600b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f123599a;
        androidx.camera.core.impl.z0 z0Var = this.f123600b;
        switch (i13) {
            case 1:
                z0Var.a();
                break;
            default:
                z0Var.b();
                break;
        }
    }
}
