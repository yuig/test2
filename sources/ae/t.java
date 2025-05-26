package ae;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f15035a = Collections.newSetFromMap(new WeakHashMap());

    @Override // ae.i
    public final void b() {
        Iterator it = he.n.e(this.f15035a).iterator();
        while (it.hasNext()) {
            ((ee.i) it.next()).b();
        }
    }

    @Override // ae.i
    public final void onDestroy() {
        Iterator it = he.n.e(this.f15035a).iterator();
        while (it.hasNext()) {
            ((ee.i) it.next()).onDestroy();
        }
    }

    @Override // ae.i
    public final void x() {
        Iterator it = he.n.e(this.f15035a).iterator();
        while (it.hasNext()) {
            ((ee.i) it.next()).x();
        }
    }
}
