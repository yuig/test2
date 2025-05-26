package v;

import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2 f123679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2 f123680c;

    public /* synthetic */ t2(v2 v2Var, v2 v2Var2, int i13) {
        this.f123678a = i13;
        this.f123679b = v2Var;
        this.f123680c = v2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f123678a) {
            case 0:
                v2 v2Var = this.f123679b;
                Objects.requireNonNull(v2Var.f123702f);
                v2Var.f123702f.g(this.f123680c);
                return;
            default:
                v2 v2Var2 = this.f123679b;
                v2 v2Var3 = this.f123680c;
                w1 w1Var = v2Var2.f123698b;
                synchronized (w1Var.f123717b) {
                    ((Set) w1Var.f123718c).remove(v2Var2);
                    ((Set) w1Var.f123719d).remove(v2Var2);
                }
                v2Var2.g(v2Var3);
                if (v2Var2.f123703g != null) {
                    Objects.requireNonNull(v2Var2.f123702f);
                    v2Var2.f123702f.c(v2Var3);
                    return;
                } else {
                    kh2.m0.X0("SyncCaptureSessionBase", "[" + v2Var2 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    return;
                }
        }
    }
}
