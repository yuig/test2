package v;

import a.sc;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes2.dex */
public final class v0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public r4.i f123691a;

    /* renamed from: b, reason: collision with root package name */
    public final r4.l f123692b = com.bumptech.glide.d.L(new a.z0(this, 6));

    /* renamed from: c, reason: collision with root package name */
    public final u0 f123693c;

    public v0(sc scVar) {
        this.f123693c = scVar;
    }

    @Override // v.m
    public final boolean a(TotalCaptureResult totalCaptureResult) {
        boolean h10;
        u0 u0Var = this.f123693c;
        if (u0Var != null) {
            switch (((sc) u0Var).f167a) {
                case 17:
                    int i13 = s0.f123649l;
                    h10 = c1.h(totalCaptureResult, false);
                    break;
                case 18:
                    int i14 = z0.f123750g;
                    h10 = c1.h(totalCaptureResult, false);
                    break;
                default:
                    int i15 = b1.f123363h;
                    h10 = c1.h(totalCaptureResult, true);
                    break;
            }
            if (!h10) {
                return false;
            }
        }
        this.f123691a.b(totalCaptureResult);
        return true;
    }
}
