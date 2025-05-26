package oi;

import android.os.Handler;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: d, reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.q0 f94926d;

    /* renamed from: a, reason: collision with root package name */
    public final d5 f94927a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.j f94928b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f94929c;

    public l(d5 d5Var) {
        com.bumptech.glide.d.t(d5Var);
        this.f94927a = d5Var;
        this.f94928b = new androidx.appcompat.widget.j(20, this, d5Var);
    }

    public final void a() {
        this.f94929c = 0L;
        d().removeCallbacks(this.f94928b);
    }

    public final void b(long j13) {
        a();
        if (j13 >= 0) {
            ((oh.b) this.f94927a.zzb()).getClass();
            this.f94929c = System.currentTimeMillis();
            if (d().postDelayed(this.f94928b, j13)) {
                return;
            }
            this.f94927a.zzj().f95268f.b(Long.valueOf(j13), "Failed to schedule delayed post. time");
        }
    }

    public abstract void c();

    public final Handler d() {
        com.google.android.gms.internal.measurement.q0 q0Var;
        if (f94926d != null) {
            return f94926d;
        }
        synchronized (l.class) {
            try {
                if (f94926d == null) {
                    f94926d = new com.google.android.gms.internal.measurement.q0(this.f94927a.zza().getMainLooper());
                }
                q0Var = f94926d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return q0Var;
    }
}
