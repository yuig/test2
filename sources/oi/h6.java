package oi;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzo;

/* loaded from: classes3.dex */
public final class h6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94821a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f94822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f94823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d6 f94824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractSafeParcelable f94825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f94826f;

    public h6(d6 d6Var, zzo zzoVar, boolean z13, zzad zzadVar, zzad zzadVar2) {
        this.f94824d = d6Var;
        this.f94822b = zzoVar;
        this.f94823c = z13;
        this.f94825e = zzadVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f94821a;
        boolean z13 = this.f94823c;
        zzo zzoVar = this.f94822b;
        AbstractSafeParcelable abstractSafeParcelable = this.f94825e;
        d6 d6Var = this.f94824d;
        switch (i13) {
            case 0:
                t3 t3Var = d6Var.f94726d;
                if (t3Var != null) {
                    com.bumptech.glide.d.t(zzoVar);
                    d6Var.C(t3Var, z13 ? null : (zzbg) abstractSafeParcelable, zzoVar);
                    d6Var.J();
                    break;
                } else {
                    d6Var.zzj().f95268f.c("Discarding data. Failed to send event to service");
                    break;
                }
            default:
                t3 t3Var2 = d6Var.f94726d;
                if (t3Var2 != null) {
                    com.bumptech.glide.d.t(zzoVar);
                    d6Var.C(t3Var2, z13 ? null : (zzad) abstractSafeParcelable, zzoVar);
                    d6Var.J();
                    break;
                } else {
                    d6Var.zzj().f95268f.c("Discarding data. Failed to send conditional user property to service");
                    break;
                }
        }
    }

    public h6(d6 d6Var, zzo zzoVar, boolean z13, zzbg zzbgVar, String str) {
        this.f94824d = d6Var;
        this.f94822b = zzoVar;
        this.f94823c = z13;
        this.f94825e = zzbgVar;
    }
}
