package v;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes2.dex */
public class k0 implements androidx.camera.core.impl.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f123525a = new k0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.camera.core.impl.v0] */
    @Override // androidx.camera.core.impl.r0
    public void a(androidx.camera.core.impl.z2 z2Var, c1 c1Var) {
        int i13;
        androidx.camera.core.impl.s0 s0Var = (androidx.camera.core.impl.s0) z2Var.j(androidx.camera.core.impl.z2.f17017on, null);
        androidx.camera.core.impl.v1 v1Var = androidx.camera.core.impl.v1.f16979c;
        androidx.camera.core.impl.c cVar = androidx.camera.core.impl.s0.f16964i;
        androidx.camera.core.impl.s0 e13 = new c1().e();
        if (s0Var != null) {
            c1Var.a(s0Var.f16971e);
            int i14 = s0Var.f16969c;
            v1Var = s0Var.f16968b;
            i13 = i14;
        } else {
            i13 = e13.f16969c;
        }
        c1Var.f123388e = androidx.camera.core.impl.q1.k(v1Var);
        u.b bVar = new u.b(z2Var);
        c1Var.f123384a = ((Integer) ((androidx.camera.core.impl.v0) bVar.f64764b).j(u.b.f119718c, Integer.valueOf(i13))).intValue();
        c1Var.b(new n1((CameraCaptureSession.CaptureCallback) ((androidx.camera.core.impl.v0) bVar.f64764b).j(u.b.f119722g, new j0())));
        c1Var.c(u.a.d((androidx.camera.core.impl.v0) bVar.f64764b).b());
    }
}
