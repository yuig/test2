package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class l0 implements c0.z0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16904b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final long f16905c;

    /* renamed from: d, reason: collision with root package name */
    public final c0.z0 f16906d;

    public l0(m0 m0Var, long j13) {
        this.f16906d = m0Var;
        this.f16905c = j13;
    }

    @Override // c0.z0
    public final long a() {
        return this.f16905c;
    }

    @Override // c0.z0
    public final c0.y0 b(k0 k0Var) {
        switch (this.f16904b) {
            case 0:
                return k0Var.f16898a == 1 ? c0.y0.f24394d : c0.y0.f24395e;
            default:
                c0.y0 b13 = this.f16906d.b(k0Var);
                long j13 = this.f16905c;
                if (j13 > 0) {
                    return k0Var.f16899b >= j13 - b13.f24397a ? c0.y0.f24394d : b13;
                }
                return b13;
        }
    }

    public l0(long j13, c0.z0 z0Var) {
        com.bumptech.glide.d.g("Timeout must be non-negative.", j13 >= 0);
        this.f16905c = j13;
        this.f16906d = z0Var;
    }
}
