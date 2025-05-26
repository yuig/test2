package oi;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class q6 extends k2 {

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.q0 f95071c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f95072d;

    /* renamed from: e, reason: collision with root package name */
    public final u6 f95073e;

    /* renamed from: f, reason: collision with root package name */
    public final j9.c f95074f;

    /* renamed from: g, reason: collision with root package name */
    public final bh.b f95075g;

    public q6(u4 u4Var) {
        super(u4Var);
        this.f95072d = true;
        this.f95073e = new u6(this, 0);
        this.f95074f = new j9.c(this);
        this.f95075g = new bh.b(this);
    }

    @Override // oi.k2
    public final boolean y() {
        return false;
    }

    public final void z() {
        p();
        if (this.f95071c == null) {
            this.f95071c = new com.google.android.gms.internal.measurement.q0(Looper.getMainLooper());
        }
    }
}
