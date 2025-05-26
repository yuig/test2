package v;

import a.jg;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class v implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f123689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f123690c;

    public /* synthetic */ v(d0 d0Var, t1 t1Var, int i13) {
        this.f123688a = i13;
        this.f123690c = d0Var;
        this.f123689b = t1Var;
    }

    public final void a() {
        switch (this.f123688a) {
            case 0:
                this.f123690c.f123409n.remove(this.f123689b);
                int ordinal = this.f123690c.f123400e.ordinal();
                if (ordinal != 1 && ordinal != 4) {
                    if (ordinal == 5 || (ordinal == 6 && this.f123690c.f123407l != 0)) {
                        this.f123690c.t("Camera reopen required. Checking if the current camera can be closed safely.", null);
                    }
                }
                if (this.f123690c.f123409n.isEmpty()) {
                    d0 d0Var = this.f123690c;
                    if (d0Var.f123406k != null) {
                        d0Var.t("closing camera", null);
                        this.f123690c.f123406k.close();
                        this.f123690c.f123406k = null;
                        break;
                    }
                }
                break;
            default:
                d0 d0Var2 = this.f123690c;
                if (d0Var2.f123412q.f202a == 2 && d0Var2.f123400e == z.OPENED) {
                    this.f123690c.E(z.CONFIGURED);
                    break;
                }
                break;
        }
    }

    @Override // g0.c
    public final void onFailure(Throwable th3) {
        switch (this.f123688a) {
            case 0:
                break;
            default:
                androidx.camera.core.impl.o2 o2Var = null;
                if (!(th3 instanceof DeferrableSurface$SurfaceClosedException)) {
                    if (!(th3 instanceof CancellationException)) {
                        z zVar = this.f123690c.f123400e;
                        z zVar2 = z.OPENED;
                        if (zVar == zVar2) {
                            this.f123690c.F(zVar2, new c0.f(4, th3), true);
                        }
                        kh2.m0.t("Camera2CameraImpl", "Unable to configure camera " + this.f123690c, th3);
                        d0 d0Var = this.f123690c;
                        if (d0Var.f123408m == this.f123689b) {
                            d0Var.D();
                            break;
                        }
                    } else {
                        this.f123690c.t("Unable to configure camera cancelled", null);
                        break;
                    }
                } else {
                    d0 d0Var2 = this.f123690c;
                    androidx.camera.core.impl.z0 z0Var = ((DeferrableSurface$SurfaceClosedException) th3).f16790a;
                    Iterator it = d0Var2.f123396a.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            androidx.camera.core.impl.o2 o2Var2 = (androidx.camera.core.impl.o2) it.next();
                            if (o2Var2.b().contains(z0Var)) {
                                o2Var = o2Var2;
                            }
                        }
                    }
                    if (o2Var != null) {
                        d0 d0Var3 = this.f123690c;
                        d0Var3.getClass();
                        f0.g H0 = l3.c.H0();
                        androidx.camera.core.impl.k2 k2Var = o2Var.f16936f;
                        if (k2Var != null) {
                            d0Var3.t("Posting surface closed", new Throwable());
                            H0.execute(new jg(8, k2Var, o2Var));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // g0.c
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.f123688a) {
            case 0:
                a();
                break;
            default:
                a();
                break;
        }
    }
}
