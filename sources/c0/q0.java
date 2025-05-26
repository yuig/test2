package c0;

import a.ig;
import androidx.camera.core.impl.o2;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q0 extends androidx.camera.core.impl.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24316b;

    public q0(Object obj, int i13) {
        this.f24315a = i13;
        this.f24316b = obj;
    }

    @Override // androidx.camera.core.impl.n
    public final void b(int i13, androidx.camera.core.impl.z zVar) {
        switch (this.f24315a) {
            case 0:
                r0 r0Var = (r0) this.f24316b;
                synchronized (r0Var.f24317a) {
                    try {
                        if (r0Var.f24321e) {
                            return;
                        }
                        r0Var.f24325i.put(zVar.h(), new h0.c(zVar));
                        r0Var.e();
                        return;
                    } finally {
                    }
                }
            case 3:
                Iterator it = ((p0.g) this.f24316b).f98328a.iterator();
                while (it.hasNext()) {
                    o2 o2Var = ((s1) it.next()).f24346m;
                    Iterator it2 = o2Var.f16937g.f16971e.iterator();
                    while (it2.hasNext()) {
                        ((androidx.camera.core.impl.n) it2.next()).b(i13, new p0.h(zVar, o2Var.f16937g.f16973g, -1L));
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void d(int i13) {
        switch (this.f24315a) {
            case 1:
                l3.c.H0().execute(new ig(this, 17));
                break;
        }
    }
}
