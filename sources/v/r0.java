package v;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f123619a;

    public r0(s0 s0Var) {
        this.f123619a = s0Var;
    }

    @Override // v.t0
    public final com.google.common.util.concurrent.c0 a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f123619a.f123657h.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).a(totalCaptureResult));
        }
        g0.r b13 = g0.m.b(arrayList);
        l0 l0Var = new l0(2);
        return g0.m.j(b13, new g0.l(l0Var), l3.c.s());
    }

    @Override // v.t0
    public final boolean b() {
        Iterator it = this.f123619a.f123657h.iterator();
        while (it.hasNext()) {
            if (((t0) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.t0
    public final void c() {
        Iterator it = this.f123619a.f123657h.iterator();
        while (it.hasNext()) {
            ((t0) it.next()).c();
        }
    }
}
