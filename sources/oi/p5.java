package oi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f95038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k5 f95039c;

    public /* synthetic */ p5(k5 k5Var, long j13, int i13) {
        this.f95037a = i13;
        this.f95039c = k5Var;
        this.f95038b = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f95037a;
        k5 k5Var = this.f95039c;
        long j13 = this.f95038b;
        switch (i13) {
            case 0:
                k5Var.n().f94775j.b(j13);
                y3 zzj = k5Var.zzj();
                zzj.f95275m.b(Long.valueOf(j13), "Session timeout duration set");
                break;
            default:
                k5Var.A(j13, true);
                k5Var.u().B(new AtomicReference());
                break;
        }
    }
}
