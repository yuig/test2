package oi;

import android.os.SystemClock;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes3.dex */
public final class r5 extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f95084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f95085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5(Object obj, u4 u4Var, int i13) {
        super(u4Var);
        this.f95084e = i13;
        this.f95085f = obj;
    }

    @Override // oi.l
    public final void c() {
        int i13 = this.f95084e;
        Object obj = this.f95085f;
        switch (i13) {
            case 0:
                k5 k5Var = (k5) obj;
                if (((u4) k5Var.f24333a).g()) {
                    k5Var.f94919p.b(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
                    break;
                }
                break;
            case 1:
                j9.c cVar = (j9.c) obj;
                ((q6) cVar.f74964d).p();
                q6 q6Var = (q6) cVar.f74964d;
                ((oh.b) q6Var.zzb()).getClass();
                cVar.a(SystemClock.elapsedRealtime(), false, false);
                o i14 = ((u4) q6Var.f24333a).i();
                ((oh.b) q6Var.zzb()).getClass();
                i14.w(SystemClock.elapsedRealtime());
                break;
            default:
                v6 v6Var = (v6) obj;
                v6Var.w();
                v6Var.zzj().f95276n.c("Starting upload from DelayedRunnable");
                v6Var.f95249b.O();
                break;
        }
    }
}
