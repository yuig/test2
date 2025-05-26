package ae;

import androidx.annotation.NonNull;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h implements g, y {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15012a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.s f15013b;

    public h(androidx.lifecycle.s sVar) {
        this.f15013b = sVar;
        sVar.a(this);
    }

    @Override // ae.g
    public final void h(i iVar) {
        this.f15012a.add(iVar);
        androidx.lifecycle.r rVar = ((b0) this.f15013b).f18588d;
        if (rVar == androidx.lifecycle.r.DESTROYED) {
            iVar.onDestroy();
        } else if (rVar.isAtLeast(androidx.lifecycle.r.STARTED)) {
            iVar.x();
        } else {
            iVar.b();
        }
    }

    @Override // ae.g
    public final void m(i iVar) {
        this.f15012a.remove(iVar);
    }

    @n0(androidx.lifecycle.q.ON_DESTROY)
    public void onDestroy(@NonNull z zVar) {
        Iterator it = he.n.e(this.f15012a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
        zVar.getLifecycle().b(this);
    }

    @n0(androidx.lifecycle.q.ON_START)
    public void onStart(@NonNull z zVar) {
        Iterator it = he.n.e(this.f15012a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).x();
        }
    }

    @n0(androidx.lifecycle.q.ON_STOP)
    public void onStop(@NonNull z zVar) {
        Iterator it = he.n.e(this.f15012a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).b();
        }
    }
}
