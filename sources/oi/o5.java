package oi;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94994a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94995b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f94996c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f94997d;

    public /* synthetic */ o5(Object obj, Object obj2, long j13, int i13) {
        this.f94994a = i13;
        this.f94996c = obj;
        this.f94997d = obj2;
        this.f94995b = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f94994a) {
            case 0:
                k5 k5Var = (k5) this.f94996c;
                Bundle bundle = (Bundle) this.f94997d;
                long j13 = this.f94995b;
                if (!TextUtils.isEmpty(k5Var.q().A())) {
                    k5Var.zzj().f95273k.c("Using developer consent only; google app id found");
                    break;
                } else {
                    k5Var.B(bundle, 0, j13);
                    break;
                }
            case 1:
                ((a6) this.f94997d).E((b6) this.f94996c, false, this.f94995b);
                a6 a6Var = (a6) this.f94997d;
                a6Var.f94647e = null;
                d6 u13 = a6Var.u();
                u13.p();
                u13.w();
                u13.A(new androidx.appcompat.widget.j(28, u13, (Object) null));
                break;
            default:
                if (!((mk2.b0) this.f94997d).f87363d) {
                    mk2.b0 b0Var = (mk2.b0) this.f94997d;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    b0Var.getClass();
                    long a13 = uj2.z.a(timeUnit);
                    long j14 = this.f94995b;
                    if (j14 > a13) {
                        try {
                            Thread.sleep(j14 - a13);
                        } catch (InterruptedException e13) {
                            Thread.currentThread().interrupt();
                            lb.l0.R0(e13);
                            return;
                        }
                    }
                    if (!((mk2.b0) this.f94997d).f87363d) {
                        ((Runnable) this.f94996c).run();
                        break;
                    }
                }
                break;
        }
    }

    public o5(a6 a6Var, b6 b6Var, long j13) {
        this.f94994a = 1;
        this.f94997d = a6Var;
        this.f94996c = b6Var;
        this.f94995b = j13;
    }
}
