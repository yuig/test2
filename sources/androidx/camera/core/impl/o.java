package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16928a = new ArrayList();

    public o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!(nVar instanceof p)) {
                this.f16928a.add(nVar);
            }
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void a(int i13) {
        Iterator it = this.f16928a.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(i13);
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void b(int i13, z zVar) {
        Iterator it = this.f16928a.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b(i13, zVar);
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void c(int i13, r rVar) {
        Iterator it = this.f16928a.iterator();
        while (it.hasNext()) {
            ((n) it.next()).c(i13, rVar);
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void d(int i13) {
        Iterator it = this.f16928a.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d(i13);
        }
    }
}
