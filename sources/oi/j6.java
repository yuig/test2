package oi;

/* loaded from: classes3.dex */
public final class j6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f94879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k6 f94880c;

    public /* synthetic */ j6(k6 k6Var, t3 t3Var, int i13) {
        this.f94878a = i13;
        this.f94880c = k6Var;
        this.f94879b = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f94878a) {
            case 0:
                synchronized (this.f94880c) {
                    try {
                        this.f94880c.f94921a = false;
                        if (!this.f94880c.f94923c.G()) {
                            this.f94880c.f94923c.zzj().f95276n.c("Connected to service");
                            d6 d6Var = this.f94880c.f94923c;
                            t3 t3Var = this.f94879b;
                            d6Var.p();
                            com.bumptech.glide.d.t(t3Var);
                            d6Var.f94726d = t3Var;
                            d6Var.J();
                            d6Var.I();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f94880c) {
                    try {
                        this.f94880c.f94921a = false;
                        if (!this.f94880c.f94923c.G()) {
                            this.f94880c.f94923c.zzj().f95275m.c("Connected to remote service");
                            d6 d6Var2 = this.f94880c.f94923c;
                            t3 t3Var2 = this.f94879b;
                            d6Var2.p();
                            com.bumptech.glide.d.t(t3Var2);
                            d6Var2.f94726d = t3Var2;
                            d6Var2.J();
                            d6Var2.I();
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
