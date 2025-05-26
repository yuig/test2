package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class m0 implements g2 {

    /* renamed from: b */
    public final /* synthetic */ int f16914b;

    /* renamed from: c */
    public final c0.z0 f16915c;

    public m0(long j13, int i13) {
        this.f16914b = i13;
        if (i13 != 1) {
            this.f16915c = new m0(j13, 1);
        } else {
            this.f16915c = new l0(j13, new l0(this, j13));
        }
    }

    @Override // c0.z0
    public final long a() {
        int i13 = this.f16914b;
        c0.z0 z0Var = this.f16915c;
        switch (i13) {
        }
        return z0Var.a();
    }

    @Override // c0.z0
    public final c0.y0 b(k0 k0Var) {
        int i13 = this.f16914b;
        c0.z0 z0Var = this.f16915c;
        switch (i13) {
            case 0:
                if (z0Var.b(k0Var).f24398b) {
                    return c0.y0.f24395e;
                }
                Throwable th3 = k0Var.f16900c;
                if (th3 instanceof CameraValidator$CameraIdListIncorrectException) {
                    kh2.m0.s("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((CameraValidator$CameraIdListIncorrectException) th3).f16789a > 0) {
                        return c0.y0.f24396f;
                    }
                }
                return c0.y0.f24394d;
            default:
                return z0Var.b(k0Var);
        }
    }
}
