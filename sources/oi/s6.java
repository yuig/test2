package oi;

import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes3.dex */
public final class s6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f95161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6 f95162c;

    public /* synthetic */ s6(q6 q6Var, long j13, int i13) {
        this.f95160a = i13;
        this.f95162c = q6Var;
        this.f95161b = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f95160a;
        q6 q6Var = this.f95162c;
        switch (i13) {
            case 0:
                q6Var.p();
                q6Var.z();
                y3 zzj = q6Var.zzj();
                long j13 = this.f95161b;
                zzj.f95276n.b(Long.valueOf(j13), "Activity paused, time");
                bh.b bVar = q6Var.f95075g;
                ((oh.b) ((q6) bVar.f22799c).zzb()).getClass();
                t6 t6Var = new t6(System.currentTimeMillis(), bVar, 0, j13);
                bVar.f22798b = t6Var;
                ((q6) bVar.f22799c).f95071c.postDelayed(t6Var, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
                if (q6Var.l().B()) {
                    ((l) q6Var.f95074f.f74963c).a();
                    break;
                }
                break;
            default:
                q6Var.p();
                q6Var.z();
                y3 zzj2 = q6Var.zzj();
                long j14 = this.f95161b;
                zzj2.f95276n.b(Long.valueOf(j14), "Activity resumed, time");
                boolean x13 = q6Var.l().x(null, s.G0);
                j9.c cVar = q6Var.f95074f;
                if (x13) {
                    if (q6Var.l().B() || q6Var.f95072d) {
                        ((q6) cVar.f74964d).p();
                        ((l) cVar.f74963c).a();
                        cVar.f74961a = j14;
                        cVar.f74962b = j14;
                    }
                } else if (q6Var.l().B() || q6Var.n().f94783r.g()) {
                    ((q6) cVar.f74964d).p();
                    ((l) cVar.f74963c).a();
                    cVar.f74961a = j14;
                    cVar.f74962b = j14;
                }
                bh.b bVar2 = q6Var.f95075g;
                ((q6) bVar2.f22799c).p();
                t6 t6Var2 = (t6) bVar2.f22798b;
                if (t6Var2 != null) {
                    ((q6) bVar2.f22799c).f95071c.removeCallbacks(t6Var2);
                }
                ((q6) bVar2.f22799c).n().f94783r.f(false);
                q6 q6Var2 = (q6) bVar2.f22799c;
                q6Var2.p();
                q6Var2.f95072d = false;
                u6 u6Var = q6Var.f95073e;
                ((q6) u6Var.f95225b).p();
                if (((u4) ((q6) u6Var.f95225b).f24333a).e()) {
                    ((oh.b) ((q6) u6Var.f95225b).zzb()).getClass();
                    u6Var.H(System.currentTimeMillis(), false);
                    break;
                }
                break;
        }
    }
}
