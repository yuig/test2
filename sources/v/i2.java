package v;

import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class i2 implements androidx.camera.core.impl.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123513b;

    public /* synthetic */ i2(Object obj, int i13) {
        this.f123512a = i13;
        this.f123513b = obj;
    }

    @Override // androidx.camera.core.impl.k2
    public final void a(androidx.camera.core.impl.o2 o2Var, androidx.camera.core.impl.m2 m2Var) {
        int i13 = this.f123512a;
        int i14 = 0;
        Object obj = this.f123513b;
        switch (i13) {
            case 0:
                m2 m2Var2 = (m2) obj;
                m2Var2.f123541b = m2Var2.a();
                p pVar = m2Var2.f123544e;
                if (pVar != null) {
                    d0 d0Var = pVar.f123593b;
                    d0Var.getClass();
                    try {
                        if (((Boolean) com.bumptech.glide.d.L(new p(d0Var, i14)).f106128b.get()).booleanValue()) {
                            m2 m2Var3 = d0Var.f123419x;
                            d0Var.f123398c.execute(new r(d0Var, d0.w(m2Var3), m2Var3.f123541b, m2Var3.f123542c, null, Collections.singletonList(androidx.camera.core.impl.b3.METERING_REPEATING), 2));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e13) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e13);
                    }
                }
                return;
            case 1:
                c0.i0 i0Var = (c0.i0) obj;
                c0.c0 c0Var = c0.i0.f24252z;
                if (i0Var.c() == null) {
                    return;
                }
                d0.a0 a0Var = i0Var.f24261w;
                a0Var.getClass();
                f0.h.s();
                a0Var.f53490f = true;
                d0.u uVar = a0Var.f53488d;
                if (uVar != null) {
                    f0.h.s();
                    if (!uVar.f53570d.f106128b.isDone()) {
                        ImageCaptureException imageCaptureException = new ImageCaptureException("The request is aborted silently and retried.", null);
                        f0.h.s();
                        uVar.f53573g = true;
                        com.google.common.util.concurrent.c0 c0Var2 = uVar.f53575i;
                        Objects.requireNonNull(c0Var2);
                        c0Var2.cancel(true);
                        uVar.f53571e.d(imageCaptureException);
                        uVar.f53572f.b(null);
                        d0.a0 a0Var2 = uVar.f53568b;
                        a0Var2.getClass();
                        f0.h.s();
                        kh2.m0.p("TakePictureManager", "Add a new request for retrying.");
                        a0Var2.f53485a.addFirst(uVar.f53567a);
                        a0Var2.c();
                    }
                }
                i0Var.B(true);
                String e14 = i0Var.e();
                androidx.camera.core.impl.h1 h1Var = (androidx.camera.core.impl.h1) i0Var.f24339f;
                androidx.camera.core.impl.k kVar = i0Var.f24340g;
                kVar.getClass();
                androidx.camera.core.impl.i2 C = i0Var.C(e14, h1Var, kVar);
                i0Var.f24259u = C;
                Object[] objArr = {C.c()};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                i0Var.A(Collections.unmodifiableList(arrayList));
                i0Var.o();
                d0.a0 a0Var3 = i0Var.f24261w;
                a0Var3.getClass();
                f0.h.s();
                a0Var3.f53490f = false;
                a0Var3.c();
                return;
            case 2:
                c0.w0 w0Var = (c0.w0) obj;
                c0.u0 u0Var = c0.w0.f24371v;
                if (w0Var.c() == null) {
                    return;
                }
                w0Var.D((androidx.camera.core.impl.w1) w0Var.f24339f, w0Var.f24340g);
                w0Var.o();
                return;
            case 3:
                Iterator it = ((androidx.camera.core.impl.n2) obj).f16927m.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.impl.k2) it.next()).a(o2Var, m2Var);
                }
                return;
            default:
                r0.t0 t0Var = r0.v0.C;
                ((r0.v0) obj).J();
                return;
        }
    }
}
